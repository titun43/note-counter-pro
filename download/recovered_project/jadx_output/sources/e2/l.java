package e2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f1297a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1298b;

    /* renamed from: c, reason: collision with root package name */
    public final j f1299c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1300d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1301e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1302f;

    public l(long j2, long j5, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f1309g;
        this.f1297a = j2;
        this.f1298b = j5;
        this.f1299c = jVar;
        this.f1300d = num;
        this.f1301e = str;
        this.f1302f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f1309g;
        ArrayList arrayList = lVar.f1302f;
        String str = lVar.f1301e;
        Integer num = lVar.f1300d;
        j jVar = lVar.f1299c;
        if (this.f1297a != lVar.f1297a || this.f1298b != lVar.f1298b || !this.f1299c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f1300d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f1301e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f1302f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j2 = this.f1297a;
        long j5 = this.f1298b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f1299c.hashCode()) * 1000003;
        Integer num = this.f1300d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f1301e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f1302f.hashCode()) * 1000003) ^ w.f1309g.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f1297a + ", requestUptimeMs=" + this.f1298b + ", clientInfo=" + this.f1299c + ", logSource=" + this.f1300d + ", logSourceName=" + this.f1301e + ", logEvents=" + this.f1302f + ", qosTier=" + w.f1309g + "}";
    }
}
