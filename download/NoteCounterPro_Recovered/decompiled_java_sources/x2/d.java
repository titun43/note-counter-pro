package x2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.b0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3704a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3705b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f3706c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f3707d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f3708e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f3709f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f3710g;
    public static Boolean h;

    public static void a(Context context, Throwable th) {
        try {
            b0.g(context);
            b0.g(th);
        } catch (Exception e4) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i5 = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = f3704a;
            cArr[i5] = cArr2[(b2 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b2 & 15];
            i5 += 2;
        }
        return new String(cArr);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(Object[] objArr, t2.d dVar) {
        int length = objArr != null ? objArr.length : 0;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            if (!b0.j(objArr[i5], dVar)) {
                i5++;
            } else if (i5 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static long e(InputStream inputStream, OutputStream outputStream, boolean z4) {
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                j2 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z4) {
                    c(inputStream);
                    c(outputStream);
                }
                throw th;
            }
        }
        if (z4) {
            c(inputStream);
            c(outputStream);
        }
        return j2;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean h(Context context) {
        if (f3707d == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z4 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z4 = true;
            }
            f3707d = Boolean.valueOf(z4);
        }
        return f3707d.booleanValue();
    }

    public static boolean i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3705b == null) {
            f3705b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f3705b.booleanValue();
        if (k(context)) {
            return !f() || g();
        }
        return false;
    }

    public static byte[] j(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 2;
            bArr[i5 / 2] = (byte) Integer.parseInt(str.substring(i5, i6), 16);
            i5 = i6;
        }
        return bArr;
    }

    public static boolean k(Context context) {
        if (f3706c == null) {
            f3706c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3706c.booleanValue();
    }
}
