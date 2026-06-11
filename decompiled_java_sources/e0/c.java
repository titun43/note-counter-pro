package e0;

import c0.j;

/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1228c;

    public c() {
        super(12);
        this.f1228c = new Object();
    }

    @Override // c0.j
    public final Object a() {
        Object a5;
        synchronized (this.f1228c) {
            a5 = super.a();
        }
        return a5;
    }

    @Override // c0.j
    public final boolean d(Object obj) {
        boolean d5;
        synchronized (this.f1228c) {
            d5 = super.d(obj);
        }
        return d5;
    }
}
