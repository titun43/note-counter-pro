package c0;

import android.util.Base64;
import androidx.emoji2.text.u;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f743a;

    /* renamed from: b, reason: collision with root package name */
    public final String f744b;

    /* renamed from: c, reason: collision with root package name */
    public final String f745c;

    /* renamed from: d, reason: collision with root package name */
    public final List f746d;

    /* renamed from: e, reason: collision with root package name */
    public final String f747e;

    /* renamed from: f, reason: collision with root package name */
    public final String f748f;

    /* renamed from: g, reason: collision with root package name */
    public final String f749g;

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f743a = str;
        str2.getClass();
        this.f744b = str2;
        this.f745c = str3;
        list.getClass();
        this.f746d = list;
        this.f747e = str4;
        this.f748f = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.f749g = u.n(sb, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f743a + ", mProviderPackage: " + this.f744b + ", mQuery: " + this.f745c + ", mSystemFont: " + this.f747e + ", mVariationSettings: " + this.f748f + ", mCertificates:");
        int i5 = 0;
        while (true) {
            List list = this.f746d;
            if (i5 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i5);
            for (int i6 = 0; i6 < list2.size(); i6++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i6), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i5++;
        }
    }
}
