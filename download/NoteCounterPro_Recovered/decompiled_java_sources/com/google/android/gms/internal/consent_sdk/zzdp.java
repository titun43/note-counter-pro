package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzdp {
    public static String zza(String str, Object... objArr) {
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
            sb.append(zzb(objArr[i5]));
            i6 = indexOf + 2;
            i5++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i5 < length) {
            String str2 = " [";
            while (i5 < objArr.length) {
                sb.append(str2);
                sb.append(zzb(objArr[i5]));
                i5++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zzb(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String k5 = u.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(k5), (Throwable) e4);
            return "<" + k5 + " threw " + e4.getClass().getName() + ">";
        }
    }
}
