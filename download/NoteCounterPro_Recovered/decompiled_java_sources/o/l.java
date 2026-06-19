package o;

import androidx.emoji2.text.u;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: g, reason: collision with root package name */
    public int[] f2732g;
    public Object[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f2733i;

    public l(int i5) {
        this.f2732g = i5 == 0 ? p.a.f2967a : new int[i5];
        this.h = i5 == 0 ? p.a.f2968b : new Object[i5 << 1];
    }

    public final int a(Object obj) {
        int i5 = this.f2733i * 2;
        Object[] objArr = this.h;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i5) {
        int i6 = this.f2733i;
        int[] iArr = this.f2732g;
        if (iArr.length < i5) {
            int[] copyOf = Arrays.copyOf(iArr, i5);
            g4.i.d(copyOf, "copyOf(this, newSize)");
            this.f2732g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.h, i5 * 2);
            g4.i.d(copyOf2, "copyOf(this, newSize)");
            this.h = copyOf2;
        }
        if (this.f2733i != i6) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i5, Object obj) {
        int i6 = this.f2733i;
        if (i6 == 0) {
            return -1;
        }
        int a5 = p.a.a(this.f2732g, i6, i5);
        if (a5 < 0 || g4.i.a(obj, this.h[a5 << 1])) {
            return a5;
        }
        int i7 = a5 + 1;
        while (i7 < i6 && this.f2732g[i7] == i5) {
            if (g4.i.a(obj, this.h[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = a5 - 1; i8 >= 0 && this.f2732g[i8] == i5; i8--) {
            if (g4.i.a(obj, this.h[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    public final void clear() {
        if (this.f2733i > 0) {
            this.f2732g = p.a.f2967a;
            this.h = p.a.f2968b;
            this.f2733i = 0;
        }
        if (this.f2733i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i5 = this.f2733i;
        if (i5 == 0) {
            return -1;
        }
        int a5 = p.a.a(this.f2732g, i5, 0);
        if (a5 < 0 || this.h[a5 << 1] == null) {
            return a5;
        }
        int i6 = a5 + 1;
        while (i6 < i5 && this.f2732g[i6] == 0) {
            if (this.h[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = a5 - 1; i7 >= 0 && this.f2732g[i7] == 0; i7--) {
            if (this.h[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof l) {
                int i5 = this.f2733i;
                if (i5 != ((l) obj).f2733i) {
                    return false;
                }
                l lVar = (l) obj;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object f5 = f(i6);
                    Object i7 = i(i6);
                    Object obj2 = lVar.get(f5);
                    if (i7 == null) {
                        if (obj2 != null || !lVar.containsKey(f5)) {
                            return false;
                        }
                    } else if (!i7.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f2733i != ((Map) obj).size()) {
                return false;
            }
            int i8 = this.f2733i;
            for (int i9 = 0; i9 < i8; i9++) {
                Object f6 = f(i9);
                Object i10 = i(i9);
                Object obj3 = ((Map) obj).get(f6);
                if (i10 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f6)) {
                        return false;
                    }
                } else if (!i10.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i5) {
        if (i5 < 0 || i5 >= this.f2733i) {
            throw new IllegalArgumentException(u.h(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.h[i5 << 1];
    }

    public final Object g(int i5) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f2733i)) {
            throw new IllegalArgumentException(u.h(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.h;
        int i7 = i5 << 1;
        Object obj = objArr[i7 + 1];
        if (i6 <= 1) {
            clear();
            return obj;
        }
        int i8 = i6 - 1;
        int[] iArr = this.f2732g;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            if (i5 < i8) {
                int i9 = i5 + 1;
                u3.f.B(i5, i9, i6, iArr, iArr);
                Object[] objArr2 = this.h;
                u3.f.C(objArr2, i7, objArr2, i9 << 1, i6 << 1);
            }
            Object[] objArr3 = this.h;
            int i10 = i8 << 1;
            objArr3[i10] = null;
            objArr3[i10 + 1] = null;
        } else {
            int i11 = i6 > 8 ? i6 + (i6 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i11);
            g4.i.d(copyOf, "copyOf(this, newSize)");
            this.f2732g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.h, i11 << 1);
            g4.i.d(copyOf2, "copyOf(this, newSize)");
            this.h = copyOf2;
            if (i6 != this.f2733i) {
                throw new ConcurrentModificationException();
            }
            if (i5 > 0) {
                u3.f.B(0, 0, i5, iArr, this.f2732g);
                u3.f.C(objArr, 0, this.h, 0, i7);
            }
            if (i5 < i8) {
                int i12 = i5 + 1;
                u3.f.B(i5, i12, i6, iArr, this.f2732g);
                u3.f.C(objArr, i7, this.h, i12 << 1, i6 << 1);
            }
        }
        if (i6 != this.f2733i) {
            throw new ConcurrentModificationException();
        }
        this.f2733i = i8;
        return obj;
    }

    public Object get(Object obj) {
        int d5 = d(obj);
        if (d5 >= 0) {
            return this.h[(d5 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d5 = d(obj);
        return d5 >= 0 ? this.h[(d5 << 1) + 1] : obj2;
    }

    public final Object h(int i5, Object obj) {
        if (i5 < 0 || i5 >= this.f2733i) {
            throw new IllegalArgumentException(u.h(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.h;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.f2732g;
        Object[] objArr = this.h;
        int i5 = this.f2733i;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            i8 += (obj != null ? obj.hashCode() : 0) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return i8;
    }

    public final Object i(int i5) {
        if (i5 < 0 || i5 >= this.f2733i) {
            throw new IllegalArgumentException(u.h(i5, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.h[(i5 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f2733i <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i5 = this.f2733i;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c5 = obj != null ? c(hashCode, obj) : e();
        if (c5 >= 0) {
            int i6 = (c5 << 1) + 1;
            Object[] objArr = this.h;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~c5;
        int[] iArr = this.f2732g;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i8);
            g4.i.d(copyOf, "copyOf(this, newSize)");
            this.f2732g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.h, i8 << 1);
            g4.i.d(copyOf2, "copyOf(this, newSize)");
            this.h = copyOf2;
            if (i5 != this.f2733i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i5) {
            int[] iArr2 = this.f2732g;
            int i9 = i7 + 1;
            u3.f.B(i9, i7, i5, iArr2, iArr2);
            Object[] objArr2 = this.h;
            u3.f.C(objArr2, i9 << 1, objArr2, i7 << 1, this.f2733i << 1);
        }
        int i10 = this.f2733i;
        if (i5 == i10) {
            int[] iArr3 = this.f2732g;
            if (i7 < iArr3.length) {
                iArr3[i7] = hashCode;
                Object[] objArr3 = this.h;
                int i11 = i7 << 1;
                objArr3[i11] = obj;
                objArr3[i11 + 1] = obj2;
                this.f2733i = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d5 = d(obj);
        if (d5 >= 0) {
            return g(d5);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d5 = d(obj);
        if (d5 >= 0) {
            return h(d5, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f2733i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2733i * 28);
        sb.append('{');
        int i5 = this.f2733i;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object f5 = f(i6);
            if (f5 != sb) {
                sb.append(f5);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i7 = i(i6);
            if (i7 != sb) {
                sb.append(i7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        g4.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d5 = d(obj);
        if (d5 < 0 || !g4.i.a(obj2, i(d5))) {
            return false;
        }
        g(d5);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d5 = d(obj);
        if (d5 < 0 || !g4.i.a(obj2, i(d5))) {
            return false;
        }
        h(d5, obj3);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(l lVar) {
        this(0);
        if (lVar != null) {
            int i5 = lVar.f2733i;
            b(this.f2733i + i5);
            if (this.f2733i != 0) {
                for (int i6 = 0; i6 < i5; i6++) {
                    put(lVar.f(i6), lVar.i(i6));
                }
            } else if (i5 > 0) {
                u3.f.B(0, 0, i5, lVar.f2732g, this.f2732g);
                u3.f.C(lVar.h, 0, this.h, 0, i5 << 1);
                this.f2733i = i5;
            }
        }
    }
}
