package m4;

import g4.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h4.a {

    /* renamed from: g, reason: collision with root package name */
    public Object f2603g;
    public int h = -2;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f2604i;

    public b(c cVar) {
        this.f2604i = cVar;
    }

    public final void a() {
        Object a5;
        int i5 = this.h;
        c cVar = this.f2604i;
        if (i5 == -2) {
            a5 = cVar.f2605a.invoke();
        } else {
            g gVar = cVar.f2606b;
            Object obj = this.f2603g;
            i.b(obj);
            a5 = gVar.a(obj);
        }
        this.f2603g = a5;
        this.h = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.h < 0) {
            a();
        }
        return this.h == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.h < 0) {
            a();
        }
        if (this.h == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2603g;
        i.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.h = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
