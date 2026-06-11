package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import j.p;
import j.q;
import j.u;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class h {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ i E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f1751a;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f1758i;

    /* renamed from: j, reason: collision with root package name */
    public int f1759j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1760k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1761l;

    /* renamed from: m, reason: collision with root package name */
    public int f1762m;

    /* renamed from: n, reason: collision with root package name */
    public char f1763n;

    /* renamed from: o, reason: collision with root package name */
    public int f1764o;

    /* renamed from: p, reason: collision with root package name */
    public char f1765p;

    /* renamed from: q, reason: collision with root package name */
    public int f1766q;

    /* renamed from: r, reason: collision with root package name */
    public int f1767r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1768s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1769t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1770u;

    /* renamed from: v, reason: collision with root package name */
    public int f1771v;
    public int w;

    /* renamed from: x, reason: collision with root package name */
    public String f1772x;

    /* renamed from: y, reason: collision with root package name */
    public String f1773y;

    /* renamed from: z, reason: collision with root package name */
    public q f1774z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f1752b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1753c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1754d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f1755e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1756f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1757g = true;

    public h(i iVar, Menu menu) {
        this.E = iVar;
        this.f1751a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f1779c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        i iVar = this.E;
        Context context = iVar.f1779c;
        boolean z4 = false;
        menuItem.setChecked(this.f1768s).setVisible(this.f1769t).setEnabled(this.f1770u).setCheckable(this.f1767r >= 1).setTitleCondensed(this.f1761l).setIcon(this.f1762m);
        int i5 = this.f1771v;
        if (i5 >= 0) {
            menuItem.setShowAsAction(i5);
        }
        if (this.f1773y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (iVar.f1780d == null) {
                iVar.f1780d = i.a(context);
            }
            Object obj = iVar.f1780d;
            String str = this.f1773y;
            g gVar = new g();
            gVar.f1749a = obj;
            Class<?> cls = obj.getClass();
            try {
                gVar.f1750b = cls.getMethod(str, g.f1748c);
                menuItem.setOnMenuItemClickListener(gVar);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        if (this.f1767r >= 2) {
            if (menuItem instanceof p) {
                p pVar = (p) menuItem;
                pVar.f1988x = (pVar.f1988x & (-5)) | 4;
            } else if (menuItem instanceof u) {
                u uVar = (u) menuItem;
                a0.a aVar = uVar.f1998c;
                try {
                    if (uVar.f1999d == null) {
                        uVar.f1999d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    uVar.f1999d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e5) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e5);
                }
            }
        }
        String str2 = this.f1772x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, i.f1775e, iVar.f1777a));
            z4 = true;
        }
        int i6 = this.w;
        if (i6 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i6);
            }
        }
        q qVar = this.f1774z;
        if (qVar != null) {
            if (menuItem instanceof a0.a) {
                ((a0.a) menuItem).a(qVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z5 = menuItem instanceof a0.a;
        if (z5) {
            ((a0.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f0.n.e(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z5) {
            ((a0.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f0.n.i(menuItem, charSequence2);
        }
        char c5 = this.f1763n;
        int i7 = this.f1764o;
        if (z5) {
            ((a0.a) menuItem).setAlphabeticShortcut(c5, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f0.n.d(menuItem, c5, i7);
        }
        char c6 = this.f1765p;
        int i8 = this.f1766q;
        if (z5) {
            ((a0.a) menuItem).setNumericShortcut(c6, i8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            f0.n.h(menuItem, c6, i8);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z5) {
                ((a0.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f0.n.g(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z5) {
                ((a0.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                f0.n.f(menuItem, colorStateList);
            }
        }
    }
}
