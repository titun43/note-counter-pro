package androidx.work;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class n implements b3.c {
    public static n h;

    /* renamed from: g, reason: collision with root package name */
    public final int f671g;

    public /* synthetic */ n(int i5) {
        this.f671g = i5;
    }

    public static synchronized n e() {
        n nVar;
        synchronized (n.class) {
            try {
                if (h == null) {
                    h = new n(3);
                }
                nVar = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // b3.c
    public int a(Context context, String str, boolean z4) {
        return 0;
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f671g <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // b3.c
    public int c(Context context, String str) {
        return this.f671g;
    }

    public void d(String str, String str2, Throwable... thArr) {
        if (this.f671g <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.f671g <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.f671g <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }
}
