package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzyk implements zzwi, zzwh {
    private final zzwi zza;
    private final long zzb;
    private zzwh zzc;

    public zzyk(zzwi zzwiVar, long j2) {
        this.zza = zzwiVar;
        this.zzb = j2;
    }

    public final zzwi zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j2) {
        zzyc[] zzycVarArr2 = new zzyc[zzycVarArr.length];
        int i5 = 0;
        while (true) {
            zzyc zzycVar = null;
            if (i5 >= zzycVarArr.length) {
                break;
            }
            zzyj zzyjVar = (zzyj) zzycVarArr[i5];
            if (zzyjVar != null) {
                zzycVar = zzyjVar.zza();
            }
            zzycVarArr2[i5] = zzycVar;
            i5++;
        }
        zzwi zzwiVar = this.zza;
        long j5 = this.zzb;
        long zze = zzwiVar.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j2 - j5);
        for (int i6 = 0; i6 < zzycVarArr.length; i6++) {
            zzyc zzycVar2 = zzycVarArr2[i6];
            if (zzycVar2 == null) {
                zzycVarArr[i6] = null;
            } else {
                zzyc zzycVar3 = zzycVarArr[i6];
                if (zzycVar3 == null || ((zzyj) zzycVar3).zza() != zzycVar2) {
                    zzycVarArr[i6] = new zzyj(zzycVar2, j5);
                }
            }
        }
        return zze + j5;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z4) {
        this.zza.zzf(j2 - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        this.zza.zzg(j2 - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        long zzh = this.zza.zzh();
        if (zzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j2) {
        long j5 = this.zzb;
        return this.zza.zzj(j2 - j5) + j5;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j2, zzmt zzmtVar) {
        long j5 = this.zzb;
        return this.zza.zzk(j2 - j5, zzmtVar) + j5;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        long j2 = zzllVar.zza;
        long j5 = this.zzb;
        zzlk zza = zzllVar.zza();
        zza.zza(j2 - j5);
        return this.zza.zzm(zza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}
