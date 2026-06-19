package n;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2611g;
    public final /* synthetic */ String h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f2612i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f2613j;

    public /* synthetic */ c(g gVar, String str, Bundle bundle, int i5) {
        this.f2611g = i5;
        this.f2613j = gVar;
        this.h = str;
        this.f2612i = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2611g) {
            case 0:
                this.f2613j.h.extraCallback(this.h, this.f2612i);
                break;
            default:
                this.f2613j.h.onPostMessage(this.h, this.f2612i);
                break;
        }
    }
}
