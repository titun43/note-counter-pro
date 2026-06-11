package u1;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final String f3509j = androidx.work.n.g("StopWorkRunnable");

    /* renamed from: g, reason: collision with root package name */
    public final l1.k f3510g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3511i;

    public j(l1.k kVar, String str, boolean z4) {
        this.f3510g = kVar;
        this.h = str;
        this.f3511i = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean j2;
        l1.k kVar = this.f3510g;
        WorkDatabase workDatabase = kVar.f2489e;
        l1.b bVar = kVar.h;
        l2.j n5 = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.h;
            synchronized (bVar.f2464q) {
                containsKey = bVar.f2459l.containsKey(str);
            }
            if (this.f3511i) {
                j2 = this.f3510g.h.i(this.h);
            } else {
                if (!containsKey && n5.e(this.h) == 2) {
                    n5.o(1, this.h);
                }
                j2 = this.f3510g.h.j(this.h);
            }
            androidx.work.n.e().b(f3509j, "StopWorkRunnable for " + this.h + "; Processor.stopWork = " + j2, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
