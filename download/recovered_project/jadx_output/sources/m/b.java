package m;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: g, reason: collision with root package name */
    public c f2542g;
    public c h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2543i;

    public b(c cVar, c cVar2, int i5) {
        this.f2543i = i5;
        this.f2542g = cVar2;
        this.h = cVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f2542g == cVar && cVar == this.h) {
            this.h = null;
            this.f2542g = null;
        }
        c cVar4 = this.f2542g;
        if (cVar4 == cVar) {
            switch (this.f2543i) {
                case 0:
                    cVar2 = cVar4.f2546j;
                    break;
                default:
                    cVar2 = cVar4.f2545i;
                    break;
            }
            this.f2542g = cVar2;
        }
        c cVar5 = this.h;
        if (cVar5 == cVar) {
            c cVar6 = this.f2542g;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.h = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f2543i) {
            case 0:
                return cVar.f2545i;
            default:
                return cVar.f2546j;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.h;
        c cVar2 = this.f2542g;
        this.h = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
