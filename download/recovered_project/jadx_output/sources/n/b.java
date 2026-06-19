package n;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2609g;
    public final /* synthetic */ Bundle h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f2610i;

    public /* synthetic */ b(g gVar, Bundle bundle, int i5) {
        this.f2609g = i5;
        this.f2610i = gVar;
        this.h = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2609g) {
            case 0:
                this.f2610i.h.onUnminimized(this.h);
                break;
            case 1:
                this.f2610i.h.onMessageChannelReady(this.h);
                break;
            case 2:
                this.f2610i.h.onWarmupCompleted(this.h);
                break;
            default:
                this.f2610i.h.onMinimized(this.h);
                break;
        }
    }
}
