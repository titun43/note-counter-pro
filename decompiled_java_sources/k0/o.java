package k0;

/* loaded from: classes.dex */
public final class o extends g4.j implements f4.l {
    public final /* synthetic */ d0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d0 d0Var) {
        super(1);
        this.h = d0Var;
    }

    @Override // f4.l
    public final Object a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            this.h.f2341f.c(new g(th));
        }
        Object obj2 = d0.f2335j;
        d0 d0Var = this.h;
        synchronized (obj2) {
            d0.f2334i.remove(d0Var.b().getAbsolutePath());
        }
        return t3.h.f3400a;
    }
}
