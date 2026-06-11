package f0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class r1 extends a.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1412m;

    /* renamed from: n, reason: collision with root package name */
    public final Window f1413n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1414o;

    public r1(Window window, k1.j jVar, int i5) {
        WindowInsetsController insetsController;
        this.f1412m = i5;
        switch (i5) {
            case 1:
                insetsController = window.getInsetsController();
                this.f1414o = insetsController;
                this.f1413n = window;
                break;
            default:
                this.f1413n = window;
                this.f1414o = jVar;
                break;
        }
    }

    public void A(int i5) {
        View decorView = this.f1413n.getDecorView();
        decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
    }

    public void B(int i5) {
        View decorView = this.f1413n.getDecorView();
        decorView.setSystemUiVisibility((~i5) & decorView.getSystemUiVisibility());
    }

    @Override // a.a
    public final void n(int i5) {
        switch (this.f1412m) {
            case 0:
                for (int i6 = 1; i6 <= 512; i6 <<= 1) {
                    if ((i5 & i6) != 0) {
                        if (i6 == 1) {
                            A(4);
                        } else if (i6 == 2) {
                            A(2);
                        } else if (i6 == 8) {
                            ((u1.f) ((k1.j) this.f1414o).h).l();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f1414o).hide(i5 & (-9));
                break;
        }
    }

    @Override // a.a
    public void u(boolean z4) {
        switch (this.f1412m) {
            case 1:
                Window window = this.f1413n;
                if (!z4) {
                    if (window != null) {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
                    }
                    ((WindowInsetsController) this.f1414o).setSystemBarsAppearance(0, 16);
                    break;
                } else {
                    if (window != null) {
                        View decorView2 = window.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
                    }
                    ((WindowInsetsController) this.f1414o).setSystemBarsAppearance(16, 16);
                    break;
                }
        }
    }

    @Override // a.a
    public final void v(boolean z4) {
        switch (this.f1412m) {
            case 0:
                if (!z4) {
                    B(8192);
                    break;
                } else {
                    Window window = this.f1413n;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    A(8192);
                    break;
                }
            default:
                Window window2 = this.f1413n;
                if (!z4) {
                    if (window2 != null) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                    }
                    ((WindowInsetsController) this.f1414o).setSystemBarsAppearance(0, 8);
                    break;
                } else {
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
                    }
                    ((WindowInsetsController) this.f1414o).setSystemBarsAppearance(8, 8);
                    break;
                }
        }
    }

    @Override // a.a
    public final void x(int i5) {
        switch (this.f1412m) {
            case 0:
                for (int i6 = 1; i6 <= 512; i6 <<= 1) {
                    if ((i5 & i6) != 0) {
                        if (i6 == 1) {
                            B(4);
                            this.f1413n.clearFlags(1024);
                        } else if (i6 == 2) {
                            B(2);
                        } else if (i6 == 8) {
                            ((u1.f) ((k1.j) this.f1414o).h).o();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f1414o).show(i5 & (-9));
                break;
        }
    }
}
