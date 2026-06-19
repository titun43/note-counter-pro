package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int[] f2734g;
    public /* synthetic */ Object[] h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f2735i;

    public m() {
        int i5;
        int i6 = 4;
        while (true) {
            i5 = 40;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (40 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 4;
        this.f2734g = new int[i8];
        this.h = new Object[i8];
    }

    public final void a(int i5, Object obj) {
        int i6 = this.f2735i;
        if (i6 == 0 || i5 > this.f2734g[i6 - 1]) {
            if (i6 >= this.f2734g.length) {
                int i7 = (i6 + 1) * 4;
                int i8 = 4;
                while (true) {
                    if (i8 >= 32) {
                        break;
                    }
                    int i9 = (1 << i8) - 12;
                    if (i7 <= i9) {
                        i7 = i9;
                        break;
                    }
                    i8++;
                }
                int i10 = i7 / 4;
                int[] copyOf = Arrays.copyOf(this.f2734g, i10);
                g4.i.d(copyOf, "copyOf(this, newSize)");
                this.f2734g = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.h, i10);
                g4.i.d(copyOf2, "copyOf(this, newSize)");
                this.h = copyOf2;
            }
            this.f2734g[i6] = i5;
            this.h[i6] = obj;
            this.f2735i = i6 + 1;
            return;
        }
        int a5 = p.a.a(this.f2734g, this.f2735i, i5);
        if (a5 >= 0) {
            this.h[a5] = obj;
            return;
        }
        int i11 = ~a5;
        int i12 = this.f2735i;
        if (i11 < i12) {
            Object[] objArr = this.h;
            if (objArr[i11] == j.f2731b) {
                this.f2734g[i11] = i5;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f2734g.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] copyOf3 = Arrays.copyOf(this.f2734g, i16);
            g4.i.d(copyOf3, "copyOf(this, newSize)");
            this.f2734g = copyOf3;
            Object[] copyOf4 = Arrays.copyOf(this.h, i16);
            g4.i.d(copyOf4, "copyOf(this, newSize)");
            this.h = copyOf4;
        }
        int i17 = this.f2735i;
        if (i17 - i11 != 0) {
            int[] iArr = this.f2734g;
            int i18 = i11 + 1;
            u3.f.B(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.h;
            u3.f.C(objArr2, i18, objArr2, i11, this.f2735i);
        }
        this.f2734g[i11] = i5;
        this.h[i11] = obj;
        this.f2735i++;
    }

    public final Object clone() {
        Object clone = super.clone();
        g4.i.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        m mVar = (m) clone;
        mVar.f2734g = (int[]) this.f2734g.clone();
        mVar.h = (Object[]) this.h.clone();
        return mVar;
    }

    public final String toString() {
        int i5 = this.f2735i;
        if (i5 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i5 * 28);
        sb.append('{');
        int i6 = this.f2735i;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2734g[i7]);
            sb.append('=');
            Object obj = this.h[i7];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        g4.i.d(sb2, "buffer.toString()");
        return sb2;
    }
}
