package org.apache.cordova;

import org.json.JSONArray;

/* loaded from: classes.dex */
public class SplashScreenPlugin extends p {

    /* renamed from: c, reason: collision with root package name */
    public boolean f2889c;

    @Override // org.apache.cordova.p
    public boolean execute(String str, JSONArray jSONArray, e eVar) {
        if (!str.equals("hide") || this.f2889c) {
            return false;
        }
        eVar.success();
        return true;
    }

    @Override // org.apache.cordova.p
    public Object onMessage(String str, Object obj) {
        str.getClass();
        if (!str.equals("setupSplashScreen")) {
            return null;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // org.apache.cordova.p
    public final void pluginInitialize() {
        this.f2889c = this.f2953a.a("AutoHideSplashScreen", true);
        this.f2953a.b(-1, "SplashScreenDelay");
        this.f2953a.a("FadeSplashScreen", true);
        this.f2953a.b(500, "FadeSplashScreenDuration");
    }
}
