package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes.dex */
final class zzaqi implements zzaqh {
    private final zzaex zza;
    private final zzagh zzb;
    private final zzaql zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaqi(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar, String str, int i5) {
        this.zza = zzaexVar;
        this.zzb = zzaghVar;
        this.zzc = zzaqlVar;
        int i6 = zzaqlVar.zzb * zzaqlVar.zze;
        int i7 = zzaqlVar.zzd;
        int i8 = i6 / 8;
        if (i7 != i8) {
            throw zzat.zzb(s.c.c(new StringBuilder(String.valueOf(i8).length() + 28 + String.valueOf(i7).length()), "Expected block size: ", i8, "; got: ", i7), null);
        }
        int i9 = zzaqlVar.zzc * i8;
        int i10 = i9 * 8;
        int max = Math.max(i8, i9 / 10);
        this.zze = max;
        zzt zztVar = new zzt();
        zztVar.zzl("audio/wav");
        zztVar.zzm(str);
        zztVar.zzh(i10);
        zztVar.zzi(i10);
        zztVar.zzn(max);
        zztVar.zzE(zzaqlVar.zzb);
        zztVar.zzF(zzaqlVar.zzc);
        zztVar.zzG(i5);
        this.zzd = zztVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza(long j2) {
        this.zzf = j2;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(int i5, long j2) {
        zzaqo zzaqoVar = new zzaqo(this.zzc, 1, i5, j2);
        this.zza.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzb;
        zzaghVar.zzz(this.zzd);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final boolean zzc(zzaev zzaevVar, long j2) {
        int i5;
        int i6;
        long j5 = j2;
        while (j5 > 0 && (i5 = this.zzg) < (i6 = this.zze)) {
            int zza = this.zzb.zza(zzaevVar, (int) Math.min(i6 - i5, j5), true);
            if (zza == -1) {
                j5 = 0;
            } else {
                this.zzg += zza;
                j5 -= zza;
            }
        }
        zzaql zzaqlVar = this.zzc;
        int i7 = this.zzg;
        int i8 = zzaqlVar.zzd;
        int i9 = i7 / i8;
        if (i9 > 0) {
            long zzt = this.zzf + zzfj.zzt(this.zzh, 1000000L, zzaqlVar.zzc, RoundingMode.DOWN);
            int i10 = i9 * i8;
            int i11 = this.zzg - i10;
            this.zzb.zze(zzt, 1, i10, i11, null);
            this.zzh += i9;
            this.zzg = i11;
        }
        return j5 <= 0;
    }
}
