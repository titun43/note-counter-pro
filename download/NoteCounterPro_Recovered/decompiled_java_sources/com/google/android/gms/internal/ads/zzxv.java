package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzxv implements zzaam {
    public long zza;
    public long zzb;
    public zzaal zzc;
    public zzxv zzd;

    public zzxv(long j2, int i5) {
        zza(j2, 65536);
    }

    public final void zza(long j2, int i5) {
        zzgrc.zzi(this.zzc == null);
        this.zza = j2;
        this.zzb = j2 + 65536;
    }

    public final int zzb(long j2) {
        long j5 = j2 - this.zza;
        int i5 = this.zzc.zzb;
        return (int) j5;
    }

    public final zzxv zzc() {
        this.zzc = null;
        zzxv zzxvVar = this.zzd;
        this.zzd = null;
        return zzxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaal zzd() {
        zzaal zzaalVar = this.zzc;
        zzaalVar.getClass();
        return zzaalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final zzaam zze() {
        zzxv zzxvVar = this.zzd;
        if (zzxvVar == null || zzxvVar.zzc == null) {
            return null;
        }
        return zzxvVar;
    }
}
