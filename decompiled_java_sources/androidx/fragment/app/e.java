package androidx.fragment.app;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f372g = 0;
    public final /* synthetic */ Object h;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f372g) {
            case 0:
                n nVar = (n) this.h;
                g4.i.e(nVar, "this$0");
                g4.i.e(null, "$operation");
                nVar.a(null);
                return;
            default:
                Iterator it = ((u0) this.h).f451n.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    public /* synthetic */ e(u0 u0Var) {
        this.h = u0Var;
    }
}
