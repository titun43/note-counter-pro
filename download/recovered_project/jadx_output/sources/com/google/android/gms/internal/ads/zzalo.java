package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzalo {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzer zzg = new zzer(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaev zzaevVar, long j2) {
        zzgrc.zza(zzaevVar.zzn() == zzaevVar.zzm());
        zzer zzerVar = this.zzg;
        zzerVar.zza(4);
        while (true) {
            if ((j2 == -1 || zzaevVar.zzn() + 4 < j2) && zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 4, true)) {
                zzerVar.zzh(0);
                if (zzerVar.zzz() == 1332176723) {
                    zzaevVar.zzl();
                    return true;
                }
                zzaevVar.zzf(1);
            }
        }
        do {
            if (j2 != -1 && zzaevVar.zzn() >= j2) {
                break;
            }
        } while (zzaevVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzaev zzaevVar, boolean z4) {
        zza();
        zzer zzerVar = this.zzg;
        zzerVar.zza(27);
        if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, 27, z4) && zzerVar.zzz() == 1332176723) {
            if (zzerVar.zzs() != 0) {
                if (z4) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzerVar.zzs();
            this.zzb = zzerVar.zzE();
            zzerVar.zzA();
            zzerVar.zzA();
            zzerVar.zzA();
            int zzs = zzerVar.zzs();
            this.zzc = zzs;
            this.zzd = zzs + 27;
            zzerVar.zza(zzs);
            if (zzaey.zze(zzaevVar, zzerVar.zzi(), 0, this.zzc, z4)) {
                for (int i5 = 0; i5 < this.zzc; i5++) {
                    int[] iArr = this.zzf;
                    int zzs2 = zzerVar.zzs();
                    iArr[i5] = zzs2;
                    this.zze += zzs2;
                }
                return true;
            }
        }
        return false;
    }
}
