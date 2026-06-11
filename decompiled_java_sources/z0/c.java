package z0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3896a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f3897b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3898c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3899d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3900e;

    public c(int i5) {
        long[] jArr = new long[i5];
        this.f3896a = jArr;
        boolean[] zArr = new boolean[i5];
        this.f3897b = zArr;
        this.f3898c = new int[i5];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final int[] a() {
        synchronized (this) {
            try {
                if (this.f3899d && !this.f3900e) {
                    int length = this.f3896a.length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 1;
                        if (i5 >= length) {
                            this.f3900e = true;
                            this.f3899d = false;
                            return this.f3898c;
                        }
                        boolean z4 = this.f3896a[i5] > 0;
                        boolean[] zArr = this.f3897b;
                        if (z4 != zArr[i5]) {
                            int[] iArr = this.f3898c;
                            if (!z4) {
                                i6 = 2;
                            }
                            iArr[i5] = i6;
                        } else {
                            this.f3898c[i5] = 0;
                        }
                        zArr[i5] = z4;
                        i5++;
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
