package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzene extends zzeng {
    private final zzcma zza;
    private final zzdml zzb;
    private final zzdan zzc;
    private final zzdhf zzd;
    private final zzenr zze;
    private final zzekl zzf;

    public zzene(zzcma zzcmaVar, zzdml zzdmlVar, zzdan zzdanVar, zzdhf zzdhfVar, zzenr zzenrVar, zzekl zzeklVar) {
        this.zza = zzcmaVar;
        this.zzb = zzdmlVar;
        this.zzc = zzdanVar;
        this.zzd = zzdhfVar;
        this.zze = zzenrVar;
        this.zzf = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    public final j3.a zzc(zzfjk zzfjkVar, Bundle bundle, zzfir zzfirVar, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.zzc;
        zzdanVar.zzb(zzfjkVar);
        zzdanVar.zzc(bundle);
        zzdanVar.zzd(new zzdag(zzfjcVar, zzfirVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzev)).booleanValue()) {
            zzdanVar.zzg(this.zzf);
        }
        zzdmp zzo = this.zza.zzo();
        zzo.zzf(zzdanVar.zze());
        zzo.zzg(this.zzd);
        zzo.zze(this.zzb);
        zzo.zzd(new zzctu(null));
        zzcxj zza = zzo.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
