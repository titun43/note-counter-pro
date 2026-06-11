package x0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3693a;

    public a(boolean z4) {
        this.f3693a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3693a == ((a) obj).f3693a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3693a) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f3693a;
    }
}
