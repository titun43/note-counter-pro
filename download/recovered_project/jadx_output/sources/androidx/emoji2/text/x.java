package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f297a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f298b;

    public x(int i5) {
        this.f297a = new SparseArray(i5);
    }

    public final void a(a0 a0Var, int i5, int i6) {
        int a5 = a0Var.a(i5);
        SparseArray sparseArray = this.f297a;
        x xVar = sparseArray == null ? null : (x) sparseArray.get(a5);
        if (xVar == null) {
            xVar = new x(1);
            sparseArray.put(a0Var.a(i5), xVar);
        }
        if (i6 > i5) {
            xVar.a(a0Var, i5 + 1, i6);
        } else {
            xVar.f298b = a0Var;
        }
    }
}
