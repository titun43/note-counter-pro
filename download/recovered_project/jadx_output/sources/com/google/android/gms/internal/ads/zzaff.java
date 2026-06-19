package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaff implements zzafy {
    private final zzafh zza;
    private final long zzb;

    public zzaff(zzafh zzafhVar, long j2) {
        this.zza = zzafhVar;
        this.zzb = j2;
    }

    private final zzafz zzd(long j2, long j5) {
        return new zzafz((j2 * 1000000) / this.zza.zze, this.zzb + j5);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzafh zzafhVar = this.zza;
        zzafg zzafgVar = zzafhVar.zzk;
        zzafgVar.getClass();
        long zzb = zzafhVar.zzb(j2);
        long[] jArr = zzafgVar.zza;
        int zzm = zzfj.zzm(jArr, zzb, true, false);
        long j5 = zzm == -1 ? 0L : jArr[zzm];
        long[] jArr2 = zzafgVar.zzb;
        zzafz zzd = zzd(j5, zzm != -1 ? jArr2[zzm] : 0L);
        if (zzd.zzb == j2 || zzm == jArr.length - 1) {
            return new zzafw(zzd, zzd);
        }
        int i5 = zzm + 1;
        return new zzafw(zzd, zzd(jArr[i5], jArr2[i5]));
    }
}
