package p1;

import android.content.Context;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Collection;
import q1.d;
import q1.e;
import r1.f;
import r1.g;
import r1.h;

/* loaded from: classes.dex */
public final class c implements q1.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f2977d = n.g("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f2978a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.c[] f2979b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2980c;

    public c(Context context, w1.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2978a = bVar;
        this.f2979b = new q1.c[]{new q1.a((r1.a) h.n(applicationContext, aVar).f3161g, 0), new q1.a((r1.b) h.n(applicationContext, aVar).h, 1), new q1.a((g) h.n(applicationContext, aVar).f3163j, 4), new q1.a((f) h.n(applicationContext, aVar).f3162i, 2), new q1.a((f) h.n(applicationContext, aVar).f3162i, 3), new e((f) h.n(applicationContext, aVar).f3162i), new d((f) h.n(applicationContext, aVar).f3162i)};
        this.f2980c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f2980c) {
            try {
                for (q1.c cVar : this.f2979b) {
                    Object obj = cVar.f3080b;
                    if (obj != null && cVar.b(obj) && cVar.f3079a.contains(str)) {
                        n.e().b(f2977d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f2980c) {
            try {
                for (q1.c cVar : this.f2979b) {
                    if (cVar.f3082d != null) {
                        cVar.f3082d = null;
                        cVar.d(null, cVar.f3080b);
                    }
                }
                for (q1.c cVar2 : this.f2979b) {
                    cVar2.c(collection);
                }
                for (q1.c cVar3 : this.f2979b) {
                    if (cVar3.f3082d != this) {
                        cVar3.f3082d = this;
                        cVar3.d(this, cVar3.f3080b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f2980c) {
            try {
                for (q1.c cVar : this.f2979b) {
                    ArrayList arrayList = cVar.f3079a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f3081c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
