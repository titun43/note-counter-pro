package i;

import f0.x0;
import k.d3;

/* loaded from: classes.dex */
public final class j extends b3.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1781c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1782d;

    /* renamed from: e, reason: collision with root package name */
    public int f1783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1784f;

    public j(k kVar) {
        this.f1781c = 0;
        this.f1784f = kVar;
        this.f1782d = false;
        this.f1783e = 0;
    }

    @Override // b3.g, f0.x0
    public void a() {
        switch (this.f1781c) {
            case 1:
                this.f1782d = true;
                break;
        }
    }

    @Override // b3.g, f0.x0
    public final void b() {
        switch (this.f1781c) {
            case 0:
                if (!this.f1782d) {
                    this.f1782d = true;
                    x0 x0Var = ((k) this.f1784f).f1788d;
                    if (x0Var != null) {
                        x0Var.b();
                        break;
                    }
                }
                break;
            default:
                ((d3) this.f1784f).f2050a.setVisibility(0);
                break;
        }
    }

    @Override // f0.x0
    public final void c() {
        switch (this.f1781c) {
            case 0:
                int i5 = this.f1783e + 1;
                this.f1783e = i5;
                k kVar = (k) this.f1784f;
                if (i5 == kVar.f1785a.size()) {
                    x0 x0Var = kVar.f1788d;
                    if (x0Var != null) {
                        x0Var.c();
                    }
                    this.f1783e = 0;
                    this.f1782d = false;
                    kVar.f1789e = false;
                    break;
                }
                break;
            default:
                if (!this.f1782d) {
                    ((d3) this.f1784f).f2050a.setVisibility(this.f1783e);
                    break;
                }
                break;
        }
    }

    public j(d3 d3Var, int i5) {
        this.f1781c = 1;
        this.f1784f = d3Var;
        this.f1783e = i5;
        this.f1782d = false;
    }
}
