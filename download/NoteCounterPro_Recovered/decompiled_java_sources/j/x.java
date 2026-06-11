package j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2002a;

    /* renamed from: b, reason: collision with root package name */
    public final n f2003b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2004c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2005d;

    /* renamed from: e, reason: collision with root package name */
    public View f2006e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2008g;
    public y h;

    /* renamed from: i, reason: collision with root package name */
    public v f2009i;

    /* renamed from: j, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2010j;

    /* renamed from: f, reason: collision with root package name */
    public int f2007f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final w f2011k = new w(this);

    public x(Context context, n nVar, View view, boolean z4, int i5, int i6) {
        this.f2002a = context;
        this.f2003b = nVar;
        this.f2006e = view;
        this.f2004c = z4;
        this.f2005d = i5;
    }

    public final v a() {
        v e0Var;
        if (this.f2009i == null) {
            Context context = this.f2002a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                e0Var = new h(context, this.f2006e, this.f2005d, this.f2004c);
            } else {
                e0Var = new e0(this.f2002a, this.f2003b, this.f2006e, this.f2005d, this.f2004c);
            }
            e0Var.l(this.f2003b);
            e0Var.r(this.f2011k);
            e0Var.n(this.f2006e);
            e0Var.e(this.h);
            e0Var.o(this.f2008g);
            e0Var.p(this.f2007f);
            this.f2009i = e0Var;
        }
        return this.f2009i;
    }

    public final boolean b() {
        v vVar = this.f2009i;
        return vVar != null && vVar.a();
    }

    public void c() {
        this.f2009i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2010j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i5, int i6, boolean z4, boolean z5) {
        v a5 = a();
        a5.s(z5);
        if (z4) {
            if ((Gravity.getAbsoluteGravity(this.f2007f, this.f2006e.getLayoutDirection()) & 7) == 5) {
                i5 -= this.f2006e.getWidth();
            }
            a5.q(i5);
            a5.t(i6);
            int i7 = (int) ((this.f2002a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a5.f2000g = new Rect(i5 - i7, i6 - i7, i5 + i7, i6 + i7);
        }
        a5.g();
    }
}
