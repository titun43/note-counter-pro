package k;

/* loaded from: classes.dex */
public final class j0 extends w1 {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0 f2129p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s0 f2130q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(s0 s0Var, s0 s0Var2, p0 p0Var) {
        super(s0Var2);
        this.f2130q = s0Var;
        this.f2129p = p0Var;
    }

    @Override // k.w1
    public final j.d0 b() {
        return this.f2129p;
    }

    @Override // k.w1
    public final boolean c() {
        s0 s0Var = this.f2130q;
        if (s0Var.getInternalPopup().a()) {
            return true;
        }
        s0Var.f2213l.n(s0Var.getTextDirection(), s0Var.getTextAlignment());
        return true;
    }
}
