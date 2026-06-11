package u1;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3497i = androidx.work.n.g("EnqueueRunnable");

    /* renamed from: g, reason: collision with root package name */
    public final l1.e f3498g;
    public final androidx.emoji2.text.p h = new androidx.emoji2.text.p(12);

    public d(l1.e eVar) {
        this.f3498g = eVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(l1.e eVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        List list;
        WorkDatabase workDatabase;
        boolean z7;
        Iterator it;
        Iterator it2;
        long j2;
        Iterator it3;
        l2.j jVar;
        HashSet S = l1.e.S(eVar);
        l1.k kVar = eVar.f2467i;
        List list2 = eVar.f2468j;
        boolean z8 = false;
        String[] strArr = (String[]) S.toArray(new String[0]);
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = kVar.f2489e;
        boolean z9 = strArr != null && strArr.length > 0;
        if (z9) {
            z4 = false;
            z5 = false;
            z6 = true;
            for (String str : strArr) {
                t1.i h = workDatabase2.n().h(str);
                if (h == null) {
                    androidx.work.n.e().d(f3497i, s.c.b("Prerequisite ", str, " doesn't exist; not enqueuing"), new Throwable[0]);
                    break;
                }
                int i5 = h.f3341b;
                z6 &= i5 == 3;
                if (i5 == 4) {
                    z5 = true;
                } else if (i5 == 6) {
                    z4 = true;
                }
            }
        } else {
            z4 = false;
            z5 = false;
            z6 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        if (isEmpty || z9) {
            list = list2;
            workDatabase = workDatabase2;
        } else {
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) workDatabase2.n().f2533a;
            z0.j d5 = z0.j.d(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
            d5.f(1);
            workDatabase_Impl.b();
            Cursor g5 = workDatabase_Impl.g(d5);
            try {
                int i6 = z2.b.i(g5, "id");
                int i7 = z2.b.i(g5, "state");
                list = list2;
                ArrayList arrayList = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    t1.h hVar = new t1.h();
                    WorkDatabase workDatabase3 = workDatabase2;
                    hVar.f3338a = g5.getString(i6);
                    hVar.f3339b = z2.b.p(g5.getInt(i7));
                    arrayList.add(hVar);
                    workDatabase2 = workDatabase3;
                }
                workDatabase = workDatabase2;
                g5.close();
                d5.h();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayList.get(i8);
                        i8++;
                        int i9 = ((t1.h) obj).f3339b;
                        if (i9 == 1 || i9 == 2) {
                            z8 = false;
                            break;
                        }
                    }
                    new b(kVar, 1).run();
                    l2.j n5 = workDatabase.n();
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        String str2 = ((t1.h) obj2).f3338a;
                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) n5.f2533a;
                        workDatabase_Impl2.b();
                        t1.e eVar2 = (t1.e) n5.f2535c;
                        e1.f a5 = eVar2.a();
                        if (str2 == null) {
                            jVar = n5;
                            a5.e(1);
                        } else {
                            jVar = n5;
                            a5.f(1, str2);
                        }
                        workDatabase_Impl2.c();
                        try {
                            a5.l();
                            workDatabase_Impl2.h();
                            workDatabase_Impl2.f();
                            eVar2.c(a5);
                            n5 = jVar;
                        } catch (Throwable th) {
                            workDatabase_Impl2.f();
                            eVar2.c(a5);
                            throw th;
                        }
                    }
                    z7 = true;
                    it = list.iterator();
                    boolean z10 = z7;
                    while (it.hasNext()) {
                        androidx.work.o oVar = (androidx.work.o) it.next();
                        t1.i iVar = oVar.f673b;
                        UUID uuid = oVar.f672a;
                        if (!z9 || z6) {
                            if (iVar.c()) {
                                iVar.f3352n = 0L;
                            } else {
                                iVar.f3352n = currentTimeMillis;
                            }
                        } else if (z5) {
                            iVar.f3341b = 4;
                        } else if (z4) {
                            iVar.f3341b = 6;
                        } else {
                            iVar.f3341b = 5;
                        }
                        try {
                            if (Build.VERSION.SDK_INT <= 25) {
                                androidx.work.c cVar = iVar.f3348j;
                                String str3 = iVar.f3342c;
                                it2 = it;
                                if (!str3.equals(ConstraintTrackingWorker.class.getName()) && (cVar.f626d || cVar.f627e)) {
                                    androidx.work.f fVar = new androidx.work.f();
                                    fVar.a(iVar.f3344e.f636a);
                                    j2 = currentTimeMillis;
                                    fVar.f633a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                                    iVar.f3342c = ConstraintTrackingWorker.class.getName();
                                    androidx.work.g gVar = new androidx.work.g(fVar.f633a);
                                    androidx.work.g.c(gVar);
                                    iVar.f3344e = gVar;
                                    if (iVar.f3341b == 1) {
                                        z10 = true;
                                    }
                                    l2.j n6 = workDatabase.n();
                                    WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) n6.f2533a;
                                    workDatabase_Impl3.b();
                                    workDatabase_Impl3.c();
                                    ((t1.b) n6.f2534b).e(iVar);
                                    workDatabase_Impl3.h();
                                    workDatabase_Impl3.f();
                                    if (z9) {
                                        for (String str4 : strArr) {
                                            t1.a aVar = new t1.a(uuid.toString(), str4);
                                            androidx.emoji2.text.p i11 = workDatabase.i();
                                            workDatabase_Impl3 = (WorkDatabase_Impl) i11.h;
                                            workDatabase_Impl3.b();
                                            workDatabase_Impl3.c();
                                            try {
                                                ((t1.b) i11.f274i).e(aVar);
                                                workDatabase_Impl3.h();
                                                workDatabase_Impl3.f();
                                            } finally {
                                            }
                                        }
                                    }
                                    it3 = oVar.f674c.iterator();
                                    while (it3.hasNext()) {
                                        String str5 = (String) it3.next();
                                        androidx.emoji2.text.p o2 = workDatabase.o();
                                        t1.j jVar2 = new t1.j(str5, uuid.toString());
                                        workDatabase_Impl3 = (WorkDatabase_Impl) o2.h;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((t1.b) o2.f274i).e(jVar2);
                                            workDatabase_Impl3.h();
                                            workDatabase_Impl3.f();
                                        } finally {
                                        }
                                    }
                                    if (isEmpty) {
                                        androidx.emoji2.text.p l5 = workDatabase.l();
                                        t1.f fVar2 = new t1.f(uuid.toString());
                                        workDatabase_Impl3 = (WorkDatabase_Impl) l5.h;
                                        workDatabase_Impl3.b();
                                        workDatabase_Impl3.c();
                                        try {
                                            ((t1.b) l5.f274i).e(fVar2);
                                            workDatabase_Impl3.h();
                                        } finally {
                                        }
                                    }
                                    it = it2;
                                    currentTimeMillis = j2;
                                }
                            } else {
                                it2 = it;
                            }
                            ((t1.b) n6.f2534b).e(iVar);
                            workDatabase_Impl3.h();
                            workDatabase_Impl3.f();
                            if (z9) {
                            }
                            it3 = oVar.f674c.iterator();
                            while (it3.hasNext()) {
                            }
                            if (isEmpty) {
                            }
                            it = it2;
                            currentTimeMillis = j2;
                        } finally {
                        }
                        j2 = currentTimeMillis;
                        if (iVar.f3341b == 1) {
                        }
                        l2.j n62 = workDatabase.n();
                        WorkDatabase_Impl workDatabase_Impl32 = (WorkDatabase_Impl) n62.f2533a;
                        workDatabase_Impl32.b();
                        workDatabase_Impl32.c();
                    }
                    z8 = z10;
                    eVar.f2471m = true;
                    return z8;
                }
            } catch (Throwable th2) {
                g5.close();
                d5.h();
                throw th2;
            }
        }
        z7 = false;
        it = list.iterator();
        boolean z102 = z7;
        while (it.hasNext()) {
        }
        z8 = z102;
        eVar.f2471m = true;
        return z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        androidx.emoji2.text.p pVar = this.h;
        l1.e eVar = this.f3498g;
        l1.k kVar = eVar.f2467i;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f2469k);
            HashSet S = l1.e.S(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(eVar.f2469k);
                    z4 = false;
                    break;
                } else if (S.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            WorkDatabase workDatabase = kVar.f2489e;
            workDatabase.c();
            try {
                boolean a5 = a(eVar);
                workDatabase.h();
                if (a5) {
                    g.a(kVar.f2487c, RescheduleReceiver.class, true);
                    l1.d.a(kVar.f2488d, kVar.f2489e, kVar.f2491g);
                }
                pVar.E(androidx.work.s.f676a);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th) {
            pVar.E(new androidx.work.p(th));
        }
    }
}
