package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public class zzbio {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbio(String str, Object obj, int i5) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i5;
    }

    public static zzbio zza(String str, boolean z4) {
        return new zzbio(str, Boolean.valueOf(z4), 1);
    }

    public static zzbio zzb(String str, long j2) {
        return new zzbio(str, Long.valueOf(j2), 2);
    }

    public static zzbio zzc(String str, double d5) {
        return new zzbio(str, Double.valueOf(d5), 3);
    }

    public static zzbio zzd(String str, String str2) {
        return new zzbio("gad:dynamite_module:experiment_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 4);
    }

    public final Object zze() {
        zzbju zza = zzbjw.zza();
        if (zza != null) {
            int i5 = this.zzc - 1;
            return i5 != 0 ? i5 != 1 ? i5 != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzb(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbjw.zzb() != null) {
            zzbjw.zzb().zza();
        }
        return this.zzb;
    }
}
