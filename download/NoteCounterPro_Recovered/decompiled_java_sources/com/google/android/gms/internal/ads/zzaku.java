package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaku implements zzafy {
    private final long zza;
    private final zzakv[] zzb;
    private final int zzc;

    public zzaku(long j2, zzakv[] zzakvVarArr, int i5) {
        this.zza = j2;
        this.zzb = zzakvVarArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzafw zzc(long j2) {
        long j5;
        long j6;
        long j7;
        long j8;
        int i5;
        int zzl;
        int zzb;
        zzakv[] zzakvVarArr = this.zzb;
        if (zzakvVarArr.length == 0) {
            zzafz zzafzVar = zzafz.zza;
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i6 = this.zzc;
        if (i6 != -1) {
            zzalf zzalfVar = zzakvVarArr[i6].zzb;
            zzl = zzakw.zzl(zzalfVar, j2);
            if (zzl == -1) {
                zzafz zzafzVar2 = zzafz.zza;
                return new zzafw(zzafzVar2, zzafzVar2);
            }
            long[] jArr = zzalfVar.zzf;
            j6 = jArr[zzl];
            long[] jArr2 = zzalfVar.zzc;
            j5 = jArr2[zzl];
            if (j6 < j2 && zzl < zzalfVar.zzb - 1 && (zzb = zzalfVar.zzb(j2)) != -1 && zzb != zzl) {
                j7 = jArr[zzb];
                j8 = jArr2[zzb];
                long j9 = j5;
                long j10 = j8;
                for (i5 = 0; i5 < zzakvVarArr.length; i5++) {
                    if (i5 != i6) {
                        zzalf zzalfVar2 = zzakvVarArr[i5].zzb;
                        j9 = zzakw.zzh(zzalfVar2, j6, j9);
                        if (j7 != -9223372036854775807L) {
                            j10 = zzakw.zzh(zzalfVar2, j7, j10);
                        }
                    }
                }
                zzafz zzafzVar3 = new zzafz(j6, j9);
                return j7 != -9223372036854775807L ? new zzafw(zzafzVar3, zzafzVar3) : new zzafw(zzafzVar3, new zzafz(j7, j10));
            }
        } else {
            j5 = Long.MAX_VALUE;
            j6 = j2;
        }
        j7 = -9223372036854775807L;
        j8 = -1;
        long j92 = j5;
        long j102 = j8;
        while (i5 < zzakvVarArr.length) {
        }
        zzafz zzafzVar32 = new zzafz(j6, j92);
        if (j7 != -9223372036854775807L) {
        }
    }
}
