package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b0.e;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d extends y4.b {

    /* renamed from: i, reason: collision with root package name */
    public final Object f2451i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f2452j = Executors.newFixedThreadPool(4, new c());

    /* renamed from: k, reason: collision with root package name */
    public volatile Handler f2453k;

    public static Handler S(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
