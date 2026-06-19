package i0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.o;
import f0.r0;
import java.util.WeakHashMap;
import k.t1;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: x, reason: collision with root package name */
    public static final int f1799x = ViewConfiguration.getTapTimeout();

    /* renamed from: g, reason: collision with root package name */
    public final a f1800g;
    public final AccelerateInterpolator h;

    /* renamed from: i, reason: collision with root package name */
    public final t1 f1801i;

    /* renamed from: j, reason: collision with root package name */
    public o f1802j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1803k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f1804l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1805m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1806n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f1807o;

    /* renamed from: p, reason: collision with root package name */
    public final float[] f1808p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f1809q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1810r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1811s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1812t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1813u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1814v;
    public final t1 w;

    public d(t1 t1Var) {
        a aVar = new a();
        aVar.f1795e = Long.MIN_VALUE;
        aVar.f1797g = -1L;
        aVar.f1796f = 0L;
        this.f1800g = aVar;
        this.h = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1803k = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1804l = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1807o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1808p = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1809q = fArr5;
        this.f1801i = t1Var;
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        float f6 = ((int) ((1575.0f * f5) + 0.5f)) / 1000.0f;
        fArr5[0] = f6;
        fArr5[1] = f6;
        float f7 = ((int) ((f5 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f7;
        fArr4[1] = f7;
        this.f1805m = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1806n = f1799x;
        aVar.f1791a = 500;
        aVar.f1792b = 500;
        this.w = t1Var;
    }

    public static float b(float f5, float f6, float f7) {
        return f5 > f7 ? f7 : f5 < f6 ? f6 : f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i5, float f5, float f6, float f7) {
        float f8;
        float interpolation;
        float b2 = b(this.f1803k[i5] * f6, 0.0f, this.f1804l[i5]);
        float c5 = c(f6 - f5, b2) - c(f5, b2);
        AccelerateInterpolator accelerateInterpolator = this.h;
        if (c5 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c5);
        } else {
            if (c5 <= 0.0f) {
                f8 = 0.0f;
                if (f8 != 0.0f) {
                    return 0.0f;
                }
                float f9 = this.f1807o[i5];
                float f10 = this.f1808p[i5];
                float f11 = this.f1809q[i5];
                float f12 = f9 * f7;
                return f8 > 0.0f ? b(f8 * f12, f10, f11) : -b((-f8) * f12, f10, f11);
            }
            interpolation = accelerateInterpolator.getInterpolation(c5);
        }
        f8 = b(interpolation, -1.0f, 1.0f);
        if (f8 != 0.0f) {
        }
    }

    public final float c(float f5, float f6) {
        if (f6 != 0.0f) {
            int i5 = this.f1805m;
            if (i5 == 0 || i5 == 1) {
                if (f5 < f6) {
                    if (f5 >= 0.0f) {
                        return 1.0f - (f5 / f6);
                    }
                    if (this.f1813u && i5 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i5 == 2 && f5 < 0.0f) {
                return f5 / (-f6);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i5 = 0;
        if (this.f1811s) {
            this.f1813u = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f1800g;
        int i6 = (int) (currentAnimationTimeMillis - aVar.f1795e);
        int i7 = aVar.f1792b;
        if (i6 > i7) {
            i5 = i7;
        } else if (i6 >= 0) {
            i5 = i6;
        }
        aVar.f1798i = i5;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.f1797g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        t1 t1Var;
        int count;
        a aVar = this.f1800g;
        float f5 = aVar.f1794d;
        int abs = (int) (f5 / Math.abs(f5));
        Math.abs(aVar.f1793c);
        if (abs != 0 && (count = (t1Var = this.w).getCount()) != 0) {
            int childCount = t1Var.getChildCount();
            int firstVisiblePosition = t1Var.getFirstVisiblePosition();
            int i5 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && t1Var.getChildAt(0).getTop() >= 0)) : !(i5 >= count && t1Var.getChildAt(childCount - 1).getBottom() <= t1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i5;
        if (this.f1814v) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f1812t = true;
            this.f1810r = false;
            float x5 = motionEvent.getX();
            float width = view.getWidth();
            t1 t1Var = this.f1801i;
            float a5 = a(0, x5, width, t1Var.getWidth());
            float a6 = a(1, motionEvent.getY(), view.getHeight(), t1Var.getHeight());
            a aVar = this.f1800g;
            aVar.f1793c = a5;
            aVar.f1794d = a6;
            if (!this.f1813u && e()) {
                if (this.f1802j == null) {
                    this.f1802j = new o(this, 12);
                }
                this.f1813u = true;
                this.f1811s = true;
                if (this.f1810r || (i5 = this.f1806n) <= 0) {
                    this.f1802j.run();
                } else {
                    o oVar = this.f1802j;
                    long j2 = i5;
                    WeakHashMap weakHashMap = r0.f1407a;
                    t1Var.postOnAnimationDelayed(oVar, j2);
                }
                this.f1810r = true;
            }
        }
        return false;
    }
}
