package m2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2564f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f2565a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2566b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2567c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2568d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2569e;

    public a(long j2, int i5, int i6, long j5, int i7) {
        this.f2565a = j2;
        this.f2566b = i5;
        this.f2567c = i6;
        this.f2568d = j5;
        this.f2569e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2565a == aVar.f2565a && this.f2566b == aVar.f2566b && this.f2567c == aVar.f2567c && this.f2568d == aVar.f2568d && this.f2569e == aVar.f2569e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f2565a;
        int i5 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f2566b) * 1000003) ^ this.f2567c) * 1000003;
        long j5 = this.f2568d;
        return ((i5 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f2569e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2565a + ", loadBatchSize=" + this.f2566b + ", criticalSectionEnterTimeoutMs=" + this.f2567c + ", eventCleanUpAge=" + this.f2568d + ", maxBlobByteSizePerRow=" + this.f2569e + "}";
    }
}
