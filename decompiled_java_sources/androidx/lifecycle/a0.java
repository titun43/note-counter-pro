package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f516k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f517a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final m.f f518b = new m.f();

    /* renamed from: c, reason: collision with root package name */
    public int f519c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f520d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f521e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f522f;

    /* renamed from: g, reason: collision with root package name */
    public int f523g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f524i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.fragment.app.o f525j;

    public a0() {
        Object obj = f516k;
        this.f522f = obj;
        this.f525j = new androidx.fragment.app.o(this, 3);
        this.f521e = obj;
        this.f523g = -1;
    }

    public static void a(String str) {
        l.b.S().f2449i.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(s.c.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(z zVar) {
        if (zVar.h) {
            if (!zVar.d()) {
                zVar.b(false);
                return;
            }
            int i5 = zVar.f596i;
            int i6 = this.f523g;
            if (i5 >= i6) {
                return;
            }
            zVar.f596i = i6;
            k1.j jVar = zVar.f595g;
            Object obj = this.f521e;
            jVar.getClass();
            t tVar = (t) obj;
            androidx.fragment.app.s sVar = (androidx.fragment.app.s) jVar.h;
            if (tVar == null || !sVar.f426f0) {
                return;
            }
            sVar.getClass();
            throw new IllegalStateException("Fragment " + sVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public final void c(z zVar) {
        if (this.h) {
            this.f524i = true;
            return;
        }
        this.h = true;
        do {
            this.f524i = false;
            if (zVar != null) {
                b(zVar);
                zVar = null;
            } else {
                m.f fVar = this.f518b;
                fVar.getClass();
                m.d dVar = new m.d(fVar);
                fVar.f2550i.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((z) ((Map.Entry) dVar.next()).getValue());
                    if (this.f524i) {
                        break;
                    }
                }
            }
        } while (this.f524i);
        this.h = false;
    }

    public final void d(k1.j jVar) {
        Object obj;
        a("observeForever");
        y yVar = new y(this, jVar);
        m.f fVar = this.f518b;
        m.c a5 = fVar.a(jVar);
        if (a5 != null) {
            obj = a5.h;
        } else {
            m.c cVar = new m.c(jVar, yVar);
            fVar.f2551j++;
            m.c cVar2 = fVar.h;
            if (cVar2 == null) {
                fVar.f2549g = cVar;
                fVar.h = cVar;
            } else {
                cVar2.f2545i = cVar;
                cVar.f2546j = cVar2;
                fVar.h = cVar;
            }
            obj = null;
        }
        z zVar = (z) obj;
        if (zVar instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zVar != null) {
            return;
        }
        yVar.b(true);
    }

    public final void e(Object obj) {
        a("setValue");
        this.f523g++;
        this.f521e = obj;
        c(null);
    }
}
