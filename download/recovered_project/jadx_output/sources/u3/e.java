package u3;

import androidx.emoji2.text.u;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e extends AbstractList implements List, h4.a {

    /* renamed from: j, reason: collision with root package name */
    public static final Object[] f3543j = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    public int f3544g;
    public Object[] h = f3543j;

    /* renamed from: i, reason: collision with root package name */
    public int f3545i;

    public final void a(int i5, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.h.length;
        while (i5 < length && it.hasNext()) {
            this.h[i5] = it.next();
            i5++;
        }
        int i6 = this.f3544g;
        for (int i7 = 0; i7 < i6 && it.hasNext(); i7++) {
            this.h[i7] = it.next();
        }
        this.f3545i = collection.size() + this.f3545i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        int i7 = this.f3545i;
        if (i5 < 0 || i5 > i7) {
            throw new IndexOutOfBoundsException(u.g(i5, i7, "index: ", ", size: "));
        }
        if (i5 == i7) {
            addLast(obj);
            return;
        }
        if (i5 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.f3545i + 1);
        int f5 = f(this.f3544g + i5);
        int i8 = this.f3545i;
        if (i5 < ((i8 + 1) >> 1)) {
            if (f5 == 0) {
                Object[] objArr = this.h;
                g4.i.e(objArr, "<this>");
                f5 = objArr.length;
            }
            int i9 = f5 - 1;
            int i10 = this.f3544g;
            if (i10 == 0) {
                Object[] objArr2 = this.h;
                g4.i.e(objArr2, "<this>");
                i6 = objArr2.length - 1;
            } else {
                i6 = i10 - 1;
            }
            int i11 = this.f3544g;
            if (i9 >= i11) {
                Object[] objArr3 = this.h;
                objArr3[i6] = objArr3[i11];
                f.C(objArr3, i11, objArr3, i11 + 1, i9 + 1);
            } else {
                Object[] objArr4 = this.h;
                f.C(objArr4, i11 - 1, objArr4, i11, objArr4.length);
                Object[] objArr5 = this.h;
                objArr5[objArr5.length - 1] = objArr5[0];
                f.C(objArr5, 0, objArr5, 1, i9 + 1);
            }
            this.h[i9] = obj;
            this.f3544g = i6;
        } else {
            int f6 = f(this.f3544g + i8);
            if (f5 < f6) {
                Object[] objArr6 = this.h;
                f.C(objArr6, f5 + 1, objArr6, f5, f6);
            } else {
                Object[] objArr7 = this.h;
                f.C(objArr7, 1, objArr7, 0, f6);
                Object[] objArr8 = this.h;
                objArr8[0] = objArr8[objArr8.length - 1];
                f.C(objArr8, f5 + 1, objArr8, f5, objArr8.length - 1);
            }
            this.h[f5] = obj;
        }
        this.f3545i++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        g4.i.e(collection, "elements");
        int i6 = this.f3545i;
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(u.g(i5, i6, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i5 == this.f3545i) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.f3545i);
        int f5 = f(this.f3544g + this.f3545i);
        int f6 = f(this.f3544g + i5);
        int size = collection.size();
        if (i5 >= ((this.f3545i + 1) >> 1)) {
            int i7 = f6 + size;
            if (f6 < f5) {
                int i8 = size + f5;
                Object[] objArr = this.h;
                if (i8 <= objArr.length) {
                    f.C(objArr, i7, objArr, f6, f5);
                } else if (i7 >= objArr.length) {
                    f.C(objArr, i7 - objArr.length, objArr, f6, f5);
                } else {
                    int length = f5 - (i8 - objArr.length);
                    f.C(objArr, 0, objArr, length, f5);
                    Object[] objArr2 = this.h;
                    f.C(objArr2, i7, objArr2, f6, length);
                }
            } else {
                Object[] objArr3 = this.h;
                f.C(objArr3, size, objArr3, 0, f5);
                Object[] objArr4 = this.h;
                if (i7 >= objArr4.length) {
                    f.C(objArr4, i7 - objArr4.length, objArr4, f6, objArr4.length);
                } else {
                    f.C(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.h;
                    f.C(objArr5, i7, objArr5, f6, objArr5.length - size);
                }
            }
            a(f6, collection);
            return true;
        }
        int i9 = this.f3544g;
        int i10 = i9 - size;
        if (f6 < i9) {
            Object[] objArr6 = this.h;
            f.C(objArr6, i10, objArr6, i9, objArr6.length);
            if (size >= f6) {
                Object[] objArr7 = this.h;
                f.C(objArr7, objArr7.length - size, objArr7, 0, f6);
            } else {
                Object[] objArr8 = this.h;
                f.C(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.h;
                f.C(objArr9, 0, objArr9, size, f6);
            }
        } else if (i10 >= 0) {
            Object[] objArr10 = this.h;
            f.C(objArr10, i10, objArr10, i9, f6);
        } else {
            Object[] objArr11 = this.h;
            i10 += objArr11.length;
            int i11 = f6 - i9;
            int length2 = objArr11.length - i10;
            if (length2 >= i11) {
                f.C(objArr11, i10, objArr11, i9, f6);
            } else {
                f.C(objArr11, i10, objArr11, i9, i9 + length2);
                Object[] objArr12 = this.h;
                f.C(objArr12, 0, objArr12, this.f3544g + length2, f6);
            }
        }
        this.f3544g = i10;
        a(d(f6 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f3545i + 1);
        int i5 = this.f3544g;
        if (i5 == 0) {
            Object[] objArr = this.h;
            g4.i.e(objArr, "<this>");
            i5 = objArr.length;
        }
        int i6 = i5 - 1;
        this.f3544g = i6;
        this.h[i6] = obj;
        this.f3545i++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f3545i + 1);
        this.h[f(this.f3544g + this.f3545i)] = obj;
        this.f3545i++;
    }

    public final void b(int i5) {
        if (i5 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.h;
        if (i5 <= objArr.length) {
            return;
        }
        if (objArr == f3543j) {
            if (i5 < 10) {
                i5 = 10;
            }
            this.h = new Object[i5];
            return;
        }
        int length = objArr.length;
        int i6 = length + (length >> 1);
        if (i6 - i5 < 0) {
            i6 = i5;
        }
        if (i6 - 2147483639 > 0) {
            i6 = i5 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
        }
        Object[] objArr2 = new Object[i6];
        f.C(objArr, 0, objArr2, this.f3544g, objArr.length);
        Object[] objArr3 = this.h;
        int length2 = objArr3.length;
        int i7 = this.f3544g;
        f.C(objArr3, length2 - i7, objArr2, 0, i7);
        this.f3544g = 0;
        this.h = objArr2;
    }

    public final int c(int i5) {
        g4.i.e(this.h, "<this>");
        if (i5 == r0.length - 1) {
            return 0;
        }
        return i5 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f3544g, f(this.f3544g + this.f3545i));
        }
        this.f3544g = 0;
        this.f3545i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i5) {
        return i5 < 0 ? i5 + this.h.length : i5;
    }

    public final void e(int i5, int i6) {
        if (i5 < i6) {
            Object[] objArr = this.h;
            g4.i.e(objArr, "<this>");
            Arrays.fill(objArr, i5, i6, (Object) null);
        } else {
            Object[] objArr2 = this.h;
            Arrays.fill(objArr2, i5, objArr2.length, (Object) null);
            Object[] objArr3 = this.h;
            g4.i.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i6, (Object) null);
        }
    }

    public final int f(int i5) {
        Object[] objArr = this.h;
        return i5 >= objArr.length ? i5 - objArr.length : i5;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        int i6 = this.f3545i;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(u.g(i5, i6, "index: ", ", size: "));
        }
        return this.h[f(this.f3544g + i5)];
    }

    public final Object h(int i5) {
        int i6 = this.f3545i;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(u.g(i5, i6, "index: ", ", size: "));
        }
        if (i5 == size() - 1) {
            return removeLast();
        }
        if (i5 == 0) {
            return removeFirst();
        }
        g();
        int f5 = f(this.f3544g + i5);
        Object[] objArr = this.h;
        Object obj = objArr[f5];
        if (i5 < (this.f3545i >> 1)) {
            int i7 = this.f3544g;
            if (f5 >= i7) {
                f.C(objArr, i7 + 1, objArr, i7, f5);
            } else {
                f.C(objArr, 1, objArr, 0, f5);
                Object[] objArr2 = this.h;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i8 = this.f3544g;
                f.C(objArr2, i8 + 1, objArr2, i8, objArr2.length - 1);
            }
            Object[] objArr3 = this.h;
            int i9 = this.f3544g;
            objArr3[i9] = null;
            this.f3544g = c(i9);
        } else {
            int f6 = f((size() - 1) + this.f3544g);
            if (f5 <= f6) {
                Object[] objArr4 = this.h;
                f.C(objArr4, f5, objArr4, f5 + 1, f6 + 1);
            } else {
                Object[] objArr5 = this.h;
                f.C(objArr5, f5, objArr5, f5 + 1, objArr5.length);
                Object[] objArr6 = this.h;
                objArr6[objArr6.length - 1] = objArr6[0];
                f.C(objArr6, 0, objArr6, 1, f6 + 1);
            }
            this.h[f6] = null;
        }
        this.f3545i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i5;
        int f5 = f(this.f3544g + this.f3545i);
        int i6 = this.f3544g;
        if (i6 < f5) {
            while (i6 < f5) {
                if (g4.i.a(obj, this.h[i6])) {
                    i5 = this.f3544g;
                } else {
                    i6++;
                }
            }
            return -1;
        }
        if (i6 < f5) {
            return -1;
        }
        int length = this.h.length;
        while (true) {
            if (i6 >= length) {
                for (int i7 = 0; i7 < f5; i7++) {
                    if (g4.i.a(obj, this.h[i7])) {
                        i6 = i7 + this.h.length;
                        i5 = this.f3544g;
                    }
                }
                return -1;
            }
            if (g4.i.a(obj, this.h[i6])) {
                i5 = this.f3544g;
                break;
            }
            i6++;
        }
        return i6 - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3545i == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i5;
        int f5 = f(this.f3544g + this.f3545i);
        int i6 = this.f3544g;
        if (i6 < f5) {
            length = f5 - 1;
            if (i6 <= length) {
                while (!g4.i.a(obj, this.h[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i5 = this.f3544g;
                return length - i5;
            }
            return -1;
        }
        if (i6 > f5) {
            int i7 = f5 - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.h;
                    g4.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i8 = this.f3544g;
                    if (i8 <= length) {
                        while (!g4.i.a(obj, this.h[length])) {
                            if (length != i8) {
                                length--;
                            }
                        }
                        i5 = this.f3544g;
                    }
                } else {
                    if (g4.i.a(obj, this.h[i7])) {
                        length = i7 + this.h.length;
                        i5 = this.f3544g;
                        break;
                    }
                    i7--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i5) {
        return h(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int f5;
        g4.i.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.h.length != 0) {
            int f6 = f(this.f3544g + this.f3545i);
            int i5 = this.f3544g;
            if (i5 < f6) {
                f5 = i5;
                while (i5 < f6) {
                    Object obj = this.h[i5];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.h[f5] = obj;
                        f5++;
                    }
                    i5++;
                }
                Object[] objArr = this.h;
                g4.i.e(objArr, "<this>");
                Arrays.fill(objArr, f5, f6, (Object) null);
            } else {
                int length = this.h.length;
                boolean z5 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.h;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.h[i6] = obj2;
                        i6++;
                    }
                    i5++;
                }
                f5 = f(i6);
                for (int i7 = 0; i7 < f6; i7++) {
                    Object[] objArr3 = this.h;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.h[f5] = obj3;
                        f5 = c(f5);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                g();
                this.f3545i = d(f5 - this.f3544g);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.h;
        int i5 = this.f3544g;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f3544g = c(i5);
        this.f3545i--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f5 = f((size() - 1) + this.f3544g);
        Object[] objArr = this.h;
        Object obj = objArr[f5];
        objArr[f5] = null;
        this.f3545i--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i6) {
        a.a.f(i5, i6, this.f3545i);
        int i7 = i6 - i5;
        if (i7 == 0) {
            return;
        }
        if (i7 == this.f3545i) {
            clear();
            return;
        }
        if (i7 == 1) {
            h(i5);
            return;
        }
        g();
        if (i5 < this.f3545i - i6) {
            int f5 = f(this.f3544g + (i5 - 1));
            int f6 = f(this.f3544g + (i6 - 1));
            while (i5 > 0) {
                int i8 = f5 + 1;
                int min = Math.min(i5, Math.min(i8, f6 + 1));
                Object[] objArr = this.h;
                int i9 = f6 - min;
                int i10 = f5 - min;
                f.C(objArr, i9 + 1, objArr, i10 + 1, i8);
                f5 = d(i10);
                f6 = d(i9);
                i5 -= min;
            }
            int f7 = f(this.f3544g + i7);
            e(this.f3544g, f7);
            this.f3544g = f7;
        } else {
            int f8 = f(this.f3544g + i6);
            int f9 = f(this.f3544g + i5);
            int i11 = this.f3545i;
            while (true) {
                i11 -= i6;
                if (i11 <= 0) {
                    break;
                }
                Object[] objArr2 = this.h;
                i6 = Math.min(i11, Math.min(objArr2.length - f8, objArr2.length - f9));
                Object[] objArr3 = this.h;
                int i12 = f8 + i6;
                f.C(objArr3, f9, objArr3, f8, i12);
                f8 = f(i12);
                f9 = f(f9 + i6);
            }
            int f10 = f(this.f3544g + this.f3545i);
            e(d(f10 - i7), f10);
        }
        this.f3545i -= i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int f5;
        g4.i.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.h.length != 0) {
            int f6 = f(this.f3544g + this.f3545i);
            int i5 = this.f3544g;
            if (i5 < f6) {
                f5 = i5;
                while (i5 < f6) {
                    Object obj = this.h[i5];
                    if (collection.contains(obj)) {
                        this.h[f5] = obj;
                        f5++;
                    } else {
                        z4 = true;
                    }
                    i5++;
                }
                Object[] objArr = this.h;
                g4.i.e(objArr, "<this>");
                Arrays.fill(objArr, f5, f6, (Object) null);
            } else {
                int length = this.h.length;
                boolean z5 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.h;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj2)) {
                        this.h[i6] = obj2;
                        i6++;
                    } else {
                        z5 = true;
                    }
                    i5++;
                }
                f5 = f(i6);
                for (int i7 = 0; i7 < f6; i7++) {
                    Object[] objArr3 = this.h;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (collection.contains(obj3)) {
                        this.h[f5] = obj3;
                        f5 = c(f5);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                g();
                this.f3545i = d(f5 - this.f3544g);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        int i6 = this.f3545i;
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException(u.g(i5, i6, "index: ", ", size: "));
        }
        int f5 = f(this.f3544g + i5);
        Object[] objArr = this.h;
        Object obj2 = objArr[f5];
        objArr[f5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3545i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f3545i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        h(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        g4.i.e(objArr, "array");
        int length = objArr.length;
        int i5 = this.f3545i;
        if (length < i5) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i5);
            g4.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int f5 = f(this.f3544g + this.f3545i);
        int i6 = this.f3544g;
        if (i6 < f5) {
            f.D(this.h, i6, objArr, f5, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.h;
            f.C(objArr2, 0, objArr, this.f3544g, objArr2.length);
            Object[] objArr3 = this.h;
            f.C(objArr3, objArr3.length - this.f3544g, objArr, 0, f5);
        }
        int i7 = this.f3545i;
        if (i7 < objArr.length) {
            objArr[i7] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        g4.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.f3545i);
        a(f(this.f3544g + this.f3545i), collection);
        return true;
    }
}
