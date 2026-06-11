package l1;

import androidx.work.impl.WorkDatabase;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2465a = n.g("Schedulers");

    public static void a(androidx.work.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        l2.j n5 = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList b2 = n5.b(bVar.h);
            ArrayList a5 = n5.a();
            if (b2.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = b2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = b2.get(i5);
                    i5++;
                    n5.k(((t1.i) obj).f3340a, currentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (b2.size() > 0) {
                t1.i[] iVarArr = (t1.i[]) b2.toArray(new t1.i[b2.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.b()) {
                        cVar.a(iVarArr);
                    }
                }
            }
            if (a5.size() > 0) {
                t1.i[] iVarArr2 = (t1.i[]) a5.toArray(new t1.i[a5.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar2 = (c) it2.next();
                    if (!cVar2.b()) {
                        cVar2.a(iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
