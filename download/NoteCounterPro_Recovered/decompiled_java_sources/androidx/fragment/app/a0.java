package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements c1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f321b;

    public /* synthetic */ a0(Object obj, int i5) {
        this.f320a = i5;
        this.f321b = obj;
    }

    @Override // c1.c
    public final Bundle a() {
        switch (this.f320a) {
            case 0:
                g.k kVar = (g.k) this.f321b;
                kVar.markFragmentsCreated();
                kVar.mFragmentLifecycleRegistry.e(androidx.lifecycle.m.ON_STOP);
                return new Bundle();
            default:
                return ((u0) this.f321b).V();
        }
    }
}
