package g2;

import android.content.Context;
import t2.i;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1673c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1674d;

    public b(Context context, i iVar, i iVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f1671a = context;
        if (iVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f1672b = iVar;
        if (iVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f1673c = iVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f1674d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f1671a.equals(bVar.f1671a) && this.f1672b.equals(bVar.f1672b) && this.f1673c.equals(bVar.f1673c) && this.f1674d.equals(bVar.f1674d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f1671a.hashCode() ^ 1000003) * 1000003) ^ this.f1672b.hashCode()) * 1000003) ^ this.f1673c.hashCode()) * 1000003) ^ this.f1674d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f1671a);
        sb.append(", wallClock=");
        sb.append(this.f1672b);
        sb.append(", monotonicClock=");
        sb.append(this.f1673c);
        sb.append(", backendName=");
        return s.c.d(sb, this.f1674d, "}");
    }
}
