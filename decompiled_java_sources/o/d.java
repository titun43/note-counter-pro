package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: g, reason: collision with root package name */
    public int f2714g;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2715i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f2716j;

    public d(f fVar) {
        this.f2716j = fVar;
        this.f2714g = fVar.f2733i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f2715i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i5 = this.h;
        f fVar = this.f2716j;
        return g4.i.a(key, fVar.f(i5)) && g4.i.a(entry.getValue(), fVar.i(this.h));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f2715i) {
            return this.f2716j.f(this.h);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2715i) {
            return this.f2716j.i(this.h);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.f2714g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f2715i) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i5 = this.h;
        f fVar = this.f2716j;
        Object f5 = fVar.f(i5);
        Object i6 = fVar.i(this.h);
        return (f5 == null ? 0 : f5.hashCode()) ^ (i6 != null ? i6.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.h++;
        this.f2715i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2715i) {
            throw new IllegalStateException();
        }
        this.f2716j.g(this.h);
        this.h--;
        this.f2714g--;
        this.f2715i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f2715i) {
            return this.f2716j.h(this.h, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
