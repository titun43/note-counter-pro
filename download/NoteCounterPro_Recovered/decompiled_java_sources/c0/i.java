package c0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o.k f759a = new o.k(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f760b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f761c;

    /* renamed from: d, reason: collision with root package name */
    public static final o.l f762d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f760b = threadPoolExecutor;
        f761c = new Object();
        f762d = new o.l(0);
    }

    public static String a(int i5, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < list.size(); i6++) {
            sb.append(((e) list.get(i6)).f749g);
            sb.append("-");
            sb.append(i5);
            if (i6 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h b(String str, Context context, List list, int i5) {
        Typeface typeface;
        int i6;
        Typeface i7;
        o.k kVar = f759a;
        a.a.e("getFontSync");
        try {
            typeface = (Typeface) kVar.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new h(typeface);
        }
        j a5 = d.a(context, list);
        List list2 = (List) a5.f764b;
        int i8 = a5.f763a;
        if (i8 != 0) {
            if (i8 == 1) {
                i6 = -2;
                if (i6 == 0) {
                    return new h(i6);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    k[] kVarArr = (k[]) list2.get(0);
                    b3.g gVar = y.f.f3734a;
                    a.a.e("TypefaceCompat.createFromFontInfo");
                    i7 = y.f.f3734a.i(context, kVarArr, i5);
                    Trace.endSection();
                    if (i7 != null) {
                        return new h(-3);
                    }
                    kVar.put(str, i7);
                    return new h(i7);
                }
                b3.g gVar2 = y.f.f3734a;
                a.a.e("TypefaceCompat.createFromFontInfoWithFallback");
                i7 = y.f.f3734a.j(context, list2, i5);
                Trace.endSection();
                if (i7 != null) {
                }
            }
            i6 = -3;
            if (i6 == 0) {
            }
        } else {
            k[] kVarArr2 = (k[]) list2.get(0);
            if (kVarArr2 != null && kVarArr2.length != 0) {
                int length = kVarArr2.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        i6 = 0;
                        break;
                    }
                    int i10 = kVarArr2[i9].f770f;
                    if (i10 == 0) {
                        i9++;
                    } else if (i10 >= 0) {
                        i6 = i10;
                    }
                }
                if (i6 == 0) {
                }
            }
            i6 = 1;
            if (i6 == 0) {
            }
        }
    }
}
