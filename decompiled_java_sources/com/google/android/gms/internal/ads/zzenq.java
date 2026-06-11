package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzenq {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzenq(String str, String str2, int i5, long j2, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i5;
        this.zzd = j2;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i5 = this.zzc;
        long j2 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i5).length() + 1 + String.valueOf(j2).length());
        sb.append(str);
        sb.append(".");
        sb.append(i5);
        sb.append(".");
        sb.append(j2);
        String sb2 = sb.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            sb2 = h1.b(new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length()), sb2, ".", str2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzci)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + num.toString().length());
        sb3.append(sb2);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}
