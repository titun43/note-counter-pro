package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaox implements zzaon {
    private zzagh zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzer zzb = new zzer(10);
    private long zze = -9223372036854775807L;

    public zzaox(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 5);
        this.zzc = zzu;
        zzt zztVar = new zzt();
        zztVar.zza(zzaqbVar.zzc());
        zztVar.zzl(this.zza);
        zztVar.zzm("application/id3");
        zzu.zzz(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j2, int i5) {
        if ((i5 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j2;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int zzd = zzerVar.zzd();
            int i5 = this.zzg;
            if (i5 < 10) {
                int min = Math.min(zzd, 10 - i5);
                byte[] zzi = zzerVar.zzi();
                int zzg = zzerVar.zzg();
                zzer zzerVar2 = this.zzb;
                System.arraycopy(zzi, zzg, zzerVar2.zzi(), this.zzg, min);
                if (this.zzg + min == 10) {
                    zzerVar2.zzh(0);
                    if (zzerVar2.zzs() != 73 || zzerVar2.zzs() != 68 || zzerVar2.zzs() != 51) {
                        zzee.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzerVar2.zzk(3);
                        this.zzf = zzerVar2.zzG() + 10;
                    }
                }
            }
            int min2 = Math.min(zzd, this.zzf - this.zzg);
            this.zzc.zzc(zzerVar, min2);
            this.zzg += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z4) {
        int i5;
        this.zzc.getClass();
        if (this.zzd && (i5 = this.zzf) != 0 && this.zzg == i5) {
            zzgrc.zzi(this.zze != -9223372036854775807L);
            this.zzc.zze(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
