package n4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h4.a {

    /* renamed from: g, reason: collision with root package name */
    public final String f2704g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2705i;

    /* renamed from: j, reason: collision with root package name */
    public int f2706j;

    /* renamed from: k, reason: collision with root package name */
    public int f2707k;

    public b(String str) {
        this.f2704g = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5;
        int i6;
        int i7 = this.h;
        if (i7 != 0) {
            return i7 == 1;
        }
        if (this.f2707k < 0) {
            this.h = 2;
            return false;
        }
        String str = this.f2704g;
        int length = str.length();
        int length2 = str.length();
        for (int i8 = this.f2705i; i8 < length2; i8++) {
            char charAt = str.charAt(i8);
            if (charAt == '\n' || charAt == '\r') {
                i5 = (charAt == '\r' && (i6 = i8 + 1) < str.length() && str.charAt(i6) == '\n') ? 2 : 1;
                length = i8;
                this.h = 1;
                this.f2707k = i5;
                this.f2706j = length;
                return true;
            }
        }
        i5 = -1;
        this.h = 1;
        this.f2707k = i5;
        this.f2706j = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.h = 0;
        int i5 = this.f2706j;
        int i6 = this.f2705i;
        this.f2705i = this.f2707k + i5;
        return this.f2704g.subSequence(i6, i5).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
