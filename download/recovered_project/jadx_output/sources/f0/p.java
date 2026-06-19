package f0;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f1396a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f1397b;

    /* renamed from: c, reason: collision with root package name */
    public final NestedScrollView f1398c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1399d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1400e;

    public p(NestedScrollView nestedScrollView) {
        this.f1398c = nestedScrollView;
    }

    public final boolean a(float f5, float f6) {
        ViewParent c5;
        if (this.f1399d && (c5 = c(0)) != null) {
            try {
                return c5.onNestedPreFling(this.f1398c, f5, f6);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + c5 + " does not implement interface method onNestedPreFling", e4);
            }
        }
        return false;
    }

    public final boolean b(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        ViewParent c5;
        int i10;
        int i11;
        int[] iArr3;
        if (this.f1399d && (c5 = c(i9)) != null) {
            if (i5 != 0 || i6 != 0 || i7 != 0 || i8 != 0) {
                NestedScrollView nestedScrollView = this.f1398c;
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i10 = iArr[0];
                    i11 = iArr[1];
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                if (iArr2 == null) {
                    if (this.f1400e == null) {
                        this.f1400e = new int[2];
                    }
                    int[] iArr4 = this.f1400e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (c5 instanceof r) {
                    ((r) c5).a(nestedScrollView, i5, i6, i7, i8, i9, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i7;
                    iArr3[1] = iArr3[1] + i8;
                    if (c5 instanceof q) {
                        ((q) c5).b(nestedScrollView, i5, i6, i7, i8, i9);
                    } else if (i9 == 0) {
                        try {
                            c5.onNestedScroll(nestedScrollView, i5, i6, i7, i8);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + c5 + " does not implement interface method onNestedScroll", e4);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i10;
                    iArr[1] = iArr[1] - i11;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent c(int i5) {
        if (i5 == 0) {
            return this.f1396a;
        }
        if (i5 != 1) {
            return null;
        }
        return this.f1397b;
    }
}
