package y;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends g {
    public final Class h;

    /* renamed from: i, reason: collision with root package name */
    public final Constructor f3746i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f3747j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f3748k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f3749l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f3750m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f3751n;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = G(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = H(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.h = cls;
        this.f3746i = constructor;
        this.f3747j = method2;
        this.f3748k = method3;
        this.f3749l = method4;
        this.f3750m = method5;
        this.f3751n = method;
    }

    public static Method G(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean D(Context context, Object obj, String str, int i5, int i6, int i7, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3747j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface E(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3751n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean F(Object obj) {
        try {
            return ((Boolean) this.f3749l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method H(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // y.g, b3.g
    public final Typeface h(Context context, x.e eVar, Resources resources, int i5) {
        Object obj;
        Method method = this.f3747j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.h(context, eVar, resources, i5);
        }
        try {
            obj = this.f3746i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            x.f[] fVarArr = eVar.f3664a;
            int length = fVarArr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    x.f fVar = fVarArr[i6];
                    Context context2 = context;
                    if (D(context2, obj, fVar.f3665a, fVar.f3669e, fVar.f3666b, fVar.f3667c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f3668d))) {
                        i6++;
                        context = context2;
                    } else {
                        try {
                            this.f3750m.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (F(obj)) {
                    return E(obj);
                }
            }
        }
        return null;
    }

    @Override // y.g, b3.g
    public final Typeface i(Context context, c0.k[] kVarArr, int i5) {
        Object obj;
        Typeface E;
        boolean z4;
        if (kVarArr.length >= 1) {
            Method method = this.f3747j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (c0.k kVar : kVarArr) {
                        if (kVar.f770f == 0) {
                            Uri uri = kVar.f765a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, y4.b.A(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f3746i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = kVarArr.length;
                        int i6 = 0;
                        boolean z5 = false;
                        while (true) {
                            Method method2 = this.f3750m;
                            if (i6 < length) {
                                c0.k kVar2 = kVarArr[i6];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f765a);
                                if (byteBuffer != null) {
                                    try {
                                        z4 = ((Boolean) this.f3748k.invoke(obj, byteBuffer, Integer.valueOf(kVar2.f766b), null, Integer.valueOf(kVar2.f767c), Integer.valueOf(kVar2.f768d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z5 = true;
                                }
                                i6++;
                                z5 = z5;
                            } else if (!z5) {
                                method2.invoke(obj, null);
                            } else if (F(obj) && (E = E(obj)) != null) {
                                return Typeface.create(E, i5);
                            }
                        }
                    }
                } else {
                    c0.k s5 = s(kVarArr, i5);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(s5.f765a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(s5.f767c).setItalic(s5.f768d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // b3.g
    public final Typeface l(Context context, Resources resources, int i5, String str, int i6) {
        Object obj;
        Method method = this.f3747j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, resources, i5, str, i6);
        }
        try {
            obj = this.f3746i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!D(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f3750m.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (F(obj)) {
                return E(obj);
            }
        }
        return null;
    }
}
