package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzvo implements zzwi, zzwh {
    public final zzwi zza;
    long zzb;
    private zzwh zzc;
    private zzvn[] zzd = new zzvn[0];
    private long zze = 0;

    public zzvo(zzwi zzwiVar, boolean z4, long j2, long j5) {
        this.zza = zzwiVar;
        this.zzb = j5;
    }

    private static long zzq(long j2, long j5, long j6) {
        long max = Math.max(j2, j5);
        return j6 != Long.MIN_VALUE ? Math.min(max, j6) : max;
    }

    public final void zza(long j2, long j5) {
        this.zzb = j5;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j2);
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
        int length = zzycVarArr.length;
        this.zzd = new zzvn[length];
        zzyc[] zzycVarArr2 = new zzyc[length];
        int i5 = 0;
        while (true) {
            zzyc zzycVar = null;
            if (i5 >= zzycVarArr.length) {
                break;
            }
            zzvn[] zzvnVarArr = this.zzd;
            zzvn zzvnVar = (zzvn) zzycVarArr[i5];
            zzvnVarArr[i5] = zzvnVar;
            if (zzvnVar != null) {
                zzycVar = zzvnVar.zza;
            }
            zzycVarArr2[i5] = zzycVar;
            i5++;
        }
        long zze = this.zza.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j2);
        long zzq = zzq(zze, j2, this.zzb);
        long j5 = -9223372036854775807L;
        if (zzo()) {
            if (zze >= j2) {
                if (zze != 0) {
                    for (zzaac zzaacVar : zzaacVarArr) {
                        if (zzaacVar != null) {
                            zzv zzc = zzaacVar.zzc();
                            if (!zzas.zzd(zzc.zzo, zzc.zzk)) {
                            }
                        }
                    }
                }
            }
            j5 = zzq;
            break;
        }
        this.zze = j5;
        for (int i6 = 0; i6 < zzycVarArr.length; i6++) {
            zzyc zzycVar2 = zzycVarArr2[i6];
            if (zzycVar2 == null) {
                this.zzd[i6] = null;
            } else {
                zzvn[] zzvnVarArr2 = this.zzd;
                zzvn zzvnVar2 = zzvnVarArr2[i6];
                if (zzvnVar2 == null || zzvnVar2.zza != zzycVar2) {
                    zzvnVarArr2[i6] = new zzvn(this, zzycVar2);
                }
            }
            zzycVarArr[i6] = this.zzd[i6];
        }
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z4) {
        this.zza.zzf(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        this.zza.zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (zzo()) {
            long j2 = this.zze;
            this.zze = -9223372036854775807L;
            long zzh = zzh();
            return zzh != -9223372036854775807L ? zzh : j2;
        }
        long zzh2 = this.zza.zzh();
        if (zzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(zzh2, 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi != Long.MIN_VALUE) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || zzi < j2) {
                return zzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzj(long j2) {
        this.zze = -9223372036854775807L;
        for (zzvn zzvnVar : this.zzd) {
            if (zzvnVar != null) {
                zzvnVar.zza();
            }
        }
        return zzq(this.zza.zzj(j2), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzk(long j2, zzmt zzmtVar) {
        if (j2 == 0) {
            return 0L;
        }
        long j5 = zzmtVar.zzd;
        String str = zzfj.zza;
        long max = Math.max(0L, Math.min(j5, j2));
        long j6 = zzmtVar.zze;
        long j7 = this.zzb;
        long max2 = Math.max(0L, Math.min(j6, j7 == Long.MIN_VALUE ? Long.MAX_VALUE : j7 - j2));
        if (max != j5 || max2 != j6) {
            zzmtVar = new zzmt(max, max2);
        }
        return this.zza.zzk(j2, zzmtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl != Long.MIN_VALUE) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || zzl < j2) {
                return zzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        return this.zza.zzm(zzllVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
    }

    public final boolean zzo() {
        return this.zze != -9223372036854775807L;
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
