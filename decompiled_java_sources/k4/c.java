package k4;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    @Override // k4.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f2441g == cVar.f2441g && this.h == cVar.h;
    }

    @Override // k4.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2441g * 31) + this.h;
    }

    @Override // k4.a
    public final boolean isEmpty() {
        return this.f2441g > this.h;
    }

    @Override // k4.a
    public final String toString() {
        return this.f2441g + ".." + this.h;
    }
}
