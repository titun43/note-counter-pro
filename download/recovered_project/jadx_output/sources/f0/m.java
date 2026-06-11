package f0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1391a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1392b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1393c = new HashMap();

    public m(Runnable runnable) {
        this.f1391a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f1392b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.m0) ((o) it.next())).f404a.p()) {
                return true;
            }
        }
        return false;
    }

    public final void b(o oVar) {
        this.f1392b.remove(oVar);
        l lVar = (l) this.f1393c.remove(oVar);
        if (lVar != null) {
            lVar.f1388a.b(lVar.f1389b);
            lVar.f1389b = null;
        }
        this.f1391a.run();
    }
}
