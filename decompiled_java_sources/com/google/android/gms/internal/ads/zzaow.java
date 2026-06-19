package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class zzaow implements zzaon {
    private final zzapq zza;
    private String zzb;
    private zzagh zzc;
    private zzaov zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzape zzg = new zzape(32, 128);
    private final zzape zzh = new zzape(33, 128);
    private final zzape zzi = new zzape(34, 128);
    private final zzape zzj = new zzape(39, 128);
    private final zzape zzk = new zzape(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaow(zzapq zzapqVar, String str) {
        this.zza = zzapqVar;
    }

    private final void zzf(long j2, int i5, int i6, long j5) {
        this.zzd.zzb(j2, i5, i6, j5, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i6);
            this.zzh.zzc(i6);
            this.zzi.zzc(i6);
        }
        this.zzj.zzc(i6);
        this.zzk.zzc(i6);
    }

    private final void zzg(byte[] bArr, int i5, int i6) {
        this.zzd.zzc(bArr, i5, i6);
        if (!this.zze) {
            this.zzg.zzd(bArr, i5, i6);
            this.zzh.zzd(bArr, i5, i6);
            this.zzi.zzd(bArr, i5, i6);
        }
        this.zzj.zzd(bArr, i5, i6);
        this.zzk.zzd(bArr, i5, i6);
    }

    private final void zzh(long j2, int i5, int i6, long j5) {
        this.zzd.zzd(j2, i5, this.zze);
        if (!this.zze) {
            zzape zzapeVar = this.zzg;
            zzapeVar.zze(i6);
            zzape zzapeVar2 = this.zzh;
            zzapeVar2.zze(i6);
            zzape zzapeVar3 = this.zzi;
            zzapeVar3.zze(i6);
            if (zzapeVar.zzb() && zzapeVar2.zzb() && zzapeVar3.zzb()) {
                String str = this.zzb;
                int i7 = zzapeVar.zzb;
                byte[] bArr = new byte[zzapeVar2.zzb + i7 + zzapeVar3.zzb];
                System.arraycopy(zzapeVar.zza, 0, bArr, 0, i7);
                System.arraycopy(zzapeVar2.zza, 0, bArr, zzapeVar.zzb, zzapeVar2.zzb);
                System.arraycopy(zzapeVar3.zza, 0, bArr, zzapeVar.zzb + zzapeVar2.zzb, zzapeVar3.zzb);
                String str2 = null;
                zzgg zzg = zzgm.zzg(zzapeVar2.zza, 3, zzapeVar2.zzb, null);
                zzgb zzgbVar = zzg.zzb;
                if (zzgbVar != null) {
                    int i8 = zzgbVar.zzf;
                    int[] iArr = zzgbVar.zze;
                    int i9 = zzgbVar.zzd;
                    str2 = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, i9, iArr, i8);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzl("video/mp2t");
                zztVar.zzm("video/hevc");
                zztVar.zzj(str2);
                zztVar.zzt(zzg.zze);
                zztVar.zzu(zzg.zzf);
                zztVar.zzv(zzg.zzg);
                zztVar.zzw(zzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzg.zzk);
                zzhVar.zzb(zzg.zzl);
                zzhVar.zzc(zzg.zzm);
                zzhVar.zze(zzg.zzc + 8);
                zzhVar.zzf(zzg.zzd + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzg.zzi);
                zztVar.zzo(zzg.zzj);
                zztVar.zzD(zzg.zza + 1);
                zztVar.zzp(Collections.singletonList(bArr));
                zzv zzM = zztVar.zzM();
                this.zzc.zzz(zzM);
                int i10 = zzM.zzq;
                zzgrc.zzi(i10 != -1);
                this.zza.zzb(i10);
                this.zze = true;
            }
        }
        zzape zzapeVar4 = this.zzj;
        if (zzapeVar4.zze(i6)) {
            int zza = zzgm.zza(zzapeVar4.zza, zzapeVar4.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar4.zza, zza);
            zzerVar.zzk(5);
            this.zza.zzc(j5, zzerVar);
        }
        zzape zzapeVar5 = this.zzk;
        if (zzapeVar5.zze(i6)) {
            int zza2 = zzgm.zza(zzapeVar5.zza, zzapeVar5.zzb);
            zzer zzerVar2 = this.zzn;
            zzerVar2.zzb(zzapeVar5.zza, zza2);
            zzerVar2.zzk(5);
            this.zza.zzc(j5, zzerVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaov zzaovVar = this.zzd;
        if (zzaovVar != null) {
            zzaovVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzb = zzaqbVar.zzc();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzc = zzu;
        this.zzd = new zzaov(zzu);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        this.zzm = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        this.zzc.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int zzg = zzerVar.zzg();
            int zze = zzerVar.zze();
            byte[] zzi = zzerVar.zzi();
            this.zzl += zzerVar.zzd();
            this.zzc.zzc(zzerVar, zzerVar.zzd());
            while (zzg < zze) {
                int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzf);
                if (zzi2 == zze) {
                    zzg(zzi, zzg, zze);
                    return;
                }
                int i5 = zzi[zzi2 + 3] & 126;
                int i6 = 3;
                if (zzi2 > 0) {
                    int i7 = zzi2 - 1;
                    if (zzi[i7] == 0) {
                        i6 = 4;
                        zzi2 = i7;
                    }
                }
                int i8 = zzi2 - zzg;
                if (i8 > 0) {
                    zzg(zzi, zzg, zzi2);
                }
                int i9 = zze - zzi2;
                long j2 = this.zzl - i9;
                zzh(j2, i9, i8 < 0 ? -i8 : 0, this.zzm);
                zzf(j2, i9, i5 >> 1, this.zzm);
                zzg = zzi2 + i6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
        this.zzc.getClass();
        String str = zzfj.zza;
        if (z4) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
