package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.lokhnathtechnical.notecounterpro.R;
import f0.q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g0 extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f381g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f382i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f383j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, AttributeSet attributeSet, u0 u0Var) {
        super(context, attributeSet);
        g4.i.e(context, "context");
        g4.i.e(attributeSet, "attrs");
        this.f381g = new ArrayList();
        this.h = new ArrayList();
        this.f383j = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i5 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0.a.f2737b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        z C = u0Var.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                throw new IllegalStateException(s.c.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            }
            n0 G = u0Var.G();
            context.getClassLoader();
            z a5 = G.a(classAttribute);
            g4.i.d(a5, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a5.D = id;
            a5.E = id;
            a5.F = string;
            a5.f508z = u0Var;
            d0 d0Var = u0Var.w;
            a5.A = d0Var;
            a5.K = true;
            if ((d0Var == null ? null : d0Var.f367m) != null) {
                a5.K = true;
            }
            a aVar = new a(u0Var);
            aVar.f315o = true;
            a5.L = this;
            a5.f505v = true;
            aVar.f(getId(), a5, string);
            if (aVar.f308g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            u0 u0Var2 = aVar.f317q;
            if (u0Var2.w != null && !u0Var2.J) {
                u0Var2.z(true);
                a aVar2 = u0Var2.h;
                if (aVar2 != null) {
                    aVar2.f318r = false;
                    aVar2.d();
                    if (u0.J(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + u0Var2.h + " as part of execSingleAction for action " + aVar);
                    }
                    u0Var2.h.e(false, false);
                    u0Var2.h.a(u0Var2.L, u0Var2.M);
                    ArrayList arrayList = u0Var2.h.f302a;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        z zVar = ((c1) obj).f359b;
                        if (zVar != null) {
                            zVar.f502s = false;
                        }
                    }
                    u0Var2.h = null;
                }
                aVar.a(u0Var2.L, u0Var2.M);
                u0Var2.f440b = true;
                try {
                    u0Var2.T(u0Var2.L, u0Var2.M);
                    u0Var2.d();
                    u0Var2.e0();
                    u0Var2.v();
                    ((HashMap) u0Var2.f441c.h).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    u0Var2.d();
                    throw th;
                }
            }
        }
        ArrayList j2 = u0Var.f441c.j();
        int size2 = j2.size();
        while (i5 < size2) {
            Object obj2 = j2.get(i5);
            i5++;
            int i7 = ((b1) obj2).f341c.E;
            getId();
        }
    }

    public final void a(View view) {
        if (this.h.contains(view)) {
            this.f381g.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        g4.i.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof z ? (z) tag : null) != null) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        q1 q1Var;
        g4.i.e(windowInsets, "insets");
        q1 g5 = q1.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f382i;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            g4.i.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            q1Var = q1.g(onApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = f0.r0.f1407a;
            WindowInsets f5 = g5.f();
            if (f5 != null) {
                WindowInsets b2 = f0.i0.b(this, f5);
                if (!b2.equals(f5)) {
                    g5 = q1.g(b2, this);
                }
            }
            q1Var = g5;
        }
        if (!q1Var.f1406a.m()) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                f0.r0.b(getChildAt(i5), q1Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g4.i.e(canvas, "canvas");
        if (this.f383j) {
            ArrayList arrayList = this.f381g;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        g4.i.e(canvas, "canvas");
        g4.i.e(view, "child");
        if (this.f383j) {
            ArrayList arrayList = this.f381g;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        g4.i.e(view, "view");
        this.h.remove(view);
        if (this.f381g.remove(view)) {
            this.f383j = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends z> F getFragment() {
        e0 e0Var;
        z zVar;
        u0 supportFragmentManager;
        View view = this;
        while (true) {
            e0Var = null;
            if (view == null) {
                zVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            zVar = tag instanceof z ? (z) tag : null;
            if (zVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (zVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof e0) {
                    e0Var = (e0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (e0Var == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = e0Var.getSupportFragmentManager();
        } else {
            if (zVar.A == null || !zVar.f500q) {
                throw new IllegalStateException("The Fragment " + zVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = zVar.c();
        }
        return (F) supportFragmentManager.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        g4.i.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                g4.i.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        g4.i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i5) {
        View childAt = getChildAt(i5);
        g4.i.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        g4.i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i5, int i6) {
        int i7 = i5 + i6;
        for (int i8 = i5; i8 < i7; i8++) {
            View childAt = getChildAt(i8);
            g4.i.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i5, i6);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i5, int i6) {
        int i7 = i5 + i6;
        for (int i8 = i5; i8 < i7; i8++) {
            View childAt = getChildAt(i8);
            g4.i.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i5, i6);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.f383j = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f382i = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        g4.i.e(view, "view");
        if (view.getParent() == this) {
            this.h.add(view);
        }
        super.startViewTransition(view);
    }
}
