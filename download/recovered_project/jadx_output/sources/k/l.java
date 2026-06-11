package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.lokhnathtechnical.notecounterpro.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements j.z {
    public j A;
    public i B;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2138g;
    public Context h;

    /* renamed from: i, reason: collision with root package name */
    public j.n f2139i;

    /* renamed from: j, reason: collision with root package name */
    public final LayoutInflater f2140j;

    /* renamed from: k, reason: collision with root package name */
    public j.y f2141k;

    /* renamed from: n, reason: collision with root package name */
    public j.b0 f2144n;

    /* renamed from: o, reason: collision with root package name */
    public k f2145o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2146p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2147q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2148r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2149s;

    /* renamed from: t, reason: collision with root package name */
    public int f2150t;

    /* renamed from: u, reason: collision with root package name */
    public int f2151u;

    /* renamed from: v, reason: collision with root package name */
    public int f2152v;
    public boolean w;

    /* renamed from: y, reason: collision with root package name */
    public h f2154y;

    /* renamed from: z, reason: collision with root package name */
    public h f2155z;

    /* renamed from: l, reason: collision with root package name */
    public final int f2142l = R.layout.abc_action_menu_layout;

    /* renamed from: m, reason: collision with root package name */
    public final int f2143m = R.layout.abc_action_menu_item_layout;

    /* renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f2153x = new SparseBooleanArray();
    public final k1.j C = new k1.j(this, 11);

    public l(Context context) {
        this.f2138g = context;
        this.f2140j = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.a0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(j.p pVar, View view, ViewGroup viewGroup) {
        View actionView = pVar.getActionView();
        if (actionView == null || pVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof j.a0 ? (j.a0) view : (j.a0) this.f2140j.inflate(this.f2143m, viewGroup, false);
            actionMenuItemView.c(pVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f2144n);
            if (this.B == null) {
                this.B = new i(this);
            }
            actionMenuItemView2.setPopupCallback(this.B);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(pVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof n)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // j.z
    public final void b(j.n nVar, boolean z4) {
        g();
        h hVar = this.f2155z;
        if (hVar != null && hVar.b()) {
            hVar.f2009i.dismiss();
        }
        j.y yVar = this.f2141k;
        if (yVar != null) {
            yVar.b(nVar, z4);
        }
    }

    @Override // j.z
    public final boolean c(j.p pVar) {
        return false;
    }

    @Override // j.z
    public final boolean d() {
        int i5;
        ArrayList arrayList;
        int i6;
        boolean z4;
        l lVar = this;
        j.n nVar = lVar.f2139i;
        if (nVar != null) {
            arrayList = nVar.l();
            i5 = arrayList.size();
        } else {
            i5 = 0;
            arrayList = null;
        }
        int i7 = lVar.f2152v;
        int i8 = lVar.f2151u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) lVar.f2144n;
        int i9 = 0;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i6 = 2;
            z4 = true;
            if (i9 >= i5) {
                break;
            }
            j.p pVar = (j.p) arrayList.get(i9);
            int i12 = pVar.f1989y;
            if ((i12 & 2) == 2) {
                i10++;
            } else if ((i12 & 1) == 1) {
                i11++;
            } else {
                z5 = true;
            }
            if (lVar.w && pVar.C) {
                i7 = 0;
            }
            i9++;
        }
        if (lVar.f2148r && (z5 || i11 + i10 > i7)) {
            i7--;
        }
        int i13 = i7 - i10;
        SparseBooleanArray sparseBooleanArray = lVar.f2153x;
        sparseBooleanArray.clear();
        int i14 = 0;
        int i15 = 0;
        while (i14 < i5) {
            j.p pVar2 = (j.p) arrayList.get(i14);
            int i16 = pVar2.f1989y;
            boolean z6 = (i16 & 2) == i6 ? z4 : false;
            int i17 = pVar2.f1968b;
            if (z6) {
                View a5 = lVar.a(pVar2, null, viewGroup);
                a5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a5.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z4);
                }
                pVar2.f(z4);
            } else if ((i16 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i17);
                boolean z8 = ((i13 > 0 || z7) && i8 > 0) ? z4 : false;
                if (z8) {
                    View a6 = lVar.a(pVar2, null, viewGroup);
                    a6.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a6.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z8 &= i8 + i15 > 0;
                }
                if (z8 && i17 != 0) {
                    sparseBooleanArray.put(i17, true);
                } else if (z7) {
                    sparseBooleanArray.put(i17, false);
                    for (int i18 = 0; i18 < i14; i18++) {
                        j.p pVar3 = (j.p) arrayList.get(i18);
                        if (pVar3.f1968b == i17) {
                            if ((pVar3.f1988x & 32) == 32) {
                                i13++;
                            }
                            pVar3.f(false);
                        }
                    }
                }
                if (z8) {
                    i13--;
                }
                pVar2.f(z8);
            } else {
                pVar2.f(false);
                i14++;
                i6 = 2;
                lVar = this;
                z4 = true;
            }
            i14++;
            i6 = 2;
            lVar = this;
            z4 = true;
        }
        return z4;
    }

    @Override // j.z
    public final void e(j.y yVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.z
    public final boolean f(j.f0 f0Var) {
        boolean z4;
        if (f0Var.hasVisibleItems()) {
            j.f0 f0Var2 = f0Var;
            while (true) {
                j.n nVar = f0Var2.f1908z;
                if (nVar == this.f2139i) {
                    break;
                }
                f0Var2 = (j.f0) nVar;
            }
            j.p pVar = f0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f2144n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i5);
                    if ((childAt instanceof j.a0) && ((j.a0) childAt).getItemData() == pVar) {
                        view = childAt;
                        break;
                    }
                    i5++;
                }
            }
            if (view != null) {
                f0Var.A.getClass();
                int size = f0Var.f1948f.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        z4 = false;
                        break;
                    }
                    MenuItem item = f0Var.getItem(i6);
                    if (item.isVisible() && item.getIcon() != null) {
                        z4 = true;
                        break;
                    }
                    i6++;
                }
                h hVar = new h(this, this.h, f0Var, view);
                this.f2155z = hVar;
                hVar.f2008g = z4;
                j.v vVar = hVar.f2009i;
                if (vVar != null) {
                    vVar.o(z4);
                }
                h hVar2 = this.f2155z;
                if (!hVar2.b()) {
                    if (hVar2.f2006e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    hVar2.d(0, 0, false, false);
                }
                j.y yVar = this.f2141k;
                if (yVar != null) {
                    yVar.k(f0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        Object obj;
        j jVar = this.A;
        if (jVar != null && (obj = this.f2144n) != null) {
            ((View) obj).removeCallbacks(jVar);
            this.A = null;
            return true;
        }
        h hVar = this.f2154y;
        if (hVar == null) {
            return false;
        }
        if (hVar.b()) {
            hVar.f2009i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.z
    public final void h() {
        int i5;
        ViewGroup viewGroup = (ViewGroup) this.f2144n;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            j.n nVar = this.f2139i;
            if (nVar != null) {
                nVar.i();
                ArrayList l5 = this.f2139i.l();
                int size = l5.size();
                i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    j.p pVar = (j.p) l5.get(i6);
                    if ((pVar.f1988x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i5);
                        j.p itemData = childAt instanceof j.a0 ? ((j.a0) childAt).getItemData() : null;
                        View a5 = a(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            a5.setPressed(false);
                            a5.jumpDrawablesToCurrentState();
                        }
                        if (a5 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a5.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a5);
                            }
                            ((ViewGroup) this.f2144n).addView(a5, i5);
                        }
                        i5++;
                    }
                }
            } else {
                i5 = 0;
            }
            while (i5 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i5) == this.f2145o) {
                    i5++;
                } else {
                    viewGroup.removeViewAt(i5);
                }
            }
        }
        ((View) this.f2144n).requestLayout();
        j.n nVar2 = this.f2139i;
        if (nVar2 != null) {
            nVar2.i();
            ArrayList arrayList2 = nVar2.f1950i;
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                j.q qVar = ((j.p) arrayList2.get(i7)).A;
            }
        }
        j.n nVar3 = this.f2139i;
        if (nVar3 != null) {
            nVar3.i();
            arrayList = nVar3.f1951j;
        }
        if (this.f2148r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((j.p) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f2145o == null) {
                this.f2145o = new k(this, this.f2138g);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2145o.getParent();
            if (viewGroup3 != this.f2144n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2145o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2144n;
                k kVar = this.f2145o;
                actionMenuView.getClass();
                n i8 = ActionMenuView.i();
                i8.f2164a = true;
                actionMenuView.addView(kVar, i8);
            }
        } else {
            k kVar2 = this.f2145o;
            if (kVar2 != null) {
                Object parent = kVar2.getParent();
                Object obj = this.f2144n;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2145o);
                }
            }
        }
        ((ActionMenuView) this.f2144n).setOverflowReserved(this.f2148r);
    }

    @Override // j.z
    public final void i(Context context, j.n nVar) {
        this.h = context;
        LayoutInflater.from(context);
        this.f2139i = nVar;
        Resources resources = context.getResources();
        if (!this.f2149s) {
            this.f2148r = true;
        }
        int i5 = 2;
        this.f2150t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i6 > 600 || ((i6 > 960 && i7 > 720) || (i6 > 720 && i7 > 960))) {
            i5 = 5;
        } else if (i6 >= 500 || ((i6 > 640 && i7 > 480) || (i6 > 480 && i7 > 640))) {
            i5 = 4;
        } else if (i6 >= 360) {
            i5 = 3;
        }
        this.f2152v = i5;
        int i8 = this.f2150t;
        if (this.f2148r) {
            if (this.f2145o == null) {
                k kVar = new k(this, this.f2138g);
                this.f2145o = kVar;
                if (this.f2147q) {
                    kVar.setImageDrawable(this.f2146p);
                    this.f2146p = null;
                    this.f2147q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2145o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i8 -= this.f2145o.getMeasuredWidth();
        } else {
            this.f2145o = null;
        }
        this.f2151u = i8;
        float f5 = resources.getDisplayMetrics().density;
    }

    public final boolean j() {
        h hVar = this.f2154y;
        return hVar != null && hVar.b();
    }

    @Override // j.z
    public final boolean k(j.p pVar) {
        return false;
    }

    public final boolean l() {
        j.n nVar;
        if (!this.f2148r || j() || (nVar = this.f2139i) == null || this.f2144n == null || this.A != null) {
            return false;
        }
        nVar.i();
        if (nVar.f1951j.isEmpty()) {
            return false;
        }
        j jVar = new j(this, new h(this, this.h, this.f2139i, this.f2145o));
        this.A = jVar;
        ((View) this.f2144n).post(jVar);
        return true;
    }
}
