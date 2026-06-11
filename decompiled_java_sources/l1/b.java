package l1;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.n;
import f2.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements a, s1.a {

    /* renamed from: r, reason: collision with root package name */
    public static final String f2454r = n.g("Processor");
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.work.b f2456i;

    /* renamed from: j, reason: collision with root package name */
    public final t f2457j;

    /* renamed from: k, reason: collision with root package name */
    public final WorkDatabase f2458k;

    /* renamed from: n, reason: collision with root package name */
    public final List f2461n;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f2460m = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f2459l = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f2462o = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2463p = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public PowerManager.WakeLock f2455g = null;

    /* renamed from: q, reason: collision with root package name */
    public final Object f2464q = new Object();

    public b(Context context, androidx.work.b bVar, t tVar, WorkDatabase workDatabase, List list) {
        this.h = context;
        this.f2456i = bVar;
        this.f2457j = tVar;
        this.f2458k = workDatabase;
        this.f2461n = list;
    }

    public static boolean b(String str, l lVar) {
        boolean z4;
        if (lVar == null) {
            n.e().b(f2454r, s.c.a("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        lVar.f2512y = true;
        lVar.h();
        j3.a aVar = lVar.f2511x;
        if (aVar != null) {
            z4 = aVar.isDone();
            lVar.f2511x.cancel(true);
        } else {
            z4 = false;
        }
        ListenableWorker listenableWorker = lVar.f2500l;
        if (listenableWorker == null || z4) {
            n.e().b(l.f2495z, "WorkSpec " + lVar.f2499k + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        n.e().b(f2454r, s.c.a("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final void a(a aVar) {
        synchronized (this.f2464q) {
            this.f2463p.add(aVar);
        }
    }

    @Override // l1.a
    public final void c(String str, boolean z4) {
        synchronized (this.f2464q) {
            try {
                this.f2460m.remove(str);
                int i5 = 0;
                n.e().b(f2454r, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z4, new Throwable[0]);
                ArrayList arrayList = this.f2463p;
                int size = arrayList.size();
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((a) obj).c(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z4;
        synchronized (this.f2464q) {
            try {
                z4 = this.f2460m.containsKey(str) || this.f2459l.containsKey(str);
            } finally {
            }
        }
        return z4;
    }

    public final void e(a aVar) {
        synchronized (this.f2464q) {
            this.f2463p.remove(aVar);
        }
    }

    public final void f(String str, androidx.work.h hVar) {
        synchronized (this.f2464q) {
            try {
                n.e().f(f2454r, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                l lVar = (l) this.f2460m.remove(str);
                if (lVar != null) {
                    if (this.f2455g == null) {
                        PowerManager.WakeLock a5 = u1.k.a(this.h, "ProcessorForegroundLck");
                        this.f2455g = a5;
                        a5.acquire();
                    }
                    this.f2459l.put(str, lVar);
                    v.a.startForegroundService(this.h, s1.b.b(this.h, str, hVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, t tVar) {
        synchronized (this.f2464q) {
            try {
                if (d(str)) {
                    n.e().b(f2454r, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.h;
                androidx.work.b bVar = this.f2456i;
                t tVar2 = this.f2457j;
                WorkDatabase workDatabase = this.f2458k;
                t tVar3 = new t(4);
                Context applicationContext = context.getApplicationContext();
                List list = this.f2461n;
                if (tVar == null) {
                    tVar = tVar3;
                }
                l lVar = new l();
                lVar.f2502n = new androidx.work.j();
                v1.j jVar = new v1.j();
                lVar.w = jVar;
                lVar.f2511x = null;
                lVar.f2496g = applicationContext;
                lVar.f2501m = tVar2;
                lVar.f2504p = this;
                lVar.h = str;
                lVar.f2497i = list;
                lVar.f2498j = tVar;
                lVar.f2500l = null;
                lVar.f2503o = bVar;
                lVar.f2505q = workDatabase;
                lVar.f2506r = workDatabase.n();
                lVar.f2507s = workDatabase.i();
                lVar.f2508t = workDatabase.o();
                c0.n nVar = new c0.n(1);
                nVar.h = this;
                nVar.f773i = str;
                nVar.f774j = jVar;
                jVar.addListener(nVar, (q) this.f2457j.f285j);
                this.f2460m.put(str, lVar);
                ((u1.i) this.f2457j.h).execute(lVar);
                n.e().b(f2454r, u.k(b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f2464q) {
            try {
                if (this.f2459l.isEmpty()) {
                    Context context = this.h;
                    String str = s1.b.f3289p;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.h.startService(intent);
                    } catch (Throwable th) {
                        n.e().d(f2454r, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f2455g;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f2455g = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean b2;
        synchronized (this.f2464q) {
            n.e().b(f2454r, "Processor stopping foreground work " + str, new Throwable[0]);
            b2 = b(str, (l) this.f2459l.remove(str));
        }
        return b2;
    }

    public final boolean j(String str) {
        boolean b2;
        synchronized (this.f2464q) {
            n.e().b(f2454r, "Processor stopping background work " + str, new Throwable[0]);
            b2 = b(str, (l) this.f2460m.remove(str));
        }
        return b2;
    }
}
