package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcof implements zzdzr {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    private final Context zze;
    private final zzbph zzf;
    private final zzcnp zzg;
    private final zzcof zzh = this;

    public zzcof(zzcnp zzcnpVar, Context context, zzbph zzbphVar) {
        this.zzg = zzcnpVar;
        this.zze = context;
        this.zzf = zzbphVar;
        zzikg zza = zzikh.zza(this);
        this.zza = zza;
        zzikg zza2 = zzikh.zza(zzbphVar);
        this.zzb = zza2;
        zzdzn zzc = zzdzn.zzc(zza2);
        this.zzc = zzc;
        this.zzd = zzikf.zza(zzdzp.zza(zza, zzc));
    }

    public final zzdzm zza() {
        return zzdzn.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final zzdzo zzb() {
        return (zzdzo) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdzr
    public final zzdzj zzc() {
        return new zzcoc(this.zzg, this.zzh, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zze;
    }
}
