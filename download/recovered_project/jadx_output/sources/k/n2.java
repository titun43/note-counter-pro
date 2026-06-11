package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.lokhnathtechnical.notecounterpro.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: g, reason: collision with root package name */
    public static n2 f2174g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f2175a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2176b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f2177c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2178d;

    /* renamed from: e, reason: collision with root package name */
    public f2.h f2179e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f2173f = PorterDuff.Mode.SRC_IN;
    public static final m2 h = new m2(6);

    public static synchronized n2 b() {
        n2 n2Var;
        synchronized (n2.class) {
            try {
                if (f2174g == null) {
                    f2174g = new n2();
                }
                n2Var = f2174g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n2Var;
    }

    public static synchronized PorterDuffColorFilter e(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n2.class) {
            m2 m2Var = h;
            m2Var.getClass();
            int i6 = (31 + i5) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) m2Var.get(Integer.valueOf(mode.hashCode() + i6));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i5, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i5) {
        Drawable drawable;
        Object obj;
        int i6;
        if (this.f2177c == null) {
            this.f2177c = new TypedValue();
        }
        TypedValue typedValue = this.f2177c;
        context.getResources().getValue(i5, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            o.i iVar = (o.i) this.f2176b.get(context);
            drawable = null;
            if (iVar != null) {
                int b2 = p.a.b(iVar.h, iVar.f2729j, j2);
                if (b2 < 0 || (obj = iVar.f2728i[b2]) == o.j.f2730a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        int b5 = p.a.b(iVar.h, iVar.f2729j, j2);
                        if (b5 >= 0) {
                            Object[] objArr = iVar.f2728i;
                            Object obj2 = objArr[b5];
                            Object obj3 = o.j.f2730a;
                            if (obj2 != obj3) {
                                objArr[b5] = obj3;
                                iVar.f2727g = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f2179e != null) {
            if (i5 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i5 == R.drawable.abc_ratingbar_material) {
                layerDrawable = f2.h.e(this, context, R.dimen.abc_star_big);
            } else if (i5 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = f2.h.e(this, context, R.dimen.abc_star_medium);
            } else if (i5 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = f2.h.e(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable == null) {
            return layerDrawable;
        }
        layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                if (constantState2 != null) {
                    o.i iVar2 = (o.i) this.f2176b.get(context);
                    if (iVar2 == null) {
                        iVar2 = new o.i();
                        int i7 = 4;
                        while (true) {
                            i6 = 80;
                            if (i7 >= 32) {
                                break;
                            }
                            int i8 = (1 << i7) - 12;
                            if (80 <= i8) {
                                i6 = i8;
                                break;
                            }
                            i7++;
                        }
                        int i9 = i6 / 8;
                        iVar2.h = new long[i9];
                        iVar2.f2728i = new Object[i9];
                        this.f2176b.put(context, iVar2);
                    }
                    iVar2.a(j2, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i5) {
        return d(context, i5, false);
    }

    public final synchronized Drawable d(Context context, int i5, boolean z4) {
        Drawable a5;
        try {
            if (!this.f2178d) {
                this.f2178d = true;
                Drawable c5 = c(context, R.drawable.abc_vector_test);
                if (c5 == null || (!(c5 instanceof h1.a) && !"android.graphics.drawable.VectorDrawable".equals(c5.getClass().getName()))) {
                    this.f2178d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a5 = a(context, i5);
            if (a5 == null) {
                a5 = v.a.getDrawable(context, i5);
            }
            if (a5 != null) {
                a5 = g(context, i5, z4, a5);
            }
            if (a5 != null) {
                n1.a(a5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a5;
    }

    public final synchronized ColorStateList f(Context context, int i5) {
        ColorStateList colorStateList;
        o.m mVar;
        Object obj;
        WeakHashMap weakHashMap = this.f2175a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (mVar = (o.m) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int a5 = p.a.a(mVar.f2734g, mVar.f2735i, i5);
            if (a5 < 0 || (obj = mVar.h[a5]) == o.j.f2731b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            f2.h hVar = this.f2179e;
            if (hVar != null) {
                colorStateList2 = hVar.f(context, i5);
            }
            if (colorStateList2 != null) {
                if (this.f2175a == null) {
                    this.f2175a = new WeakHashMap();
                }
                o.m mVar2 = (o.m) this.f2175a.get(context);
                if (mVar2 == null) {
                    mVar2 = new o.m();
                    this.f2175a.put(context, mVar2);
                }
                mVar2.a(i5, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i5, boolean z4, Drawable drawable) {
        int i6;
        boolean z5;
        int round;
        PorterDuffColorFilter e4;
        ColorStateList f5 = f(context, i5);
        PorterDuff.Mode mode = null;
        if (f5 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f5);
            if (this.f2179e != null && i5 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                mutate.setTintMode(mode);
            }
            return mutate;
        }
        if (this.f2179e != null) {
            if (i5 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c5 = s2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = v.f2253b;
                f2.h.g(findDrawableByLayerId, c5, mode2);
                f2.h.g(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), s2.c(context, R.attr.colorControlNormal), mode2);
                f2.h.g(layerDrawable.findDrawableByLayerId(android.R.id.progress), s2.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i5 == R.drawable.abc_ratingbar_material || i5 == R.drawable.abc_ratingbar_indicator_material || i5 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = s2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = v.f2253b;
                f2.h.g(findDrawableByLayerId2, b2, mode3);
                f2.h.g(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), s2.c(context, R.attr.colorControlActivated), mode3);
                f2.h.g(layerDrawable2.findDrawableByLayerId(android.R.id.progress), s2.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        f2.h hVar = this.f2179e;
        boolean z6 = false;
        if (hVar != null) {
            PorterDuff.Mode mode4 = v.f2253b;
            if (f2.h.b((int[]) hVar.f1459a, i5)) {
                i6 = R.attr.colorControlNormal;
            } else if (f2.h.b((int[]) hVar.f1461c, i5)) {
                i6 = R.attr.colorControlActivated;
            } else {
                if (f2.h.b((int[]) hVar.f1462d, i5)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i5 == R.drawable.abc_list_divider_mtrl_alpha) {
                    round = Math.round(40.8f);
                    i6 = 16842800;
                    z5 = true;
                    if (z5) {
                        Drawable mutate2 = drawable.mutate();
                        int c6 = s2.c(context, i6);
                        synchronized (v.class) {
                            e4 = e(c6, mode4);
                        }
                        mutate2.setColorFilter(e4);
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z6 = true;
                    }
                } else if (i5 != R.drawable.abc_dialog_material_background) {
                    i6 = 0;
                    z5 = false;
                    round = -1;
                    if (z5) {
                    }
                }
                i6 = 16842801;
            }
            z5 = true;
            round = -1;
            if (z5) {
            }
        }
        if (z6 || !z4) {
            return drawable;
        }
        return null;
    }
}
