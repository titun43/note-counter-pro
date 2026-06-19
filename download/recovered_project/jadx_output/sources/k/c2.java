package k;

/* loaded from: classes.dex */
public final class c2 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2036g;
    public final /* synthetic */ g2 h;

    public /* synthetic */ c2(g2 g2Var, int i5) {
        this.f2036g = i5;
        this.h = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2036g) {
            case 0:
                t1 t1Var = this.h.f2072i;
                if (t1Var != null) {
                    t1Var.setListSelectionHidden(true);
                    t1Var.requestLayout();
                    break;
                }
                break;
            default:
                g2 g2Var = this.h;
                t1 t1Var2 = g2Var.f2072i;
                if (t1Var2 != null && t1Var2.isAttachedToWindow() && g2Var.f2072i.getCount() > g2Var.f2072i.getChildCount() && g2Var.f2072i.getChildCount() <= g2Var.f2082s) {
                    g2Var.E.setInputMethodMode(2);
                    g2Var.g();
                    break;
                }
                break;
        }
    }
}
