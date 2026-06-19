package b1;

import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f692a;

    /* renamed from: b, reason: collision with root package name */
    public final String f693b;

    /* renamed from: c, reason: collision with root package name */
    public final int f694c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f695d;

    /* renamed from: e, reason: collision with root package name */
    public final int f696e;

    /* renamed from: f, reason: collision with root package name */
    public final String f697f;

    /* renamed from: g, reason: collision with root package name */
    public final int f698g;

    public a(int i5, String str, String str2, String str3, boolean z4, int i6) {
        this.f692a = str;
        this.f693b = str2;
        this.f695d = z4;
        this.f696e = i5;
        int i7 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i7 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i7 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i7 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f694c = i7;
        this.f697f = str3;
        this.f698g = i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            int i5 = aVar.f698g;
            String str = aVar.f697f;
            if (this.f696e != aVar.f696e || !this.f692a.equals(aVar.f692a) || this.f695d != aVar.f695d) {
                return false;
            }
            String str2 = this.f697f;
            int i6 = this.f698g;
            if (i6 == 1 && i5 == 2 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if (i6 == 2 && i5 == 1 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i6 != 0 && i6 == i5) {
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f694c != aVar.f694c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f692a.hashCode() * 31) + this.f694c) * 31) + (this.f695d ? 1231 : 1237)) * 31) + this.f696e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f692a);
        sb.append("', type='");
        sb.append(this.f693b);
        sb.append("', affinity='");
        sb.append(this.f694c);
        sb.append("', notNull=");
        sb.append(this.f695d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f696e);
        sb.append(", defaultValue='");
        return s.c.d(sb, this.f697f, "'}");
    }
}
