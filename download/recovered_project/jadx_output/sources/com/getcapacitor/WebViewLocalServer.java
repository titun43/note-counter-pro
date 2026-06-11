package com.getcapacitor;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.getcapacitor.plugin.util.CapacitorHttpUrlConnection;
import com.getcapacitor.plugin.util.HttpRequestHandler;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewLocalServer {
    private static final String capacitorContentStart = "/_capacitor_content_";
    private static final String capacitorFileStart = "/_capacitor_file_";
    private final ArrayList<String> authorities;
    private String basePath;
    private final Bridge bridge;
    private final boolean html5mode;
    private boolean isAsset;
    private final JSInjector jsInjector;
    private final AndroidProtocolHandler protocolHandler;
    private final UriMatcher uriMatcher = new UriMatcher(null);

    public static class LollipopLazyInputStream extends LazyInputStream {
        private InputStream is;
        private WebResourceRequest request;

        public LollipopLazyInputStream(PathHandler pathHandler, WebResourceRequest webResourceRequest) {
            super(pathHandler);
            this.request = webResourceRequest;
        }

        @Override // com.getcapacitor.WebViewLocalServer.LazyInputStream
        public InputStream handle() {
            return this.handler.handle(this.request);
        }
    }

    public static abstract class PathHandler {
        private String charset;
        private String encoding;
        protected String mimeType;
        private String reasonPhrase;
        private Map<String, String> responseHeaders;
        private int statusCode;

        public PathHandler() {
            this(null, null, 200, "OK", null);
        }

        public Map<String, String> buildDefaultResponseHeaders() {
            return new HashMap(this.responseHeaders);
        }

        public String getCharset() {
            return this.charset;
        }

        public String getEncoding() {
            return this.encoding;
        }

        public String getReasonPhrase() {
            return this.reasonPhrase;
        }

        @Deprecated(forRemoval = true)
        public Map<String, String> getResponseHeaders() {
            return this.responseHeaders;
        }

        public int getStatusCode() {
            return this.statusCode;
        }

        public abstract InputStream handle(Uri uri);

        public InputStream handle(WebResourceRequest webResourceRequest) {
            return handle(webResourceRequest.getUrl());
        }

        public PathHandler(String str, String str2, int i5, String str3, Map<String, String> map) {
            this.encoding = str;
            this.charset = str2;
            this.statusCode = i5;
            this.reasonPhrase = str3;
            map = map == null ? new HashMap<>() : map;
            map.put("Cache-Control", "no-cache");
            this.responseHeaders = map;
        }
    }

    public WebViewLocalServer(Context context, Bridge bridge, JSInjector jSInjector, ArrayList<String> arrayList, boolean z4) {
        this.html5mode = z4;
        this.protocolHandler = new AndroidProtocolHandler(context.getApplicationContext());
        this.authorities = arrayList;
        this.bridge = bridge;
        this.jsInjector = jSInjector;
    }

    private void createHostingDetails() {
        final String str = this.basePath;
        if (str.indexOf(42) != -1) {
            throw new IllegalArgumentException("assetPath cannot contain the '*' character.");
        }
        PathHandler pathHandler = new PathHandler() { // from class: com.getcapacitor.WebViewLocalServer.1
            @Override // com.getcapacitor.WebViewLocalServer.PathHandler
            public InputStream handle(Uri uri) {
                boolean z4;
                String path = uri.getPath();
                RouteProcessor routeProcessor = WebViewLocalServer.this.bridge.getRouteProcessor();
                if (routeProcessor != null) {
                    ProcessedRoute process = WebViewLocalServer.this.bridge.getRouteProcessor().process(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, path);
                    String path2 = process.getPath();
                    WebViewLocalServer.this.isAsset = process.isAsset();
                    z4 = process.isIgnoreAssetPath();
                    path = path2;
                } else {
                    z4 = false;
                }
                try {
                    if (path.startsWith("/_capacitor_content_")) {
                        return WebViewLocalServer.this.protocolHandler.openContentUrl(uri);
                    }
                    if (path.startsWith("/_capacitor_file_")) {
                        return WebViewLocalServer.this.protocolHandler.openFile(path);
                    }
                    if (!WebViewLocalServer.this.isAsset) {
                        if (routeProcessor == null) {
                            path = WebViewLocalServer.this.basePath + uri.getPath();
                        }
                        return WebViewLocalServer.this.protocolHandler.openFile(path);
                    }
                    if (z4) {
                        return WebViewLocalServer.this.protocolHandler.openAsset(path);
                    }
                    return WebViewLocalServer.this.protocolHandler.openAsset(str + path);
                } catch (IOException unused) {
                    Logger.error("Unable to open asset URL: " + uri);
                    return null;
                }
            }
        };
        ArrayList<String> arrayList = this.authorities;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            String str2 = arrayList.get(i5);
            i5++;
            String str3 = str2;
            registerUriForScheme(Bridge.CAPACITOR_HTTP_SCHEME, pathHandler, str3);
            registerUriForScheme(Bridge.CAPACITOR_HTTPS_SCHEME, pathHandler, str3);
            String scheme = this.bridge.getScheme();
            if (!scheme.equals(Bridge.CAPACITOR_HTTP_SCHEME) && !scheme.equals(Bridge.CAPACITOR_HTTPS_SCHEME)) {
                registerUriForScheme(scheme, pathHandler, str3);
            }
        }
    }

    private String getMimeType(String str, InputStream inputStream) {
        String str2;
        try {
            str2 = URLConnection.guessContentTypeFromName(str);
            if (str2 != null) {
                try {
                    if (str.endsWith(".js") && str2.equals("image/x-icon")) {
                        Logger.debug("We shouldn't be here");
                    }
                } catch (Exception e4) {
                    e = e4;
                    Logger.error("Unable to get mime type" + str, e);
                    return str2;
                }
            }
            if (str2 != null) {
                return str2;
            }
            if (!str.endsWith(".js") && !str.endsWith(".mjs")) {
                if (str.endsWith(".wasm")) {
                    return "application/wasm";
                }
                str = URLConnection.guessContentTypeFromStream(inputStream);
                return str;
            }
            return "application/javascript";
        } catch (Exception e5) {
            e = e5;
            str2 = null;
        }
    }

    private String getReasonPhraseFromResponseCode(int i5) {
        if (i5 == 100) {
            return "Continue";
        }
        if (i5 == 101) {
            return "Switching Protocols";
        }
        if (i5 == 400) {
            return "Bad Request";
        }
        if (i5 == 401) {
            return "Unauthorized";
        }
        switch (i5) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative Information";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i5) {
                    case 300:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case 302:
                        return "Found";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    default:
                        switch (i5) {
                            case 403:
                                return "Forbidden";
                            case 404:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case 407:
                                return "Proxy Authentication Required";
                            case 408:
                                return "Request Timeout";
                            case 409:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            default:
                                switch (i5) {
                                    case 500:
                                        return "Internal Server Error";
                                    case 501:
                                        return "Not Implemented";
                                    case 502:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case 504:
                                        return "Gateway Timeout";
                                    case 505:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "Unknown";
                                }
                        }
                }
        }
    }

    private int getStatusCode(InputStream inputStream, int i5) {
        try {
            if (inputStream.available() == -1) {
                return 404;
            }
            return i5;
        } catch (IOException unused) {
            return 500;
        }
    }

    private WebResourceResponse handleCapacitorHttpRequest(WebResourceRequest webResourceRequest) {
        URL url = new URL(webResourceRequest.getUrl().getQueryParameter(Bridge.CAPACITOR_HTTP_INTERCEPTOR_URL_PARAM));
        JSObject jSObject = new JSObject();
        for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
            jSObject.put(entry.getKey(), entry.getValue());
        }
        String string = jSObject.getString("x-cap-user-agent");
        if (string != null) {
            jSObject.put("User-Agent", string);
        }
        jSObject.remove("x-cap-user-agent");
        CapacitorHttpUrlConnection build = new HttpRequestHandler.HttpURLConnectionBuilder().setUrl(url).setMethod(webResourceRequest.getMethod()).setHeaders(jSObject).openConnection().build();
        if (!HttpRequestHandler.isDomainExcludedFromSSL(this.bridge, url).booleanValue()) {
            build.setSSLSocketFactory(this.bridge);
        }
        build.connect();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = null;
        String str2 = null;
        for (Map.Entry<String, List<String>> entry2 : build.getHeaderFields().entrySet()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = entry2.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            if ("Content-Type".equalsIgnoreCase(entry2.getKey())) {
                String[] split = sb.toString().split(";");
                String trim = split[0].trim();
                if (split.length > 1) {
                    String[] split2 = split[1].split("=");
                    if (split2.length > 1) {
                        str2 = split2[1].trim();
                    }
                }
                str = trim;
            } else {
                linkedHashMap.put(entry2.getKey(), sb.toString());
            }
        }
        InputStream errorStream = build.getErrorStream();
        if (errorStream == null) {
            errorStream = build.getInputStream();
        }
        InputStream inputStream = errorStream;
        if (str == null) {
            str = getMimeType(webResourceRequest.getUrl().getPath(), inputStream);
        }
        int responseCode = build.getResponseCode();
        return new WebResourceResponse(str, str2, responseCode, getReasonPhraseFromResponseCode(responseCode), linkedHashMap, inputStream);
    }

    private WebResourceResponse handleLocalRequest(WebResourceRequest webResourceRequest, PathHandler pathHandler) {
        JSInjector jSInjector;
        int i5;
        String path = webResourceRequest.getUrl().getPath();
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        String str = requestHeaders.get(requestHeaders.get("Range") == null ? "range" : "Range");
        if (str != null) {
            LollipopLazyInputStream lollipopLazyInputStream = new LollipopLazyInputStream(pathHandler, webResourceRequest);
            String mimeType = getMimeType(path, lollipopLazyInputStream);
            Map<String, String> buildDefaultResponseHeaders = pathHandler.buildDefaultResponseHeaders();
            try {
                int available = lollipopLazyInputStream.available();
                String[] split = str.split("=")[1].split("-");
                String str2 = split[0];
                int i6 = available - 1;
                if (split.length > 1) {
                    i6 = Integer.parseInt(split[1]);
                }
                buildDefaultResponseHeaders.put("Accept-Ranges", "bytes");
                buildDefaultResponseHeaders.put("Content-Range", "bytes " + str2 + "-" + i6 + "/" + available);
                i5 = 206;
            } catch (IOException unused) {
                i5 = 404;
            }
            return new WebResourceResponse(mimeType, pathHandler.getEncoding(), i5, pathHandler.getReasonPhrase(), buildDefaultResponseHeaders, lollipopLazyInputStream);
        }
        if (isLocalFile(webResourceRequest.getUrl()) || isErrorUrl(webResourceRequest.getUrl())) {
            LollipopLazyInputStream lollipopLazyInputStream2 = new LollipopLazyInputStream(pathHandler, webResourceRequest);
            return new WebResourceResponse(getMimeType(webResourceRequest.getUrl().getPath(), lollipopLazyInputStream2), pathHandler.getEncoding(), getStatusCode(lollipopLazyInputStream2, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.buildDefaultResponseHeaders(), lollipopLazyInputStream2);
        }
        if (path.equals("/cordova.js")) {
            return new WebResourceResponse("application/javascript", pathHandler.getEncoding(), pathHandler.getStatusCode(), pathHandler.getReasonPhrase(), pathHandler.buildDefaultResponseHeaders(), null);
        }
        if (!path.equals("/") && (webResourceRequest.getUrl().getLastPathSegment().contains(".") || !this.html5mode)) {
            if ("/favicon.ico".equalsIgnoreCase(path)) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception e4) {
                    Logger.error("favicon handling failed", e4);
                }
            }
            if (path.lastIndexOf(".") < 0) {
                return null;
            }
            String substring = path.substring(path.lastIndexOf("."));
            InputStream lollipopLazyInputStream3 = new LollipopLazyInputStream(pathHandler, webResourceRequest);
            if (substring.equals(".html") && (jSInjector = this.jsInjector) != null) {
                lollipopLazyInputStream3 = jSInjector.getInjectedStream(lollipopLazyInputStream3);
            }
            InputStream inputStream = lollipopLazyInputStream3;
            return new WebResourceResponse(getMimeType(path, inputStream), pathHandler.getEncoding(), getStatusCode(inputStream, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.buildDefaultResponseHeaders(), inputStream);
        }
        try {
            String str3 = this.basePath + "/index.html";
            if (this.bridge.getRouteProcessor() != null) {
                ProcessedRoute process = this.bridge.getRouteProcessor().process(this.basePath, "/index.html");
                String path2 = process.getPath();
                this.isAsset = process.isAsset();
                str3 = path2;
            }
            InputStream openAsset = this.isAsset ? this.protocolHandler.openAsset(str3) : this.protocolHandler.openFile(str3);
            JSInjector jSInjector2 = this.jsInjector;
            if (jSInjector2 != null) {
                openAsset = jSInjector2.getInjectedStream(openAsset);
            }
            InputStream inputStream2 = openAsset;
            return new WebResourceResponse("text/html", pathHandler.getEncoding(), getStatusCode(inputStream2, pathHandler.getStatusCode()), pathHandler.getReasonPhrase(), pathHandler.buildDefaultResponseHeaders(), inputStream2);
        } catch (IOException e5) {
            Logger.error("Unable to open index.html", e5);
            return null;
        }
    }

    private WebResourceResponse handleProxyRequest(WebResourceRequest webResourceRequest, PathHandler pathHandler) {
        if (this.jsInjector == null) {
            return null;
        }
        String method = webResourceRequest.getMethod();
        if (!method.equals("GET")) {
            return null;
        }
        try {
            String uri = webResourceRequest.getUrl().toString();
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("Accept") && entry.getValue().toLowerCase().contains("text/html")) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    for (Map.Entry<String, String> entry2 : requestHeaders.entrySet()) {
                        httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
                    }
                    String cookie = CookieManager.getInstance().getCookie(uri);
                    if (cookie != null) {
                        httpURLConnection.setRequestProperty("Cookie", cookie);
                    }
                    httpURLConnection.setRequestMethod(method);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setConnectTimeout(30000);
                    if (webResourceRequest.getUrl().getUserInfo() != null) {
                        httpURLConnection.setRequestProperty("Authorization", "Basic " + Base64.encodeToString(webResourceRequest.getUrl().getUserInfo().getBytes(StandardCharsets.UTF_8), 2));
                    }
                    List<String> list = httpURLConnection.getHeaderFields().get("Set-Cookie");
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            CookieManager.getInstance().setCookie(uri, it.next());
                        }
                    }
                    return new WebResourceResponse("text/html", pathHandler.getEncoding(), pathHandler.getStatusCode(), pathHandler.getReasonPhrase(), pathHandler.buildDefaultResponseHeaders(), this.jsInjector.getInjectedStream(httpURLConnection.getInputStream()));
                }
            }
            return null;
        } catch (Exception e4) {
            this.bridge.handleAppUrlLoadError(e4);
            return null;
        }
    }

    private boolean isAllowedUrl(Uri uri) {
        return this.bridge.getServerUrl() != null || this.bridge.getAppAllowNavigationMask().matches(uri.getHost());
    }

    private boolean isErrorUrl(Uri uri) {
        return uri.toString().equals(this.bridge.getErrorUrl());
    }

    private boolean isLocalFile(Uri uri) {
        String path = uri.getPath();
        return path.startsWith("/_capacitor_content_") || path.startsWith("/_capacitor_file_");
    }

    private boolean isMainUrl(Uri uri) {
        return this.bridge.getServerUrl() == null && uri.getHost().equalsIgnoreCase(this.bridge.getHost());
    }

    private static Uri parseAndVerifyUrl(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            Logger.error("Malformed URL: ".concat(str));
            return null;
        }
        String path = parse.getPath();
        if (path != null && !path.isEmpty()) {
            return parse;
        }
        Logger.error("URL does not have a path: ".concat(str));
        return null;
    }

    private void registerUriForScheme(String str, PathHandler pathHandler, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(str);
        builder.authority(str2);
        builder.path(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        Uri build = builder.build();
        register(Uri.withAppendedPath(build, "/"), pathHandler);
        register(Uri.withAppendedPath(build, "**"), pathHandler);
    }

    public String getBasePath() {
        return this.basePath;
    }

    public InputStream getJavaScriptInjectedStream(InputStream inputStream) {
        JSInjector jSInjector = this.jsInjector;
        return jSInjector != null ? jSInjector.getInjectedStream(inputStream) : inputStream;
    }

    public void hostAssets(String str) {
        this.isAsset = true;
        this.basePath = str;
        createHostingDetails();
    }

    public void hostFiles(String str) {
        this.isAsset = false;
        this.basePath = str;
        createHostingDetails();
    }

    public void register(Uri uri, PathHandler pathHandler) {
        synchronized (this.uriMatcher) {
            this.uriMatcher.addURI(uri.getScheme(), uri.getAuthority(), uri.getPath(), pathHandler);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        PathHandler pathHandler;
        Uri url = webResourceRequest.getUrl();
        if (url.getPath() != null && url.getPath().startsWith(Bridge.CAPACITOR_HTTP_INTERCEPTOR_START)) {
            Logger.debug("Handling CapacitorHttp request: " + url);
            try {
                return handleCapacitorHttpRequest(webResourceRequest);
            } catch (Exception e4) {
                Logger.error(e4.getLocalizedMessage());
                return null;
            }
        }
        synchronized (this.uriMatcher) {
            pathHandler = (PathHandler) this.uriMatcher.match(webResourceRequest.getUrl());
        }
        if (pathHandler == null) {
            return null;
        }
        if (!isLocalFile(url) && !isMainUrl(url) && isAllowedUrl(url) && !isErrorUrl(url)) {
            return handleProxyRequest(webResourceRequest, pathHandler);
        }
        Logger.debug("Handling local request: " + webResourceRequest.getUrl().toString());
        return handleLocalRequest(webResourceRequest, pathHandler);
    }

    public static abstract class LazyInputStream extends InputStream {
        protected final PathHandler handler;
        private InputStream is = null;

        public LazyInputStream(PathHandler pathHandler) {
            this.handler = pathHandler;
        }

        private InputStream getInputStream() {
            if (this.is == null) {
                this.is = handle();
            }
            return this.is;
        }

        @Override // java.io.InputStream
        public int available() {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.available();
            }
            return -1;
        }

        public abstract InputStream handle();

        @Override // java.io.InputStream
        public int read() {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.skip(j2);
            }
            return 0L;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr);
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) {
            InputStream inputStream = getInputStream();
            if (inputStream != null) {
                return inputStream.read(bArr, i5, i6);
            }
            return -1;
        }
    }
}
