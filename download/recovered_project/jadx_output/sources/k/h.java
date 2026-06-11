package k;

import android.content.Context;
import android.view.View;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class h extends j.x {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2100l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f2101m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Context context, j.n nVar, View view) {
        super(context, nVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f2101m = lVar;
        this.f2007f = 8388613;
        k1.j jVar = lVar.C;
        this.h = jVar;
        j.v vVar = this.f2009i;
        if (vVar != null) {
            vVar.e(jVar);
        }
    }

    @Override // j.x
    public final void c() {
        switch (this.f2100l) {
            case 0:
                l lVar = this.f2101m;
                lVar.f2155z = null;
                lVar.getClass();
                super.c();
                break;
            default:
                l lVar2 = this.f2101m;
                j.n nVar = lVar2.f2139i;
                if (nVar != null) {
                    nVar.c(true);
                }
                lVar2.f2154y = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Context context, j.f0 f0Var, View view) {
        super(context, f0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f2101m = lVar;
        if ((f0Var.A.f1988x & 32) != 32) {
            View view2 = lVar.f2145o;
            this.f2006e = view2 == null ? (View) lVar.f2144n : view2;
        }
        k1.j jVar = lVar.C;
        this.h = jVar;
        j.v vVar = this.f2009i;
        if (vVar != null) {
            vVar.e(jVar);
        }
    }
}
