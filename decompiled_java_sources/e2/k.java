package e2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f1290a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1291b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1292c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1293d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1294e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1295f;

    /* renamed from: g, reason: collision with root package name */
    public final v f1296g;

    public k(long j2, Integer num, long j5, byte[] bArr, String str, long j6, v vVar) {
        this.f1290a = j2;
        this.f1291b = num;
        this.f1292c = j5;
        this.f1293d = bArr;
        this.f1294e = str;
        this.f1295f = j6;
        this.f1296g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f1296g;
            String str2 = kVar.f1294e;
            Integer num2 = kVar.f1291b;
            if (this.f1290a == kVar.f1290a && ((num = this.f1291b) != null ? num.equals(num2) : num2 == null) && this.f1292c == kVar.f1292c) {
                if (Arrays.equals(this.f1293d, rVar instanceof k ? ((k) rVar).f1293d : kVar.f1293d) && ((str = this.f1294e) != null ? str.equals(str2) : str2 == null) && this.f1295f == kVar.f1295f && ((vVar = this.f1296g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f1290a;
        int i5 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f1291b;
        int hashCode = (i5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j5 = this.f1292c;
        int hashCode2 = (((hashCode ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1293d)) * 1000003;
        String str = this.f1294e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j6 = this.f1295f;
        int i6 = (hashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        v vVar = this.f1296g;
        return i6 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f1290a + ", eventCode=" + this.f1291b + ", eventUptimeMs=" + this.f1292c + ", sourceExtension=" + Arrays.toString(this.f1293d) + ", sourceExtensionJsonProto3=" + this.f1294e + ", timezoneOffsetSeconds=" + this.f1295f + ", networkConnectionInfo=" + this.f1296g + "}";
    }
}
