package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f583a;

    /* renamed from: b, reason: collision with root package name */
    public m.a f584b;

    /* renamed from: c, reason: collision with root package name */
    public n f585c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f586d;

    /* renamed from: e, reason: collision with root package name */
    public int f587e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f588f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f589g;
    public final ArrayList h;

    public v(t tVar) {
        new AtomicReference();
        this.f583a = true;
        this.f584b = new m.a();
        this.f585c = n.h;
        this.h = new ArrayList();
        this.f586d = new WeakReference(tVar);
    }

    @Override // androidx.lifecycle.o
    public final void a(s sVar) {
        r reflectiveGenericLifecycleObserver;
        Object obj;
        t tVar;
        d("addObserver");
        n nVar = this.f585c;
        n nVar2 = n.f558g;
        if (nVar != nVar2) {
            nVar2 = n.h;
        }
        u uVar = new u();
        HashMap hashMap = x.f593a;
        boolean z4 = sVar instanceof r;
        boolean z5 = sVar instanceof e;
        if (z4 && z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) sVar, (r) sVar);
        } else if (z5) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) sVar, null);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = (r) sVar;
        } else {
            Class<?> cls = sVar.getClass();
            if (x.c(cls) == 2) {
                Object obj2 = x.f594b.get(cls);
                g4.i.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                int size = list.size();
                h[] hVarArr = new h[size];
                if (size > 0) {
                    x.a((Constructor) list.get(0), sVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(hVarArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(sVar);
            }
        }
        uVar.f582b = reflectiveGenericLifecycleObserver;
        uVar.f581a = nVar2;
        m.a aVar = this.f584b;
        m.c a5 = aVar.a(sVar);
        if (a5 != null) {
            obj = a5.h;
        } else {
            HashMap hashMap2 = aVar.f2541k;
            m.c cVar = new m.c(sVar, uVar);
            aVar.f2551j++;
            m.c cVar2 = aVar.h;
            if (cVar2 == null) {
                aVar.f2549g = cVar;
                aVar.h = cVar;
            } else {
                cVar2.f2545i = cVar;
                cVar.f2546j = cVar2;
                aVar.h = cVar;
            }
            hashMap2.put(sVar, cVar);
            obj = null;
        }
        if (((u) obj) == null && (tVar = (t) this.f586d.get()) != null) {
            boolean z6 = this.f587e != 0 || this.f588f;
            n c5 = c(sVar);
            this.f587e++;
            while (uVar.f581a.compareTo(c5) < 0 && this.f584b.f2541k.containsKey(sVar)) {
                n nVar3 = uVar.f581a;
                ArrayList arrayList = this.h;
                arrayList.add(nVar3);
                k kVar = m.Companion;
                n nVar4 = uVar.f581a;
                kVar.getClass();
                g4.i.e(nVar4, "state");
                int ordinal = nVar4.ordinal();
                m mVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : m.ON_RESUME : m.ON_START : m.ON_CREATE;
                if (mVar == null) {
                    throw new IllegalStateException("no event up from " + uVar.f581a);
                }
                uVar.a(tVar, mVar);
                arrayList.remove(arrayList.size() - 1);
                c5 = c(sVar);
            }
            if (!z6) {
                h();
            }
            this.f587e--;
        }
    }

    @Override // androidx.lifecycle.o
    public final void b(s sVar) {
        g4.i.e(sVar, "observer");
        d("removeObserver");
        this.f584b.b(sVar);
    }

    public final n c(s sVar) {
        u uVar;
        HashMap hashMap = this.f584b.f2541k;
        m.c cVar = hashMap.containsKey(sVar) ? ((m.c) hashMap.get(sVar)).f2546j : null;
        n nVar = (cVar == null || (uVar = (u) cVar.h) == null) ? null : uVar.f581a;
        ArrayList arrayList = this.h;
        n nVar2 = arrayList.isEmpty() ? null : (n) arrayList.get(arrayList.size() - 1);
        n nVar3 = this.f585c;
        g4.i.e(nVar3, "state1");
        if (nVar == null || nVar.compareTo(nVar3) >= 0) {
            nVar = nVar3;
        }
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    public final void d(String str) {
        if (this.f583a) {
            l.b.S().f2449i.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(s.c.b("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(m mVar) {
        g4.i.e(mVar, "event");
        d("handleLifecycleEvent");
        f(mVar.a());
    }

    public final void f(n nVar) {
        n nVar2 = this.f585c;
        if (nVar2 == nVar) {
            return;
        }
        n nVar3 = n.h;
        n nVar4 = n.f558g;
        if (nVar2 == nVar3 && nVar == nVar4) {
            throw new IllegalStateException(("no event down from " + this.f585c + " in component " + this.f586d.get()).toString());
        }
        this.f585c = nVar;
        if (this.f588f || this.f587e != 0) {
            this.f589g = true;
            return;
        }
        this.f588f = true;
        h();
        this.f588f = false;
        if (this.f585c == nVar4) {
            this.f584b = new m.a();
        }
    }

    public final void g() {
        d("setCurrentState");
        f(n.f559i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f589g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        t tVar = (t) this.f586d.get();
        if (tVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            m.a aVar = this.f584b;
            if (aVar.f2551j != 0) {
                m.c cVar = aVar.f2549g;
                g4.i.b(cVar);
                n nVar = ((u) cVar.h).f581a;
                m.c cVar2 = this.f584b.h;
                g4.i.b(cVar2);
                n nVar2 = ((u) cVar2.h).f581a;
                if (nVar == nVar2 && this.f585c == nVar2) {
                    break;
                }
                this.f589g = false;
                n nVar3 = this.f585c;
                m.c cVar3 = this.f584b.f2549g;
                g4.i.b(cVar3);
                int compareTo = nVar3.compareTo(((u) cVar3.h).f581a);
                ArrayList arrayList = this.h;
                if (compareTo < 0) {
                    m.a aVar2 = this.f584b;
                    m.b bVar = new m.b(aVar2.h, aVar2.f2549g, 1);
                    aVar2.f2550i.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f589g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        g4.i.d(entry, "next()");
                        s sVar = (s) entry.getKey();
                        u uVar = (u) entry.getValue();
                        while (uVar.f581a.compareTo(this.f585c) > 0 && !this.f589g && this.f584b.f2541k.containsKey(sVar)) {
                            k kVar = m.Companion;
                            n nVar4 = uVar.f581a;
                            kVar.getClass();
                            g4.i.e(nVar4, "state");
                            int ordinal = nVar4.ordinal();
                            m mVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : m.ON_PAUSE : m.ON_STOP : m.ON_DESTROY;
                            if (mVar == null) {
                                throw new IllegalStateException("no event down from " + uVar.f581a);
                            }
                            arrayList.add(mVar.a());
                            uVar.a(tVar, mVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                m.c cVar4 = this.f584b.h;
                if (!this.f589g && cVar4 != null && this.f585c.compareTo(((u) cVar4.h).f581a) > 0) {
                    m.a aVar3 = this.f584b;
                    aVar3.getClass();
                    m.d dVar = new m.d(aVar3);
                    aVar3.f2550i.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f589g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        s sVar2 = (s) entry2.getKey();
                        u uVar2 = (u) entry2.getValue();
                        while (uVar2.f581a.compareTo(this.f585c) < 0 && !this.f589g && this.f584b.f2541k.containsKey(sVar2)) {
                            arrayList.add(uVar2.f581a);
                            k kVar2 = m.Companion;
                            n nVar5 = uVar2.f581a;
                            kVar2.getClass();
                            g4.i.e(nVar5, "state");
                            int ordinal2 = nVar5.ordinal();
                            m mVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : m.ON_RESUME : m.ON_START : m.ON_CREATE;
                            if (mVar2 == null) {
                                throw new IllegalStateException("no event up from " + uVar2.f581a);
                            }
                            uVar2.a(tVar, mVar2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
