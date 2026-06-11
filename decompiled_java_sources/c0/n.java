package c0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.emoji2.text.r;
import androidx.emoji2.text.t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import y1.b0;
import y1.w;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f772g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f773i;

    /* renamed from: j, reason: collision with root package name */
    public Object f774j;

    public /* synthetic */ n(int i5) {
        this.f772g = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z4 = true;
        char c5 = 1;
        switch (this.f772g) {
            case 0:
                try {
                    obj = ((f) this.h).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f774j).post(new a(c5 == true ? 1 : 0, (g) this.f773i, obj));
                return;
            case 1:
                try {
                    z4 = ((Boolean) ((v1.j) this.f774j).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((l1.b) this.h).c((String) this.f773i, z4);
                return;
            case 2:
                v1.j jVar = (v1.j) this.f773i;
                l1.l lVar = (l1.l) this.f774j;
                try {
                    ((j3.a) this.h).get();
                    androidx.work.n.e().b(l1.l.f2495z, "Starting work for " + lVar.f2499k.f3342c, new Throwable[0]);
                    lVar.f2511x = lVar.f2500l.startWork();
                    jVar.j(lVar.f2511x);
                    return;
                } catch (Throwable th) {
                    jVar.i(th);
                    return;
                }
            case 3:
                String str = (String) this.f773i;
                l1.l lVar2 = (l1.l) this.f774j;
                try {
                    try {
                        androidx.work.m mVar = (androidx.work.m) ((v1.j) this.h).get();
                        if (mVar == null) {
                            androidx.work.n.e().d(l1.l.f2495z, lVar2.f2499k.f3342c + " returned a null result. Treating it as a failure.", new Throwable[0]);
                        } else {
                            androidx.work.n.e().b(l1.l.f2495z, String.format("%s returned a %s result.", lVar2.f2499k.f3342c, mVar), new Throwable[0]);
                            lVar2.f2502n = mVar;
                        }
                    } catch (Throwable th2) {
                        lVar2.b();
                        throw th2;
                    }
                } catch (InterruptedException e4) {
                    e = e4;
                    androidx.work.n.e().d(l1.l.f2495z, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e5) {
                    androidx.work.n.e().f(l1.l.f2495z, str + " was cancelled", e5);
                } catch (ExecutionException e6) {
                    e = e6;
                    androidx.work.n.e().d(l1.l.f2495z, str + " failed because it threw an exception/error", e);
                }
                lVar2.b();
                return;
            case 4:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f774j;
                Context context = (Context) this.f773i;
                Intent intent = (Intent) this.h;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    androidx.work.n.e().b(ConstraintProxyUpdateReceiver.f651a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                    u1.g.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    u1.g.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    u1.g.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    u1.g.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 5:
                t1.i h = ((WorkDatabase) this.h).n().h((String) this.f773i);
                if (h == null || !h.b()) {
                    return;
                }
                synchronized (((s1.b) this.f774j).f3291i) {
                    ((s1.b) this.f774j).f3294l.put((String) this.f773i, h);
                    ((s1.b) this.f774j).f3295m.add(h);
                    s1.b bVar = (s1.b) this.f774j;
                    bVar.f3296n.b(bVar.f3295m);
                }
                return;
            case 6:
                ((l1.k) this.h).h.g((String) this.f773i, (t) this.f774j);
                return;
            case 7:
                y1.b bVar2 = (y1.b) this.h;
                a2.c cVar = (a2.c) this.f773i;
                r rVar = (r) this.f774j;
                bVar2.getClass();
                y1.e eVar = b0.f3819j;
                bVar2.t(24, 4, eVar);
                cVar.b(eVar, rVar.h);
                return;
            case 8:
                ((w) this.h).x((u1.f) this.f773i, (com.getcapacitor.plugin.c) this.f774j);
                return;
            default:
                ((w) this.h).w((a2.c) this.f774j, (r) this.f773i);
                return;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i5) {
        this.f772g = i5;
        this.f774j = obj;
        this.h = obj2;
        this.f773i = obj3;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i5, boolean z4) {
        this.f772g = i5;
        this.h = obj;
        this.f773i = obj2;
        this.f774j = obj3;
    }
}
