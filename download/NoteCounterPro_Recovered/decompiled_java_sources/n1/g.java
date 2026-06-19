package n1;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.n;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import k.v0;
import l1.k;
import u1.t;

/* loaded from: classes.dex */
public final class g implements l1.a {

    /* renamed from: q, reason: collision with root package name */
    public static final String f2677q = n.g("SystemAlarmDispatcher");

    /* renamed from: g, reason: collision with root package name */
    public final Context f2678g;
    public final w1.a h;

    /* renamed from: i, reason: collision with root package name */
    public final t f2679i;

    /* renamed from: j, reason: collision with root package name */
    public final l1.b f2680j;

    /* renamed from: k, reason: collision with root package name */
    public final k f2681k;

    /* renamed from: l, reason: collision with root package name */
    public final b f2682l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f2683m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2684n;

    /* renamed from: o, reason: collision with root package name */
    public Intent f2685o;

    /* renamed from: p, reason: collision with root package name */
    public SystemAlarmService f2686p;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f2678g = applicationContext;
        this.f2682l = new b(applicationContext);
        this.f2679i = new t();
        k Q = k.Q(systemAlarmService);
        this.f2681k = Q;
        l1.b bVar = Q.h;
        this.f2680j = bVar;
        this.h = Q.f2490f;
        bVar.a(this);
        this.f2684n = new ArrayList();
        this.f2685o = null;
        this.f2683m = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i5) {
        n e4 = n.e();
        String str = f2677q;
        int i6 = 0;
        e4.b(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i5)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.e().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f2684n) {
                try {
                    ArrayList arrayList = this.f2684n;
                    int size = arrayList.size();
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i5);
        synchronized (this.f2684n) {
            try {
                boolean isEmpty = this.f2684n.isEmpty();
                this.f2684n.add(intent);
                if (isEmpty) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void b() {
        if (this.f2683m.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // l1.a
    public final void c(String str, boolean z4) {
        String str2 = b.f2660j;
        Intent intent = new Intent(this.f2678g, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        e(new v0(this, 0, 2, intent));
    }

    public final void d() {
        n.e().b(f2677q, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2680j.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f2679i.f3535a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f2686p = null;
    }

    public final void e(Runnable runnable) {
        this.f2683m.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock a5 = u1.k.a(this.f2678g, "ProcessCommand");
        try {
            a5.acquire();
            this.f2681k.f2490f.i(new f(this, 0));
        } finally {
            a5.release();
        }
    }
}
