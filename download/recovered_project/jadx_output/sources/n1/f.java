package n1;

import android.content.Intent;
import android.os.PowerManager;
import androidx.emoji2.text.t;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.n;
import u1.i;
import u1.k;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2676g;
    public final g h;

    public /* synthetic */ f(g gVar, int i5) {
        this.f2676g = i5;
        this.h = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar;
        f fVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f2676g) {
            case 0:
                synchronized (this.h.f2684n) {
                    g gVar2 = this.h;
                    gVar2.f2685o = (Intent) gVar2.f2684n.get(0);
                }
                Intent intent = this.h.f2685o;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.h.f2685o.getIntExtra("KEY_START_ID", 0);
                    n e4 = n.e();
                    String str = g.f2677q;
                    e4.b(str, String.format("Processing command %s, %s", this.h.f2685o, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock a5 = k.a(this.h.f2678g, action + " (" + intExtra + ")");
                    try {
                        n.e().b(str, "Acquiring operation wake lock (" + action + ") " + a5, new Throwable[0]);
                        a5.acquire();
                        g gVar3 = this.h;
                        gVar3.f2682l.d(gVar3.f2685o, intExtra, gVar3);
                        n.e().b(str, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                        a5.release();
                        gVar = this.h;
                        fVar = new f(gVar, 1);
                    } catch (Throwable th) {
                        try {
                            n e5 = n.e();
                            String str2 = g.f2677q;
                            e5.d(str2, "Unexpected error in onHandleIntent", th);
                            n.e().b(str2, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                            a5.release();
                            gVar = this.h;
                            fVar = new f(gVar, 1);
                        } catch (Throwable th2) {
                            n.e().b(g.f2677q, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                            a5.release();
                            g gVar4 = this.h;
                            gVar4.e(new f(gVar4, 1));
                            throw th2;
                        }
                    }
                    gVar.e(fVar);
                    return;
                }
                return;
            default:
                g gVar5 = this.h;
                n e6 = n.e();
                String str3 = g.f2677q;
                e6.b(str3, "Checking if commands are complete.", new Throwable[0]);
                gVar5.b();
                synchronized (gVar5.f2684n) {
                    try {
                        if (gVar5.f2685o != null) {
                            n.e().b(str3, String.format("Removing command %s", gVar5.f2685o), new Throwable[0]);
                            if (!((Intent) gVar5.f2684n.remove(0)).equals(gVar5.f2685o)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            gVar5.f2685o = null;
                        }
                        i iVar = (i) ((t) gVar5.h).h;
                        b bVar = gVar5.f2682l;
                        synchronized (bVar.f2662i) {
                            isEmpty = bVar.h.isEmpty();
                        }
                        if (isEmpty && gVar5.f2684n.isEmpty()) {
                            synchronized (iVar.f3507i) {
                                isEmpty2 = iVar.f3506g.isEmpty();
                            }
                            if (isEmpty2) {
                                n.e().b(str3, "No more commands & intents.", new Throwable[0]);
                                SystemAlarmService systemAlarmService = gVar5.f2686p;
                                if (systemAlarmService != null) {
                                    systemAlarmService.a();
                                }
                            }
                        }
                        if (!gVar5.f2684n.isEmpty()) {
                            gVar5.f();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
