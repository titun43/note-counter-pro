package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f2717g;

    public e(f fVar) {
        this.f2717g = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f2717g.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2717g.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2717g.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2717g, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f2717g;
        int a5 = fVar.a(obj);
        if (a5 < 0) {
            return false;
        }
        fVar.g(a5);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f2717g;
        int i5 = fVar.f2733i;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i5) {
            if (collection.contains(fVar.i(i6))) {
                fVar.g(i6);
                i6--;
                i5--;
                z4 = true;
            }
            i6++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f2717g;
        int i5 = fVar.f2733i;
        int i6 = 0;
        boolean z4 = false;
        while (i6 < i5) {
            if (!collection.contains(fVar.i(i6))) {
                fVar.g(i6);
                i6--;
                i5--;
                z4 = true;
            }
            i6++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f2717g.f2733i;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f2717g;
        int i5 = fVar.f2733i;
        Object[] objArr = new Object[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = fVar.i(i6);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f2717g;
        int i5 = fVar.f2733i;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = fVar.i(i6);
        }
        if (objArr.length > i5) {
            objArr[i5] = null;
        }
        return objArr;
    }
}
