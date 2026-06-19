package t3;

import g4.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements b, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public f4.a f3397g;
    public volatile Object h = g.f3399a;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3398i = this;

    public f(f4.a aVar) {
        this.f3397g = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.h;
        g gVar = g.f3399a;
        if (obj2 != gVar) {
            return obj2;
        }
        synchronized (this.f3398i) {
            obj = this.h;
            if (obj == gVar) {
                f4.a aVar = this.f3397g;
                i.b(aVar);
                obj = aVar.invoke();
                this.h = obj;
                this.f3397g = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.h != g.f3399a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
