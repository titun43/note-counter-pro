package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f2115l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f2116m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f2117a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2118b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f2119c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f2120d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f2121e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2122f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f2123g = false;
    public TextPaint h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f2124i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f2125j;

    /* renamed from: k, reason: collision with root package name */
    public final f1 f2126k;

    public i1(TextView textView) {
        this.f2124i = textView;
        this.f2125j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2126k = new g1();
        } else {
            this.f2126k = new f1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i5 : iArr) {
                if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                    arrayList.add(Integer.valueOf(i5));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i6 = 0; i6 < size; i6++) {
                    iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f2116m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f2118b) {
                if (this.f2124i.getMeasuredHeight() <= 0 || this.f2124i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2126k.b(this.f2124i) ? 1048576 : (this.f2124i.getMeasuredWidth() - this.f2124i.getTotalPaddingLeft()) - this.f2124i.getTotalPaddingRight();
                int height = (this.f2124i.getHeight() - this.f2124i.getCompoundPaddingBottom()) - this.f2124i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2115l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c5 = c(rectF);
                        if (c5 != this.f2124i.getTextSize()) {
                            g(0, c5);
                        }
                    } finally {
                    }
                }
            }
            this.f2118b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2122f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i5 = length - 1;
        int i6 = 0;
        int i7 = 1;
        while (i7 <= i5) {
            int i8 = (i7 + i5) / 2;
            int i9 = this.f2122f[i8];
            TextView textView = this.f2124i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.h;
            if (textPaint == null) {
                this.h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.h.set(textView.getPaint());
            this.h.setTextSize(i9);
            StaticLayout a5 = e1.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f2124i, this.h, this.f2126k);
            if ((maxLines == -1 || (a5.getLineCount() <= maxLines && a5.getLineEnd(a5.getLineCount() - 1) == charSequence.length())) && a5.getHeight() <= rectF.bottom) {
                int i10 = i8 + 1;
                i6 = i7;
                i7 = i10;
            } else {
                i6 = i8 - 1;
                i5 = i6;
            }
        }
        return this.f2122f[i6];
    }

    public final boolean f() {
        return j() && this.f2117a != 0;
    }

    public final void g(int i5, float f5) {
        Context context = this.f2125j;
        float applyDimension = TypedValue.applyDimension(i5, f5, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f2124i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f2118b = false;
                try {
                    Method d5 = d("nullLayouts");
                    if (d5 != null) {
                        d5.invoke(textView, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f2117a == 1) {
            if (!this.f2123g || this.f2122f.length == 0) {
                int floor = ((int) Math.floor((this.f2121e - this.f2120d) / this.f2119c)) + 1;
                int[] iArr = new int[floor];
                for (int i5 = 0; i5 < floor; i5++) {
                    iArr[i5] = Math.round((i5 * this.f2119c) + this.f2120d);
                }
                this.f2122f = b(iArr);
            }
            this.f2118b = true;
        } else {
            this.f2118b = false;
        }
        return this.f2118b;
    }

    public final boolean i() {
        boolean z4 = this.f2122f.length > 0;
        this.f2123g = z4;
        if (z4) {
            this.f2117a = 1;
            this.f2120d = r0[0];
            this.f2121e = r0[r1 - 1];
            this.f2119c = -1.0f;
        }
        return z4;
    }

    public final boolean j() {
        return !(this.f2124i instanceof x);
    }

    public final void k(float f5, float f6, float f7) {
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f5 + "px) is less or equal to (0px)");
        }
        if (f6 <= f5) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f6 + "px) is less or equal to minimum auto-size text size (" + f5 + "px)");
        }
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f7 + "px) is less or equal to (0px)");
        }
        this.f2117a = 1;
        this.f2120d = f5;
        this.f2121e = f6;
        this.f2119c = f7;
        this.f2123g = false;
    }
}
