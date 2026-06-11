package org.apache.cordova;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2897a;

    /* renamed from: b, reason: collision with root package name */
    public final u f2898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2899c;

    public e(String str, u uVar) {
        this.f2897a = str;
        this.f2898b = uVar;
    }

    public void error(JSONObject jSONObject) {
        sendPluginResult(new l0(10, jSONObject));
    }

    public String getCallbackId() {
        return this.f2897a;
    }

    public boolean isChangingThreads() {
        return false;
    }

    public boolean isFinished() {
        return this.f2899c;
    }

    public void sendPluginResult(l0 l0Var) {
        synchronized (this) {
            try {
                if (this.f2899c) {
                    l0Var.a();
                } else {
                    this.f2899c = !l0Var.f2945c;
                    this.f2898b.sendPluginResult(l0Var, this.f2897a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void success(JSONObject jSONObject) {
        sendPluginResult(new l0(2, jSONObject));
    }

    public void error(String str) {
        sendPluginResult(new l0(10, str));
    }

    public void success(String str) {
        sendPluginResult(new l0(2, str));
    }

    public void error(int i5) {
        sendPluginResult(new l0(10, i5));
    }

    public void success(JSONArray jSONArray) {
        sendPluginResult(new l0(jSONArray));
    }

    public void success(byte[] bArr) {
        sendPluginResult(new l0(bArr));
    }

    public void success(int i5) {
        sendPluginResult(new l0(2, i5));
    }

    public void success() {
        sendPluginResult(new l0(2));
    }
}
