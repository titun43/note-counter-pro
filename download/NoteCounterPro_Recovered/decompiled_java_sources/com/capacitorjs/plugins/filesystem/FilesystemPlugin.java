package com.capacitorjs.plugins.filesystem;

import a2.c;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.activity.a0;
import androidx.activity.w;
import com.capacitorjs.plugins.filesystem.LegacyFilesystemImplementation;
import com.getcapacitor.Bridge;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import com.getcapacitor.PermissionState;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;
import com.google.android.gms.ads.RequestConfiguration;
import f4.p;
import f4.q;
import g4.i;
import o3.k;
import o4.e0;
import o4.r0;
import o4.s;
import o4.t;
import org.json.JSONException;
import r3.g0;
import t3.b;
import t3.f;
import t4.o;
import v4.e;

@CapacitorPlugin(name = "Filesystem", permissions = {@Permission(alias = "publicStorage", strings = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}), @Permission(alias = "publicStorageAboveAPI29", strings = {"android.permission.READ_EXTERNAL_STORAGE"})})
/* loaded from: classes.dex */
public final class FilesystemPlugin extends Plugin {
    private LegacyFilesystemImplementation legacyImplementation;
    private final b coroutineScope$delegate = new f(new w(1));
    private final b controller$delegate = new f(new a0(this, 3));

    /* JADX INFO: Access modifiers changed from: private */
    public static final k controller_delegate$lambda$0(FilesystemPlugin filesystemPlugin) {
        Context applicationContext = filesystemPlugin.getContext().getApplicationContext();
        i.d(applicationContext, "getApplicationContext(...)");
        return new k(applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t coroutineScope_delegate$lambda$0() {
        e eVar = e0.f2793a;
        return o4.w.a(o.f3438a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$0(PluginCall pluginCall, FilesystemPlugin filesystemPlugin, Integer num, Integer num2) {
        JSObject jSObject = new JSObject();
        jSObject.put("url", pluginCall.getString("url"));
        jSObject.put("bytes", (Object) num);
        jSObject.put("contentLength", (Object) num2);
        filesystemPlugin.notifyListeners("progress", jSObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getController() {
        return (k) ((f) this.controller$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getCoroutineScope() {
        return (t) ((f) this.coroutineScope$delegate).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStoragePermissionGranted(boolean z4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return true;
        }
        return i5 >= 30 ? !z4 || getPermissionState("publicStorageAboveAPI29") == PermissionState.GRANTED : getPermissionState("publicStorage") == PermissionState.GRANTED;
    }

    @PermissionCallback
    private final void permissionCallback(PluginCall pluginCall) {
        if (!isStoragePermissionGranted(true)) {
            Logger.debug(getLogTag(), "User denied storage permission");
            PluginResultExtensionsKt.sendError(pluginCall, FilesystemErrors.INSTANCE.getFilePermissionsDenied());
            return;
        }
        String methodName = pluginCall.getMethodName();
        if (methodName != null) {
            switch (methodName.hashCode()) {
                case -2139808842:
                    if (!methodName.equals("appendFile")) {
                        return;
                    }
                    break;
                case -1406748165:
                    if (!methodName.equals("writeFile")) {
                        return;
                    }
                    break;
                case -1249348042:
                    if (methodName.equals("getUri")) {
                        getUri(pluginCall);
                        return;
                    }
                    return;
                case -934594754:
                    if (methodName.equals("rename")) {
                        rename(pluginCall);
                        return;
                    }
                    return;
                case -867956686:
                    if (methodName.equals("readFile")) {
                        readFile(pluginCall);
                        return;
                    }
                    return;
                case 3059573:
                    if (methodName.equals("copy")) {
                        copy(pluginCall);
                        return;
                    }
                    return;
                case 3540564:
                    if (methodName.equals("stat")) {
                        stat(pluginCall);
                        return;
                    }
                    return;
                case 103950895:
                    if (methodName.equals("mkdir")) {
                        mkdir(pluginCall);
                        return;
                    }
                    return;
                case 108628082:
                    if (methodName.equals("rmdir")) {
                        rmdir(pluginCall);
                        return;
                    }
                    return;
                case 864161661:
                    if (methodName.equals("readFileInChunks")) {
                        readFileInChunks(pluginCall);
                        return;
                    }
                    return;
                case 1080408887:
                    if (methodName.equals("readdir")) {
                        readdir(pluginCall);
                        return;
                    }
                    return;
                case 1108651556:
                    if (methodName.equals("downloadFile")) {
                        downloadFile(pluginCall);
                        return;
                    }
                    return;
                case 1764172231:
                    if (methodName.equals("deleteFile")) {
                        deleteFile(pluginCall);
                        return;
                    }
                    return;
                default:
                    return;
            }
            writeFile(pluginCall);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runWithPermission(g0 g0Var, PluginCall pluginCall, p pVar) {
        o4.w.i(getCoroutineScope(), new FilesystemPlugin$runWithPermission$1(this, g0Var, pluginCall, pVar, null));
    }

    @PluginMethod
    public final void appendFile(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        try {
            pluginCall.getData().putOpt(FilesystemMethodOptionsKt.INPUT_APPEND, Boolean.TRUE);
            writeFile(pluginCall);
        } catch (JSONException e4) {
            Log.e(getLogTag(), "Tried to set `append` in `PluginCall`, but got exception", e4);
            FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
            String methodName = pluginCall.getMethodName();
            i.d(methodName, "getMethodName(...)");
            String localizedMessage = e4.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.operationFailed(methodName, localizedMessage));
        }
    }

    @Override // com.getcapacitor.Plugin
    @PluginMethod
    public void checkPermissions(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        if (!isStoragePermissionGranted(false)) {
            super.checkPermissions(pluginCall);
            return;
        }
        JSObject jSObject = new JSObject();
        jSObject.put("publicStorage", "granted");
        PluginResultExtensionsKt.sendSuccess$default(pluginCall, jSObject, false, 2, null);
    }

    @PluginMethod
    public final void copy(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        DoubleUri doubleIONFILEUri = FilesystemMethodOptionsKt.getDoubleIONFILEUri(pluginCall);
        if (doubleIONFILEUri != null) {
            runWithPermission(doubleIONFILEUri.getFromUri(), doubleIONFILEUri.getToUri(), pluginCall, new FilesystemPlugin$copy$1(this, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod
    public final void deleteFile(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        g0 singleIONFILEUri = FilesystemMethodOptionsKt.getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri != null) {
            runWithPermission(singleIONFILEUri, pluginCall, new FilesystemPlugin$deleteFile$1(this, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod
    public final void downloadFile(final PluginCall pluginCall) {
        i.e(pluginCall, "call");
        try {
            final String string = pluginCall.getString("directory", Environment.DIRECTORY_DOWNLOADS);
            LegacyFilesystemImplementation legacyFilesystemImplementation = this.legacyImplementation;
            if (legacyFilesystemImplementation != null && legacyFilesystemImplementation.isPublicDirectory(string) && !isStoragePermissionGranted(false)) {
                requestAllPermissions(pluginCall, "permissionCallback");
                return;
            }
            c cVar = new c(pluginCall, this);
            LegacyFilesystemImplementation legacyFilesystemImplementation2 = this.legacyImplementation;
            if (legacyFilesystemImplementation2 != null) {
                Bridge bridge = this.bridge;
                i.d(bridge, "bridge");
                legacyFilesystemImplementation2.downloadFile(pluginCall, bridge, cVar, new LegacyFilesystemImplementation.FilesystemDownloadCallback() { // from class: com.capacitorjs.plugins.filesystem.FilesystemPlugin$downloadFile$1
                    @Override // com.capacitorjs.plugins.filesystem.LegacyFilesystemImplementation.FilesystemDownloadCallback
                    public void onError(Exception exc) {
                        i.e(exc, "error");
                        pluginCall.reject("Error downloading file: " + exc.getLocalizedMessage(), exc);
                    }

                    @Override // com.capacitorjs.plugins.filesystem.LegacyFilesystemImplementation.FilesystemDownloadCallback
                    public void onSuccess(JSObject jSObject) {
                        LegacyFilesystemImplementation legacyFilesystemImplementation3;
                        i.e(jSObject, "result");
                        legacyFilesystemImplementation3 = FilesystemPlugin.this.legacyImplementation;
                        if (legacyFilesystemImplementation3 != null && legacyFilesystemImplementation3.isPublicDirectory(string)) {
                            MediaScannerConnection.scanFile(FilesystemPlugin.this.getContext(), new String[]{jSObject.getString("path")}, null, null);
                        }
                        pluginCall.resolve(jSObject);
                    }
                });
            }
        } catch (Exception e4) {
            pluginCall.reject("Error downloading file: " + e4.getLocalizedMessage(), e4);
        }
    }

    @PluginMethod
    public final void getUri(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        g0 singleIONFILEUri = FilesystemMethodOptionsKt.getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri != null) {
            o4.w.i(getCoroutineScope(), new FilesystemPlugin$getUri$1(this, singleIONFILEUri, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnDestroy() {
        super.handleOnDestroy();
        t coroutineScope = getCoroutineScope();
        r0 r0Var = (r0) coroutineScope.k().d(s.h);
        if (r0Var != null) {
            r0Var.b(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        super.load();
        Context context = getContext();
        i.d(context, "getContext(...)");
        this.legacyImplementation = new LegacyFilesystemImplementation(context);
    }

    @PluginMethod
    public final void mkdir(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        SingleUriWithRecursiveOptions singleUriWithRecursiveOptions = FilesystemMethodOptionsKt.getSingleUriWithRecursiveOptions(pluginCall);
        if (singleUriWithRecursiveOptions != null) {
            runWithPermission(singleUriWithRecursiveOptions.getUri(), pluginCall, new FilesystemPlugin$mkdir$1(this, singleUriWithRecursiveOptions, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod
    public final void readFile(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        ReadFileOptions readFileOptions = FilesystemMethodOptionsKt.getReadFileOptions(pluginCall);
        if (readFileOptions != null) {
            runWithPermission(readFileOptions.getUri(), pluginCall, new FilesystemPlugin$readFile$1(this, readFileOptions, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod(returnType = PluginMethod.RETURN_CALLBACK)
    public final void readFileInChunks(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        ReadFileInChunksOptions readFileInChunksOptions = FilesystemMethodOptionsKt.getReadFileInChunksOptions(pluginCall);
        if (readFileInChunksOptions != null) {
            runWithPermission(readFileInChunksOptions.getUri(), pluginCall, new FilesystemPlugin$readFileInChunks$1(this, readFileInChunksOptions, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod
    public final void readdir(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        g0 singleIONFILEUri = FilesystemMethodOptionsKt.getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri != null) {
            runWithPermission(singleIONFILEUri, pluginCall, new FilesystemPlugin$readdir$1(this, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod
    public final void rename(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        DoubleUri doubleIONFILEUri = FilesystemMethodOptionsKt.getDoubleIONFILEUri(pluginCall);
        if (doubleIONFILEUri != null) {
            runWithPermission(doubleIONFILEUri.getFromUri(), doubleIONFILEUri.getToUri(), pluginCall, new FilesystemPlugin$rename$1(this, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @Override // com.getcapacitor.Plugin
    @PluginMethod
    public void requestPermissions(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        if (!isStoragePermissionGranted(false)) {
            super.requestPermissions(pluginCall);
            return;
        }
        JSObject jSObject = new JSObject();
        jSObject.put("publicStorage", "granted");
        PluginResultExtensionsKt.sendSuccess$default(pluginCall, jSObject, false, 2, null);
    }

    @PluginMethod
    public final void rmdir(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        SingleUriWithRecursiveOptions singleUriWithRecursiveOptions = FilesystemMethodOptionsKt.getSingleUriWithRecursiveOptions(pluginCall);
        if (singleUriWithRecursiveOptions != null) {
            runWithPermission(singleUriWithRecursiveOptions.getUri(), pluginCall, new FilesystemPlugin$rmdir$1(this, singleUriWithRecursiveOptions, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod
    public final void stat(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        g0 singleIONFILEUri = FilesystemMethodOptionsKt.getSingleIONFILEUri(pluginCall);
        if (singleIONFILEUri != null) {
            runWithPermission(singleIONFILEUri, pluginCall, new FilesystemPlugin$stat$1(this, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    @PluginMethod
    public final void writeFile(PluginCall pluginCall) {
        i.e(pluginCall, "call");
        WriteFileOptions writeFileOptions = FilesystemMethodOptionsKt.getWriteFileOptions(pluginCall);
        if (writeFileOptions != null) {
            runWithPermission(writeFileOptions.getUri(), pluginCall, new FilesystemPlugin$writeFile$1(this, writeFileOptions, pluginCall, null));
            return;
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String methodName = pluginCall.getMethodName();
        i.d(methodName, "getMethodName(...)");
        PluginResultExtensionsKt.sendError(pluginCall, filesystemErrors.invalidInputMethod(methodName));
    }

    private final void runWithPermission(g0 g0Var, g0 g0Var2, PluginCall pluginCall, q qVar) {
        runWithPermission(g0Var, pluginCall, new FilesystemPlugin$runWithPermission$2(this, g0Var2, pluginCall, qVar, null));
    }
}
