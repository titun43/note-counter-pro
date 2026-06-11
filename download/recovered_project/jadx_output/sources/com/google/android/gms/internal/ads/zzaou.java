package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaou implements zzaon {
    private final zzapq zza;
    private long zzf;
    private String zzh;
    private zzagh zzi;
    private zzaot zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzape zzc = new zzape(7, 128);
    private final zzape zzd = new zzape(8, 128);
    private final zzape zze = new zzape(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaou(zzapq zzapqVar, boolean z4, boolean z5, String str) {
        this.zza = zzapqVar;
    }

    private final void zzf(long j2, int i5, long j5) {
        if (!this.zzk) {
            this.zzc.zzc(i5);
            this.zzd.zzc(i5);
        }
        this.zze.zzc(i5);
        this.zzj.zzd(j2, i5, j5, this.zzm);
    }

    private final void zzg(byte[] bArr, int i5, int i6) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i5, i6);
            this.zzd.zzd(bArr, i5, i6);
        }
        this.zze.zzd(bArr, i5, i6);
    }

    private final void zzh(long j2, int i5, int i6, long j5) {
        if (!this.zzk) {
            zzape zzapeVar = this.zzc;
            zzapeVar.zze(i6);
            zzape zzapeVar2 = this.zzd;
            zzapeVar2.zze(i6);
            if (this.zzk) {
                if (zzapeVar.zzb()) {
                    zzgl zze = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                    this.zza.zzb(zze.zzm);
                    this.zzj.zza(zze);
                    zzapeVar.zza();
                } else if (zzapeVar2.zzb()) {
                    this.zzj.zzb(zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb));
                    zzapeVar2.zza();
                }
            } else if (zzapeVar.zzb() && zzapeVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzapeVar.zza, zzapeVar.zzb));
                arrayList.add(Arrays.copyOf(zzapeVar2.zza, zzapeVar2.zzb));
                zzgl zze2 = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                zzgk zzh = zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb);
                String zza = zzdo.zza(zze2.zza, zze2.zzb, zze2.zzc);
                zzagh zzaghVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(zza);
                zztVar.zzt(zze2.zze);
                zztVar.zzu(zze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zze2.zzj);
                zzhVar.zzb(zze2.zzk);
                zzhVar.zzc(zze2.zzl);
                zzhVar.zze(zze2.zzh + 8);
                zzhVar.zzf(zze2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zze2.zzg);
                zztVar.zzp(arrayList);
                int i7 = zze2.zzm;
                zztVar.zzo(i7);
                zzaghVar.zzz(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i7);
                this.zzj.zza(zze2);
                this.zzj.zzb(zzh);
                zzapeVar.zza();
                zzapeVar2.zza();
            }
        }
        zzape zzapeVar3 = this.zze;
        if (zzapeVar3.zze(i6)) {
            int zza2 = zzgm.zza(zzapeVar3.zza, zzapeVar3.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar3.zza, zza2);
            zzerVar.zzh(4);
            this.zza.zzc(j5, zzerVar);
        }
        if (this.zzj.zze(j2, i5, this.zzk)) {
            this.zzm = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgm.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaot zzaotVar = this.zzj;
        if (zzaotVar != null) {
            zzaotVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzi = zzu;
        this.zzj = new zzaot(zzu, false, false);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        this.zzl = j2;
        int i6 = i5 & 2;
        this.zzm = (i6 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i5;
        int i6;
        int i7;
        this.zzi.getClass();
        String str = zzfj.zza;
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        byte[] zzi = zzerVar.zzi();
        this.zzf += zzerVar.zzd();
        this.zzi.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzg);
            if (zzi2 == zze) {
                zzg(zzi, zzg, zze);
                return;
            }
            int i8 = zzi[zzi2 + 3] & 31;
            if (zzi2 > 0) {
                int i9 = zzi2 - 1;
                if (zzi[i9] == 0) {
                    i6 = 4;
                    i5 = i9;
                    i7 = i5 - zzg;
                    if (i7 > 0) {
                        zzg(zzi, zzg, i5);
                    }
                    int i10 = zze - i5;
                    long j2 = this.zzf - i10;
                    zzh(j2, i10, i7 >= 0 ? -i7 : 0, this.zzl);
                    zzf(j2, i8, this.zzl);
                    zzg = i5 + i6;
                }
            }
            i5 = zzi2;
            i6 = 3;
            i7 = i5 - zzg;
            if (i7 > 0) {
            }
            int i102 = zze - i5;
            long j22 = this.zzf - i102;
            zzh(j22, i102, i7 >= 0 ? -i7 : 0, this.zzl);
            zzf(j22, i8, this.zzl);
            zzg = i5 + i6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
        this.zzi.getClass();
        String str = zzfj.zza;
        if (z4) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }
}
