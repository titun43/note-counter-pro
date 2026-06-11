package com.capacitorjs.plugins.app;

import com.getcapacitor.App;
import com.getcapacitor.PluginResult;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements App.AppStatusChangeListener, App.AppRestoredListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppPlugin f840a;

    public /* synthetic */ a(AppPlugin appPlugin) {
        this.f840a = appPlugin;
    }

    @Override // com.getcapacitor.App.AppRestoredListener
    public void onAppRestored(PluginResult pluginResult) {
        this.f840a.lambda$load$1(pluginResult);
    }

    @Override // com.getcapacitor.App.AppStatusChangeListener
    public void onAppStatusChanged(Boolean bool) {
        this.f840a.lambda$load$0(bool);
    }
}
