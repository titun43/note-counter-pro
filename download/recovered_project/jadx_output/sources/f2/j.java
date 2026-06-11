package f2;

import android.util.Base64;
import androidx.emoji2.text.t;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1471a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1472b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.c f1473c;

    public j(String str, byte[] bArr, c2.c cVar) {
        this.f1471a = str;
        this.f1472b = bArr;
        this.f1473c = cVar;
    }

    public static t a() {
        t tVar = new t(6);
        tVar.f285j = c2.c.f788g;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f1471a.equals(jVar.f1471a) && Arrays.equals(this.f1472b, jVar.f1472b) && this.f1473c.equals(jVar.f1473c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1471a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1472b)) * 1000003) ^ this.f1473c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f1472b;
        String encodeToString = bArr == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f1471a);
        sb.append(", ");
        sb.append(this.f1473c);
        sb.append(", ");
        return s.c.d(sb, encodeToString, ")");
    }
}
