package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f435b;

    public s0(u0 u0Var, int i5) {
        this.f435b = u0Var;
        this.f434a = i5;
    }

    @Override // androidx.fragment.app.r0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        u0 u0Var = this.f435b;
        z zVar = u0Var.f462z;
        int i5 = this.f434a;
        if (zVar == null || i5 >= 0 || !zVar.c().Q()) {
            return u0Var.R(arrayList, arrayList2, i5, 1);
        }
        return false;
    }
}
