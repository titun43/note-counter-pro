package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcod implements zzdzk {
    private final Long zza;
    private final String zzb;
    private final zzcnp zzc;
    private final zzcof zzd;

    public zzcod(zzcnp zzcnpVar, zzcof zzcofVar, Long l5, String str) {
        this.zzc = zzcnpVar;
        this.zzd = zzcofVar;
        this.zza = l5;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public final zzdzt zza() {
        long longValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzu.zza(longValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public final zzdzx zzb() {
        long longValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzy.zza(longValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }
}
