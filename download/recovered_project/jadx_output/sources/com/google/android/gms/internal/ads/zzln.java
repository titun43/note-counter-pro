package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzln {
    public final zzwi zza;
    public final Object zzb;
    public final zzyc[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzlo zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzmn[] zzj;
    private final zzaaj zzk;
    private final zzmc zzl;
    private zzln zzm;
    private zzyn zzn;
    private zzaak zzo;
    private long zzp;

    public zzln(zzmn[] zzmnVarArr, long j2, zzaaj zzaajVar, zzaan zzaanVar, zzmc zzmcVar, zzlo zzloVar, zzaak zzaakVar, long j5) {
        this.zzj = zzmnVarArr;
        this.zzp = j2;
        this.zzk = zzaajVar;
        this.zzl = zzmcVar;
        zzwk zzwkVar = zzloVar.zza;
        this.zzb = zzwkVar.zza;
        this.zzg = zzloVar;
        this.zzn = zzyn.zza;
        this.zzo = zzaakVar;
        this.zzc = new zzyc[2];
        this.zzi = new boolean[2];
        long j6 = zzloVar.zzb;
        long j7 = zzloVar.zzd;
        zzwi zze = zzmcVar.zze(zzwkVar, zzaanVar, j6);
        this.zza = j7 != -9223372036854775807L ? new zzvo(zze, true, 0L, j7) : zze;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i5 = 0;
        while (true) {
            zzaak zzaakVar = this.zzo;
            if (i5 >= zzaakVar.zza) {
                return;
            }
            zzaakVar.zza(i5);
            zzaac zzaacVar = this.zzo.zzc[i5];
            i5++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i5 = 0;
        while (true) {
            zzaak zzaakVar = this.zzo;
            if (i5 >= zzaakVar.zza) {
                return;
            }
            zzaakVar.zza(i5);
            zzaac zzaacVar = this.zzo.zzc[i5];
            i5++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j2) {
        this.zzp = j2;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzi() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzi = this.zzf ? this.zza.zzi() : Long.MIN_VALUE;
        return zzi == Long.MIN_VALUE ? this.zzg.zze : zzi;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzl();
        }
        return 0L;
    }

    public final void zzh(float f5, zzbf zzbfVar, boolean z4) {
        this.zze = true;
        this.zzn = this.zza.zzd();
        zzaak zzk = zzk(f5, zzbfVar, z4);
        zzlo zzloVar = this.zzg;
        long j2 = zzloVar.zzb;
        long j5 = zzloVar.zze;
        if (j5 != -9223372036854775807L && j2 >= j5) {
            j2 = Math.max(0L, j5 - 1);
        }
        long zzl = zzl(zzk, j2, false);
        long j6 = this.zzp;
        zzlo zzloVar2 = this.zzg;
        this.zzp = (zzloVar2.zzb - zzl) + j6;
        this.zzg = zzloVar2.zza(zzl);
    }

    public final void zzi(long j2) {
        zzgrc.zzi(zzw());
        if (this.zze) {
            this.zza.zzg(j2 - this.zzp);
        }
    }

    public final void zzj(zzll zzllVar) {
        zzgrc.zzi(zzw());
        this.zza.zzm(zzllVar);
    }

    public final zzaak zzk(float f5, zzbf zzbfVar, boolean z4) {
        zzyn zzynVar = this.zzn;
        zzwk zzwkVar = this.zzg.zza;
        zzaaj zzaajVar = this.zzk;
        zzmn[] zzmnVarArr = this.zzj;
        zzaak zzq = zzaajVar.zzq(zzmnVarArr, zzynVar, zzwkVar, zzbfVar);
        for (int i5 = 0; i5 < zzq.zza; i5++) {
            if (zzq.zza(i5)) {
                if (zzq.zzc[i5] == null) {
                    zzmnVarArr[i5].zza();
                    r2 = false;
                }
                zzgrc.zzi(r2);
            } else {
                zzgrc.zzi(zzq.zzc[i5] == null);
            }
        }
        for (zzaac zzaacVar : zzq.zzc) {
        }
        return zzq;
    }

    public final long zzl(zzaak zzaakVar, long j2, boolean z4) {
        return zzm(zzaakVar, j2, false, new boolean[2]);
    }

    public final long zzm(zzaak zzaakVar, long j2, boolean z4, boolean[] zArr) {
        zzmn[] zzmnVarArr;
        int i5 = 0;
        while (true) {
            boolean z5 = true;
            if (i5 >= zzaakVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z4 || !zzaakVar.zzb(this.zzo, i5)) {
                z5 = false;
            }
            zArr2[i5] = z5;
            i5++;
        }
        int i6 = 0;
        while (true) {
            zzmnVarArr = this.zzj;
            if (i6 >= 2) {
                break;
            }
            zzmnVarArr[i6].zza();
            i6++;
        }
        zzv();
        this.zzo = zzaakVar;
        zzu();
        zzwi zzwiVar = this.zza;
        zzaac[] zzaacVarArr = zzaakVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzyc[] zzycVarArr = this.zzc;
        long zze = zzwiVar.zze(zzaacVarArr, zArr3, zzycVarArr, zArr, j2);
        for (int i7 = 0; i7 < 2; i7++) {
            zzmnVarArr[i7].zza();
        }
        this.zzf = false;
        for (int i8 = 0; i8 < 2; i8++) {
            if (zzycVarArr[i8] != null) {
                zzgrc.zzi(zzaakVar.zza(i8));
                zzmnVarArr[i8].zza();
                this.zzf = true;
            } else {
                zzgrc.zzi(zzaacVarArr[i8] == null);
            }
        }
        return zze;
    }

    public final void zzn() {
        zzv();
        zzwi zzwiVar = this.zza;
        try {
            boolean z4 = zzwiVar instanceof zzvo;
            zzmc zzmcVar = this.zzl;
            if (z4) {
                zzmcVar.zzf(((zzvo) zzwiVar).zza);
            } else {
                zzmcVar.zzf(zzwiVar);
            }
        } catch (RuntimeException e4) {
            zzee.zzf("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    public final void zzo(zzln zzlnVar) {
        if (zzlnVar == this.zzm) {
            return;
        }
        zzv();
        this.zzm = zzlnVar;
        zzu();
    }

    public final zzln zzp() {
        return this.zzm;
    }

    public final zzyn zzq() {
        return this.zzn;
    }

    public final zzaak zzr() {
        return this.zzo;
    }

    public final void zzs() {
        zzwi zzwiVar = this.zza;
        if (zzwiVar instanceof zzvo) {
            long j2 = this.zzg.zzd;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((zzvo) zzwiVar).zza(0L, j2);
        }
    }

    public final void zzt(zzwh zzwhVar, long j2) {
        this.zzd = true;
        this.zza.zzb(zzwhVar, j2);
    }
}
