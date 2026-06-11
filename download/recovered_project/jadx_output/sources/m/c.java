package m;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: g, reason: collision with root package name */
    public final Object f2544g;
    public final Object h;

    /* renamed from: i, reason: collision with root package name */
    public c f2545i;

    /* renamed from: j, reason: collision with root package name */
    public c f2546j;

    public c(Object obj, Object obj2) {
        this.f2544g = obj;
        this.h = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2544g.equals(cVar.f2544g) && this.h.equals(cVar.h);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2544g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2544g.hashCode() ^ this.h.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f2544g + "=" + this.h;
    }
}
