package y0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import q.m;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final m f3781a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3782b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f3783c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b() {
        c cVar = new c();
        f3783c = cVar;
        f3781a.i(cVar);
        return f3783c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z4) {
        boolean z5;
        h a5;
        h hVar;
        int i5;
        if (z4 || f3783c == null) {
            synchronized (f3782b) {
                if (!z4) {
                    if (f3783c != null) {
                        return;
                    }
                }
                int i6 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z5 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z5 = false;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 28 && i7 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z6 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z7 = file2.exists() && length2 > 0;
                    try {
                        long a6 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a5 = h.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a5 = null;
                        }
                        if (a5 != null && a5.f3779c == a6 && (i5 = a5.f3778b) != 2) {
                            i6 = i5;
                            if (z4 && z7 && i6 != 1) {
                                i6 = 2;
                            }
                            if (a5 != null && a5.f3778b == 2 && i6 == 1 && length < a5.f3780d) {
                                i6 = 3;
                            }
                            hVar = new h(a6, 1, i6, length2);
                            if (a5 != null || !a5.equals(hVar)) {
                                hVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z6) {
                            i6 = 1;
                        } else if (z7) {
                            i6 = 2;
                        }
                        if (z4) {
                            i6 = 2;
                        }
                        if (a5 != null) {
                            i6 = 3;
                        }
                        hVar = new h(a6, 1, i6, length2);
                        if (a5 != null) {
                        }
                        hVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
