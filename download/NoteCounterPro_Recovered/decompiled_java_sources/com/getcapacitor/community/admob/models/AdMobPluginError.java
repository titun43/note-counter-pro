package com.getcapacitor.community.admob.models;

import com.getcapacitor.JSObject;
import com.google.android.gms.ads.AdError;
import g4.i;

/* loaded from: classes.dex */
public final class AdMobPluginError extends JSObject {
    private final int code;
    private final String message;

    public AdMobPluginError(int i5, String str) {
        i.e(str, "message");
        this.code = i5;
        this.message = str;
        super.put("code", i5);
        super.put("message", str);
    }

    public static /* synthetic */ AdMobPluginError copy$default(AdMobPluginError adMobPluginError, int i5, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = adMobPluginError.code;
        }
        if ((i6 & 2) != 0) {
            str = adMobPluginError.message;
        }
        return adMobPluginError.copy(i5, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final AdMobPluginError copy(int i5, String str) {
        i.e(str, "message");
        return new AdMobPluginError(i5, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdMobPluginError)) {
            return false;
        }
        AdMobPluginError adMobPluginError = (AdMobPluginError) obj;
        return this.code == adMobPluginError.code && i.a(this.message, adMobPluginError.message);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    @Override // org.json.JSONObject
    public String toString() {
        return "AdMobPluginError(code=" + this.code + ", message=" + this.message + ")";
    }

    @Override // com.getcapacitor.JSObject, org.json.JSONObject
    public JSObject put(String str, int i5) {
        i.e(str, "key");
        throw new Exception("Do not put elements directly here use the constructor");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdMobPluginError(AdError adError) {
        this(r0, r3);
        i.e(adError, "adError");
        int code = adError.getCode();
        String message = adError.getMessage();
        i.d(message, "getMessage(...)");
    }
}
