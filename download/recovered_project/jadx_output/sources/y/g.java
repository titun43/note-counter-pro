package y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class g extends b3.g {

    /* renamed from: c, reason: collision with root package name */
    public static Class f3737c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f3738d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f3739e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3740f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3741g = false;

    public static boolean B(Object obj, String str, int i5, boolean z4) {
        C();
        try {
            return ((Boolean) f3739e.invoke(obj, str, Integer.valueOf(i5), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void C() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3741g) {
            return;
        }
        f3741g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f3738d = constructor;
        f3737c = cls;
        f3739e = method2;
        f3740f = method;
    }

    @Override // b3.g
    public Typeface h(Context context, x.e eVar, Resources resources, int i5) {
        C();
        try {
            Object newInstance = f3738d.newInstance(null);
            for (x.f fVar : eVar.f3664a) {
                File w = y4.b.w(context);
                if (w == null) {
                    return null;
                }
                try {
                    if (!y4.b.i(w, resources, fVar.f3670f)) {
                        return null;
                    }
                    if (!B(newInstance, w.getPath(), fVar.f3666b, fVar.f3667c)) {
                        return null;
                    }
                    w.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    w.delete();
                }
            }
            C();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f3737c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f3740f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // b3.g
    public Typeface i(Context context, c0.k[] kVarArr, int i5) {
        File file;
        String readlink;
        if (kVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(s(kVarArr, i5).f765a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface k5 = k(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return k5;
                        }
                        Typeface k52 = k(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return k52;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
