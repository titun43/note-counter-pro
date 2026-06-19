package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaoz implements zzaon {
    private final zzer zza;
    private final zzafr zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzagh zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaoz(String str, int i5, String str2) {
        zzer zzerVar = new zzer(4);
        this.zza = zzerVar;
        zzerVar.zzi()[0] = -1;
        this.zzb = new zzafr();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i5;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzg = zzaqbVar.zzc();
        this.zzf = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        this.zzn = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        this.zzf.getClass();
        while (zzerVar.zzd() > 0) {
            int i5 = this.zzh;
            if (i5 == 0) {
                byte[] zzi = zzerVar.zzi();
                int zzg = zzerVar.zzg();
                int zze = zzerVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzerVar.zzh(zze);
                        break;
                    }
                    int i6 = zzg + 1;
                    byte b2 = zzi[zzg];
                    boolean z4 = (b2 & 255) == 255;
                    boolean z5 = this.zzk && (b2 & 224) == 224;
                    this.zzk = z4;
                    if (z5) {
                        zzerVar.zzh(i6);
                        this.zzk = false;
                        this.zza.zzi()[1] = zzi[zzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    zzg = i6;
                }
            } else if (i5 != 1) {
                int min = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzc(zzerVar, min);
                int i7 = this.zzi + min;
                this.zzi = i7;
                if (i7 >= this.zzm) {
                    zzgrc.zzi(this.zzn != -9223372036854775807L);
                    this.zzf.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int min2 = Math.min(zzerVar.zzd(), 4 - this.zzi);
                zzer zzerVar2 = this.zza;
                zzerVar.zzm(zzerVar2.zzi(), this.zzi, min2);
                int i8 = this.zzi + min2;
                this.zzi = i8;
                if (i8 >= 4) {
                    zzerVar2.zzh(0);
                    zzafr zzafrVar = this.zzb;
                    if (zzafrVar.zza(zzerVar2.zzB())) {
                        this.zzm = zzafrVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (zzafrVar.zzg * 1000000) / zzafrVar.zzd;
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzl(this.zze);
                            zztVar.zzm(zzafrVar.zzb);
                            zztVar.zzn(4096);
                            zztVar.zzE(zzafrVar.zze);
                            zztVar.zzF(zzafrVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzz(zztVar.zzM());
                            this.zzj = true;
                        }
                        zzerVar2.zzh(0);
                        this.zzf.zzc(zzerVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
    }
}
