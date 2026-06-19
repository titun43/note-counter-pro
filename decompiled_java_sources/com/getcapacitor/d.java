package com.getcapacitor;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f865g;
    public final /* synthetic */ Bridge h;

    public /* synthetic */ d(Bridge bridge, int i5) {
        this.f865g = i5;
        this.h = bridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f865g) {
            case 0:
                this.h.lambda$setServerBasePath$4();
                break;
            case 1:
                this.h.lambda$reload$6();
                break;
            default:
                this.h.lambda$setServerAssetPath$5();
                break;
        }
    }
}
