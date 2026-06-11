package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class e0 implements t {

    /* renamed from: o, reason: collision with root package name */
    public static final e0 f533o = new e0();

    /* renamed from: g, reason: collision with root package name */
    public int f534g;
    public int h;

    /* renamed from: k, reason: collision with root package name */
    public Handler f537k;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.activity.o f539m;

    /* renamed from: n, reason: collision with root package name */
    public final u1.f f540n;

    /* renamed from: i, reason: collision with root package name */
    public boolean f535i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f536j = true;

    /* renamed from: l, reason: collision with root package name */
    public final v f538l = new v(this);

    public e0() {
        int i5 = 3;
        this.f539m = new androidx.activity.o(this, i5);
        this.f540n = new u1.f(this, i5);
    }

    public final void a() {
        int i5 = this.h + 1;
        this.h = i5;
        if (i5 == 1) {
            if (this.f535i) {
                this.f538l.e(m.ON_RESUME);
                this.f535i = false;
            } else {
                Handler handler = this.f537k;
                g4.i.b(handler);
                handler.removeCallbacks(this.f539m);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final o getLifecycle() {
        return this.f538l;
    }
}
