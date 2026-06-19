package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzakf implements zzakb {
    private final zzer zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzakf(zzfv zzfvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zza = zzerVar;
        zzerVar.zzh(12);
        this.zzc = zzerVar.zzH() & 255;
        this.zzb = zzerVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzc() {
        int i5 = this.zzc;
        if (i5 == 8) {
            return this.zza.zzs();
        }
        if (i5 == 16) {
            return this.zza.zzt();
        }
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        if (i6 % 2 != 0) {
            return this.zze & 15;
        }
        int zzs = this.zza.zzs();
        this.zze = zzs;
        return (zzs & 240) >> 4;
    }
}
