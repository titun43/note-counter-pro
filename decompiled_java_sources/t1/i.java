package t1;

import androidx.fragment.app.h1;
import androidx.work.n;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f3340a;

    /* renamed from: b, reason: collision with root package name */
    public int f3341b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f3342c;

    /* renamed from: d, reason: collision with root package name */
    public String f3343d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.work.g f3344e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.work.g f3345f;

    /* renamed from: g, reason: collision with root package name */
    public long f3346g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public long f3347i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.work.c f3348j;

    /* renamed from: k, reason: collision with root package name */
    public int f3349k;

    /* renamed from: l, reason: collision with root package name */
    public int f3350l;

    /* renamed from: m, reason: collision with root package name */
    public long f3351m;

    /* renamed from: n, reason: collision with root package name */
    public long f3352n;

    /* renamed from: o, reason: collision with root package name */
    public long f3353o;

    /* renamed from: p, reason: collision with root package name */
    public long f3354p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3355q;

    /* renamed from: r, reason: collision with root package name */
    public int f3356r;

    static {
        n.g("WorkSpec");
    }

    public i(String str, String str2) {
        androidx.work.g gVar = androidx.work.g.f635c;
        this.f3344e = gVar;
        this.f3345f = gVar;
        this.f3348j = androidx.work.c.f622i;
        this.f3350l = 1;
        this.f3351m = 30000L;
        this.f3354p = -1L;
        this.f3356r = 1;
        this.f3340a = str;
        this.f3342c = str2;
    }

    public final long a() {
        int i5;
        if (this.f3341b == 1 && (i5 = this.f3349k) > 0) {
            return Math.min(18000000L, this.f3350l == 2 ? this.f3351m * i5 : (long) Math.scalb(this.f3351m, i5 - 1)) + this.f3352n;
        }
        if (!c()) {
            long j2 = this.f3352n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            return j2 + this.f3346g;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = this.f3352n;
        if (j5 == 0) {
            j5 = this.f3346g + currentTimeMillis;
        }
        long j6 = this.f3347i;
        long j7 = this.h;
        if (j6 != j7) {
            return j5 + j7 + (j5 == 0 ? j6 * (-1) : 0L);
        }
        return j5 + (j5 != 0 ? j7 : 0L);
    }

    public final boolean b() {
        return !androidx.work.c.f622i.equals(this.f3348j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3346g != iVar.f3346g || this.h != iVar.h || this.f3347i != iVar.f3347i || this.f3349k != iVar.f3349k || this.f3351m != iVar.f3351m || this.f3352n != iVar.f3352n || this.f3353o != iVar.f3353o || this.f3354p != iVar.f3354p || this.f3355q != iVar.f3355q || !this.f3340a.equals(iVar.f3340a) || this.f3341b != iVar.f3341b || !this.f3342c.equals(iVar.f3342c)) {
            return false;
        }
        String str = this.f3343d;
        if (str != null) {
            if (!str.equals(iVar.f3343d)) {
                return false;
            }
        } else if (iVar.f3343d != null) {
            return false;
        }
        return this.f3344e.equals(iVar.f3344e) && this.f3345f.equals(iVar.f3345f) && this.f3348j.equals(iVar.f3348j) && this.f3350l == iVar.f3350l && this.f3356r == iVar.f3356r;
    }

    public final int hashCode() {
        int hashCode = (this.f3342c.hashCode() + ((h1.c(this.f3341b) + (this.f3340a.hashCode() * 31)) * 31)) * 31;
        String str = this.f3343d;
        int hashCode2 = (this.f3345f.hashCode() + ((this.f3344e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j2 = this.f3346g;
        int i5 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j5 = this.h;
        int i6 = (i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f3347i;
        int c5 = (h1.c(this.f3350l) + ((((this.f3348j.hashCode() + ((i6 + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31) + this.f3349k) * 31)) * 31;
        long j7 = this.f3351m;
        int i7 = (c5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f3352n;
        int i8 = (i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f3353o;
        int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f3354p;
        return h1.c(this.f3356r) + ((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f3355q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return s.c.d(new StringBuilder("{WorkSpec: "), this.f3340a, "}");
    }
}
