package g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import com.google.android.gms.ads.AdRequest;
import f0.w0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.d3;
import k.l1;
import k.l3;

/* loaded from: classes.dex */
public final class f0 extends r implements j.l, LayoutInflater.Factory2 {

    /* renamed from: n0, reason: collision with root package name */
    public static final o.l f1528n0 = new o.l(0);

    /* renamed from: o0, reason: collision with root package name */
    public static final int[] f1529o0 = {R.attr.windowBackground};

    /* renamed from: p0, reason: collision with root package name */
    public static final boolean f1530p0 = !"robolectric".equals(Build.FINGERPRINT);
    public i.b A;
    public ActionBarContextView B;
    public PopupWindow C;
    public s D;
    public boolean F;
    public ViewGroup G;
    public TextView H;
    public View I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public e0[] R;
    public e0 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f1531a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1532b0;

    /* renamed from: c0, reason: collision with root package name */
    public a0 f1533c0;

    /* renamed from: d0, reason: collision with root package name */
    public a0 f1534d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1535e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f1536f0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1538h0;

    /* renamed from: i0, reason: collision with root package name */
    public Rect f1539i0;

    /* renamed from: j0, reason: collision with root package name */
    public Rect f1540j0;

    /* renamed from: k0, reason: collision with root package name */
    public i0 f1541k0;
    public OnBackInvokedDispatcher l0;

    /* renamed from: m0, reason: collision with root package name */
    public OnBackInvokedCallback f1542m0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f1543p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f1544q;

    /* renamed from: r, reason: collision with root package name */
    public Window f1545r;

    /* renamed from: s, reason: collision with root package name */
    public z f1546s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f1547t;

    /* renamed from: u, reason: collision with root package name */
    public a f1548u;

    /* renamed from: v, reason: collision with root package name */
    public i.i f1549v;
    public CharSequence w;

    /* renamed from: x, reason: collision with root package name */
    public l1 f1550x;

    /* renamed from: y, reason: collision with root package name */
    public t f1551y;

    /* renamed from: z, reason: collision with root package name */
    public u f1552z;
    public w0 E = null;

    /* renamed from: g0, reason: collision with root package name */
    public final s f1537g0 = new s(this, 0);

    public f0(Context context, Window window, l lVar, Object obj) {
        k kVar = null;
        this.Y = -100;
        this.f1544q = context;
        this.f1547t = lVar;
        this.f1543p = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof k)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        kVar = (k) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (kVar != null) {
                this.Y = ((f0) kVar.getDelegate()).Y;
            }
        }
        if (this.Y == -100) {
            String name = this.f1543p.getClass().getName();
            o.l lVar2 = f1528n0;
            Integer num = (Integer) lVar2.get(name);
            if (num != null) {
                this.Y = num.intValue();
                lVar2.remove(this.f1543p.getClass().getName());
            }
        }
        if (window != null) {
            q(window);
        }
        k.v.c();
    }

    public static b0.g r(Context context) {
        b0.g gVar;
        b0.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = r.f1613i) == null) {
            return null;
        }
        b0.h hVar = gVar.f689a;
        b0.g b2 = x.b(context.getApplicationContext().getResources().getConfiguration());
        if (gVar.b()) {
            gVar2 = b0.g.f688b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i5 = 0;
            while (i5 < b2.f689a.f690a.size() + hVar.f690a.size()) {
                Locale locale = i5 < hVar.f690a.size() ? hVar.f690a.get(i5) : b2.f689a.f690a.get(i5 - hVar.f690a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i5++;
            }
            gVar2 = new b0.g(new b0.h(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.b() ? b2 : gVar2;
    }

    public static Configuration v(Context context, int i5, b0.g gVar, Configuration configuration, boolean z4) {
        int i6 = i5 != 1 ? i5 != 2 ? z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i6 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            x.d(configuration2, gVar);
        }
        return configuration2;
    }

    public final c0 A(Context context) {
        if (this.f1533c0 == null) {
            if (androidx.emoji2.text.t.f282k == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.emoji2.text.t.f282k = new androidx.emoji2.text.t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1533c0 = new a0(this, androidx.emoji2.text.t.f282k);
        }
        return this.f1533c0;
    }

    public final e0 B(int i5) {
        e0[] e0VarArr = this.R;
        if (e0VarArr == null || e0VarArr.length <= i5) {
            e0[] e0VarArr2 = new e0[i5 + 1];
            if (e0VarArr != null) {
                System.arraycopy(e0VarArr, 0, e0VarArr2, 0, e0VarArr.length);
            }
            this.R = e0VarArr2;
            e0VarArr = e0VarArr2;
        }
        e0 e0Var = e0VarArr[i5];
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0();
        e0Var2.f1512a = i5;
        e0Var2.f1524n = false;
        e0VarArr[i5] = e0Var2;
        return e0Var2;
    }

    public final void C() {
        y();
        if (this.L && this.f1548u == null) {
            Object obj = this.f1543p;
            if (obj instanceof Activity) {
                this.f1548u = new s0(this.M, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.f1548u = new s0((Dialog) obj);
            }
            a aVar = this.f1548u;
            if (aVar != null) {
                aVar.l(this.f1538h0);
            }
        }
    }

    public final void D(int i5) {
        this.f1536f0 = (1 << i5) | this.f1536f0;
        if (this.f1535e0) {
            return;
        }
        View decorView = this.f1545r.getDecorView();
        WeakHashMap weakHashMap = f0.r0.f1407a;
        decorView.postOnAnimation(this.f1537g0);
        this.f1535e0 = true;
    }

    public final int E(Context context, int i5) {
        if (i5 != -100) {
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1 && i5 != 2) {
                        if (i5 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f1534d0 == null) {
                            this.f1534d0 = new a0(this, context);
                        }
                        return this.f1534d0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return A(context).e();
                }
            }
            return i5;
        }
        return -1;
    }

    public final boolean F() {
        boolean z4 = this.T;
        this.T = false;
        e0 B = B(0);
        if (!B.f1523m) {
            i.b bVar = this.A;
            if (bVar != null) {
                bVar.a();
                return true;
            }
            C();
            a aVar = this.f1548u;
            if (aVar == null || !aVar.b()) {
                return false;
            }
        } else if (!z4) {
            u(B, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0175, code lost:
    
        if (r2.f1935l.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(e0 e0Var, KeyEvent keyEvent) {
        int i5;
        ViewGroup.LayoutParams layoutParams;
        boolean z4 = e0Var.f1523m;
        int i6 = e0Var.f1512a;
        if (z4 || this.W) {
            return;
        }
        Context context = this.f1544q;
        if (i6 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f1545r.getCallback();
        if (callback != null && !callback.onMenuOpened(i6, e0Var.h)) {
            u(e0Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !I(e0Var, keyEvent)) {
            return;
        }
        d0 d0Var = e0Var.f1516e;
        if (d0Var == null || e0Var.f1524n) {
            if (d0Var == null) {
                C();
                a aVar = this.f1548u;
                Context e4 = aVar != null ? aVar.e() : null;
                if (e4 != null) {
                    context = e4;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.actionBarPopupTheme, typedValue, true);
                int i7 = typedValue.resourceId;
                if (i7 != 0) {
                    newTheme.applyStyle(i7, true);
                }
                newTheme.resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.panelMenuListTheme, typedValue, true);
                int i8 = typedValue.resourceId;
                if (i8 != 0) {
                    newTheme.applyStyle(i8, true);
                } else {
                    newTheme.applyStyle(com.lokhnathtechnical.notecounterpro.R.style.Theme_AppCompat_CompactMenu, true);
                }
                i.d dVar = new i.d(context, 0);
                dVar.getTheme().setTo(newTheme);
                e0Var.f1520j = dVar;
                TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.a.f1318j);
                e0Var.f1513b = obtainStyledAttributes.getResourceId(86, 0);
                e0Var.f1515d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                e0Var.f1516e = new d0(this, e0Var.f1520j);
                e0Var.f1514c = 81;
            } else if (e0Var.f1524n && d0Var.getChildCount() > 0) {
                e0Var.f1516e.removeAllViews();
            }
            View view = e0Var.f1518g;
            if (view == null) {
                if (e0Var.h != null) {
                    if (this.f1552z == null) {
                        this.f1552z = new u(this);
                    }
                    u uVar = this.f1552z;
                    if (e0Var.f1519i == null) {
                        j.j jVar = new j.j(e0Var.f1520j);
                        e0Var.f1519i = jVar;
                        jVar.f1934k = uVar;
                        j.n nVar = e0Var.h;
                        nVar.b(jVar, nVar.f1943a);
                    }
                    j.j jVar2 = e0Var.f1519i;
                    d0 d0Var2 = e0Var.f1516e;
                    if (jVar2.f1933j == null) {
                        jVar2.f1933j = (ExpandedMenuView) jVar2.h.inflate(com.lokhnathtechnical.notecounterpro.R.layout.abc_expanded_menu_layout, (ViewGroup) d0Var2, false);
                        if (jVar2.f1935l == null) {
                            jVar2.f1935l = new j.i(jVar2);
                        }
                        jVar2.f1933j.setAdapter((ListAdapter) jVar2.f1935l);
                        jVar2.f1933j.setOnItemClickListener(jVar2);
                    }
                    ExpandedMenuView expandedMenuView = jVar2.f1933j;
                    e0Var.f1517f = expandedMenuView;
                }
                e0Var.f1524n = true;
                return;
            }
            e0Var.f1517f = view;
            if (e0Var.f1517f != null) {
                if (e0Var.f1518g == null) {
                    j.j jVar3 = e0Var.f1519i;
                    if (jVar3.f1935l == null) {
                        jVar3.f1935l = new j.i(jVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = e0Var.f1517f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                e0Var.f1516e.setBackgroundResource(e0Var.f1513b);
                ViewParent parent = e0Var.f1517f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(e0Var.f1517f);
                }
                e0Var.f1516e.addView(e0Var.f1517f, layoutParams2);
                if (!e0Var.f1517f.hasFocus()) {
                    e0Var.f1517f.requestFocus();
                }
            }
            e0Var.f1524n = true;
            return;
        }
        View view2 = e0Var.f1518g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i5 = -1;
            e0Var.f1522l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i5, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = e0Var.f1514c;
            layoutParams3.windowAnimations = e0Var.f1515d;
            windowManager.addView(e0Var.f1516e, layoutParams3);
            e0Var.f1523m = true;
            if (i6 != 0) {
                K();
                return;
            }
            return;
        }
        i5 = -2;
        e0Var.f1522l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i5, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = e0Var.f1514c;
        layoutParams32.windowAnimations = e0Var.f1515d;
        windowManager.addView(e0Var.f1516e, layoutParams32);
        e0Var.f1523m = true;
        if (i6 != 0) {
        }
    }

    public final boolean H(e0 e0Var, int i5, KeyEvent keyEvent) {
        j.n nVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((e0Var.f1521k || I(e0Var, keyEvent)) && (nVar = e0Var.h) != null) {
            return nVar.performShortcut(i5, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(e0 e0Var, KeyEvent keyEvent) {
        l1 l1Var;
        l1 l1Var2;
        Resources.Theme theme;
        l1 l1Var3;
        l1 l1Var4;
        if (!this.W) {
            boolean z4 = e0Var.f1521k;
            int i5 = e0Var.f1512a;
            if (z4) {
                return true;
            }
            e0 e0Var2 = this.S;
            if (e0Var2 != null && e0Var2 != e0Var) {
                u(e0Var2, false);
            }
            Window.Callback callback = this.f1545r.getCallback();
            if (callback != null) {
                e0Var.f1518g = callback.onCreatePanelView(i5);
            }
            boolean z5 = i5 == 0 || i5 == 108;
            if (z5 && (l1Var4 = this.f1550x) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var4;
                actionBarOverlayLayout.k();
                ((d3) actionBarOverlayLayout.f128k).f2060l = true;
            }
            if (e0Var.f1518g == null && (!z5 || !(this.f1548u instanceof n0))) {
                j.n nVar = e0Var.h;
                if (nVar == null || e0Var.f1525o) {
                    if (nVar == null) {
                        Context context = this.f1544q;
                        if ((i5 == 0 || i5 == 108) && this.f1550x != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                i.d dVar = new i.d(context, 0);
                                dVar.getTheme().setTo(theme);
                                context = dVar;
                            }
                        }
                        j.n nVar2 = new j.n(context);
                        nVar2.f1947e = this;
                        j.n nVar3 = e0Var.h;
                        if (nVar2 != nVar3) {
                            if (nVar3 != null) {
                                nVar3.r(e0Var.f1519i);
                            }
                            e0Var.h = nVar2;
                            j.j jVar = e0Var.f1519i;
                            if (jVar != null) {
                                nVar2.b(jVar, nVar2.f1943a);
                            }
                        }
                    }
                    if (z5 && (l1Var2 = this.f1550x) != null) {
                        if (this.f1551y == null) {
                            this.f1551y = new t(this);
                        }
                        ((ActionBarOverlayLayout) l1Var2).l(e0Var.h, this.f1551y);
                    }
                    e0Var.h.w();
                    if (callback.onCreatePanelMenu(i5, e0Var.h)) {
                        e0Var.f1525o = false;
                    } else {
                        j.n nVar4 = e0Var.h;
                        if (nVar4 != null) {
                            if (nVar4 != null) {
                                nVar4.r(e0Var.f1519i);
                            }
                            e0Var.h = null;
                        }
                        if (z5 && (l1Var = this.f1550x) != null) {
                            ((ActionBarOverlayLayout) l1Var).l(null, this.f1551y);
                        }
                    }
                }
                e0Var.h.w();
                Bundle bundle = e0Var.f1526p;
                if (bundle != null) {
                    e0Var.h.s(bundle);
                    e0Var.f1526p = null;
                }
                if (!callback.onPreparePanel(0, e0Var.f1518g, e0Var.h)) {
                    if (z5 && (l1Var3 = this.f1550x) != null) {
                        ((ActionBarOverlayLayout) l1Var3).l(null, this.f1551y);
                    }
                    e0Var.h.v();
                    return false;
                }
                e0Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                e0Var.h.v();
            }
            e0Var.f1521k = true;
            e0Var.f1522l = false;
            this.S = e0Var;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.l0 != null && (B(0).f1523m || this.A != null)) {
                z4 = true;
            }
            if (z4 && this.f1542m0 == null) {
                this.f1542m0 = y.b(this.l0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f1542m0) == null) {
                    return;
                }
                y.c(this.l0, onBackInvokedCallback);
                this.f1542m0 = null;
            }
        }
    }

    @Override // g.r
    public final void b() {
        LayoutInflater from = LayoutInflater.from(this.f1544q);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof f0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // g.r
    public final void c() {
        if (this.f1548u != null) {
            C();
            if (this.f1548u.f()) {
                return;
            }
            D(0);
        }
    }

    @Override // g.r
    public final void e() {
        String str;
        this.U = true;
        p(false, true);
        z();
        Object obj = this.f1543p;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = u.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                a aVar = this.f1548u;
                if (aVar == null) {
                    this.f1538h0 = true;
                } else {
                    aVar.l(true);
                }
            }
            synchronized (r.f1618n) {
                r.i(this);
                r.f1617m.add(new WeakReference(this));
            }
        }
        this.X = new Configuration(this.f1544q.getResources().getConfiguration());
        this.V = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // j.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(j.n nVar) {
        ActionMenuView actionMenuView;
        k.l lVar;
        l1 l1Var = this.f1550x;
        if (l1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((d3) actionBarOverlayLayout.f128k).f2050a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f163g) != null && actionMenuView.f145y) {
                if (ViewConfiguration.get(this.f1544q).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1550x;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((d3) actionBarOverlayLayout2.f128k).f2050a.f163g;
                    if (actionMenuView2 != null) {
                        k.l lVar2 = actionMenuView2.f146z;
                        if (lVar2 != null) {
                            if (lVar2.A == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f1545r.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1550x;
                actionBarOverlayLayout3.k();
                if (((d3) actionBarOverlayLayout3.f128k).f2050a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1550x;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((d3) actionBarOverlayLayout4.f128k).f2050a.f163g;
                    if (actionMenuView3 != null && (lVar = actionMenuView3.f146z) != null) {
                        lVar.g();
                    }
                    if (this.W) {
                        return;
                    }
                    callback.onPanelClosed(108, B(0).h);
                    return;
                }
                if (callback == null || this.W) {
                    return;
                }
                if (this.f1535e0 && (1 & this.f1536f0) != 0) {
                    View decorView = this.f1545r.getDecorView();
                    s sVar = this.f1537g0;
                    decorView.removeCallbacks(sVar);
                    sVar.run();
                }
                e0 B = B(0);
                j.n nVar2 = B.h;
                if (nVar2 == null || B.f1525o || !callback.onPreparePanel(0, B.f1518g, nVar2)) {
                    return;
                }
                callback.onMenuOpened(108, B.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f1550x;
                actionBarOverlayLayout5.k();
                ((d3) actionBarOverlayLayout5.f128k).f2050a.u();
                return;
            }
        }
        e0 B2 = B(0);
        B2.f1524n = true;
        u(B2, false);
        G(B2, null);
    }

    @Override // j.l
    public final boolean g(j.n nVar, MenuItem menuItem) {
        e0 e0Var;
        Window.Callback callback = this.f1545r.getCallback();
        if (callback != null && !this.W) {
            j.n k5 = nVar.k();
            e0[] e0VarArr = this.R;
            int length = e0VarArr != null ? e0VarArr.length : 0;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    e0Var = e0VarArr[i5];
                    if (e0Var != null && e0Var.h == k5) {
                        break;
                    }
                    i5++;
                } else {
                    e0Var = null;
                    break;
                }
            }
            if (e0Var != null) {
                return callback.onMenuItemSelected(e0Var.f1512a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // g.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        a aVar;
        a0 a0Var;
        a0 a0Var2;
        if (this.f1543p instanceof Activity) {
            synchronized (r.f1618n) {
                r.i(this);
            }
        }
        if (this.f1535e0) {
            this.f1545r.getDecorView().removeCallbacks(this.f1537g0);
        }
        this.W = true;
        if (this.Y != -100) {
            Object obj = this.f1543p;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1528n0.put(this.f1543p.getClass().getName(), Integer.valueOf(this.Y));
                aVar = this.f1548u;
                if (aVar != null) {
                    aVar.h();
                }
                a0Var = this.f1533c0;
                if (a0Var != null) {
                    a0Var.c();
                }
                a0Var2 = this.f1534d0;
                if (a0Var2 == null) {
                    a0Var2.c();
                    return;
                }
                return;
            }
        }
        f1528n0.remove(this.f1543p.getClass().getName());
        aVar = this.f1548u;
        if (aVar != null) {
        }
        a0Var = this.f1533c0;
        if (a0Var != null) {
        }
        a0Var2 = this.f1534d0;
        if (a0Var2 == null) {
        }
    }

    @Override // g.r
    public final boolean j(int i5) {
        if (i5 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i5 = 108;
        } else if (i5 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i5 = 109;
        }
        if (this.P && i5 == 108) {
            return false;
        }
        if (this.L && i5 == 1) {
            this.L = false;
        }
        if (i5 == 1) {
            J();
            this.P = true;
            return true;
        }
        if (i5 == 2) {
            J();
            this.J = true;
            return true;
        }
        if (i5 == 5) {
            J();
            this.K = true;
            return true;
        }
        if (i5 == 10) {
            J();
            this.N = true;
            return true;
        }
        if (i5 == 108) {
            J();
            this.L = true;
            return true;
        }
        if (i5 != 109) {
            return this.f1545r.requestFeature(i5);
        }
        J();
        this.M = true;
        return true;
    }

    @Override // g.r
    public final void k(int i5) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1544q).inflate(i5, viewGroup);
        this.f1546s.a(this.f1545r.getCallback());
    }

    @Override // g.r
    public final void l(View view) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1546s.a(this.f1545r.getCallback());
    }

    @Override // g.r
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1546s.a(this.f1545r.getCallback());
    }

    @Override // g.r
    public final void n(CharSequence charSequence) {
        this.w = charSequence;
        l1 l1Var = this.f1550x;
        if (l1Var != null) {
            l1Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f1548u;
        if (aVar != null) {
            aVar.n(charSequence);
            return;
        }
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Type inference failed for: r1v1, types: [g.l, java.lang.Object] */
    @Override // g.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i.b o(i.a aVar) {
        i.b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        i.b bVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        i.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.a();
        }
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, aVar, 9, false);
        C();
        a aVar2 = this.f1548u;
        ?? r12 = this.f1547t;
        if (aVar2 != null) {
            i.b o2 = aVar2.o(pVar);
            this.A = o2;
            if (o2 != null) {
                r12.onSupportActionModeStarted(o2);
            }
        }
        if (this.A == null) {
            w0 w0Var = this.E;
            if (w0Var != null) {
                w0Var.b();
            }
            i.b bVar3 = this.A;
            if (bVar3 != null) {
                bVar3.a();
            }
            if (!this.W) {
                try {
                    onWindowStartingSupportActionMode = r12.onWindowStartingSupportActionMode(pVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.A = onWindowStartingSupportActionMode;
                } else {
                    int i5 = 1;
                    if (this.B == null) {
                        boolean z4 = this.O;
                        Context context = this.f1544q;
                        if (z4) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                i.d dVar = new i.d(context, 0);
                                dVar.getTheme().setTo(newTheme);
                                context = dVar;
                            }
                            this.B = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.lokhnathtechnical.notecounterpro.R.attr.actionModePopupWindowStyle);
                            this.C = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            this.C.setContentView(this.B);
                            this.C.setWidth(-1);
                            context.getTheme().resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.actionBarSize, typedValue, true);
                            this.B.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.C.setHeight(-2);
                            this.D = new s(this, i5);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.G.findViewById(com.lokhnathtechnical.notecounterpro.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                C();
                                a aVar3 = this.f1548u;
                                Context e4 = aVar3 != null ? aVar3.e() : null;
                                if (e4 != null) {
                                    context = e4;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.B = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.B != null) {
                        w0 w0Var2 = this.E;
                        if (w0Var2 != null) {
                            w0Var2.b();
                        }
                        this.B.e();
                        Context context2 = this.B.getContext();
                        ActionBarContextView actionBarContextView = this.B;
                        i.e eVar = new i.e();
                        eVar.f1740i = context2;
                        eVar.f1741j = actionBarContextView;
                        eVar.f1742k = pVar;
                        j.n nVar = new j.n(actionBarContextView.getContext());
                        nVar.f1953l = 1;
                        eVar.f1745n = nVar;
                        nVar.f1947e = eVar;
                        if (((i.a) pVar.h).g(eVar, nVar)) {
                            eVar.i();
                            this.B.c(eVar);
                            this.A = eVar;
                            if (this.F && (viewGroup = this.G) != null && viewGroup.isLaidOut()) {
                                this.B.setAlpha(0.0f);
                                w0 a5 = f0.r0.a(this.B);
                                a5.a(1.0f);
                                this.E = a5;
                                a5.d(new v(this, i5));
                            } else {
                                this.B.setAlpha(1.0f);
                                this.B.setVisibility(0);
                                if (this.B.getParent() instanceof View) {
                                    View view = (View) this.B.getParent();
                                    WeakHashMap weakHashMap = f0.r0.f1407a;
                                    f0.i0.c(view);
                                }
                            }
                            if (this.C != null) {
                                this.f1545r.getDecorView().post(this.D);
                            }
                        } else {
                            this.A = null;
                        }
                    }
                }
                bVar = this.A;
                if (bVar != null) {
                    r12.onSupportActionModeStarted(bVar);
                }
                K();
                this.A = this.A;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            bVar = this.A;
            if (bVar != null) {
            }
            K();
            this.A = this.A;
        }
        K();
        return this.A;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e8
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(boolean z4, boolean z5) {
        int i5;
        Configuration configuration;
        b0.g b2;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        Object obj;
        Object obj2;
        Activity activity;
        if (this.W) {
            return false;
        }
        int i7 = this.Y;
        if (i7 == -100) {
            i7 = r.h;
        }
        Context context = this.f1544q;
        int E = E(context, i7);
        int i8 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        b0.g r2 = i8 < 33 ? r(context) : null;
        if (!z5 && r2 != null) {
            r2 = x.b(context.getResources().getConfiguration());
        }
        Configuration v5 = v(context, E, r2, null, false);
        boolean z9 = this.f1532b0;
        Object obj3 = this.f1543p;
        if (!z9 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i5 = 0;
                configuration = this.X;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i9 = configuration.uiMode & 48;
                int i10 = v5.uiMode & 48;
                b0.g b5 = x.b(configuration);
                b2 = r2 != null ? null : x.b(v5);
                i6 = i9 == i10 ? AdRequest.MAX_CONTENT_URL_LENGTH : 0;
                if (b2 != null && !b5.equals(b2)) {
                    i6 |= 8196;
                }
                if (((~i5) & i6) != 0 && z4 && this.U && ((f1530p0 || this.V) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31 && (i6 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(v5.getLayoutDirection());
                        }
                        if (i11 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new androidx.activity.o(activity, 7));
                        }
                        z6 = true;
                        if (!z6 || i6 == 0) {
                            z7 = z6;
                        } else {
                            boolean z10 = (i5 & i6) == i6;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i10;
                            if (b2 != null) {
                                x.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i12 = Build.VERSION.SDK_INT;
                            if (i12 < 26 && i12 < 28) {
                                if (!y4.b.h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        y4.b.f3886g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e4) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
                                    }
                                    y4.b.h = true;
                                }
                                Field field = y4.b.f3886g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e5) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!y4.b.f3881b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                y4.b.f3880a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e6) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
                                            }
                                            y4.b.f3881b = true;
                                        }
                                        Field field2 = y4.b.f3880a;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e7) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
                                            }
                                            if (obj2 != null) {
                                                if (!y4.b.f3883d) {
                                                    try {
                                                        y4.b.f3882c = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e8) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
                                                    }
                                                    y4.b.f3883d = true;
                                                }
                                                Class cls = y4.b.f3882c;
                                                if (cls != null) {
                                                    if (!y4.b.f3885f) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            y4.b.f3884e = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e9) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
                                                        }
                                                        y4.b.f3885f = true;
                                                    }
                                                    Field field3 = y4.b.f3884e;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e10) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i13 = this.Z;
                            if (i13 != 0) {
                                context.setTheme(i13);
                                z8 = true;
                                context.getTheme().applyStyle(this.Z, true);
                            } else {
                                z8 = true;
                            }
                            if (z10 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof androidx.lifecycle.t) {
                                    if (((androidx.lifecycle.v) ((androidx.lifecycle.t) activity2).getLifecycle()).f585c.compareTo(androidx.lifecycle.n.f559i) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.V && !this.W) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                            z7 = z8;
                        }
                        if (z7 && (obj3 instanceof k)) {
                            if ((i6 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                                ((k) obj3).onNightModeChanged(E);
                            }
                            if ((i6 & 4) != 0) {
                                ((k) obj3).onLocalesChanged(r2);
                            }
                        }
                        if (b2 != null) {
                            x.c(x.b(context.getResources().getConfiguration()));
                        }
                        if (i7 == 0) {
                            A(context).h();
                        } else {
                            a0 a0Var = this.f1533c0;
                            if (a0Var != null) {
                                a0Var.c();
                            }
                        }
                        if (i7 == 3) {
                            if (this.f1534d0 == null) {
                                this.f1534d0 = new a0(this, context);
                            }
                            this.f1534d0.h();
                        } else {
                            a0 a0Var2 = this.f1534d0;
                            if (a0Var2 != null) {
                                a0Var2.c();
                            }
                        }
                        return z7;
                    }
                }
                z6 = false;
                if (z6) {
                }
                z7 = z6;
                if (z7) {
                    if ((i6 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    }
                    if ((i6 & 4) != 0) {
                    }
                }
                if (b2 != null) {
                }
                if (i7 == 0) {
                }
                if (i7 == 3) {
                }
                return z7;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i8 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f1531a0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e11) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e11);
                this.f1531a0 = 0;
            }
        }
        this.f1532b0 = true;
        i5 = this.f1531a0;
        configuration = this.X;
        if (configuration == null) {
        }
        int i92 = configuration.uiMode & 48;
        int i102 = v5.uiMode & 48;
        b0.g b52 = x.b(configuration);
        if (r2 != null) {
        }
        if (i92 == i102) {
        }
        if (b2 != null) {
            i6 |= 8196;
        }
        if (((~i5) & i6) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z6 = false;
        if (z6) {
        }
        z7 = z6;
        if (z7) {
        }
        if (b2 != null) {
        }
        if (i7 == 0) {
        }
        if (i7 == 3) {
        }
        return z7;
    }

    public final void q(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f1545r != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof z) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        z zVar = new z(this, callback);
        this.f1546s = zVar;
        window.setCallback(zVar);
        Context context = this.f1544q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f1529o0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            k.v a5 = k.v.a();
            synchronized (a5) {
                drawable = a5.f2255a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f1545r = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.l0) != null) {
            return;
        }
        Object obj = this.f1543p;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1542m0) != null) {
            y.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1542m0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.l0 = y.a(activity);
                K();
            }
        }
        this.l0 = null;
        K();
    }

    public final void s(int i5, e0 e0Var, j.n nVar) {
        if (nVar == null) {
            if (e0Var == null && i5 >= 0) {
                e0[] e0VarArr = this.R;
                if (i5 < e0VarArr.length) {
                    e0Var = e0VarArr[i5];
                }
            }
            if (e0Var != null) {
                nVar = e0Var.h;
            }
        }
        if ((e0Var == null || e0Var.f1523m) && !this.W) {
            z zVar = this.f1546s;
            Window.Callback callback = this.f1545r.getCallback();
            zVar.getClass();
            try {
                zVar.f1657k = true;
                callback.onPanelClosed(i5, nVar);
            } finally {
                zVar.f1657k = false;
            }
        }
    }

    public final void t(j.n nVar) {
        k.l lVar;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1550x;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((d3) actionBarOverlayLayout.f128k).f2050a.f163g;
        if (actionMenuView != null && (lVar = actionMenuView.f146z) != null) {
            lVar.g();
            k.h hVar = lVar.f2155z;
            if (hVar != null && hVar.b()) {
                hVar.f2009i.dismiss();
            }
        }
        Window.Callback callback = this.f1545r.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, nVar);
        }
        this.Q = false;
    }

    public final void u(e0 e0Var, boolean z4) {
        d0 d0Var;
        l1 l1Var;
        if (z4 && e0Var.f1512a == 0 && (l1Var = this.f1550x) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var;
            actionBarOverlayLayout.k();
            if (((d3) actionBarOverlayLayout.f128k).f2050a.o()) {
                t(e0Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1544q.getSystemService("window");
        if (windowManager != null && e0Var.f1523m && (d0Var = e0Var.f1516e) != null) {
            windowManager.removeView(d0Var);
            if (z4) {
                s(e0Var.f1512a, e0Var, null);
            }
        }
        e0Var.f1521k = false;
        e0Var.f1522l = false;
        e0Var.f1523m = false;
        e0Var.f1517f = null;
        e0Var.f1524n = true;
        if (this.S == e0Var) {
            this.S = null;
        }
        if (e0Var.f1512a == 0) {
            K();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r7.g() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(KeyEvent keyEvent) {
        View decorView;
        boolean z4;
        boolean z5;
        ActionMenuView actionMenuView;
        Object obj = this.f1543p;
        if ((!(obj instanceof f0.j) && !(obj instanceof i)) || (decorView = this.f1545r.getDecorView()) == null || !a.a.h(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                z zVar = this.f1546s;
                Window.Callback callback = this.f1545r.getCallback();
                zVar.getClass();
                try {
                    zVar.f1656j = true;
                } finally {
                    zVar.f1656j = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.T = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        e0 B = B(0);
                        if (!B.f1523m) {
                            I(B, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.A == null) {
                        e0 B2 = B(0);
                        l1 l1Var = this.f1550x;
                        Context context = this.f1544q;
                        if (l1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((d3) actionBarOverlayLayout.f128k).f2050a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f163g) != null && actionMenuView.f145y && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1550x;
                                actionBarOverlayLayout2.k();
                                if (((d3) actionBarOverlayLayout2.f128k).f2050a.o()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1550x;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((d3) actionBarOverlayLayout3.f128k).f2050a.f163g;
                                    if (actionMenuView2 != null) {
                                        k.l lVar = actionMenuView2.f146z;
                                        if (lVar != null) {
                                        }
                                    }
                                } else if (!this.W && I(B2, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1550x;
                                    actionBarOverlayLayout4.k();
                                    z4 = ((d3) actionBarOverlayLayout4.f128k).f2050a.u();
                                    if (z4) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                                z4 = false;
                                if (z4) {
                                }
                            }
                        }
                        boolean z6 = B2.f1523m;
                        if (z6 || B2.f1522l) {
                            u(B2, true);
                            z4 = z6;
                            if (z4) {
                            }
                        } else {
                            if (B2.f1521k) {
                                if (B2.f1525o) {
                                    B2.f1521k = false;
                                    z5 = I(B2, keyEvent);
                                } else {
                                    z5 = true;
                                }
                                if (z5) {
                                    G(B2, keyEvent);
                                    z4 = true;
                                    if (z4) {
                                    }
                                }
                            }
                            z4 = false;
                            if (z4) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!F()) {
                return false;
            }
        }
        return true;
    }

    public final void x(int i5) {
        e0 B = B(i5);
        if (B.h != null) {
            Bundle bundle = new Bundle();
            B.h.t(bundle);
            if (bundle.size() > 0) {
                B.f1526p = bundle;
            }
            B.h.w();
            B.h.clear();
        }
        B.f1525o = true;
        B.f1524n = true;
        if ((i5 == 108 || i5 == 0) && this.f1550x != null) {
            e0 B2 = B(0);
            B2.f1521k = false;
            I(B2, null);
        }
    }

    public final void y() {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        Context context = this.f1544q;
        int[] iArr = f.a.f1318j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            j(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            j(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            j(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            j(10);
        }
        this.O = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        z();
        this.f1545r.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.P) {
            viewGroup = this.N ? (ViewGroup) from.inflate(com.lokhnathtechnical.notecounterpro.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.lokhnathtechnical.notecounterpro.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.O) {
            viewGroup = (ViewGroup) from.inflate(com.lokhnathtechnical.notecounterpro.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.M = false;
            this.L = false;
        } else if (this.L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.lokhnathtechnical.notecounterpro.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i.d(context, typedValue.resourceId) : context).inflate(com.lokhnathtechnical.notecounterpro.R.layout.abc_screen_toolbar, (ViewGroup) null);
            l1 l1Var = (l1) viewGroup.findViewById(com.lokhnathtechnical.notecounterpro.R.id.decor_content_parent);
            this.f1550x = l1Var;
            l1Var.setWindowCallback(this.f1545r.getCallback());
            if (this.M) {
                ((ActionBarOverlayLayout) this.f1550x).j(109);
            }
            if (this.J) {
                ((ActionBarOverlayLayout) this.f1550x).j(2);
            }
            if (this.K) {
                ((ActionBarOverlayLayout) this.f1550x).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ", android:windowIsFloating: " + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
        }
        t tVar = new t(this);
        WeakHashMap weakHashMap = f0.r0.f1407a;
        f0.k0.i(viewGroup, tVar);
        if (this.f1550x == null) {
            this.H = (TextView) viewGroup.findViewById(com.lokhnathtechnical.notecounterpro.R.id.title);
        }
        boolean z4 = l3.f2159a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.lokhnathtechnical.notecounterpro.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1545r.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1545r.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new u(this));
        this.G = viewGroup;
        Object obj = this.f1543p;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.w;
        if (!TextUtils.isEmpty(title)) {
            l1 l1Var2 = this.f1550x;
            if (l1Var2 != null) {
                l1Var2.setWindowTitle(title);
            } else {
                a aVar = this.f1548u;
                if (aVar != null) {
                    aVar.n(title);
                } else {
                    TextView textView = this.H;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.G.findViewById(R.id.content);
        View decorView = this.f1545r.getDecorView();
        contentFrameLayout2.f155m.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.F = true;
        e0 B = B(0);
        if (this.W || B.h != null) {
            return;
        }
        D(108);
    }

    public final void z() {
        if (this.f1545r == null) {
            Object obj = this.f1543p;
            if (obj instanceof Activity) {
                q(((Activity) obj).getWindow());
            }
        }
        if (this.f1545r == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
