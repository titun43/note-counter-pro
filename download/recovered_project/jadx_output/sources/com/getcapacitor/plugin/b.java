package com.getcapacitor.plugin;

import com.getcapacitor.PluginCall;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f888g;
    public final /* synthetic */ SystemBars h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f889i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PluginCall f890j;

    public /* synthetic */ b(SystemBars systemBars, String str, PluginCall pluginCall, int i5) {
        this.f888g = i5;
        this.h = systemBars;
        this.f889i = str;
        this.f890j = pluginCall;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f888g) {
            case 0:
                this.h.lambda$show$2(this.f889i, this.f890j);
                break;
            default:
                this.h.lambda$hide$3(this.f889i, this.f890j);
                break;
        }
    }
}
