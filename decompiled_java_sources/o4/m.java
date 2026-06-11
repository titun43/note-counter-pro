package o4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2815a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2816b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.q f2817c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2818d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f2819e;

    public m(Object obj, g0 g0Var, f4.q qVar, Object obj2, Throwable th) {
        this.f2815a = obj;
        this.f2816b = g0Var;
        this.f2817c = qVar;
        this.f2818d = obj2;
        this.f2819e = th;
    }

    public static m a(m mVar, g0 g0Var, Throwable th, int i5) {
        Object obj = mVar.f2815a;
        if ((i5 & 2) != 0) {
            g0Var = mVar.f2816b;
        }
        g0 g0Var2 = g0Var;
        f4.q qVar = mVar.f2817c;
        Object obj2 = mVar.f2818d;
        if ((i5 & 16) != 0) {
            th = mVar.f2819e;
        }
        return new m(obj, g0Var2, qVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return g4.i.a(this.f2815a, mVar.f2815a) && g4.i.a(this.f2816b, mVar.f2816b) && g4.i.a(this.f2817c, mVar.f2817c) && g4.i.a(this.f2818d, mVar.f2818d) && g4.i.a(this.f2819e, mVar.f2819e);
    }

    public final int hashCode() {
        Object obj = this.f2815a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        g0 g0Var = this.f2816b;
        int hashCode2 = (hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        f4.q qVar = this.f2817c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f2818d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2819e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2815a + ", cancelHandler=" + this.f2816b + ", onCancellation=" + this.f2817c + ", idempotentResume=" + this.f2818d + ", cancelCause=" + this.f2819e + ')';
    }

    public /* synthetic */ m(Object obj, g0 g0Var, f4.q qVar, Throwable th, int i5) {
        this(obj, (i5 & 2) != 0 ? null : g0Var, (i5 & 4) != 0 ? null : qVar, (Object) null, (i5 & 16) != 0 ? null : th);
    }
}
