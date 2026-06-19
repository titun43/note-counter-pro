package k;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2269g;
    public final /* synthetic */ Toolbar h;

    public /* synthetic */ w2(Toolbar toolbar, int i5) {
        this.f2269g = i5;
        this.h = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2269g) {
            case 0:
                y2 y2Var = this.h.S;
                j.p pVar = y2Var == null ? null : y2Var.h;
                if (pVar != null) {
                    pVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.h.m();
                break;
        }
    }
}
