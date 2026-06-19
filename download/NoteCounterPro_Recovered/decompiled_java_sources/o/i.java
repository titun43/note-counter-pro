package o;

import androidx.emoji2.text.u;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f2727g;
    public /* synthetic */ long[] h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object[] f2728i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f2729j;

    public final void a(long j2, Object obj) {
        Object obj2 = j.f2730a;
        int b2 = p.a.b(this.h, this.f2729j, j2);
        if (b2 >= 0) {
            this.f2728i[b2] = obj;
            return;
        }
        int i5 = ~b2;
        int i6 = this.f2729j;
        if (i5 < i6) {
            Object[] objArr = this.f2728i;
            if (objArr[i5] == obj2) {
                this.h[i5] = j2;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f2727g) {
            long[] jArr = this.h;
            if (i6 >= jArr.length) {
                Object[] objArr2 = this.f2728i;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj3 = objArr2[i8];
                    if (obj3 != obj2) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr2[i7] = obj3;
                            objArr2[i8] = null;
                        }
                        i7++;
                    }
                }
                this.f2727g = false;
                this.f2729j = i7;
                i5 = ~p.a.b(this.h, i7, j2);
            }
        }
        int i9 = this.f2729j;
        if (i9 >= this.h.length) {
            int i10 = (i9 + 1) * 8;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 8;
            long[] copyOf = Arrays.copyOf(this.h, i13);
            g4.i.d(copyOf, "copyOf(this, newSize)");
            this.h = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f2728i, i13);
            g4.i.d(copyOf2, "copyOf(this, newSize)");
            this.f2728i = copyOf2;
        }
        int i14 = this.f2729j - i5;
        if (i14 != 0) {
            long[] jArr2 = this.h;
            int i15 = i5 + 1;
            g4.i.e(jArr2, "<this>");
            System.arraycopy(jArr2, i5, jArr2, i15, i14);
            Object[] objArr3 = this.f2728i;
            u3.f.C(objArr3, i15, objArr3, i5, this.f2729j);
        }
        this.h[i5] = j2;
        this.f2728i[i5] = obj;
        this.f2729j++;
    }

    public final Object clone() {
        Object clone = super.clone();
        g4.i.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        i iVar = (i) clone;
        iVar.h = (long[]) this.h.clone();
        iVar.f2728i = (Object[]) this.f2728i.clone();
        return iVar;
    }

    public final String toString() {
        int i5;
        int i6;
        Object obj = j.f2730a;
        if (this.f2727g) {
            int i7 = this.f2729j;
            long[] jArr = this.h;
            Object[] objArr = this.f2728i;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj2 = objArr[i9];
                if (obj2 != obj) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj2;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f2727g = false;
            this.f2729j = i8;
        }
        int i10 = this.f2729j;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i10 * 28);
        sb.append('{');
        int i11 = this.f2729j;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb.append(", ");
            }
            if (i12 < 0 || i12 >= (i5 = this.f2729j)) {
                throw new IllegalArgumentException(u.h(i12, "Expected index to be within 0..size()-1, but was ").toString());
            }
            if (this.f2727g) {
                long[] jArr2 = this.h;
                Object[] objArr2 = this.f2728i;
                int i13 = 0;
                for (int i14 = 0; i14 < i5; i14++) {
                    Object obj3 = objArr2[i14];
                    if (obj3 != obj) {
                        if (i14 != i13) {
                            jArr2[i13] = jArr2[i14];
                            objArr2[i13] = obj3;
                            objArr2[i14] = null;
                        }
                        i13++;
                    }
                }
                this.f2727g = false;
                this.f2729j = i13;
            }
            sb.append(this.h[i12]);
            sb.append('=');
            if (i12 < 0 || i12 >= (i6 = this.f2729j)) {
                throw new IllegalArgumentException(u.h(i12, "Expected index to be within 0..size()-1, but was ").toString());
            }
            if (this.f2727g) {
                long[] jArr3 = this.h;
                Object[] objArr3 = this.f2728i;
                int i15 = 0;
                for (int i16 = 0; i16 < i6; i16++) {
                    Object obj4 = objArr3[i16];
                    if (obj4 != obj) {
                        if (i16 != i15) {
                            jArr3[i15] = jArr3[i16];
                            objArr3[i15] = obj4;
                            objArr3[i16] = null;
                        }
                        i15++;
                    }
                }
                this.f2727g = false;
                this.f2729j = i15;
            }
            Object obj5 = this.f2728i[i12];
            if (obj5 != sb) {
                sb.append(obj5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        g4.i.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
