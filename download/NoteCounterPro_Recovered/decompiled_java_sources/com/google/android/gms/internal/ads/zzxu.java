package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
public final class zzxu extends zzvj implements zzxi {
    private final zzha zza;
    private final zzxc zzb;
    private final zzto zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private zzhz zzi;
    private zzak zzj;
    private final zzaaw zzk;

    public /* synthetic */ zzxu(zzak zzakVar, zzha zzhaVar, zzxc zzxcVar, zzto zztoVar, zzaaw zzaawVar, int i5, boolean z4, int i6, zzv zzvVar, zzgru zzgruVar, byte[] bArr) {
        this.zzj = zzakVar;
        this.zza = zzhaVar;
        this.zzb = zzxcVar;
        this.zzc = zztoVar;
        this.zzk = zzaawVar;
        this.zzd = i5;
    }

    private final void zzu() {
        long j2 = this.zzf;
        boolean z4 = this.zzg;
        boolean z5 = this.zzh;
        zzak zzJ = zzJ();
        zzbf zzygVar = new zzyg(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j2, 0L, 0L, z4, false, false, null, zzJ, z5 ? zzJ.zzc : null);
        if (this.zze) {
            zzygVar = new zzxr(this, zzygVar);
        }
        zze(zzygVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized void zzA(zzak zzakVar) {
        this.zzj = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        ((zzxq) zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j2) {
        zzhb zza = this.zza.zza();
        zzhz zzhzVar = this.zzi;
        if (zzhzVar != null) {
            zza.zze(zzhzVar);
        }
        zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new zzxq(zzagVar.zza, zza, this.zzb.zza(zzk()), this.zzc, zzh(zzwkVar), this.zzk, zzf(zzwkVar), this, zzaanVar, null, this.zzd, false, 0, null, zzfj.zzq(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized zzak zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zza(zzhz zzhzVar) {
        this.zzi = zzhzVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(long j2, zzafy zzafyVar, boolean z4) {
        if (j2 == -9223372036854775807L) {
            j2 = this.zzf;
        }
        boolean zzb = zzafyVar.zzb();
        if (!this.zze && this.zzf == j2 && this.zzg == zzb && this.zzh == z4) {
            return;
        }
        this.zzf = j2;
        this.zzg = zzb;
        this.zzh = z4;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzt() {
    }
}
