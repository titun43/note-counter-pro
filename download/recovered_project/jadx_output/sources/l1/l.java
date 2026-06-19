package l1;

import android.content.Context;
import android.database.Cursor;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import androidx.emoji2.text.u;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.m;
import androidx.work.n;
import f2.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import u1.o;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final String f2495z = n.g("WorkerWrapper");

    /* renamed from: g, reason: collision with root package name */
    public Context f2496g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public List f2497i;

    /* renamed from: j, reason: collision with root package name */
    public t f2498j;

    /* renamed from: k, reason: collision with root package name */
    public t1.i f2499k;

    /* renamed from: l, reason: collision with root package name */
    public ListenableWorker f2500l;

    /* renamed from: m, reason: collision with root package name */
    public t f2501m;

    /* renamed from: n, reason: collision with root package name */
    public m f2502n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.work.b f2503o;

    /* renamed from: p, reason: collision with root package name */
    public b f2504p;

    /* renamed from: q, reason: collision with root package name */
    public WorkDatabase f2505q;

    /* renamed from: r, reason: collision with root package name */
    public l2.j f2506r;

    /* renamed from: s, reason: collision with root package name */
    public p f2507s;

    /* renamed from: t, reason: collision with root package name */
    public p f2508t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f2509u;

    /* renamed from: v, reason: collision with root package name */
    public String f2510v;
    public v1.j w;

    /* renamed from: x, reason: collision with root package name */
    public j3.a f2511x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f2512y;

    public final void a(m mVar) {
        boolean z4 = mVar instanceof androidx.work.l;
        String str = f2495z;
        if (!z4) {
            if (mVar instanceof androidx.work.k) {
                n.e().f(str, s.c.a("Worker result RETRY for ", this.f2510v), new Throwable[0]);
                c();
                return;
            }
            n.e().f(str, s.c.a("Worker result FAILURE for ", this.f2510v), new Throwable[0]);
            if (this.f2499k.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        n.e().f(str, s.c.a("Worker result SUCCESS for ", this.f2510v), new Throwable[0]);
        if (this.f2499k.c()) {
            d();
            return;
        }
        p pVar = this.f2507s;
        String str2 = this.h;
        l2.j jVar = this.f2506r;
        WorkDatabase workDatabase = this.f2505q;
        workDatabase.c();
        try {
            jVar.o(3, str2);
            jVar.m(str2, ((androidx.work.l) this.f2502n).f670a);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList y2 = pVar.y(str2);
            int size = y2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = y2.get(i5);
                i5++;
                String str3 = (String) obj;
                if (jVar.e(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) pVar.h;
                    z0.j d5 = z0.j.d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        d5.f(1);
                    } else {
                        d5.g(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor g5 = workDatabase_Impl.g(d5);
                    try {
                        if (g5.moveToFirst() && g5.getInt(0) != 0) {
                            n.e().f(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            jVar.o(1, str3);
                            jVar.n(str3, currentTimeMillis);
                        }
                    } finally {
                        g5.close();
                        d5.h();
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th) {
            workDatabase.f();
            e(false);
            throw th;
        }
    }

    public final void b() {
        List list = this.f2497i;
        String str = this.h;
        WorkDatabase workDatabase = this.f2505q;
        if (!h()) {
            workDatabase.c();
            try {
                int e4 = this.f2506r.e(str);
                r1.h m5 = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m5.f3161g;
                workDatabase_Impl.b();
                t1.e eVar = (t1.e) m5.f3162i;
                e1.f a5 = eVar.a();
                if (str == null) {
                    a5.e(1);
                } else {
                    a5.f(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a5.l();
                    workDatabase_Impl.h();
                    if (e4 == 0) {
                        e(false);
                    } else if (e4 == 2) {
                        a(this.f2502n);
                    } else if (!u.a(e4)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    eVar.c(a5);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).d(str);
            }
            d.a(this.f2503o, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.h;
        l2.j jVar = this.f2506r;
        WorkDatabase workDatabase = this.f2505q;
        workDatabase.c();
        try {
            jVar.o(1, str);
            jVar.n(str, System.currentTimeMillis());
            jVar.k(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.h;
        l2.j jVar = this.f2506r;
        WorkDatabase workDatabase = this.f2505q;
        workDatabase.c();
        try {
            jVar.n(str, System.currentTimeMillis());
            jVar.o(1, str);
            jVar.l(str);
            jVar.k(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z4) {
        boolean z5;
        ListenableWorker listenableWorker;
        b bVar;
        this.f2505q.c();
        try {
            l2.j n5 = this.f2505q.n();
            n5.getClass();
            z0.j d5 = z0.j.d(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n5.f2533a;
            workDatabase_Impl.b();
            Cursor g5 = workDatabase_Impl.g(d5);
            try {
                if (g5.moveToFirst()) {
                    if (g5.getInt(0) != 0) {
                        z5 = true;
                        if (!z5) {
                            u1.g.a(this.f2496g, RescheduleReceiver.class, false);
                        }
                        if (z4) {
                            this.f2506r.o(1, this.h);
                            this.f2506r.k(this.h, -1L);
                        }
                        if (this.f2499k != null && (listenableWorker = this.f2500l) != null && listenableWorker.isRunInForeground()) {
                            bVar = this.f2504p;
                            String str = this.h;
                            synchronized (bVar.f2464q) {
                                bVar.f2459l.remove(str);
                                bVar.h();
                            }
                        }
                        this.f2505q.h();
                        this.f2505q.f();
                        this.w.h(Boolean.valueOf(z4));
                    }
                }
                z5 = false;
                if (!z5) {
                }
                if (z4) {
                }
                if (this.f2499k != null) {
                    bVar = this.f2504p;
                    String str2 = this.h;
                    synchronized (bVar.f2464q) {
                    }
                }
                this.f2505q.h();
                this.f2505q.f();
                this.w.h(Boolean.valueOf(z4));
            } finally {
                g5.close();
                d5.h();
            }
        } catch (Throwable th) {
            this.f2505q.f();
            throw th;
        }
    }

    public final void f() {
        l2.j jVar = this.f2506r;
        String str = this.h;
        int e4 = jVar.e(str);
        String str2 = f2495z;
        if (e4 == 2) {
            n.e().b(str2, s.c.b("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        n.e().b(str2, "Status for " + str + " is " + u.B(e4) + "; not doing any work", new Throwable[0]);
        e(false);
    }

    public final void g() {
        l2.j jVar = this.f2506r;
        String str = this.h;
        WorkDatabase workDatabase = this.f2505q;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (jVar.e(str2) != 6) {
                    jVar.o(4, str2);
                }
                linkedList.addAll(this.f2507s.y(str2));
            }
            jVar.m(str, ((androidx.work.j) this.f2502n).f669a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f2512y) {
            return false;
        }
        n.e().b(f2495z, s.c.a("Work interrupted for ", this.f2510v), new Throwable[0]);
        if (this.f2506r.e(this.h) == 0) {
            e(false);
            return true;
        }
        e(!u.a(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if ((r9.f3341b == 1 && r9.f3349k > 0) != false) goto L35;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        androidx.work.i iVar;
        androidx.work.g a5;
        p pVar = this.f2508t;
        String str = this.h;
        ArrayList A = pVar.A(str);
        this.f2509u = A;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(str);
        sb.append(", tags={ ");
        int size = A.size();
        int i5 = 0;
        boolean z4 = true;
        while (i5 < size) {
            Object obj = A.get(i5);
            i5++;
            String str2 = (String) obj;
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f2510v = sb.toString();
        androidx.work.b bVar = this.f2503o;
        l2.j jVar = this.f2506r;
        t tVar = this.f2501m;
        WorkDatabase workDatabase = this.f2505q;
        if (h()) {
            return;
        }
        workDatabase.c();
        try {
            t1.i h = jVar.h(str);
            this.f2499k = h;
            String str3 = f2495z;
            if (h == null) {
                n.e().d(str3, "Didn't find WorkSpec for id " + str, new Throwable[0]);
                e(false);
                workDatabase.h();
                return;
            }
            if (h.f3341b != 1) {
                f();
                workDatabase.h();
                n.e().b(str3, this.f2499k.f3342c + " is not in ENQUEUED state. Nothing more to do.", new Throwable[0]);
                return;
            }
            if (!h.c()) {
                t1.i iVar2 = this.f2499k;
            }
            long currentTimeMillis = System.currentTimeMillis();
            t1.i iVar3 = this.f2499k;
            if (iVar3.f3352n != 0 && currentTimeMillis < iVar3.a()) {
                n.e().b(str3, "Delaying execution for " + this.f2499k.f3342c + " because it is being executed before schedule.", new Throwable[0]);
                e(true);
                workDatabase.h();
                return;
            }
            workDatabase.h();
            workDatabase.f();
            if (this.f2499k.c()) {
                a5 = this.f2499k.f3344e;
            } else {
                t2.i iVar4 = bVar.f618d;
                String str4 = this.f2499k.f3343d;
                iVar4.getClass();
                String str5 = androidx.work.i.f640a;
                try {
                    iVar = (androidx.work.i) Class.forName(str4).newInstance();
                } catch (Exception e4) {
                    n.e().d(androidx.work.i.f640a, s.c.a("Trouble instantiating + ", str4), e4);
                    iVar = null;
                }
                if (iVar == null) {
                    n.e().d(str3, s.c.a("Could not create Input Merger ", this.f2499k.f3343d), new Throwable[0]);
                    g();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f2499k.f3344e);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f2533a;
                z0.j d5 = z0.j.d(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    d5.f(1);
                } else {
                    d5.g(1, str);
                }
                workDatabase_Impl.b();
                Cursor g5 = workDatabase_Impl.g(d5);
                try {
                    ArrayList arrayList2 = new ArrayList(g5.getCount());
                    while (g5.moveToNext()) {
                        arrayList2.add(androidx.work.g.a(g5.getBlob(0)));
                    }
                    g5.close();
                    d5.h();
                    arrayList.addAll(arrayList2);
                    a5 = iVar.a(arrayList);
                } catch (Throwable th) {
                    g5.close();
                    d5.h();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            ArrayList arrayList3 = this.f2509u;
            t tVar2 = this.f2498j;
            int i6 = this.f2499k.f3349k;
            ExecutorService executorService = bVar.f615a;
            androidx.work.u uVar = bVar.f617c;
            u1.p pVar2 = new u1.p(workDatabase, tVar);
            o oVar = new o(workDatabase, this.f2504p, tVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f604a = fromString;
            workerParameters.f605b = a5;
            workerParameters.f606c = new HashSet(arrayList3);
            workerParameters.f607d = tVar2;
            workerParameters.f608e = i6;
            workerParameters.f609f = executorService;
            workerParameters.f610g = tVar;
            workerParameters.h = uVar;
            workerParameters.f611i = pVar2;
            workerParameters.f612j = oVar;
            if (this.f2500l == null) {
                this.f2500l = uVar.a(this.f2496g, this.f2499k.f3342c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f2500l;
            if (listenableWorker == null) {
                n.e().d(str3, s.c.a("Could not create Worker ", this.f2499k.f3342c), new Throwable[0]);
                g();
                return;
            }
            if (listenableWorker.isUsed()) {
                n.e().d(str3, s.c.b("Received an already-used Worker ", this.f2499k.f3342c, "; WorkerFactory should return new instances"), new Throwable[0]);
                g();
                return;
            }
            boolean z5 = false;
            this.f2500l.setUsed();
            workDatabase.c();
            try {
                int i7 = 2;
                if (jVar.e(str) == 1) {
                    jVar.o(2, str);
                    jVar.i(str);
                    z5 = true;
                }
                workDatabase.h();
                if (!z5) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                v1.j jVar2 = new v1.j();
                u1.m mVar = new u1.m(this.f2496g, this.f2499k, this.f2500l, oVar, this.f2501m);
                ((q) tVar.f285j).execute(mVar);
                v1.j jVar3 = mVar.f3517g;
                jVar3.addListener(new c0.n(this, jVar3, jVar2, i7), (q) tVar.f285j);
                jVar2.addListener(new c0.n(this, jVar2, this.f2510v, 3), (u1.i) tVar.h);
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
            workDatabase.f();
        }
    }
}
