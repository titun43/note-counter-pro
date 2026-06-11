package com.capacitorjs.plugins.filesystem;

import a2.b;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import com.getcapacitor.Bridge;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.plugin.util.CapacitorHttpUrlConnection;
import com.getcapacitor.plugin.util.HttpRequestHandler;
import com.google.android.gms.ads.RequestConfiguration;
import g4.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import t3.h;

/* loaded from: classes.dex */
public final class LegacyFilesystemImplementation {
    private final Context context;

    public interface FilesystemDownloadCallback {
        void onError(Exception exc);

        void onSuccess(JSObject jSObject);
    }

    public LegacyFilesystemImplementation(Context context) {
        i.e(context, "context");
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe A[EDGE_INSN: B:33:0x00fe->B:34:0x00fe BREAK  A[LOOP:0: B:17:0x00d7->B:29:0x00d7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final JSObject doDownloadInBackground(String str, PluginCall pluginCall, Bridge bridge, HttpRequestHandler.ProgressEmitter progressEmitter) {
        String str2;
        int parseInt;
        byte[] bArr;
        int i5;
        int read;
        JSObject object = pluginCall.getObject("headers", new JSObject());
        JSObject object2 = pluginCall.getObject("params", new JSObject());
        Integer num = pluginCall.getInt("connectTimeout");
        Integer num2 = pluginCall.getInt("readTimeout");
        Boolean bool = pluginCall.getBoolean("disableRedirects");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = pluginCall.getBoolean("shouldEncodeUrlParams");
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        Boolean bool3 = pluginCall.getBoolean("progress");
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        String string = pluginCall.getString("method");
        if (string != null) {
            str2 = string.toUpperCase(Locale.ROOT);
            i.d(str2, "toUpperCase(...)");
        } else {
            str2 = "GET";
        }
        String string2 = pluginCall.getString("path");
        i.b(string2);
        String string3 = pluginCall.getString("directory", Environment.DIRECTORY_DOWNLOADS);
        URL url = new URL(str);
        File fileObject = getFileObject(string2, string3);
        CapacitorHttpUrlConnection build = new HttpRequestHandler.HttpURLConnectionBuilder().setUrl(url).setMethod(str2).setHeaders(object).setUrlParams(object2, booleanValue2).setConnectTimeout(num).setReadTimeout(num2).setDisableRedirects(Boolean.valueOf(booleanValue)).openConnection().build();
        build.setSSLSocketFactory(bridge);
        InputStream inputStream = build.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(fileObject, false);
        String headerField = build.getHeaderField("content-length");
        if (headerField != null) {
            try {
                parseInt = Integer.parseInt(headerField);
            } catch (NumberFormatException unused) {
            }
            bArr = new byte[1024];
            long currentTimeMillis = System.currentTimeMillis();
            i5 = 0;
            while (true) {
                read = inputStream.read(bArr);
                if (read > 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                i5 += read;
                if (booleanValue3 && progressEmitter != null) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - currentTimeMillis > 100) {
                        progressEmitter.emit(Integer.valueOf(i5), Integer.valueOf(parseInt));
                        currentTimeMillis = currentTimeMillis2;
                    }
                }
            }
            if (booleanValue3 && progressEmitter != null) {
                progressEmitter.emit(Integer.valueOf(i5), Integer.valueOf(parseInt));
            }
            inputStream.close();
            fileOutputStream.close();
            JSObject jSObject = new JSObject();
            i.b(fileObject);
            jSObject.put("path", fileObject.getAbsolutePath());
            return jSObject;
        }
        parseInt = 0;
        bArr = new byte[1024];
        long currentTimeMillis3 = System.currentTimeMillis();
        i5 = 0;
        while (true) {
            read = inputStream.read(bArr);
            if (read > 0) {
            }
        }
        if (booleanValue3) {
            progressEmitter.emit(Integer.valueOf(i5), Integer.valueOf(parseInt));
        }
        inputStream.close();
        fileOutputStream.close();
        JSObject jSObject2 = new JSObject();
        i.b(fileObject);
        jSObject2.put("path", fileObject.getAbsolutePath());
        return jSObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h downloadFile$lambda$0(LegacyFilesystemImplementation legacyFilesystemImplementation, String str, PluginCall pluginCall, Bridge bridge, HttpRequestHandler.ProgressEmitter progressEmitter, Handler handler, FilesystemDownloadCallback filesystemDownloadCallback) {
        try {
            handler.post(new b(3, filesystemDownloadCallback, legacyFilesystemImplementation.doDownloadInBackground(str, pluginCall, bridge, progressEmitter)));
        } catch (Exception e4) {
            handler.post(new b(4, filesystemDownloadCallback, e4));
        }
        return h.f3400a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return r0.getFilesDir();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r4.equals("DATA") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r4.equals("LIBRARY") == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final File getDirectory(String str) {
        Context context = this.context;
        switch (str.hashCode()) {
            case -1038134325:
                if (str.equals("EXTERNAL")) {
                    return context.getExternalFilesDir(null);
                }
                return null;
            case -564829544:
                if (str.equals("DOCUMENTS")) {
                    return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
                }
                return null;
            case 2090922:
                break;
            case 63879010:
                if (str.equals("CACHE")) {
                    return context.getCacheDir();
                }
                return null;
            case 884191387:
                break;
            case 1013698023:
                if (str.equals("EXTERNAL_STORAGE")) {
                    return Environment.getExternalStorageDirectory();
                }
                return null;
            default:
                return null;
        }
    }

    private final File getFileObject(String str, String str2) {
        if (str2 == null) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || i.a(parse.getScheme(), "file")) {
                return new File(parse.getPath());
            }
        }
        i.b(str2);
        File directory = getDirectory(str2);
        if (directory == null) {
            return null;
        }
        if (!directory.exists()) {
            directory.mkdir();
        }
        return new File(directory, str);
    }

    public final void downloadFile(PluginCall pluginCall, Bridge bridge, HttpRequestHandler.ProgressEmitter progressEmitter, FilesystemDownloadCallback filesystemDownloadCallback) {
        i.e(pluginCall, "call");
        i.e(bridge, "bridge");
        i.e(filesystemDownloadCallback, PluginMethod.RETURN_CALLBACK);
        new v3.a(new a(this, pluginCall.getString("url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), pluginCall, bridge, progressEmitter, new Handler(Looper.getMainLooper()), filesystemDownloadCallback)).start();
    }

    public final boolean isPublicDirectory(String str) {
        return "DOCUMENTS".equals(str) || "EXTERNAL_STORAGE".equals(str);
    }
}
