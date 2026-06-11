package j;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.lokhnathtechnical.notecounterpro.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.i2;
import k.j2;
import k.l2;
import k.t1;

/* loaded from: classes.dex */
public final class h extends v implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public y C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1912i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1913j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1914k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f1915l;

    /* renamed from: o, reason: collision with root package name */
    public final d f1918o;

    /* renamed from: p, reason: collision with root package name */
    public final e f1919p;

    /* renamed from: t, reason: collision with root package name */
    public View f1923t;

    /* renamed from: u, reason: collision with root package name */
    public View f1924u;

    /* renamed from: v, reason: collision with root package name */
    public int f1925v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1926x;

    /* renamed from: y, reason: collision with root package name */
    public int f1927y;

    /* renamed from: z, reason: collision with root package name */
    public int f1928z;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1916m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1917n = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final u1.f f1920q = new u1.f(this, 10);

    /* renamed from: r, reason: collision with root package name */
    public int f1921r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f1922s = 0;
    public boolean A = false;

    public h(Context context, View view, int i5, boolean z4) {
        int i6 = 0;
        this.f1918o = new d(this, i6);
        this.f1919p = new e(this, i6);
        this.h = context;
        this.f1923t = view;
        this.f1913j = i5;
        this.f1914k = z4;
        this.f1925v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1912i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1915l = new Handler();
    }

    @Override // j.d0
    public final boolean a() {
        ArrayList arrayList = this.f1917n;
        return arrayList.size() > 0 && ((g) arrayList.get(0)).f1909a.E.isShowing();
    }

    @Override // j.z
    public final void b(n nVar, boolean z4) {
        ArrayList arrayList = this.f1917n;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (nVar == ((g) arrayList.get(i5)).f1910b) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            return;
        }
        int i6 = i5 + 1;
        if (i6 < arrayList.size()) {
            ((g) arrayList.get(i6)).f1910b.c(false);
        }
        g gVar = (g) arrayList.remove(i5);
        n nVar2 = gVar.f1910b;
        l2 l2Var = gVar.f1909a;
        k.c0 c0Var = l2Var.E;
        nVar2.r(this);
        if (this.F) {
            i2.b(c0Var, null);
            c0Var.setAnimationStyle(0);
        }
        l2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f1925v = ((g) arrayList.get(size2 - 1)).f1911c;
        } else {
            this.f1925v = this.f1923t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((g) arrayList.get(0)).f1910b.c(false);
                return;
            }
            return;
        }
        dismiss();
        y yVar = this.C;
        if (yVar != null) {
            yVar.b(nVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.f1918o);
            }
            this.D = null;
        }
        this.f1924u.removeOnAttachStateChangeListener(this.f1919p);
        this.E.onDismiss();
    }

    @Override // j.z
    public final boolean d() {
        return false;
    }

    @Override // j.d0
    public final void dismiss() {
        ArrayList arrayList = this.f1917n;
        int size = arrayList.size();
        if (size > 0) {
            g[] gVarArr = (g[]) arrayList.toArray(new g[size]);
            for (int i5 = size - 1; i5 >= 0; i5--) {
                g gVar = gVarArr[i5];
                if (gVar.f1909a.E.isShowing()) {
                    gVar.f1909a.dismiss();
                }
            }
        }
    }

    @Override // j.z
    public final void e(y yVar) {
        this.C = yVar;
    }

    @Override // j.z
    public final boolean f(f0 f0Var) {
        ArrayList arrayList = this.f1917n;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            g gVar = (g) obj;
            if (f0Var == gVar.f1910b) {
                gVar.f1909a.f2072i.requestFocus();
                return true;
            }
        }
        if (!f0Var.hasVisibleItems()) {
            return false;
        }
        l(f0Var);
        y yVar = this.C;
        if (yVar != null) {
            yVar.k(f0Var);
        }
        return true;
    }

    @Override // j.d0
    public final void g() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f1916m;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            u((n) obj);
        }
        arrayList.clear();
        View view = this.f1923t;
        this.f1924u = view;
        if (view != null) {
            boolean z4 = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1918o);
            }
            this.f1924u.addOnAttachStateChangeListener(this.f1919p);
        }
    }

    @Override // j.z
    public final void h() {
        ArrayList arrayList = this.f1917n;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ListAdapter adapter = ((g) obj).f1909a.f2072i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((k) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.d0
    public final t1 j() {
        ArrayList arrayList = this.f1917n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((g) arrayList.get(arrayList.size() - 1)).f1909a.f2072i;
    }

    @Override // j.v
    public final void l(n nVar) {
        nVar.b(this, this.h);
        if (a()) {
            u(nVar);
        } else {
            this.f1916m.add(nVar);
        }
    }

    @Override // j.v
    public final void n(View view) {
        if (this.f1923t != view) {
            this.f1923t = view;
            this.f1922s = Gravity.getAbsoluteGravity(this.f1921r, view.getLayoutDirection());
        }
    }

    @Override // j.v
    public final void o(boolean z4) {
        this.A = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g gVar;
        ArrayList arrayList = this.f1917n;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                gVar = null;
                break;
            }
            gVar = (g) arrayList.get(i5);
            if (!gVar.f1909a.E.isShowing()) {
                break;
            } else {
                i5++;
            }
        }
        if (gVar != null) {
            gVar.f1910b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i5 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.v
    public final void p(int i5) {
        if (this.f1921r != i5) {
            this.f1921r = i5;
            this.f1922s = Gravity.getAbsoluteGravity(i5, this.f1923t.getLayoutDirection());
        }
    }

    @Override // j.v
    public final void q(int i5) {
        this.w = true;
        this.f1927y = i5;
    }

    @Override // j.v
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // j.v
    public final void s(boolean z4) {
        this.B = z4;
    }

    @Override // j.v
    public final void t(int i5) {
        this.f1926x = true;
        this.f1928z = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0161, code lost:
    
        if (((r9.getWidth() + r11[0]) + r5) > r10.right) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0163, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        if ((r11[0] - r5) < 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(n nVar) {
        boolean z4;
        int i5;
        g gVar;
        View view;
        int i6;
        int i7;
        int i8;
        int width;
        MenuItem menuItem;
        k kVar;
        int i9;
        int firstVisiblePosition;
        Context context = this.h;
        LayoutInflater from = LayoutInflater.from(context);
        k kVar2 = new k(nVar, from, this.f1914k, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.A) {
            kVar2.f1938c = true;
        } else if (a()) {
            int size = nVar.f1948f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = nVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i10++;
            }
            kVar2.f1938c = z4;
        }
        int m5 = v.m(kVar2, context, this.f1912i);
        l2 l2Var = new l2(context, null, this.f1913j);
        l2Var.H = this.f1920q;
        l2Var.f2085v = this;
        l2Var.E.setOnDismissListener(this);
        l2Var.f2084u = this.f1923t;
        l2Var.f2081r = this.f1922s;
        l2Var.D = true;
        l2Var.E.setFocusable(true);
        l2Var.E.setInputMethodMode(2);
        l2Var.p(kVar2);
        l2Var.r(m5);
        l2Var.f2081r = this.f1922s;
        ArrayList arrayList = this.f1917n;
        if (arrayList.size() > 0) {
            gVar = (g) arrayList.get(arrayList.size() - 1);
            n nVar2 = gVar.f1910b;
            int size2 = nVar2.f1948f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = nVar2.getItem(i11);
                if (menuItem.hasSubMenu() && nVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (menuItem == null) {
                i5 = 1;
                view = null;
            } else {
                t1 t1Var = gVar.f1909a.f2072i;
                ListAdapter adapter = t1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i9 = headerViewListAdapter.getHeadersCount();
                    kVar = (k) headerViewListAdapter.getWrappedAdapter();
                } else {
                    kVar = (k) adapter;
                    i9 = 0;
                }
                int count = kVar.getCount();
                i5 = 1;
                int i12 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (menuItem == kVar.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1 && (firstVisiblePosition = (i12 + i9) - t1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < t1Var.getChildCount()) {
                    view = t1Var.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i13 = Build.VERSION.SDK_INT;
                k.c0 c0Var = l2Var.E;
                if (i13 <= 28) {
                    Method method = l2.I;
                    if (method != null) {
                        try {
                            method.invoke(c0Var, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    j2.a(c0Var, false);
                }
                i2.a(l2Var.E, null);
                t1 t1Var2 = ((g) arrayList.get(arrayList.size() - 1)).f1909a.f2072i;
                int[] iArr = new int[2];
                t1Var2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f1924u.getWindowVisibleDisplayFrame(rect);
                if (this.f1925v == i5) {
                }
                boolean z5 = i6 == 1;
                this.f1925v = i6;
                if (Build.VERSION.SDK_INT >= 26) {
                    l2Var.f2084u = view;
                    i8 = 0;
                    i7 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f1923t.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f1922s & 7) == 5) {
                        iArr2[0] = this.f1923t.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i7 = iArr3[0] - iArr2[0];
                    i8 = iArr3[1] - iArr2[1];
                }
                if ((this.f1922s & 5) != 5) {
                    if (z5) {
                        width = i7 + view.getWidth();
                        l2Var.f2075l = width;
                        l2Var.f2080q = true;
                        l2Var.f2079p = true;
                        l2Var.l(i8);
                    }
                    width = i7 - m5;
                    l2Var.f2075l = width;
                    l2Var.f2080q = true;
                    l2Var.f2079p = true;
                    l2Var.l(i8);
                } else if (z5) {
                    width = i7 + m5;
                    l2Var.f2075l = width;
                    l2Var.f2080q = true;
                    l2Var.f2079p = true;
                    l2Var.l(i8);
                } else {
                    m5 = view.getWidth();
                    width = i7 - m5;
                    l2Var.f2075l = width;
                    l2Var.f2080q = true;
                    l2Var.f2079p = true;
                    l2Var.l(i8);
                }
            } else {
                if (this.w) {
                    l2Var.f2075l = this.f1927y;
                }
                if (this.f1926x) {
                    l2Var.l(this.f1928z);
                }
                Rect rect2 = this.f2000g;
                l2Var.C = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new g(l2Var, nVar, this.f1925v));
            l2Var.g();
            t1 t1Var3 = l2Var.f2072i;
            t1Var3.setOnKeyListener(this);
            if (gVar == null || !this.B || nVar.f1954m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) t1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(nVar.f1954m);
            t1Var3.addHeaderView(frameLayout, null, false);
            l2Var.g();
            return;
        }
        i5 = 1;
        gVar = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new g(l2Var, nVar, this.f1925v));
        l2Var.g();
        t1 t1Var32 = l2Var.f2072i;
        t1Var32.setOnKeyListener(this);
        if (gVar == null) {
        }
    }
}
