package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final View f2195a;

    /* renamed from: d, reason: collision with root package name */
    public u2 f2198d;

    /* renamed from: e, reason: collision with root package name */
    public u2 f2199e;

    /* renamed from: f, reason: collision with root package name */
    public u2 f2200f;

    /* renamed from: c, reason: collision with root package name */
    public int f2197c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final v f2196b = v.a();

    public q(View view) {
        this.f2195a = view;
    }

    public final void a() {
        View view = this.f2195a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f2198d != null) {
                if (this.f2200f == null) {
                    this.f2200f = new u2();
                }
                u2 u2Var = this.f2200f;
                u2Var.f2249a = null;
                u2Var.f2252d = false;
                u2Var.f2250b = null;
                u2Var.f2251c = false;
                WeakHashMap weakHashMap = f0.r0.f1407a;
                ColorStateList c5 = f0.k0.c(view);
                if (c5 != null) {
                    u2Var.f2252d = true;
                    u2Var.f2249a = c5;
                }
                PorterDuff.Mode d5 = f0.k0.d(view);
                if (d5 != null) {
                    u2Var.f2251c = true;
                    u2Var.f2250b = d5;
                }
                if (u2Var.f2252d || u2Var.f2251c) {
                    v.d(background, u2Var, view.getDrawableState());
                    return;
                }
            }
            u2 u2Var2 = this.f2199e;
            if (u2Var2 != null) {
                v.d(background, u2Var2, view.getDrawableState());
                return;
            }
            u2 u2Var3 = this.f2198d;
            if (u2Var3 != null) {
                v.d(background, u2Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        u2 u2Var = this.f2199e;
        if (u2Var != null) {
            return u2Var.f2249a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        u2 u2Var = this.f2199e;
        if (u2Var != null) {
            return u2Var.f2250b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i5) {
        ColorStateList f5;
        View view = this.f2195a;
        Context context = view.getContext();
        int[] iArr = f.a.f1332y;
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(context, attributeSet, iArr, i5);
        TypedArray typedArray = (TypedArray) r2.f284i;
        View view2 = this.f2195a;
        f0.r0.h(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f284i, i5, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f2197c = typedArray.getResourceId(0, -1);
                v vVar = this.f2196b;
                Context context2 = view.getContext();
                int i6 = this.f2197c;
                synchronized (vVar) {
                    f5 = vVar.f2255a.f(context2, i6);
                }
                if (f5 != null) {
                    g(f5);
                }
            }
            if (typedArray.hasValue(1)) {
                f0.k0.f(view, r2.k(1));
            }
            if (typedArray.hasValue(2)) {
                f0.k0.g(view, n1.b(typedArray.getInt(2, -1), null));
            }
            r2.u();
        } catch (Throwable th) {
            r2.u();
            throw th;
        }
    }

    public final void e() {
        this.f2197c = -1;
        g(null);
        a();
    }

    public final void f(int i5) {
        ColorStateList colorStateList;
        this.f2197c = i5;
        v vVar = this.f2196b;
        if (vVar != null) {
            Context context = this.f2195a.getContext();
            synchronized (vVar) {
                colorStateList = vVar.f2255a.f(context, i5);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2198d == null) {
                this.f2198d = new u2();
            }
            u2 u2Var = this.f2198d;
            u2Var.f2249a = colorStateList;
            u2Var.f2252d = true;
        } else {
            this.f2198d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f2199e == null) {
            this.f2199e = new u2();
        }
        u2 u2Var = this.f2199e;
        u2Var.f2249a = colorStateList;
        u2Var.f2252d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f2199e == null) {
            this.f2199e = new u2();
        }
        u2 u2Var = this.f2199e;
        u2Var.f2250b = mode;
        u2Var.f2251c = true;
        a();
    }
}
