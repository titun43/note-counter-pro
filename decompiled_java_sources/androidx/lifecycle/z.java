package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: g, reason: collision with root package name */
    public final k1.j f595g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f596i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f597j;

    public z(a0 a0Var, k1.j jVar) {
        this.f597j = a0Var;
        this.f595g = jVar;
    }

    public final void b(boolean z4) {
        if (z4 == this.h) {
            return;
        }
        this.h = z4;
        int i5 = z4 ? 1 : -1;
        a0 a0Var = this.f597j;
        int i6 = a0Var.f519c;
        a0Var.f519c = i5 + i6;
        if (!a0Var.f520d) {
            a0Var.f520d = true;
            while (true) {
                try {
                    int i7 = a0Var.f519c;
                    if (i6 == i7) {
                        break;
                    } else {
                        i6 = i7;
                    }
                } finally {
                    a0Var.f520d = false;
                }
            }
        }
        if (this.h) {
            a0Var.c(this);
        }
    }

    public void c() {
    }

    public abstract boolean d();
}
