package m1;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.emoji2.text.t;
import androidx.work.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k1.j;
import l1.c;
import l1.k;
import t1.i;
import u1.h;

/* loaded from: classes.dex */
public final class b implements c, p1.b, l1.a {

    /* renamed from: o, reason: collision with root package name */
    public static final String f2556o = n.g("GreedyScheduler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f2557g;
    public final k h;

    /* renamed from: i, reason: collision with root package name */
    public final p1.c f2558i;

    /* renamed from: k, reason: collision with root package name */
    public final a f2560k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2561l;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f2563n;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f2559j = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public final Object f2562m = new Object();

    public b(Context context, androidx.work.b bVar, t tVar, k kVar) {
        this.f2557g = context;
        this.h = kVar;
        this.f2558i = new p1.c(context, tVar, this);
        this.f2560k = new a(this, bVar.f619e);
    }

    @Override // l1.c
    public final void a(i... iVarArr) {
        if (this.f2563n == null) {
            this.f2563n = Boolean.valueOf(h.a(this.f2557g, this.h.f2488d));
        }
        if (!this.f2563n.booleanValue()) {
            n.e().f(f2556o, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f2561l) {
            this.h.h.a(this);
            this.f2561l = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long a5 = iVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (iVar.f3341b == 1) {
                if (currentTimeMillis < a5) {
                    a aVar = this.f2560k;
                    if (aVar != null) {
                        j jVar = aVar.f2554b;
                        HashMap hashMap = aVar.f2555c;
                        Runnable runnable = (Runnable) hashMap.remove(iVar.f3340a);
                        if (runnable != null) {
                            ((Handler) jVar.h).removeCallbacks(runnable);
                        }
                        c0.a aVar2 = new c0.a(aVar, iVar, 11, false);
                        hashMap.put(iVar.f3340a, aVar2);
                        ((Handler) jVar.h).postDelayed(aVar2, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    androidx.work.c cVar = iVar.f3348j;
                    if (cVar.f625c) {
                        n.e().b(f2556o, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (cVar.h.f632a.size() > 0) {
                        n.e().b(f2556o, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f3340a);
                    }
                } else {
                    n.e().b(f2556o, s.c.a("Starting work for ", iVar.f3340a), new Throwable[0]);
                    this.h.U(iVar.f3340a, null);
                }
            }
        }
        synchronized (this.f2562m) {
            try {
                if (!hashSet.isEmpty()) {
                    n.e().b(f2556o, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f2559j.addAll(hashSet);
                    this.f2558i.b(this.f2559j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l1.c
    public final boolean b() {
        return false;
    }

    @Override // l1.a
    public final void c(String str, boolean z4) {
        synchronized (this.f2562m) {
            try {
                Iterator it = this.f2559j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f3340a.equals(str)) {
                        n.e().b(f2556o, "Stopping tracking for " + str, new Throwable[0]);
                        this.f2559j.remove(iVar);
                        this.f2558i.b(this.f2559j);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l1.c
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.f2563n;
        k kVar = this.h;
        if (bool == null) {
            this.f2563n = Boolean.valueOf(h.a(this.f2557g, kVar.f2488d));
        }
        boolean booleanValue = this.f2563n.booleanValue();
        String str2 = f2556o;
        if (!booleanValue) {
            n.e().f(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f2561l) {
            kVar.h.a(this);
            this.f2561l = true;
        }
        n.e().b(str2, s.c.a("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f2560k;
        if (aVar != null && (runnable = (Runnable) aVar.f2555c.remove(str)) != null) {
            ((Handler) aVar.f2554b.h).removeCallbacks(runnable);
        }
        kVar.V(str);
    }

    @Override // p1.b
    public final void e(ArrayList arrayList) {
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            String str = (String) obj;
            n.e().b(f2556o, s.c.a("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.h.V(str);
        }
    }

    @Override // p1.b
    public final void f(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            String str = (String) obj;
            n.e().b(f2556o, s.c.a("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.h.U(str, null);
        }
    }
}
