package com.getcapacitor.community.admob.helpers;

import com.getcapacitor.JSObject;
import com.getcapacitor.community.admob.models.AdMobPluginError;
import com.getcapacitor.community.admob.models.LoadPluginEventNames;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import g4.i;
import x2.a;

/* loaded from: classes.dex */
public final class FullscreenPluginCallback extends FullScreenContentCallback {
    private final LoadPluginEventNames loadPluginObject;
    private final a notifyListenersFunction;

    public FullscreenPluginCallback(LoadPluginEventNames loadPluginEventNames, a aVar) {
        i.e(loadPluginEventNames, "loadPluginObject");
        i.e(aVar, "notifyListenersFunction");
        this.loadPluginObject = loadPluginEventNames;
        this.notifyListenersFunction = aVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.notifyListenersFunction.a(this.loadPluginObject.getDismissed(), new JSObject());
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        i.e(adError, "adError");
        this.notifyListenersFunction.a(this.loadPluginObject.getFailedToShow(), new AdMobPluginError(adError));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        this.notifyListenersFunction.a(this.loadPluginObject.getShowed(), new JSObject());
    }
}
