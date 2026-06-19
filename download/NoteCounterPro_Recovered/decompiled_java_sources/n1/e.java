package n1;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.v0;
import t1.i;
import u1.k;
import u1.r;

/* loaded from: classes.dex */
public final class e implements p1.b, l1.a, r {

    /* renamed from: p, reason: collision with root package name */
    public static final String f2667p = n.g("DelayMetCommandHandler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f2668g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2669i;

    /* renamed from: j, reason: collision with root package name */
    public final g f2670j;

    /* renamed from: k, reason: collision with root package name */
    public final p1.c f2671k;

    /* renamed from: n, reason: collision with root package name */
    public PowerManager.WakeLock f2674n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2675o = false;

    /* renamed from: m, reason: collision with root package name */
    public int f2673m = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2672l = new Object();

    public e(Context context, int i5, String str, g gVar) {
        this.f2668g = context;
        this.h = i5;
        this.f2670j = gVar;
        this.f2669i = str;
        this.f2671k = new p1.c(context, gVar.h, this);
    }

    public final void a() {
        synchronized (this.f2672l) {
            try {
                this.f2671k.c();
                this.f2670j.f2679i.b(this.f2669i);
                PowerManager.WakeLock wakeLock = this.f2674n;
                if (wakeLock != null && wakeLock.isHeld()) {
                    n.e().b(f2667p, "Releasing wakelock " + this.f2674n + " for WorkSpec " + this.f2669i, new Throwable[0]);
                    this.f2674n.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        StringBuilder sb = new StringBuilder();
        String str = this.f2669i;
        sb.append(str);
        sb.append(" (");
        sb.append(this.h);
        sb.append(")");
        this.f2674n = k.a(this.f2668g, sb.toString());
        n e4 = n.e();
        PowerManager.WakeLock wakeLock = this.f2674n;
        String str2 = f2667p;
        e4.b(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f2674n.acquire();
        i h = this.f2670j.f2681k.f2489e.n().h(str);
        if (h == null) {
            d();
            return;
        }
        boolean b2 = h.b();
        this.f2675o = b2;
        if (b2) {
            this.f2671k.b(Collections.singletonList(h));
        } else {
            n.e().b(str2, s.c.a("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // l1.a
    public final void c(String str, boolean z4) {
        n.e().b(f2667p, "onExecuted " + str + ", " + z4, new Throwable[0]);
        a();
        int i5 = this.h;
        g gVar = this.f2670j;
        Context context = this.f2668g;
        if (z4) {
            gVar.e(new v0(gVar, i5, 2, b.b(context, this.f2669i)));
        }
        if (this.f2675o) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.e(new v0(gVar, i5, 2, intent));
        }
    }

    public final void d() {
        synchronized (this.f2672l) {
            try {
                if (this.f2673m < 2) {
                    this.f2673m = 2;
                    n e4 = n.e();
                    String str = f2667p;
                    e4.b(str, "Stopping work for WorkSpec " + this.f2669i, new Throwable[0]);
                    Context context = this.f2668g;
                    String str2 = this.f2669i;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.f2670j;
                    gVar.e(new v0(gVar, this.h, 2, intent));
                    if (this.f2670j.f2680j.d(this.f2669i)) {
                        n.e().b(str, "WorkSpec " + this.f2669i + " needs to be rescheduled", new Throwable[0]);
                        Intent b2 = b.b(this.f2668g, this.f2669i);
                        g gVar2 = this.f2670j;
                        gVar2.e(new v0(gVar2, this.h, 2, b2));
                    } else {
                        n.e().b(str, "Processor does not have WorkSpec " + this.f2669i + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    n.e().b(f2667p, "Already stopped work for " + this.f2669i, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p1.b
    public final void e(ArrayList arrayList) {
        d();
    }

    @Override // p1.b
    public final void f(List list) {
        if (list.contains(this.f2669i)) {
            synchronized (this.f2672l) {
                try {
                    if (this.f2673m == 0) {
                        this.f2673m = 1;
                        n.e().b(f2667p, "onAllConstraintsMet for " + this.f2669i, new Throwable[0]);
                        if (this.f2670j.f2680j.g(this.f2669i, null)) {
                            this.f2670j.f2679i.a(this.f2669i, this);
                        } else {
                            a();
                        }
                    } else {
                        n.e().b(f2667p, "Already started work for " + this.f2669i, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
