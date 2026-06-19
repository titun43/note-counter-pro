package g4;

import f4.r;
import f4.s;
import f4.t;
import f4.u;
import f4.v;
import f4.w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements l4.b, d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1696a;

    static {
        List S = u3.h.S(f4.a.class, f4.l.class, f4.p.class, f4.q.class, r.class, s.class, t.class, u.class, v.class, w.class, f4.b.class, f4.c.class, f4.d.class, f4.e.class, f4.f.class, f4.g.class, f4.h.class, f4.i.class, f4.j.class, f4.k.class, f4.m.class, f4.n.class, f4.o.class);
        ArrayList arrayList = new ArrayList(u3.i.T(S));
        int i5 = 0;
        for (Object obj : S) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new t3.c((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        u3.r.R(arrayList);
    }

    public e(Class cls) {
        this.f1696a = cls;
    }

    @Override // g4.d
    public final Class a() {
        return this.f1696a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && z2.b.j(this).equals(z2.b.j((l4.b) obj));
    }

    public final int hashCode() {
        return z2.b.j(this).hashCode();
    }

    public final String toString() {
        return this.f1696a.toString() + " (Kotlin reflection is not available)";
    }
}
