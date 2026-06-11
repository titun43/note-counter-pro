package s4;

import java.util.ArrayList;
import o4.o;
import o4.w;
import t4.r;

/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: g, reason: collision with root package name */
    public final w3.h f3308g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final q4.a f3309i;

    /* renamed from: j, reason: collision with root package name */
    public final r4.b f3310j;

    public d(r4.b bVar, w3.h hVar, int i5, q4.a aVar) {
        this.f3308g = hVar;
        this.h = i5;
        this.f3309i = aVar;
        this.f3310j = bVar;
    }

    public final String a() {
        ArrayList arrayList = new ArrayList(4);
        w3.i iVar = w3.i.f3631g;
        w3.h hVar = this.f3308g;
        if (hVar != iVar) {
            arrayList.add("context=" + hVar);
        }
        int i5 = this.h;
        if (i5 != -3) {
            arrayList.add("capacity=" + i5);
        }
        q4.a aVar = q4.a.f3098g;
        q4.a aVar2 = this.f3309i;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + u3.g.X(arrayList, null, 62) + ']';
    }

    @Override // s4.f
    public final r4.b d(w3.h hVar, q4.a aVar) {
        w3.h hVar2 = this.f3308g;
        w3.h l5 = hVar.l(hVar2);
        q4.a aVar2 = q4.a.f3098g;
        q4.a aVar3 = this.f3309i;
        int i5 = this.h;
        if (aVar == aVar2) {
            r2 = i5 != -3 ? i5 : -3;
            aVar = aVar3;
        }
        return (g4.i.a(l5, hVar2) && r2 == i5 && aVar == aVar3) ? this : new d(this.f3310j, l5, r2, aVar);
    }

    @Override // r4.b
    public final Object j(r4.c cVar, w3.c cVar2) {
        int i5 = this.h;
        w3.c cVar3 = null;
        t3.h hVar = t3.h.f3400a;
        if (i5 == -3) {
            w3.h context = cVar2.getContext();
            Boolean bool = Boolean.FALSE;
            o oVar = new o(0);
            w3.h hVar2 = this.f3308g;
            w3.h l5 = !((Boolean) hVar2.j(bool, oVar)).booleanValue() ? context.l(hVar2) : w.d(context, hVar2, false);
            if (g4.i.a(l5, context)) {
                Object j2 = this.f3310j.j(cVar, (y3.c) cVar2);
                x3.a aVar = x3.a.f3712g;
                if (j2 != aVar) {
                    j2 = hVar;
                }
                if (j2 == aVar) {
                    return j2;
                }
            } else {
                w3.d dVar = w3.d.f3630g;
                if (g4.i.a(l5.d(dVar), context.d(dVar))) {
                    w3.h context2 = cVar2.getContext();
                    if (!(cVar instanceof m) && !(cVar instanceof h)) {
                        cVar = new r4.n(cVar, context2);
                    }
                    Object a5 = i.a(l5, cVar, t4.b.l(l5), new c(this, cVar3, 1), cVar2);
                    if (a5 == x3.a.f3712g) {
                        return a5;
                    }
                }
            }
        }
        p3.w wVar = new p3.w(cVar, this, cVar3, 1);
        y3.c cVar4 = (y3.c) cVar2;
        r rVar = new r(cVar4.getContext(), cVar4);
        Object y2 = a.a.y(rVar, rVar, wVar);
        x3.a aVar2 = x3.a.f3712g;
        if (y2 != aVar2) {
            y2 = hVar;
        }
        return y2 == aVar2 ? y2 : hVar;
    }

    public final String toString() {
        return this.f3310j + " -> " + a();
    }
}
