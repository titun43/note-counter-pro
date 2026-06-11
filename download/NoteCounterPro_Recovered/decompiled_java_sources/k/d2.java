package k;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class d2 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2 f2049a;

    public d2(g2 g2Var) {
        this.f2049a = g2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        g2 g2Var = this.f2049a;
        if (g2Var.E.isShowing()) {
            g2Var.g();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2049a.dismiss();
    }
}
