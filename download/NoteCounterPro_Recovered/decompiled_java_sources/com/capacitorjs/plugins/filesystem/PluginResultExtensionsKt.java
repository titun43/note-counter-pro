package com.capacitorjs.plugins.filesystem;

import com.capacitorjs.plugins.filesystem.FilesystemErrors;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import g4.i;

/* loaded from: classes.dex */
public final class PluginResultExtensionsKt {
    public static final void sendError(PluginCall pluginCall, FilesystemErrors.ErrorInfo errorInfo) {
        i.e(pluginCall, "<this>");
        i.e(errorInfo, "error");
        pluginCall.reject(errorInfo.getMessage(), errorInfo.getCode());
    }

    public static final void sendSuccess(PluginCall pluginCall, JSObject jSObject, boolean z4) {
        i.e(pluginCall, "<this>");
        pluginCall.setKeepAlive(Boolean.valueOf(z4));
        if (jSObject != null) {
            pluginCall.resolve(jSObject);
        } else {
            pluginCall.resolve();
        }
    }

    public static /* synthetic */ void sendSuccess$default(PluginCall pluginCall, JSObject jSObject, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            jSObject = null;
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        sendSuccess(pluginCall, jSObject, z4);
    }
}
