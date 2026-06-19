package y;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3728e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3729a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3730b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3731c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3732d;

    public c(int i5, int i6, int i7, int i8) {
        this.f3729a = i5;
        this.f3730b = i6;
        this.f3731c = i7;
        this.f3732d = i8;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f3729a, cVar2.f3729a), Math.max(cVar.f3730b, cVar2.f3730b), Math.max(cVar.f3731c, cVar2.f3731c), Math.max(cVar.f3732d, cVar2.f3732d));
    }

    public static c b(int i5, int i6, int i7, int i8) {
        return (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) ? f3728e : new c(i5, i6, i7, i8);
    }

    public static c c(Insets insets) {
        int i5;
        int i6;
        int i7;
        int i8;
        i5 = insets.left;
        i6 = insets.top;
        i7 = insets.right;
        i8 = insets.bottom;
        return b(i5, i6, i7, i8);
    }

    public final Insets d() {
        return b.a(this.f3729a, this.f3730b, this.f3731c, this.f3732d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3732d == cVar.f3732d && this.f3729a == cVar.f3729a && this.f3731c == cVar.f3731c && this.f3730b == cVar.f3730b;
    }

    public final int hashCode() {
        return (((((this.f3729a * 31) + this.f3730b) * 31) + this.f3731c) * 31) + this.f3732d;
    }

    public final String toString() {
        return "Insets{left=" + this.f3729a + ", top=" + this.f3730b + ", right=" + this.f3731c + ", bottom=" + this.f3732d + '}';
    }
}
