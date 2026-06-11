package u1;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final androidx.emoji2.text.p f3496g = new androidx.emoji2.text.p(12);

    public static void a(l1.k kVar, String str) {
        WorkDatabase workDatabase = kVar.f2489e;
        l2.j n5 = workDatabase.n();
        androidx.emoji2.text.p i5 = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e4 = n5.e(str2);
            if (e4 != 3 && e4 != 4) {
                n5.o(6, str2);
            }
            linkedList.addAll(i5.y(str2));
        }
        l1.b bVar = kVar.h;
        synchronized (bVar.f2464q) {
            try {
                androidx.work.n.e().b(l1.b.f2454r, "Processor cancelling " + str, new Throwable[0]);
                bVar.f2462o.add(str);
                l1.l lVar = (l1.l) bVar.f2459l.remove(str);
                boolean z4 = lVar != null;
                if (lVar == null) {
                    lVar = (l1.l) bVar.f2460m.remove(str);
                }
                l1.b.b(str, lVar);
                if (z4) {
                    bVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = kVar.f2491g.iterator();
        while (it.hasNext()) {
            ((l1.c) it.next()).d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        androidx.emoji2.text.p pVar = this.f3496g;
        try {
            b();
            pVar.E(androidx.work.s.f676a);
        } catch (Throwable th) {
            pVar.E(new androidx.work.p(th));
        }
    }
}
