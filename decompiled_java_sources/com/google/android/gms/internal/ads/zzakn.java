package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzakn {
    public final zzagh zza;
    public zzalf zzd;
    public zzaki zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzv zzj;
    private boolean zzm;
    public final zzale zzb = new zzale();
    public final zzer zzc = new zzer();
    private final zzer zzk = new zzer(1);
    private final zzer zzl = new zzer();

    public zzakn(zzagh zzaghVar, zzalf zzalfVar, zzaki zzakiVar, zzv zzvVar) {
        this.zza = zzaghVar;
        this.zzd = zzalfVar;
        this.zze = zzakiVar;
        this.zzj = zzvVar;
        zza(zzalfVar, zzakiVar);
    }

    public final void zza(zzalf zzalfVar, zzaki zzakiVar) {
        this.zzd = zzalfVar;
        this.zze = zzakiVar;
        this.zza.zzz(this.zzj);
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzalc zzalcVar = this.zzd.zza;
        zzaki zzakiVar = this.zzb.zza;
        String str = zzfj.zza;
        zzald zza = zzalcVar.zza(zzakiVar.zza);
        zzq zzb = zzqVar.zzb(zza != null ? zza.zzb : null);
        zzt zza2 = this.zzj.zza();
        zza2.zzq(zzb);
        this.zza.zzz(zza2.zzM());
    }

    public final void zzc() {
        zzale zzaleVar = this.zzb;
        zzaleVar.zzd = 0;
        zzaleVar.zzp = 0L;
        zzaleVar.zzq = false;
        zzaleVar.zzk = false;
        zzaleVar.zzo = false;
        zzaleVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzale zzaleVar = this.zzb;
        return zzaleVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i5 = !this.zzm ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzj() != null ? i5 | 1073741824 : i5;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i5 = this.zzg + 1;
        this.zzg = i5;
        int[] iArr = this.zzb.zzg;
        int i6 = this.zzh;
        if (i5 != iArr[i6]) {
            return true;
        }
        this.zzh = i6 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i5, int i6) {
        zzer zzerVar;
        zzald zzj = zzj();
        if (zzj == null) {
            return 0;
        }
        int i7 = zzj.zzd;
        if (i7 != 0) {
            zzerVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzj.zze;
            String str = zzfj.zza;
            zzer zzerVar2 = this.zzl;
            int length = bArr.length;
            zzerVar2.zzb(bArr, length);
            zzerVar = zzerVar2;
            i7 = length;
        }
        zzale zzaleVar = this.zzb;
        boolean zzb = zzaleVar.zzb(this.zzf);
        boolean z4 = zzb || i6 != 0;
        zzer zzerVar3 = this.zzk;
        zzerVar3.zzi()[0] = (byte) ((true != z4 ? 0 : 128) | i7);
        zzerVar3.zzh(0);
        zzagh zzaghVar = this.zza;
        zzaghVar.zzd(zzerVar3, 1, 1);
        zzaghVar.zzd(zzerVar, i7, 1);
        if (!z4) {
            return i7 + 1;
        }
        if (!zzb) {
            zzer zzerVar4 = this.zzc;
            zzerVar4.zza(8);
            byte[] zzi = zzerVar4.zzi();
            zzi[0] = 0;
            zzi[1] = 1;
            zzi[2] = 0;
            zzi[3] = (byte) i6;
            zzi[4] = (byte) ((i5 >> 24) & 255);
            zzi[5] = (byte) ((i5 >> 16) & 255);
            zzi[6] = (byte) ((i5 >> 8) & 255);
            zzi[7] = (byte) (i5 & 255);
            zzaghVar.zzd(zzerVar4, 8, 1);
            return i7 + 9;
        }
        int i8 = i7 + 1;
        zzer zzerVar5 = zzaleVar.zzn;
        int zzt = zzerVar5.zzt();
        zzerVar5.zzk(-2);
        int i9 = (zzt * 6) + 2;
        if (i6 != 0) {
            zzer zzerVar6 = this.zzc;
            zzerVar6.zza(i9);
            byte[] zzi2 = zzerVar6.zzi();
            zzerVar5.zzm(zzi2, 0, i9);
            int i10 = (((zzi2[2] & 255) << 8) | (zzi2[3] & 255)) + i6;
            zzi2[2] = (byte) ((i10 >> 8) & 255);
            zzi2[3] = (byte) (i10 & 255);
            zzerVar5 = zzerVar6;
        }
        zzaghVar.zzd(zzerVar5, i9, 1);
        return i8 + i9;
    }

    public final zzald zzj() {
        if (!this.zzm) {
            return null;
        }
        zzale zzaleVar = this.zzb;
        zzaki zzakiVar = zzaleVar.zza;
        String str = zzfj.zza;
        int i5 = zzakiVar.zza;
        zzald zzaldVar = zzaleVar.zzm;
        if (zzaldVar == null) {
            zzaldVar = this.zzd.zza.zza(i5);
        }
        if (zzaldVar == null || !zzaldVar.zza) {
            return null;
        }
        return zzaldVar;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    public final /* synthetic */ void zzl(boolean z4) {
        this.zzm = true;
    }
}
