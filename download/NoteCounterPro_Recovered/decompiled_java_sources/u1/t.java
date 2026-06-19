package u1;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3534e = androidx.work.n.g("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f3535a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3536b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3537c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3538d;

    public t() {
        q qVar = new q();
        qVar.f3532a = 0;
        this.f3536b = new HashMap();
        this.f3537c = new HashMap();
        this.f3538d = new Object();
        this.f3535a = Executors.newSingleThreadScheduledExecutor(qVar);
    }

    public final void a(String str, n1.e eVar) {
        synchronized (this.f3538d) {
            androidx.work.n.e().b(f3534e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            s sVar = new s(this, str);
            this.f3536b.put(str, sVar);
            this.f3537c.put(str, eVar);
            this.f3535a.schedule(sVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f3538d) {
            try {
                if (((s) this.f3536b.remove(str)) != null) {
                    androidx.work.n.e().b(f3534e, "Stopping timer for " + str, new Throwable[0]);
                    this.f3537c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
