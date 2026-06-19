package e2;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1277a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1278b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1279c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1280d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1281e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1282f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1283g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1284i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1285j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1286k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1287l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1277a = num;
        this.f1278b = str;
        this.f1279c = str2;
        this.f1280d = str3;
        this.f1281e = str4;
        this.f1282f = str5;
        this.f1283g = str6;
        this.h = str7;
        this.f1284i = str8;
        this.f1285j = str9;
        this.f1286k = str10;
        this.f1287l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f1277a;
            if (num != null ? num.equals(((h) aVar).f1277a) : ((h) aVar).f1277a == null) {
                String str = this.f1278b;
                if (str != null ? str.equals(((h) aVar).f1278b) : ((h) aVar).f1278b == null) {
                    String str2 = this.f1279c;
                    if (str2 != null ? str2.equals(((h) aVar).f1279c) : ((h) aVar).f1279c == null) {
                        String str3 = this.f1280d;
                        if (str3 != null ? str3.equals(((h) aVar).f1280d) : ((h) aVar).f1280d == null) {
                            String str4 = this.f1281e;
                            if (str4 != null ? str4.equals(((h) aVar).f1281e) : ((h) aVar).f1281e == null) {
                                String str5 = this.f1282f;
                                if (str5 != null ? str5.equals(((h) aVar).f1282f) : ((h) aVar).f1282f == null) {
                                    String str6 = this.f1283g;
                                    if (str6 != null ? str6.equals(((h) aVar).f1283g) : ((h) aVar).f1283g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((h) aVar).h) : ((h) aVar).h == null) {
                                            String str8 = this.f1284i;
                                            if (str8 != null ? str8.equals(((h) aVar).f1284i) : ((h) aVar).f1284i == null) {
                                                String str9 = this.f1285j;
                                                if (str9 != null ? str9.equals(((h) aVar).f1285j) : ((h) aVar).f1285j == null) {
                                                    String str10 = this.f1286k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f1286k) : ((h) aVar).f1286k == null) {
                                                        String str11 = this.f1287l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f1287l) : ((h) aVar).f1287l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f1277a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f1278b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1279c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1280d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1281e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f1282f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f1283g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f1284i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f1285j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f1286k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f1287l;
        return (str11 != null ? str11.hashCode() : 0) ^ hashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f1277a);
        sb.append(", model=");
        sb.append(this.f1278b);
        sb.append(", hardware=");
        sb.append(this.f1279c);
        sb.append(", device=");
        sb.append(this.f1280d);
        sb.append(", product=");
        sb.append(this.f1281e);
        sb.append(", osBuild=");
        sb.append(this.f1282f);
        sb.append(", manufacturer=");
        sb.append(this.f1283g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.f1284i);
        sb.append(", country=");
        sb.append(this.f1285j);
        sb.append(", mccMnc=");
        sb.append(this.f1286k);
        sb.append(", applicationBuild=");
        return s.c.d(sb, this.f1287l, "}");
    }
}
