package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzbho extends zzbhp {
    private static final String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i5 = 0;
        int i6 = 0;
        while (i6 < str.length() && str.charAt(i6) == ',') {
            i6++;
        }
        while (length > 0) {
            int i7 = length - 1;
            if (str.charAt(i7) != ',') {
                break;
            }
            length = i7;
        }
        if (length < i6) {
            return null;
        }
        if (i6 != 0) {
            i5 = i6;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i5, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final String zza(String str, String str2) {
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        if (TextUtils.isEmpty(zzb)) {
            return zzb2;
        }
        if (TextUtils.isEmpty(zzb2)) {
            return zzb;
        }
        return h1.b(new StringBuilder(String.valueOf(zzb).length() + 1 + String.valueOf(zzb2).length()), zzb, ",", zzb2);
    }
}
