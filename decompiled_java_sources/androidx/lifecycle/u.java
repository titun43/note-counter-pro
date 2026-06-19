package androidx.lifecycle;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public n f581a;

    /* renamed from: b, reason: collision with root package name */
    public r f582b;

    public final void a(t tVar, m mVar) {
        n a5 = mVar.a();
        n nVar = this.f581a;
        g4.i.e(nVar, "state1");
        if (a5.compareTo(nVar) < 0) {
            nVar = a5;
        }
        this.f581a = nVar;
        this.f582b.a(tVar, mVar);
        this.f581a = a5;
    }
}
