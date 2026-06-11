package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import f0.w0;
import g.f0;
import g.u;
import j.n;
import k.d3;
import k.h;
import k.k1;
import k.l;
import k.l1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f150g;
    public TypedValue h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f151i;

    /* renamed from: j, reason: collision with root package name */
    public TypedValue f152j;

    /* renamed from: k, reason: collision with root package name */
    public TypedValue f153k;

    /* renamed from: l, reason: collision with root package name */
    public TypedValue f154l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f155m;

    /* renamed from: n, reason: collision with root package name */
    public k1 f156n;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f155m = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f153k == null) {
            this.f153k = new TypedValue();
        }
        return this.f153k;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f154l == null) {
            this.f154l = new TypedValue();
        }
        return this.f154l;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f151i == null) {
            this.f151i = new TypedValue();
        }
        return this.f151i;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f152j == null) {
            this.f152j = new TypedValue();
        }
        return this.f152j;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f150g == null) {
            this.f150g = new TypedValue();
        }
        return this.f150g;
    }

    public TypedValue getMinWidthMinor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k1 k1Var = this.f156n;
        if (k1Var != null) {
            k1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        l lVar;
        super.onDetachedFromWindow();
        k1 k1Var = this.f156n;
        if (k1Var != null) {
            f0 f0Var = ((u) k1Var).f1651g;
            l1 l1Var = f0Var.f1550x;
            if (l1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((d3) actionBarOverlayLayout.f128k).f2050a.f163g;
                if (actionMenuView != null && (lVar = actionMenuView.f146z) != null) {
                    lVar.g();
                    h hVar = lVar.f2155z;
                    if (hVar != null && hVar.b()) {
                        hVar.f2009i.dismiss();
                    }
                }
            }
            if (f0Var.C != null) {
                f0Var.f1545r.getDecorView().removeCallbacks(f0Var.D);
                if (f0Var.C.isShowing()) {
                    try {
                        f0Var.C.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                f0Var.C = null;
            }
            w0 w0Var = f0Var.E;
            if (w0Var != null) {
                w0Var.b();
            }
            n nVar = f0Var.B(0).h;
            if (nVar != null) {
                nVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i6) {
        int i7;
        boolean z4;
        int i8;
        int measuredWidth;
        TypedValue typedValue;
        int i9;
        int i10;
        float fraction;
        int i11;
        int i12;
        float fraction2;
        int i13;
        int i14;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z5 = true;
        boolean z6 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        Rect rect = this.f155m;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z6 ? this.f152j : this.f151i;
            if (typedValue2 != null && (i13 = typedValue2.type) != 0) {
                if (i13 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i13 == 6) {
                    int i15 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i15, i15);
                } else {
                    i14 = 0;
                    if (i14 > 0) {
                        i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.left + rect.right), View.MeasureSpec.getSize(i5)), 1073741824);
                        z4 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z6 ? this.f153k : this.f154l;
                            if (typedValue3 != null && (i11 = typedValue3.type) != 0) {
                                if (i11 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i11 == 6) {
                                    int i16 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i16, i16);
                                } else {
                                    i12 = 0;
                                    if (i12 > 0) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i6)), 1073741824);
                                        super.onMeasure(i7, i8);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z4 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z6 ? this.h : this.f150g;
                                            if (typedValue != null && (i9 = typedValue.type) != 0) {
                                                if (i9 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i9 == 6) {
                                                    int i17 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i17, i17);
                                                } else {
                                                    i10 = 0;
                                                    if (i10 > 0) {
                                                        i10 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i10) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                                                        if (z5) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i8);
                                                        return;
                                                    }
                                                }
                                                i10 = (int) fraction;
                                                if (i10 > 0) {
                                                }
                                                if (measuredWidth < i10) {
                                                }
                                            }
                                        }
                                        z5 = false;
                                        if (z5) {
                                        }
                                    }
                                }
                                i12 = (int) fraction2;
                                if (i12 > 0) {
                                }
                            }
                        }
                        i8 = i6;
                        super.onMeasure(i7, i8);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z4) {
                            if (!z6) {
                            }
                            if (typedValue != null) {
                                if (i9 != 5) {
                                }
                                i10 = (int) fraction;
                                if (i10 > 0) {
                                }
                                if (measuredWidth < i10) {
                                }
                            }
                        }
                        z5 = false;
                        if (z5) {
                        }
                    }
                }
                i14 = (int) fraction3;
                if (i14 > 0) {
                }
            }
        }
        i7 = i5;
        z4 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i8 = i6;
        super.onMeasure(i7, i8);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z4) {
        }
        z5 = false;
        if (z5) {
        }
    }

    public void setAttachListener(k1 k1Var) {
        this.f156n = k1Var;
    }
}
