package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements Collection, Set, h4.a {

    /* renamed from: g, reason: collision with root package name */
    public int[] f2721g = p.a.f2967a;
    public Object[] h = p.a.f2968b;

    /* renamed from: i, reason: collision with root package name */
    public int f2722i;

    public g(int i5) {
        if (i5 > 0) {
            j.a(this, i5);
        }
    }

    public final Object a(int i5) {
        int i6 = this.f2722i;
        Object[] objArr = this.h;
        Object obj = objArr[i5];
        if (i6 <= 1) {
            clear();
            return obj;
        }
        int i7 = i6 - 1;
        int[] iArr = this.f2721g;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            if (i5 < i7) {
                int i8 = i5 + 1;
                u3.f.B(i5, i8, i6, iArr, iArr);
                Object[] objArr2 = this.h;
                u3.f.C(objArr2, i5, objArr2, i8, i6);
            }
            this.h[i7] = null;
        } else {
            int i9 = i6 > 8 ? i6 + (i6 >> 1) : 8;
            int[] iArr2 = new int[i9];
            this.f2721g = iArr2;
            this.h = new Object[i9];
            if (i5 > 0) {
                u3.f.B(0, 0, i5, iArr, iArr2);
                u3.f.D(objArr, 0, this.h, i5, 6);
            }
            if (i5 < i7) {
                int i10 = i5 + 1;
                u3.f.B(i5, i10, i6, iArr, this.f2721g);
                u3.f.C(objArr, i5, this.h, i10, i6);
            }
        }
        if (i6 != this.f2722i) {
            throw new ConcurrentModificationException();
        }
        this.f2722i = i7;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i5;
        int b2;
        int i6 = this.f2722i;
        if (obj == null) {
            b2 = j.b(this, null, 0);
            i5 = 0;
        } else {
            int hashCode = obj.hashCode();
            i5 = hashCode;
            b2 = j.b(this, obj, hashCode);
        }
        if (b2 >= 0) {
            return false;
        }
        int i7 = ~b2;
        int[] iArr = this.f2721g;
        if (i6 >= iArr.length) {
            int i8 = 8;
            if (i6 >= 8) {
                i8 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.h;
            int[] iArr2 = new int[i8];
            this.f2721g = iArr2;
            this.h = new Object[i8];
            if (i6 != this.f2722i) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                u3.f.B(0, 0, iArr.length, iArr, iArr2);
                u3.f.D(objArr, 0, this.h, objArr.length, 6);
            }
        }
        if (i7 < i6) {
            int[] iArr3 = this.f2721g;
            int i9 = i7 + 1;
            u3.f.B(i9, i7, i6, iArr3, iArr3);
            Object[] objArr2 = this.h;
            u3.f.C(objArr2, i9, objArr2, i7, i6);
        }
        int i10 = this.f2722i;
        if (i6 == i10) {
            int[] iArr4 = this.f2721g;
            if (i7 < iArr4.length) {
                iArr4[i7] = i5;
                this.h[i7] = obj;
                this.f2722i = i10 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        g4.i.e(collection, "elements");
        int size = collection.size() + this.f2722i;
        int i5 = this.f2722i;
        int[] iArr = this.f2721g;
        boolean z4 = false;
        if (iArr.length < size) {
            Object[] objArr = this.h;
            int[] iArr2 = new int[size];
            this.f2721g = iArr2;
            this.h = new Object[size];
            if (i5 > 0) {
                u3.f.B(0, 0, i5, iArr, iArr2);
                u3.f.D(objArr, 0, this.h, this.f2722i, 6);
            }
        }
        if (this.f2722i != i5) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f2722i != 0) {
            this.f2721g = p.a.f2967a;
            this.h = p.a.f2968b;
            this.f2722i = 0;
        }
        if (this.f2722i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? j.b(this, null, 0) : j.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        g4.i.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f2722i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i5 = this.f2722i;
            for (int i6 = 0; i6 < i5; i6++) {
                if (!((Set) obj).contains(this.h[i6])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f2721g;
        int i5 = this.f2722i;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2722i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b2 = obj == null ? j.b(this, null, 0) : j.b(this, obj, obj.hashCode());
        if (b2 < 0) {
            return false;
        }
        a(b2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        g4.i.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        g4.i.e(collection, "elements");
        boolean z4 = false;
        for (int i5 = this.f2722i - 1; -1 < i5; i5--) {
            if (!collection.contains(this.h[i5])) {
                a(i5);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f2722i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.h;
        int i5 = this.f2722i;
        g4.i.e(objArr, "<this>");
        int length = objArr.length;
        if (i5 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i5);
            g4.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i5 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2722i * 14);
        sb.append('{');
        int i5 = this.f2722i;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = this.h[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        g4.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        g4.i.e(objArr, "array");
        int i5 = this.f2722i;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        } else if (objArr.length > i5) {
            objArr[i5] = null;
        }
        u3.f.C(this.h, 0, objArr, 0, this.f2722i);
        return objArr;
    }
}
