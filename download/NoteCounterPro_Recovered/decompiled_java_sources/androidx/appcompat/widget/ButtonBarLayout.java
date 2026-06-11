package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.lokhnathtechnical.notecounterpro.R;
import f.a;
import f0.r0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public boolean f148g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public int f149i;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149i = -1;
        int[] iArr = a.f1319k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        r0.h(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f148g = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f148g);
        }
    }

    private void setStacked(boolean z4) {
        if (this.h != z4) {
            if (!z4 || this.f148g) {
                this.h = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        int i7;
        boolean z4;
        int i8;
        int size = View.MeasureSpec.getSize(i5);
        int i9 = 0;
        if (this.f148g) {
            if (size > this.f149i && this.h) {
                setStacked(false);
            }
            this.f149i = size;
        }
        if (this.h || View.MeasureSpec.getMode(i5) != 1073741824) {
            i7 = i5;
            z4 = false;
        } else {
            i7 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(i7, i6);
        if (this.f148g && !this.h && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i5, i6);
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            i8 = -1;
            if (i10 >= childCount) {
                i10 = -1;
                break;
            } else if (getChildAt(i10).getVisibility() == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.h) {
                int i11 = i10 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i11 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i11).getVisibility() == 0) {
                        i8 = i11;
                        break;
                    }
                    i11++;
                }
                i9 = i8 >= 0 ? getChildAt(i8).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i9 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = r0.f1407a;
        if (getMinimumHeight() != i9) {
            setMinimumHeight(i9);
            if (i6 == 0) {
                super.onMeasure(i5, i6);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f148g != z4) {
            this.f148g = z4;
            if (!z4 && this.h) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
