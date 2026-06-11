package com.getcapacitor.community.admob.rewardedinterstitial.models;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import g4.f;

/* loaded from: classes.dex */
public final class SsvInfo {
    private final String customData;
    private final String userId;

    public SsvInfo(String str, String str2) {
        this.customData = str;
        this.userId = str2;
    }

    public final String getCustomData() {
        return this.customData;
    }

    public final boolean getHasInfo() {
        return (this.customData == null && this.userId == null) ? false : true;
    }

    public final String getUserId() {
        return this.userId;
    }

    public /* synthetic */ SsvInfo(String str, String str2, int i5, f fVar) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SsvInfo(PluginCall pluginCall) {
        this(r2, r0);
        JSObject object;
        JSObject object2;
        String str = null;
        String string = (pluginCall == null || (object2 = pluginCall.getObject("ssv")) == null) ? null : object2.getString("customData");
        if (pluginCall != null && (object = pluginCall.getObject("ssv")) != null) {
            str = object.getString("userId");
        }
    }

    public SsvInfo() {
        this(null, null);
    }
}
