package q0;

import androidx.lifecycle.n0;
import androidx.lifecycle.r0;
import androidx.lifecycle.u0;
import g4.i;

/* loaded from: classes.dex */
public final class c implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f3076a;

    public c(e... eVarArr) {
        i.e(eVarArr, "initializers");
        this.f3076a = eVarArr;
    }

    @Override // androidx.lifecycle.u0
    public final r0 b(Class cls, d dVar) {
        n0 n0Var = null;
        for (e eVar : this.f3076a) {
            if (eVar.f3077a.equals(cls)) {
                n0Var = new n0();
            }
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
