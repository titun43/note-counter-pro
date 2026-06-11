package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzee;
import com.google.android.gms.internal.ads.zziaw;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.play_billing.zzgr;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ String A(int i5) {
        switch (i5) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i5) {
        switch (i5) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static final boolean a(int i5) {
        return i5 == 3 || i5 == 4 || i5 == 6;
    }

    public static int b(int i5, int i6) {
        return String.valueOf(i5).length() + i6;
    }

    public static int c(int i5, int i6, int i7) {
        return zziaw.zzA(i5) + i6 + i7;
    }

    public static int d(int i5, int i6, int i7, int i8) {
        return ((i5 + i6) - i7) + i8;
    }

    public static int e(String str, int i5, int i6) {
        return str.length() + i5 + i6;
    }

    public static a3.a f(Parcel parcel) {
        a3.a a5 = a3.b.a(parcel.readStrongBinder());
        parcel.recycle();
        return a5;
    }

    public static String g(int i5, int i6, String str, String str2) {
        return str + i5 + str2 + i6;
    }

    public static String h(int i5, String str) {
        return str + i5;
    }

    public static String i(int i5, String str, String str2) {
        return str + i5 + str2;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, String str, int i5) {
        sb.append(str);
        sb.append(i5);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, int i5, String str2) {
        sb.append(str);
        sb.append(i5);
        sb.append(str2);
        return sb.toString();
    }

    public static String n(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static void o(int i5, HashMap hashMap, String str, int i6, String str2) {
        hashMap.put(str, Integer.valueOf(i5));
        hashMap.put(str2, Integer.valueOf(i6));
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void q(String str, String str2, String str3) {
        zzee.zzc(str3, str2.concat(String.valueOf(str)));
    }

    public static void r(StringBuilder sb, String str, int i5, String str2) {
        sb.append(str);
        sb.append(i5);
        zzee.zzc(str2, sb.toString());
    }

    public static void s(StringBuilder sb, String str, int i5, String str2, int i6) {
        sb.append(str);
        sb.append(i5);
        sb.append(str2);
        sb.append(i6);
    }

    public static void t(StringBuilder sb, String str, long j2, String str2) {
        sb.append(str);
        sb.append(j2);
        sb.append(str2);
    }

    public static void u(x2.c cVar, Bundle bundle, String str) {
        cVar.getClass();
        bundle.putLong(str, System.currentTimeMillis());
    }

    public static int v(int i5, int i6, int i7) {
        return zzpv.zzC(i5) + i6 + i7;
    }

    public static int w(int i5, int i6, int i7, int i8) {
        return zziaw.zzA(i5) + i6 + i7 + i8;
    }

    public static int x(int i5, int i6, int i7) {
        return zzjj.zzA(i5) + i6 + i7;
    }

    public static int y(int i5, int i6, int i7, int i8) {
        return zzjj.zzA(i5) + i6 + i7 + i8;
    }

    public static int z(int i5, int i6, int i7) {
        return zzgr.zzz(i5) + i6 + i7;
    }
}
