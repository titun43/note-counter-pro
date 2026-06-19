package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaha implements zzaeu {
    private final zzer zza = new zzer(4);
    private final zzaga zzb = new zzaga(-1, -1, "image/avif");

    private final boolean zzh(zzaev zzaevVar, int i5) {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == ((long) i5);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        ((zzael) zzaevVar).zzj(4, false);
        return zzh(zzaevVar, 1718909296) && zzh(zzaevVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb.zzc(zzaexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        return this.zzb.zzd(zzaevVar, zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        this.zzb.zze(j2, j5);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
