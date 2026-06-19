package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2295a;

    /* renamed from: b, reason: collision with root package name */
    public u2 f2296b;

    /* renamed from: c, reason: collision with root package name */
    public u2 f2297c;

    /* renamed from: d, reason: collision with root package name */
    public u2 f2298d;

    /* renamed from: e, reason: collision with root package name */
    public u2 f2299e;

    /* renamed from: f, reason: collision with root package name */
    public u2 f2300f;

    /* renamed from: g, reason: collision with root package name */
    public u2 f2301g;
    public u2 h;

    /* renamed from: i, reason: collision with root package name */
    public final i1 f2302i;

    /* renamed from: j, reason: collision with root package name */
    public int f2303j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2304k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2305l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2306m;

    public z0(TextView textView) {
        this.f2295a = textView;
        this.f2302i = new i1(textView);
    }

    public static u2 c(Context context, v vVar, int i5) {
        ColorStateList f5;
        synchronized (vVar) {
            f5 = vVar.f2255a.f(context, i5);
        }
        if (f5 == null) {
            return null;
        }
        u2 u2Var = new u2();
        u2Var.f2252d = true;
        u2Var.f2249a = f5;
        return u2Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i5 >= 30) {
            h0.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i5 >= 30) {
            h0.b.a(editorInfo, text);
            return;
        }
        int i6 = editorInfo.initialSelStart;
        int i7 = editorInfo.initialSelEnd;
        int i8 = i6 > i7 ? i7 : i6;
        if (i6 <= i7) {
            i6 = i7;
        }
        int length = text.length();
        if (i8 < 0 || i6 > length) {
            h0.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i9 = editorInfo.inputType & 4095;
        if (i9 == 129 || i9 == 225 || i9 == 18) {
            h0.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            h0.c.a(editorInfo, text, i8, i6);
            return;
        }
        int i10 = i6 - i8;
        int i11 = i10 > 1024 ? 0 : i10;
        int i12 = 2048 - i11;
        int min = Math.min(text.length() - i6, i12 - Math.min(i8, (int) (i12 * 0.8d)));
        int min2 = Math.min(i8, i12 - min);
        int i13 = i8 - min2;
        if (Character.isLowSurrogate(text.charAt(i13))) {
            i13++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i6 + min) - 1))) {
            min--;
        }
        int i14 = min2 + i11;
        h0.c.a(editorInfo, i11 != i10 ? TextUtils.concat(text.subSequence(i13, i13 + min2), text.subSequence(i6, min + i6)) : text.subSequence(i13, i14 + min + i13), min2, i14);
    }

    public final void a(Drawable drawable, u2 u2Var) {
        if (drawable == null || u2Var == null) {
            return;
        }
        v.d(drawable, u2Var, this.f2295a.getDrawableState());
    }

    public final void b() {
        u2 u2Var = this.f2296b;
        TextView textView = this.f2295a;
        if (u2Var != null || this.f2297c != null || this.f2298d != null || this.f2299e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2296b);
            a(compoundDrawables[1], this.f2297c);
            a(compoundDrawables[2], this.f2298d);
            a(compoundDrawables[3], this.f2299e);
        }
        if (this.f2300f == null && this.f2301g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2300f);
        a(compoundDrawablesRelative[2], this.f2301g);
    }

    public final ColorStateList d() {
        u2 u2Var = this.h;
        if (u2Var != null) {
            return u2Var.f2249a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        u2 u2Var = this.h;
        if (u2Var != null) {
            return u2Var.f2250b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i5) {
        boolean z4;
        boolean z5;
        String str;
        String str2;
        int i6;
        float f5;
        int i7;
        ColorStateList colorStateList;
        int resourceId;
        int i8;
        int resourceId2;
        TextView textView = this.f2295a;
        Context context = textView.getContext();
        v a5 = v.a();
        int[] iArr = f.a.h;
        androidx.emoji2.text.t r2 = androidx.emoji2.text.t.r(context, attributeSet, iArr, i5);
        f0.r0.h(textView, textView.getContext(), iArr, attributeSet, (TypedArray) r2.f284i, i5, 0);
        TypedArray typedArray = (TypedArray) r2.f284i;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2296b = c(context, a5, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2297c = c(context, a5, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2298d = c(context, a5, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2299e = c(context, a5, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f2300f = c(context, a5, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2301g = c(context, a5, typedArray.getResourceId(6, 0));
        }
        r2.u();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f1330v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, obtainStyledAttributes);
            if (z6 || !obtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z5 = false;
            } else {
                z5 = obtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            n(context, tVar);
            int i9 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i9 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            tVar.u();
        } else {
            z4 = false;
            z5 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        androidx.emoji2.text.t tVar2 = new androidx.emoji2.text.t(context, obtainStyledAttributes2);
        if (!z6 && obtainStyledAttributes2.hasValue(14)) {
            z5 = obtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        boolean z7 = z5;
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i10 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i10 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar2);
        tVar2.u();
        if (!z6 && z4) {
            textView.setAllCaps(z7);
        }
        Typeface typeface = this.f2305l;
        if (typeface != null) {
            if (this.f2304k == -1) {
                textView.setTypeface(typeface, this.f2303j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            x0.d(textView, str);
        }
        if (str2 != null) {
            w0.b(textView, w0.a(str2));
        }
        i1 i1Var = this.f2302i;
        Context context2 = i1Var.f2125j;
        int[] iArr3 = f.a.f1317i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i5, 0);
        TextView textView2 = i1Var.f2124i;
        f0.r0.h(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i5, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            i1Var.f2117a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i11 = 0; i11 < length; i11++) {
                    iArr4[i11] = obtainTypedArray.getDimensionPixelSize(i11, -1);
                }
                i1Var.f2122f = i1.b(iArr4);
                i1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!i1Var.j()) {
            i1Var.f2117a = 0;
        } else if (i1Var.f2117a == 1) {
            if (!i1Var.f2123g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i8 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i8 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i8, 112.0f, displayMetrics);
                }
                float f6 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                i1Var.k(dimension2, f6, dimension);
            }
            i1Var.h();
        }
        if (l3.f2161c && i1Var.f2117a != 0) {
            int[] iArr5 = i1Var.f2122f;
            if (iArr5.length > 0) {
                if (x0.a(textView) != -1.0f) {
                    x0.b(textView, Math.round(i1Var.f2120d), Math.round(i1Var.f2121e), Math.round(i1Var.f2119c), 0);
                } else {
                    x0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b2 = resourceId4 != -1 ? a5.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b5 = resourceId5 != -1 ? a5.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b6 = resourceId6 != -1 ? a5.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b7 = resourceId7 != -1 ? a5.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b8 = resourceId8 != -1 ? a5.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b9 = resourceId9 != -1 ? a5.b(context, resourceId9) : null;
        if (b8 != null || b9 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b8 == null) {
                b8 = compoundDrawablesRelative[0];
            }
            if (b5 == null) {
                b5 = compoundDrawablesRelative[1];
            }
            if (b9 == null) {
                b9 = compoundDrawablesRelative[2];
            }
            if (b7 == null) {
                b7 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b8, b5, b9, b7);
        } else if (b2 != null || b5 != null || b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[1];
                }
                if (b6 == null) {
                    b6 = compoundDrawables[2];
                }
                if (b7 == null) {
                    b7 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b5, b6, b7);
            } else {
                if (b5 == null) {
                    b5 = compoundDrawablesRelative2[1];
                }
                if (b7 == null) {
                    b7 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b5, compoundDrawablesRelative2[2], b7);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = v.a.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(n1.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i12 = peekValue.data;
                int i13 = i12 & 15;
                f5 = TypedValue.complexToFloat(i12);
                i7 = i13;
                i6 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i6) {
                    z2.b.w(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i6) {
                    z2.b.x(textView, dimensionPixelSize2);
                }
                if (f5 == -1.0f) {
                    if (i7 == i6) {
                        z2.b.y(textView, (int) f5);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        androidx.activity.a.i(textView, i7, f5);
                        return;
                    } else {
                        z2.b.y(textView, Math.round(TypedValue.applyDimension(i7, f5, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i6 = -1;
            f5 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i6 = -1;
            f5 = -1.0f;
        }
        i7 = i6;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i6) {
        }
        if (dimensionPixelSize2 != i6) {
        }
        if (f5 == -1.0f) {
        }
    }

    public final void g(Context context, int i5) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, f.a.f1330v);
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2295a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i6 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar);
        if (i6 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            x0.d(textView, string);
        }
        tVar.u();
        Typeface typeface = this.f2305l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2303j);
        }
    }

    public final void i(int i5, int i6, int i7, int i8) {
        i1 i1Var = this.f2302i;
        if (i1Var.j()) {
            DisplayMetrics displayMetrics = i1Var.f2125j.getResources().getDisplayMetrics();
            i1Var.k(TypedValue.applyDimension(i8, i5, displayMetrics), TypedValue.applyDimension(i8, i6, displayMetrics), TypedValue.applyDimension(i8, i7, displayMetrics));
            if (i1Var.h()) {
                i1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i5) {
        i1 i1Var = this.f2302i;
        if (i1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i5 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = i1Var.f2125j.getResources().getDisplayMetrics();
                    for (int i6 = 0; i6 < length; i6++) {
                        iArr2[i6] = Math.round(TypedValue.applyDimension(i5, iArr[i6], displayMetrics));
                    }
                }
                i1Var.f2122f = i1.b(iArr2);
                if (!i1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                i1Var.f2123g = false;
            }
            if (i1Var.h()) {
                i1Var.a();
            }
        }
    }

    public final void k(int i5) {
        i1 i1Var = this.f2302i;
        if (i1Var.j()) {
            if (i5 == 0) {
                i1Var.f2117a = 0;
                i1Var.f2120d = -1.0f;
                i1Var.f2121e = -1.0f;
                i1Var.f2119c = -1.0f;
                i1Var.f2122f = new int[0];
                i1Var.f2118b = false;
                return;
            }
            if (i5 != 1) {
                throw new IllegalArgumentException(androidx.emoji2.text.u.h(i5, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = i1Var.f2125j.getResources().getDisplayMetrics();
            i1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (i1Var.h()) {
                i1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new u2();
        }
        u2 u2Var = this.h;
        u2Var.f2249a = colorStateList;
        u2Var.f2252d = colorStateList != null;
        this.f2296b = u2Var;
        this.f2297c = u2Var;
        this.f2298d = u2Var;
        this.f2299e = u2Var;
        this.f2300f = u2Var;
        this.f2301g = u2Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new u2();
        }
        u2 u2Var = this.h;
        u2Var.f2250b = mode;
        u2Var.f2251c = mode != null;
        this.f2296b = u2Var;
        this.f2297c = u2Var;
        this.f2298d = u2Var;
        this.f2299e = u2Var;
        this.f2300f = u2Var;
        this.f2301g = u2Var;
    }

    public final void n(Context context, androidx.emoji2.text.t tVar) {
        String string;
        int i5 = this.f2303j;
        TypedArray typedArray = (TypedArray) tVar.f284i;
        this.f2303j = typedArray.getInt(2, i5);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            int i7 = typedArray.getInt(11, -1);
            this.f2304k = i7;
            if (i7 != -1) {
                this.f2303j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2306m = false;
                int i8 = typedArray.getInt(1, 1);
                if (i8 == 1) {
                    this.f2305l = Typeface.SANS_SERIF;
                    return;
                } else if (i8 == 2) {
                    this.f2305l = Typeface.SERIF;
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    this.f2305l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2305l = null;
        int i9 = typedArray.hasValue(12) ? 12 : 10;
        int i10 = this.f2304k;
        int i11 = this.f2303j;
        if (!context.isRestricted()) {
            try {
                Typeface n5 = tVar.n(i9, this.f2303j, new u0(this, i10, i11, new WeakReference(this.f2295a)));
                if (n5 != null) {
                    if (i6 < 28 || this.f2304k == -1) {
                        this.f2305l = n5;
                    } else {
                        this.f2305l = y0.a(Typeface.create(n5, 0), this.f2304k, (this.f2303j & 2) != 0);
                    }
                }
                this.f2306m = this.f2305l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2305l != null || (string = typedArray.getString(i9)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2304k == -1) {
            this.f2305l = Typeface.create(string, this.f2303j);
        } else {
            this.f2305l = y0.a(Typeface.create(string, 0), this.f2304k, (this.f2303j & 2) != 0);
        }
    }
}
