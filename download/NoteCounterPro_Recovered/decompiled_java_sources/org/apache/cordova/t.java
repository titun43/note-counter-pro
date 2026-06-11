package org.apache.cordova;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.getcapacitor.Bridge;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f2958a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f2959b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f2960c;

    public t(Context context, k0 k0Var) {
        this.f2959b = context.getContentResolver();
        this.f2958a = context.getAssets();
        this.f2960c = k0Var;
    }

    public static String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.equals("3ga") ? "audio/3gpp" : lowerCase.equals("js") ? "text/javascript" : MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
    }

    public static int c(Uri uri) {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("Relative URIs are not supported.");
        }
        String scheme = uri.getScheme();
        if ("content".equalsIgnoreCase(scheme)) {
            return 2;
        }
        if ("android.resource".equalsIgnoreCase(scheme)) {
            return 3;
        }
        if ("file".equalsIgnoreCase(scheme)) {
            return uri.getPath().startsWith("/android_asset/") ? 1 : 0;
        }
        if ("data".equalsIgnoreCase(scheme)) {
            return 4;
        }
        if (Bridge.CAPACITOR_HTTP_SCHEME.equalsIgnoreCase(scheme)) {
            return 5;
        }
        if (Bridge.CAPACITOR_HTTPS_SCHEME.equalsIgnoreCase(scheme)) {
            return 6;
        }
        return "cdvplugin".equalsIgnoreCase(scheme) ? 7 : -1;
    }

    public final String a(Uri uri) {
        switch (c(uri)) {
            case 0:
            case 1:
                return b(uri.getPath());
            case 2:
            case 3:
                return this.f2959b.getType(uri);
            case 4:
                String schemeSpecificPart = uri.getSchemeSpecificPart();
                int indexOf = schemeSpecificPart.indexOf(44);
                if (indexOf == -1) {
                    return null;
                }
                String[] split = schemeSpecificPart.substring(0, indexOf).split(";");
                if (split.length > 0) {
                    return split[0];
                }
                return null;
            case 5:
            case 6:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                    httpURLConnection.setDoInput(false);
                    httpURLConnection.setRequestMethod("HEAD");
                    String headerField = httpURLConnection.getHeaderField("Content-Type");
                    return headerField != null ? headerField.split(";")[0] : headerField;
                } catch (IOException unused) {
                    return null;
                }
            default:
                return null;
        }
    }

    public final s d(Uri uri) {
        InputStream open;
        byte[] bytes;
        AssetManager assetManager = this.f2958a;
        switch (c(uri)) {
            case 0:
                FileInputStream fileInputStream = new FileInputStream(uri.getPath());
                String b2 = b(uri.getPath());
                fileInputStream.getChannel().size();
                return new s(b2, fileInputStream);
            case 1:
                String substring = uri.getPath().substring(15);
                try {
                    AssetFileDescriptor openFd = assetManager.openFd(substring);
                    open = openFd.createInputStream();
                    openFd.getLength();
                } catch (FileNotFoundException unused) {
                    open = assetManager.open(substring);
                    open.available();
                }
                return new s(b(substring), open);
            case 2:
            case 3:
                ContentResolver contentResolver = this.f2959b;
                String type = contentResolver.getType(uri);
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
                openAssetFileDescriptor.getLength();
                return new s(type, createInputStream);
            case 4:
                String schemeSpecificPart = uri.getSchemeSpecificPart();
                int indexOf = schemeSpecificPart.indexOf(44);
                s sVar = null;
                if (indexOf != -1) {
                    String[] split = schemeSpecificPart.substring(0, indexOf).split(";");
                    String str = split.length > 0 ? split[0] : null;
                    boolean z4 = false;
                    int i5 = 1;
                    while (i5 < split.length) {
                        if ("base64".equalsIgnoreCase(split[i5])) {
                            z4 = true;
                        }
                        i5++;
                        z4 = z4;
                    }
                    String substring2 = schemeSpecificPart.substring(indexOf + 1);
                    if (z4) {
                        bytes = Base64.decode(substring2, 0);
                    } else {
                        try {
                            bytes = substring2.getBytes("UTF-8");
                        } catch (UnsupportedEncodingException unused2) {
                            bytes = substring2.getBytes();
                        }
                    }
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                    int length = bytes.length;
                    sVar = new s(str, byteArrayInputStream);
                }
                if (sVar != null) {
                    return sVar;
                }
                break;
            case 5:
            case 6:
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.setDoInput(true);
                String headerField = httpURLConnection.getHeaderField("Content-Type");
                if (headerField != null) {
                    headerField = headerField.split(";")[0];
                }
                httpURLConnection.getContentLength();
                return new s(headerField, "gzip".equals(httpURLConnection.getContentEncoding()) ? new GZIPInputStream(httpURLConnection.getInputStream()) : httpURLConnection.getInputStream());
            case 7:
                p c5 = this.f2960c.c(uri.getHost());
                if (c5 != null) {
                    return c5.handleOpenForRead(uri);
                }
                throw new FileNotFoundException("Invalid plugin ID in URI: " + uri);
        }
        throw new FileNotFoundException("URI not supported by CordovaResourceApi: " + uri);
    }

    public final Uri e(Uri uri) {
        Uri uri2;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("Relative URIs are not supported.");
        }
        k0 k0Var = this.f2960c;
        synchronized (k0Var.f2936a) {
            try {
                Iterator it = k0Var.f2936a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uri2 = null;
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar == null || (uri2 = pVar.remapUri(uri)) == null) {
                    }
                }
            } finally {
            }
        }
        return uri2 != null ? uri2 : uri;
    }
}
