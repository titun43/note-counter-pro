package m;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: g, reason: collision with root package name */
    public c f2547g;
    public boolean h = true;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f2548i;

    public d(f fVar) {
        this.f2548i = fVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2 = this.f2547g;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f2546j;
            this.f2547g = cVar3;
            this.h = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.h) {
            return this.f2548i.f2549g != null;
        }
        c cVar = this.f2547g;
        return (cVar == null || cVar.f2545i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.h) {
            this.h = false;
            this.f2547g = this.f2548i.f2549g;
        } else {
            c cVar = this.f2547g;
            this.f2547g = cVar != null ? cVar.f2545i : null;
        }
        return this.f2547g;
    }
}
