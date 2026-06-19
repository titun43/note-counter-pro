package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2217a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2218b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2219c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2220d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2221e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2222f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2223g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.a.f1318j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i5) {
        ColorStateList d5 = d(context, i5);
        if (d5 != null && d5.isStateful()) {
            return d5.getColorForState(f2218b, d5.getDefaultColor());
        }
        ThreadLocal threadLocal = f2217a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f5 = typedValue.getFloat();
        int c5 = c(context, i5);
        int round = Math.round(Color.alpha(c5) * f5);
        int i6 = y.a.f3727a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (c5 & 16777215) | (round << 24);
    }

    public static int c(Context context, int i5) {
        int[] iArr = f2223g;
        iArr[0] = i5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i5) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2223g;
        iArr[0] = i5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = v.a.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
