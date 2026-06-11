package f0;

/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f1351a;

    /* renamed from: b, reason: collision with root package name */
    public y.c[] f1352b;

    public d1() {
        this(new q1());
    }

    public final void a() {
        y.c[] cVarArr = this.f1352b;
        if (cVarArr != null) {
            y.c cVar = cVarArr[0];
            y.c cVar2 = cVarArr[1];
            q1 q1Var = this.f1351a;
            if (cVar2 == null) {
                cVar2 = q1Var.f1406a.f(2);
            }
            if (cVar == null) {
                cVar = q1Var.f1406a.f(1);
            }
            g(y.c.a(cVar, cVar2));
            y.c cVar3 = this.f1352b[z2.b.l(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            y.c cVar4 = this.f1352b[z2.b.l(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            y.c cVar5 = this.f1352b[z2.b.l(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract q1 b();

    public void c(int i5, y.c cVar) {
        if (this.f1352b == null) {
            this.f1352b = new y.c[10];
        }
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((i5 & i6) != 0) {
                this.f1352b[z2.b.l(i6)] = cVar;
            }
        }
    }

    public abstract void e(y.c cVar);

    public abstract void g(y.c cVar);

    public d1(q1 q1Var) {
        this.f1351a = q1Var;
    }

    public void d(y.c cVar) {
    }

    public void f(y.c cVar) {
    }

    public void h(y.c cVar) {
    }
}
