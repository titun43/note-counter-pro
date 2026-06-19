package k4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h4.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f2443g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2444i;

    /* renamed from: j, reason: collision with root package name */
    public int f2445j;

    public b(int i5, int i6, int i7) {
        this.f2443g = i7;
        this.h = i6;
        boolean z4 = false;
        if (i7 <= 0 ? i5 >= i6 : i5 <= i6) {
            z4 = true;
        }
        this.f2444i = z4;
        this.f2445j = z4 ? i5 : i6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2444i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f2445j;
        if (i5 != this.h) {
            this.f2445j = this.f2443g + i5;
        } else {
            if (!this.f2444i) {
                throw new NoSuchElementException();
            }
            this.f2444i = false;
        }
        return Integer.valueOf(i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
