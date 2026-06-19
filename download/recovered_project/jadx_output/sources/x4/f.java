package x4;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.MimeTypeMap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ServiceWorkerController;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import org.apache.cordova.CordovaClientCertRequest;
import org.apache.cordova.CordovaHttpAuthHandler;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.apache.cordova.h0;
import org.apache.cordova.i;
import org.apache.cordova.i0;
import org.apache.cordova.k0;
import org.apache.cordova.p;
import org.apache.cordova.s;
import org.apache.cordova.t;

/* loaded from: classes.dex */
public class f extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final SystemWebViewEngine f3723a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.f f3724b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3725c;

    /* renamed from: d, reason: collision with root package name */
    public final Hashtable f3726d = new Hashtable();

    public f(SystemWebViewEngine systemWebViewEngine) {
        this.f3723a = systemWebViewEngine;
        ArrayList arrayList = new ArrayList();
        String lowerCase = systemWebViewEngine.f2904c.c("hostname", "localhost").toLowerCase();
        arrayList.add(new e0.b("/", new d(this, systemWebViewEngine)));
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            e0.b bVar = (e0.b) obj;
            arrayList2.add(new j1.d(lowerCase, (String) bVar.f1226a, (d) bVar.f1227b));
        }
        this.f3724b = new u1.f(arrayList2, 11);
        if (systemWebViewEngine.f2904c.a("ResolveServiceWorkerRequests", true)) {
            ServiceWorkerController.getInstance().setServiceWorkerClient(new e(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebResourceResponse lambda$new$0(SystemWebViewEngine systemWebViewEngine, String str) {
        try {
            k0 k0Var = this.f3723a.h;
            if (k0Var != null) {
                ArrayList arrayList = new ArrayList();
                for (p pVar : k0Var.f2936a.values()) {
                    if (pVar != null) {
                        pVar.getPathHandler();
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
            if (str.isEmpty()) {
                str = "index.html";
            }
            InputStream open = systemWebViewEngine.f2902a.getContext().getAssets().open("www/" + str, 2);
            String str2 = "text/html";
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            if (fileExtensionFromUrl != null) {
                if (!str.endsWith(".js") && !str.endsWith(".mjs")) {
                    str2 = str.endsWith(".wasm") ? "application/wasm" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                }
                str2 = "application/javascript";
            }
            return new WebResourceResponse(str2, null, open);
        } catch (Exception e4) {
            e4.printStackTrace();
            Log.e("SystemWebViewClient", e4.getMessage());
            return null;
        }
    }

    private static boolean needsContentUrlFix(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    private static boolean needsSpecialsInAssetUrlFix(Uri uri) {
        if (t.c(uri) != 1) {
            return false;
        }
        if (uri.getQuery() != null || uri.getFragment() != null) {
            return true;
        }
        uri.toString().contains("%");
        return false;
    }

    public void clearAuthenticationTokens() {
        this.f3726d.clear();
    }

    public org.apache.cordova.d getAuthenticationToken(String str, String str2) {
        String concat = str.concat(str2);
        Hashtable hashtable = this.f3726d;
        if (hashtable.get(concat) != null) {
            throw new ClassCastException();
        }
        if (hashtable.get(str) != null) {
            throw new ClassCastException();
        }
        if (hashtable.get(str2) != null) {
            throw new ClassCastException();
        }
        if (hashtable.get(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f3725c || str.startsWith("about:")) {
            this.f3725c = false;
            this.f3723a.f2906e.onPageFinishedLoading(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f3725c = true;
        i iVar = this.f3723a.f2905d;
        h0 h0Var = iVar.f2927b;
        synchronized (h0Var) {
            h0Var.f2923b.clear();
            h0Var.f(-1);
        }
        iVar.f2928c = -1;
        this.f3723a.f2906e.onPageStarted(str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        k0 k0Var = this.f3723a.h;
        if (k0Var != null) {
            CordovaClientCertRequest cordovaClientCertRequest = new CordovaClientCertRequest(clientCertRequest);
            synchronized (k0Var.f2936a) {
                for (p pVar : k0Var.f2936a.values()) {
                    if (pVar != null && pVar.onReceivedClientCertRequest(k0Var.f2939d, cordovaClientCertRequest)) {
                        this.f3723a.f2906e.clearLoadTimeoutTimer();
                        return;
                    }
                }
            }
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i5, String str, String str2) {
        if (this.f3725c) {
            SystemWebViewEngine systemWebViewEngine = this.f3723a;
            if (i5 == -10) {
                systemWebViewEngine.f2906e.clearLoadTimeoutTimer();
                if (webView.canGoBack()) {
                    webView.goBack();
                    return;
                }
                super.onReceivedError(webView, i5, str, str2);
            }
            systemWebViewEngine.f2906e.onReceivedError(i5, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        getAuthenticationToken(str, str2);
        k0 k0Var = this.f3723a.h;
        if (k0Var != null) {
            CordovaHttpAuthHandler cordovaHttpAuthHandler = new CordovaHttpAuthHandler(httpAuthHandler);
            synchronized (k0Var.f2936a) {
                for (p pVar : k0Var.f2936a.values()) {
                    if (pVar != null && pVar.onReceivedHttpAuthRequest(k0Var.f2939d, cordovaHttpAuthHandler, str, str2)) {
                        this.f3723a.f2906e.clearLoadTimeoutTimer();
                        return;
                    }
                }
            }
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        SystemWebViewEngine systemWebViewEngine = this.f3723a;
        try {
            if ((systemWebViewEngine.f2908g.getActivity().getPackageManager().getApplicationInfo(systemWebViewEngine.f2908g.getActivity().getPackageName(), 128).flags & 2) != 0) {
                sslErrorHandler.proceed();
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean z4;
        k0 k0Var = this.f3723a.h;
        if (k0Var != null) {
            synchronized (k0Var.f2937b) {
                try {
                    Iterator it = k0Var.f2937b.values().iterator();
                    z4 = false;
                    while (it.hasNext()) {
                        p pVar = (p) k0Var.f2936a.get(((i0) it.next()).f2929a);
                        if (pVar != null && pVar.onRenderProcessGone(webView, renderProcessGoneDetail)) {
                            z4 = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                return true;
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public org.apache.cordova.d removeAuthenticationToken(String str, String str2) {
        if (this.f3726d.remove(str.concat(str2)) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public void setAuthenticationToken(org.apache.cordova.d dVar, String str, String str2) {
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (str2 == null) {
            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        this.f3726d.put(str.concat(str2), dVar);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        SystemWebViewEngine systemWebViewEngine = this.f3723a;
        try {
            if (!systemWebViewEngine.h.m(str)) {
                return new WebResourceResponse("text/plain", "UTF-8", null);
            }
            t tVar = systemWebViewEngine.f2909i;
            Uri parse = Uri.parse(str);
            Uri e4 = tVar.e(parse);
            if (parse.equals(e4) && !needsSpecialsInAssetUrlFix(parse) && !needsContentUrlFix(parse)) {
                return null;
            }
            s d5 = tVar.d(e4);
            return new WebResourceResponse(d5.f2957b, "UTF-8", d5.f2956a);
        } catch (IOException e5) {
            if (!(e5 instanceof FileNotFoundException)) {
                Log.e("SystemWebViewClient", "Error occurred while loading a file (returning a 404).", e5);
            }
            return new WebResourceResponse("text/plain", "UTF-8", null);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f3723a.f2906e.onNavigationAttempt(str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f3724b.n(webResourceRequest.getUrl());
    }
}
