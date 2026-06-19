package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaga implements zzaeu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzaex zzf;
    private zzagh zzg;

    public zzaga(int i5, int i6, String str) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        int i5 = this.zza;
        zzgrc.zzi((i5 == -1 || this.zzb == -1) ? false : true);
        int i6 = this.zzb;
        zzer zzerVar = new zzer(i6);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, i6, false);
        return zzerVar.zzt() == i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
        zzagh zzu = zzaexVar.zzu(1024, 4);
        this.zzg = zzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzl(str);
        zztVar.zzm(str);
        zzu.zzz(zztVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzagb(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        int i5 = this.zze;
        if (i5 != 1) {
            if (i5 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzagh zzaghVar = this.zzg;
        zzaghVar.getClass();
        int zza = zzaghVar.zza(zzaevVar, 1024, true);
        if (zza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j2, long j5) {
        if (j2 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
