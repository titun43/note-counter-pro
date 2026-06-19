package n;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2623g;
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2624i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2625j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2626k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bundle f2627l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f2628m;

    public f(g gVar, int i5, int i6, int i7, int i8, int i9, Bundle bundle) {
        this.f2628m = gVar;
        this.f2623g = i5;
        this.h = i6;
        this.f2624i = i7;
        this.f2625j = i8;
        this.f2626k = i9;
        this.f2627l = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2628m.h.onActivityLayout(this.f2623g, this.h, this.f2624i, this.f2625j, this.f2626k, this.f2627l);
    }
}
