package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h4.a {

    /* renamed from: g, reason: collision with root package name */
    public int f2709g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2710i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2711j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2712k;

    public b(int i5) {
        this.f2709g = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.f2709g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f5;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.h;
        switch (this.f2711j) {
            case 0:
                f5 = ((f) this.f2712k).f(i5);
                break;
            case 1:
                f5 = ((f) this.f2712k).i(i5);
                break;
            default:
                f5 = ((g) this.f2712k).h[i5];
                break;
        }
        this.h++;
        this.f2710i = true;
        return f5;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2710i) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i5 = this.h - 1;
        this.h = i5;
        switch (this.f2711j) {
            case 0:
                ((f) this.f2712k).g(i5);
                break;
            case 1:
                ((f) this.f2712k).g(i5);
                break;
            default:
                ((g) this.f2712k).a(i5);
                break;
        }
        this.f2709g--;
        this.f2710i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f2722i);
        this.f2711j = 2;
        this.f2712k = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i5) {
        this(fVar.f2733i);
        this.f2711j = i5;
        switch (i5) {
            case 1:
                this.f2712k = fVar;
                this(fVar.f2733i);
                break;
            default:
                this.f2712k = fVar;
                break;
        }
    }
}
