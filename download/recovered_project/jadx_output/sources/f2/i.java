package f2;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1465a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1466b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1467c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1468d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1469e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f1470f;

    public i(String str, Integer num, n nVar, long j2, long j5, HashMap hashMap) {
        this.f1465a = str;
        this.f1466b = num;
        this.f1467c = nVar;
        this.f1468d = j2;
        this.f1469e = j5;
        this.f1470f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f1470f.get(str);
        return str2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f1470f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f1465a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.f1459a = str;
        hVar.f1460b = this.f1466b;
        n nVar = this.f1467c;
        if (nVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f1461c = nVar;
        hVar.f1462d = Long.valueOf(this.f1468d);
        hVar.f1463e = Long.valueOf(this.f1469e);
        hVar.f1464f = new HashMap(this.f1470f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            Integer num2 = iVar.f1466b;
            if (this.f1465a.equals(iVar.f1465a) && ((num = this.f1466b) != null ? num.equals(num2) : num2 == null) && this.f1467c.equals(iVar.f1467c) && this.f1468d == iVar.f1468d && this.f1469e == iVar.f1469e && this.f1470f.equals(iVar.f1470f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1465a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1466b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f1467c.hashCode()) * 1000003;
        long j2 = this.f1468d;
        int i5 = (hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j5 = this.f1469e;
        return ((i5 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f1470f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1465a + ", code=" + this.f1466b + ", encodedPayload=" + this.f1467c + ", eventMillis=" + this.f1468d + ", uptimeMillis=" + this.f1469e + ", autoMetadata=" + this.f1470f + "}";
    }
}
