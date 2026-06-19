package q1;

import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import t1.i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3079a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f3080b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.d f3081c;

    /* renamed from: d, reason: collision with root package name */
    public b f3082d;

    public c(r1.d dVar) {
        this.f3081c = dVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.f3079a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f3079a.add(iVar.f3340a);
            }
        }
        if (this.f3079a.isEmpty()) {
            this.f3081c.b(this);
        } else {
            r1.d dVar = this.f3081c;
            synchronized (dVar.f3153c) {
                try {
                    if (dVar.f3154d.add(this)) {
                        if (dVar.f3154d.size() == 1) {
                            dVar.f3155e = dVar.a();
                            n.e().b(r1.d.f3150f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f3155e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f3155e;
                        this.f3080b = obj;
                        d(this.f3082d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f3082d, this.f3080b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f3079a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f3079a;
            p1.c cVar = (p1.c) bVar;
            synchronized (cVar.f2980c) {
                try {
                    p1.b bVar2 = cVar.f2978a;
                    if (bVar2 != null) {
                        bVar2.e(arrayList);
                    }
                } finally {
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f3079a;
        p1.c cVar2 = (p1.c) bVar;
        synchronized (cVar2.f2980c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    String str = (String) obj2;
                    if (cVar2.a(str)) {
                        n.e().b(p1.c.f2977d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                p1.b bVar3 = cVar2.f2978a;
                if (bVar3 != null) {
                    bVar3.f(arrayList3);
                }
            } finally {
            }
        }
    }
}
