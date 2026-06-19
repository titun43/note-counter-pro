package g;

import android.view.Window;
import k.k1;

/* loaded from: classes.dex */
public final class u implements k1, j.y {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f1651g;

    public /* synthetic */ u(f0 f0Var) {
        this.f1651g = f0Var;
    }

    @Override // j.y
    public void b(j.n nVar, boolean z4) {
        e0 e0Var;
        j.n k5 = nVar.k();
        int i5 = 0;
        boolean z5 = k5 != nVar;
        if (z5) {
            nVar = k5;
        }
        f0 f0Var = this.f1651g;
        e0[] e0VarArr = f0Var.R;
        int length = e0VarArr != null ? e0VarArr.length : 0;
        while (true) {
            if (i5 < length) {
                e0Var = e0VarArr[i5];
                if (e0Var != null && e0Var.h == nVar) {
                    break;
                } else {
                    i5++;
                }
            } else {
                e0Var = null;
                break;
            }
        }
        if (e0Var != null) {
            if (!z5) {
                f0Var.u(e0Var, z4);
            } else {
                f0Var.s(e0Var.f1512a, e0Var, k5);
                f0Var.u(e0Var, true);
            }
        }
    }

    @Override // j.y
    public boolean k(j.n nVar) {
        Window.Callback callback;
        if (nVar != nVar.k()) {
            return true;
        }
        f0 f0Var = this.f1651g;
        if (!f0Var.L || (callback = f0Var.f1545r.getCallback()) == null || f0Var.W) {
            return true;
        }
        callback.onMenuOpened(108, nVar);
        return true;
    }
}
