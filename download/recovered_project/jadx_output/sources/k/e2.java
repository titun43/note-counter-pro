package k;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class e2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2 f2067a;

    public e2(g2 g2Var) {
        this.f2067a = g2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i5) {
        g2 g2Var = this.f2067a;
        c2 c2Var = g2Var.w;
        c0 c0Var = g2Var.E;
        if (i5 != 1 || c0Var.getInputMethodMode() == 2 || c0Var.getContentView() == null) {
            return;
        }
        g2Var.A.removeCallbacks(c2Var);
        c2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i5, int i6, int i7) {
    }
}
