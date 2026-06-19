package f2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final c2.b f1480a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1481b;

    public n(c2.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f1480a = bVar;
        this.f1481b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f1480a.equals(nVar.f1480a)) {
            return Arrays.equals(this.f1481b, nVar.f1481b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1480a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1481b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f1480a + ", bytes=[...]}";
    }
}
