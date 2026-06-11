package j;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.UUID;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1904g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1905i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1906j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1907k;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f1904g = i5;
        this.f1907k = obj;
        this.h = obj2;
        this.f1905i = obj3;
        this.f1906j = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t1.i h;
        switch (this.f1904g) {
            case 0:
                h hVar = (h) ((u1.f) this.f1907k).h;
                p pVar = (p) this.f1905i;
                g gVar = (g) this.h;
                if (gVar != null) {
                    hVar.F = true;
                    gVar.f1910b.c(false);
                    hVar.F = false;
                }
                if (pVar.isEnabled() && pVar.hasSubMenu()) {
                    ((n) this.f1906j).q(pVar, null, 4);
                    return;
                }
                return;
            default:
                v1.j jVar = (v1.j) this.f1906j;
                UUID uuid = (UUID) this.h;
                String uuid2 = uuid.toString();
                androidx.work.n e4 = androidx.work.n.e();
                String str = u1.p.f3529c;
                androidx.work.g gVar2 = (androidx.work.g) this.f1905i;
                e4.b(str, "Updating progress for " + uuid + " (" + gVar2 + ")", new Throwable[0]);
                u1.p pVar2 = (u1.p) this.f1907k;
                WorkDatabase workDatabase = pVar2.f3530a;
                WorkDatabase workDatabase2 = pVar2.f3530a;
                workDatabase.c();
                try {
                    h = workDatabase2.n().h(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (h.f3341b == 2) {
                    t1.g gVar3 = new t1.g(uuid2, gVar2);
                    r1.h m5 = workDatabase2.m();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m5.f3161g;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((t1.b) m5.h).e(gVar3);
                        workDatabase_Impl.h();
                        workDatabase_Impl.f();
                    } catch (Throwable th) {
                        workDatabase_Impl.f();
                        throw th;
                    }
                } else {
                    androidx.work.n.e().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.", new Throwable[0]);
                }
                jVar.h(null);
                workDatabase2.h();
                return;
        }
    }
}
