package r3;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final Charset f3176b;

    public d(Charset charset) {
        g4.i.e(charset, "charset");
        this.f3176b = charset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g4.i.a(this.f3176b, ((d) obj).f3176b);
    }

    public final int hashCode() {
        return this.f3176b.hashCode();
    }

    public final String toString() {
        return "WithCharset(charset=" + this.f3176b + ")";
    }
}
