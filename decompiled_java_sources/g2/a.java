package g2;

import androidx.fragment.app.h1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1669a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1670b;

    public a(int i5, long j2) {
        if (i5 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f1669a = i5;
        this.f1670b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i5 = aVar.f1669a;
        int i6 = this.f1669a;
        if (i6 != 0) {
            return (i6 == i5) && this.f1670b == aVar.f1670b;
        }
        throw null;
    }

    public final int hashCode() {
        int c5 = (h1.c(this.f1669a) ^ 1000003) * 1000003;
        long j2 = this.f1670b;
        return c5 ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i5 = this.f1669a;
        sb.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f1670b);
        sb.append("}");
        return sb.toString();
    }
}
