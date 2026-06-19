package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzgrt {
    public static String zza(String str) {
        return str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
    }

    public static String zzb(String str) {
        if (zzgrb.zza(str)) {
            return null;
        }
        return str;
    }

    public static boolean zzc(String str) {
        return zzgrb.zza(str);
    }

    public static String zzd(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i5 = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(zze(objArr[i5]));
            i6 = indexOf + 2;
            i5++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i5 < length) {
            String str2 = " [";
            while (i5 < objArr.length) {
                sb.append(str2);
                sb.append(zze(objArr[i5]));
                i5++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zze(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String b2 = h1.b(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(b2), (Throwable) e4);
            String name2 = e4.getClass().getName();
            StringBuilder sb = new StringBuilder(b2.length() + 8 + name2.length() + 1);
            s.c.e(sb, "<", b2, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
