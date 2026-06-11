package x;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.lokhnathtechnical.notecounterpro.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3663a = new ThreadLocal();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0142  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        float f5;
        int attributeCount;
        int i5;
        char c5;
        int alpha;
        int i6;
        int[] iArr;
        AttributeSet attributeSet;
        int i7;
        int a5;
        float f6;
        int i8;
        float cbrt;
        int i9;
        TypedValue typedValue;
        ?? r02 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == z4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = t.a.f3323a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(asAttributeSet, iArr4) : theme2.obtainStyledAttributes(asAttributeSet, iArr4, i10, i10);
                int resourceId = obtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f3663a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z4);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i10, -65281);
                        }
                        f5 = !obtainAttributes.hasValue(z4) ? obtainAttributes.getFloat(z4, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c6 = z4;
                        float f7 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = asAttributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i5 = i10;
                        int i13 = i5;
                        while (i5 < attributeCount) {
                            int attributeNameResource = asAttributeSet.getAttributeNameResource(i5);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i14 = i13 + 1;
                                if (!asAttributeSet.getAttributeBooleanValue(i5, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i13] = attributeNameResource;
                                i13 = i14;
                            }
                            i5++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i13);
                        float f8 = 100.0f;
                        c5 = (f7 >= 0.0f || f7 > 100.0f) ? (char) 0 : c6;
                        if (f5 == 1.0f || c5 != 0) {
                            alpha = (int) ((Color.alpha(color) * f5) + 0.5f);
                            if (alpha >= 0) {
                                i6 = 0;
                            } else {
                                i6 = 255;
                                if (alpha <= 255) {
                                    i6 = alpha;
                                }
                            }
                            if (c5 == 0) {
                                a a6 = a.a(color);
                                float f9 = a6.f3650a;
                                float f10 = a6.f3651b;
                                l lVar = l.f3683k;
                                if (f10 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
                                    iArr = trimStateSet;
                                    attributeSet = asAttributeSet;
                                    i7 = depth2;
                                    a5 = b.a(f7);
                                } else {
                                    float min = f9 < 0.0f ? 0.0f : Math.min(360.0f, f9);
                                    float f11 = 0.0f;
                                    float f12 = f10;
                                    char c7 = c6;
                                    a aVar = null;
                                    while (true) {
                                        if (Math.abs(f11 - f10) >= 0.4f) {
                                            float f13 = 1000.0f;
                                            float f14 = f8;
                                            float f15 = 0.0f;
                                            float f16 = 1000.0f;
                                            a aVar2 = null;
                                            while (true) {
                                                if (Math.abs(f15 - f14) <= 0.01f) {
                                                    iArr = trimStateSet;
                                                    attributeSet = asAttributeSet;
                                                    i7 = depth2;
                                                    f6 = f8;
                                                    break;
                                                }
                                                f6 = f8;
                                                float f17 = ((f14 - f15) / 2.0f) + f15;
                                                iArr = trimStateSet;
                                                int c8 = a.b(f17, f12, min).c(l.f3683k);
                                                float b2 = b.b(Color.red(c8));
                                                float b5 = b.b(Color.green(c8));
                                                float b6 = b.b(Color.blue(c8));
                                                float[] fArr = b.f3659d[c6];
                                                float f18 = ((b6 * fArr[2]) + ((b5 * fArr[c6]) + (b2 * fArr[0]))) / f6;
                                                if (f18 <= 0.008856452f) {
                                                    cbrt = f18 * 903.2963f;
                                                    i8 = c8;
                                                } else {
                                                    i8 = c8;
                                                    cbrt = (((float) Math.cbrt(f18)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f7 - cbrt);
                                                if (abs < 0.2f) {
                                                    a a7 = a.a(i8);
                                                    attributeSet = asAttributeSet;
                                                    a b7 = a.b(a7.f3652c, a7.f3651b, min);
                                                    float f19 = a7.f3653d - b7.f3653d;
                                                    float f20 = a7.f3654e - b7.f3654e;
                                                    float f21 = a7.f3655f - b7.f3655f;
                                                    i7 = depth2;
                                                    float pow = (float) (Math.pow(Math.sqrt((f21 * f21) + (f20 * f20) + (f19 * f19)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f16 = pow;
                                                        f13 = abs;
                                                        aVar2 = a7;
                                                    }
                                                } else {
                                                    attributeSet = asAttributeSet;
                                                    i7 = depth2;
                                                }
                                                if (f13 == 0.0f && f16 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f7) {
                                                    f15 = f17;
                                                } else {
                                                    f14 = f17;
                                                }
                                                f8 = f6;
                                                trimStateSet = iArr;
                                                asAttributeSet = attributeSet;
                                                depth2 = i7;
                                            }
                                            a aVar3 = aVar2;
                                            if (c7 == 0) {
                                                if (aVar3 == null) {
                                                    f10 = f12;
                                                } else {
                                                    aVar = aVar3;
                                                    f11 = f12;
                                                }
                                                f12 = ((f10 - f11) / 2.0f) + f11;
                                                f8 = f6;
                                                trimStateSet = iArr;
                                                asAttributeSet = attributeSet;
                                                depth2 = i7;
                                            } else {
                                                if (aVar3 != null) {
                                                    a5 = aVar3.c(lVar);
                                                    break;
                                                }
                                                f12 = ((f10 - f11) / 2.0f) + f11;
                                                f8 = f6;
                                                trimStateSet = iArr;
                                                asAttributeSet = attributeSet;
                                                depth2 = i7;
                                                c7 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            attributeSet = asAttributeSet;
                                            i7 = depth2;
                                            a5 = aVar == null ? b.a(f7) : aVar.c(lVar);
                                        }
                                    }
                                }
                                color = a5;
                            } else {
                                iArr = trimStateSet;
                                attributeSet = asAttributeSet;
                                i7 = depth2;
                            }
                            color = (16777215 & color) | (i6 << 24);
                        } else {
                            iArr = trimStateSet;
                            attributeSet = asAttributeSet;
                            i7 = depth2;
                        }
                        i9 = i11 + 1;
                        if (i9 > iArr3.length) {
                            int[] iArr6 = new int[i11 <= 4 ? 8 : i11 * 2];
                            System.arraycopy(iArr3, 0, iArr6, 0, i11);
                            iArr3 = iArr6;
                        }
                        iArr3[i11] = color;
                        if (i9 > iArr2.length) {
                            ?? r12 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                            System.arraycopy(iArr2, 0, r12, 0, i11);
                            iArr2 = r12;
                        }
                        iArr2[i11] = iArr;
                        iArr2 = iArr2;
                        theme2 = theme;
                        i11 = i9;
                        z4 = c6;
                        asAttributeSet = attributeSet;
                        depth2 = i7;
                        i10 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i10, -65281);
                if (!obtainAttributes.hasValue(z4)) {
                }
                char c62 = z4;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = asAttributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i5 = i10;
                int i132 = i5;
                while (i5 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i132);
                float f82 = 100.0f;
                if (f7 >= 0.0f) {
                }
                if (f5 == 1.0f) {
                }
                alpha = (int) ((Color.alpha(color) * f5) + 0.5f);
                if (alpha >= 0) {
                }
                if (c5 == 0) {
                }
                color = (16777215 & color) | (i6 << 24);
                i9 = i11 + 1;
                if (i9 > iArr3.length) {
                }
                iArr3[i11] = color;
                if (i9 > iArr2.length) {
                }
                iArr2[i11] = iArr;
                iArr2 = iArr2;
                theme2 = theme;
                i11 = i9;
                z4 = c62;
                asAttributeSet = attributeSet;
                depth2 = i7;
                i10 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                theme2 = theme;
                z4 = z4;
                asAttributeSet = asAttributeSet;
                depth2 = depth2;
                i10 = 0;
            }
        }
        int[] iArr7 = new int[i11];
        int[][] iArr8 = new int[i11][];
        System.arraycopy(iArr3, 0, iArr7, 0, i11);
        System.arraycopy(iArr2, 0, iArr8, 0, i11);
        return new ColorStateList(iArr8, iArr7);
    }
}
