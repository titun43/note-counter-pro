package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzake implements zzakb {
    private final int zza;
    private final int zzb;
    private final zzer zzc;

    public zzake(zzfv zzfvVar, zzv zzvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zzc = zzerVar;
        zzerVar.zzh(12);
        int zzH = zzerVar.zzH();
        if ("audio/raw".equals(zzvVar.zzo)) {
            int zzD = zzfj.zzD(zzvVar.zzI) * zzvVar.zzG;
            if (zzH == 0 || zzH % zzD != 0) {
                zzee.zzc("BoxParsers", s.c.c(new StringBuilder(String.valueOf(zzD).length() + 66 + String.valueOf(zzH).length()), "Audio sample size mismatch. stsd sample size: ", zzD, ", stsz sample size: ", zzH));
                zzH = zzD;
            }
        }
        this.zza = zzH == 0 ? -1 : zzH;
        this.zzb = zzerVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final int zzc() {
        int i5 = this.zza;
        return i5 == -1 ? this.zzc.zzH() : i5;
    }
}
