package v4;

import java.util.concurrent.TimeUnit;
import t4.u;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3612a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f3613b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3614c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3615d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3616e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3617f;

    static {
        String str;
        int i5 = u.f3444a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3612a = str;
        f3613b = t4.b.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i6 = u.f3444a;
        if (i6 < 2) {
            i6 = 2;
        }
        f3614c = t4.b.k("kotlinx.coroutines.scheduler.core.pool.size", i6, 8);
        f3615d = t4.b.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f3616e = TimeUnit.SECONDS.toNanos(t4.b.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f3617f = g.f3608a;
    }
}
