package y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends b3.g {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f3742c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f3743d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f3744e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f3745f;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            method2 = null;
        }
        f3743d = constructor;
        f3742c = cls;
        f3744e = method2;
        f3745f = method;
    }

    public static boolean B(Object obj, ByteBuffer byteBuffer, int i5, int i6, boolean z4) {
        try {
            return ((Boolean) f3744e.invoke(obj, byteBuffer, Integer.valueOf(i5), null, Integer.valueOf(i6), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface C(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f3742c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3745f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // b3.g
    public final Typeface h(Context context, x.e eVar, Resources resources, int i5) {
        Object obj;
        int i6;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f3743d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (x.f fVar : eVar.f3664a) {
                int i7 = fVar.f3670f;
                File w = y4.b.w(context);
                if (w != null) {
                    try {
                        if (y4.b.i(w, resources, i7)) {
                            try {
                                fileInputStream = new FileInputStream(w);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i6 = (mappedByteBuffer != null && B(obj, mappedByteBuffer, fVar.f3669e, fVar.f3666b, fVar.f3667c)) ? i6 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        w.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return C(obj);
        }
        return null;
    }

    @Override // b3.g
    public final Typeface i(Context context, c0.k[] kVarArr, int i5) {
        Object obj;
        try {
            obj = f3743d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i6 = 0;
            o.l lVar = new o.l(0);
            int length = kVarArr.length;
            while (true) {
                if (i6 < length) {
                    c0.k kVar = kVarArr[i6];
                    Uri uri = kVar.f765a;
                    ByteBuffer byteBuffer = (ByteBuffer) lVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = y4.b.A(context, uri);
                        lVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !B(obj, byteBuffer, kVar.f766b, kVar.f767c, kVar.f768d)) {
                        break;
                    }
                    i6++;
                } else {
                    Typeface C = C(obj);
                    if (C != null) {
                        return Typeface.create(C, i5);
                    }
                }
            }
        }
        return null;
    }
}
