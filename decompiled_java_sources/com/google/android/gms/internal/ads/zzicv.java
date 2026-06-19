package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzicv {
    private final zzicu zza;

    private zzicv(zzies zziesVar, Object obj, zzies zziesVar2, Object obj2) {
        this.zza = new zzicu(zziesVar, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zziesVar2, obj2);
    }

    public static zzicv zza(zzies zziesVar, Object obj, zzies zziesVar2, Object obj2) {
        return new zzicv(zziesVar, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zziesVar2, obj2);
    }

    public static void zzb(zziaw zziawVar, zzicu zzicuVar, Object obj, Object obj2) {
        zzibg.zzf(zziawVar, zzicuVar.zza, 1, obj);
        zzibg.zzf(zziawVar, zzicuVar.zzc, 2, obj2);
    }

    public static int zzc(zzicu zzicuVar, Object obj, Object obj2) {
        return zzibg.zzh(zzicuVar.zza, 1, obj) + zzibg.zzh(zzicuVar.zzc, 2, obj2);
    }

    public final int zzd(int i5, Object obj, Object obj2) {
        zzicu zzicuVar = this.zza;
        int zzA = zziaw.zzA(i5 << 3);
        int zzc = zzc(zzicuVar, obj, obj2);
        return u.c(zzc, zzc, zzA);
    }

    public final zzicu zze() {
        return this.zza;
    }
}
