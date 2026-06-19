package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzfr {
    public final String zza;

    private zzfr(int i5, int i6, String str) {
        this.zza = str;
    }

    public static zzfr zza(zzer zzerVar) {
        String str;
        zzerVar.zzk(2);
        int zzs = zzerVar.zzs();
        int i5 = zzs >> 1;
        int i6 = zzs & 1;
        int zzs2 = zzerVar.zzs() >> 3;
        if (i5 == 4 || i5 == 5 || i5 == 7 || i5 == 8) {
            str = "dvhe";
        } else if (i5 == 9) {
            str = "dvav";
        } else {
            if (i5 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i7 = zzs2 | (i6 << 5);
        String str2 = i5 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i5).length();
        int length3 = String.valueOf(i7).length();
        String str3 = i7 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(u.e(str3, length + length2, length3));
        sb.append(str);
        sb.append(str2);
        sb.append(i5);
        sb.append(str3);
        sb.append(i7);
        return new zzfr(i5, i7, sb.toString());
    }
}
