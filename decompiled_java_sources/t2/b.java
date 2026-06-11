package t2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.emoji2.text.u;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends u2.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f3362g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final PendingIntent f3363i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3364j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f3365k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f3361l = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new k0(13);

    public b(int i5, int i6, PendingIntent pendingIntent, String str, Integer num) {
        this.f3362g = i5;
        this.h = i6;
        this.f3363i = pendingIntent;
        this.f3364j = str;
        this.f3365k = num;
    }

    public static String a(int i5) {
        if (i5 == 99) {
            return "UNFINISHED";
        }
        if (i5 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i5) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i5) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case zzbgj.zzt.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return u.m(new StringBuilder(String.valueOf(i5).length() + 20), "UNKNOWN_ERROR_CODE(", i5, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.h == bVar.h && b0.j(this.f3363i, bVar.f3363i) && b0.j(this.f3364j, bVar.f3364j) && b0.j(this.f3365k, bVar.f3365k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), this.f3363i, this.f3364j, this.f3365k});
    }

    public final String toString() {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this);
        pVar.h(a(this.h), "statusCode");
        pVar.h(this.f3363i, "resolution");
        pVar.h(this.f3364j, "message");
        pVar.h(this.f3365k, "clientMethodKey");
        return pVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f3362g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.H(parcel, 3, this.f3363i, i5);
        z2.b.I(parcel, 4, this.f3364j);
        Integer num = this.f3365k;
        if (num != null) {
            z2.b.N(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        z2.b.P(parcel, O);
    }

    public b(int i5, PendingIntent pendingIntent, String str) {
        this(1, i5, pendingIntent, str, null);
    }
}
