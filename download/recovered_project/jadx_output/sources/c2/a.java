package c2;

import com.google.android.gms.internal.play_billing.zzlk;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f786a;

    public a(zzlk zzlkVar) {
        if (zzlkVar == null) {
            throw new NullPointerException("Null payload");
        }
        this.f786a = zzlkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && this.f786a.equals(((a) obj).f786a)) {
            Object obj2 = c.f788g;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c.f788g.hashCode() ^ (((1000003 * 1000003) ^ this.f786a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f786a + ", priority=" + c.f788g + "}";
    }
}
