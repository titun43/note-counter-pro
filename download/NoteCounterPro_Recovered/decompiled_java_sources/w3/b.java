package w3;

import com.google.android.gms.ads.RequestConfiguration;
import f4.p;
import java.io.Serializable;
import o4.o;

/* loaded from: classes.dex */
public final class b implements h, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final h f3629g;
    public final f h;

    public b(h hVar, f fVar) {
        g4.i.e(hVar, "left");
        g4.i.e(fVar, "element");
        this.f3629g = hVar;
        this.h = fVar;
    }

    @Override // w3.h
    public final f d(g gVar) {
        g4.i.e(gVar, "key");
        b bVar = this;
        while (true) {
            f d5 = bVar.h.d(gVar);
            if (d5 != null) {
                return d5;
            }
            h hVar = bVar.f3629g;
            if (!(hVar instanceof b)) {
                return hVar.d(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i5 = 2;
            b bVar2 = bVar;
            int i6 = 2;
            while (true) {
                h hVar = bVar2.f3629g;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i6++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f3629g;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i5++;
            }
            if (i6 == i5) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.h;
                    if (!g4.i.a(bVar.d(fVar.getKey()), fVar)) {
                        z4 = false;
                        break;
                    }
                    h hVar3 = bVar4.f3629g;
                    if (!(hVar3 instanceof b)) {
                        g4.i.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        z4 = g4.i.a(bVar.d(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (z4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + this.f3629g.hashCode();
    }

    @Override // w3.h
    public final h i(g gVar) {
        g4.i.e(gVar, "key");
        f fVar = this.h;
        f d5 = fVar.d(gVar);
        h hVar = this.f3629g;
        if (d5 != null) {
            return hVar;
        }
        h i5 = hVar.i(gVar);
        return i5 == hVar ? this : i5 == i.f3631g ? fVar : new b(i5, fVar);
    }

    @Override // w3.h
    public final Object j(Object obj, p pVar) {
        return pVar.invoke(this.f3629g.j(obj, pVar), this.h);
    }

    @Override // w3.h
    public final h l(h hVar) {
        g4.i.e(hVar, "context");
        return hVar == i.f3631g ? this : (h) hVar.j(this, new o(8));
    }

    public final String toString() {
        return "[" + ((String) j(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new o(7))) + ']';
    }
}
