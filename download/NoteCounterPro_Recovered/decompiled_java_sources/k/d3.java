package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.lokhnathtechnical.notecounterpro.R;

/* loaded from: classes.dex */
public final class d3 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f2050a;

    /* renamed from: b, reason: collision with root package name */
    public int f2051b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2052c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f2053d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f2054e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f2055f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2056g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f2057i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f2058j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f2059k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2060l;

    /* renamed from: m, reason: collision with root package name */
    public l f2061m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2062n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f2063o;

    public d3(Toolbar toolbar, boolean z4) {
        Drawable drawable;
        this.f2062n = 0;
        this.f2050a = toolbar;
        this.h = toolbar.getTitle();
        this.f2057i = toolbar.getSubtitle();
        this.f2056g = this.h != null;
        this.f2055f = toolbar.getNavigationIcon();
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(toolbar.getContext(), null, f.a.f1310a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) r2.f284i;
        int i5 = 15;
        this.f2063o = r2.l(15);
        if (z4) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f2056g = true;
                this.h = text;
                if ((this.f2051b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f2056g) {
                        f0.r0.j(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f2057i = text2;
                if ((this.f2051b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable l5 = r2.l(20);
            if (l5 != null) {
                this.f2054e = l5;
                c();
            }
            Drawable l6 = r2.l(17);
            if (l6 != null) {
                this.f2053d = l6;
                c();
            }
            if (this.f2055f == null && (drawable = this.f2063o) != null) {
                this.f2055f = drawable;
                if ((this.f2051b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f2052c;
                if (view != null && (this.f2051b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f2052c = inflate;
                if (inflate != null && (this.f2051b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f2051b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.f180z.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f173r = resourceId2;
                d1 d1Var = toolbar.h;
                if (d1Var != null) {
                    d1Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f174s = resourceId3;
                d1 d1Var2 = toolbar.f164i;
                if (d1Var2 != null) {
                    d1Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f2063o = toolbar.getNavigationIcon();
            } else {
                i5 = 11;
            }
            this.f2051b = i5;
        }
        r2.u();
        if (R.string.abc_action_bar_up_description != this.f2062n) {
            this.f2062n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i6 = this.f2062n;
                this.f2058j = i6 != 0 ? toolbar.getContext().getString(i6) : null;
                b();
            }
        }
        this.f2058j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new c3(this));
    }

    public final void a(int i5) {
        View view;
        int i6 = this.f2051b ^ i5;
        this.f2051b = i5;
        if (i6 != 0) {
            int i7 = i6 & 4;
            Toolbar toolbar = this.f2050a;
            if (i7 != 0) {
                if ((i5 & 4) != 0) {
                    b();
                }
                if ((this.f2051b & 4) != 0) {
                    Drawable drawable = this.f2055f;
                    if (drawable == null) {
                        drawable = this.f2063o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i6 & 3) != 0) {
                c();
            }
            if ((i6 & 8) != 0) {
                if ((i5 & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.f2057i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i6 & 16) == 0 || (view = this.f2052c) == null) {
                return;
            }
            if ((i5 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2051b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f2058j);
            Toolbar toolbar = this.f2050a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f2062n);
            } else {
                toolbar.setNavigationContentDescription(this.f2058j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i5 = this.f2051b;
        if ((i5 & 2) == 0) {
            drawable = null;
        } else if ((i5 & 1) != 0) {
            drawable = this.f2054e;
            if (drawable == null) {
                drawable = this.f2053d;
            }
        } else {
            drawable = this.f2053d;
        }
        this.f2050a.setLogo(drawable);
    }
}
