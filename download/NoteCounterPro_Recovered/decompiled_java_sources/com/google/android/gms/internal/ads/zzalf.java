package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzalf {
    public final zzalc zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final int[] zzh;
    public final long zzi;
    public final boolean zzj;

    public zzalf(zzalc zzalcVar, long[] jArr, int[] iArr, int i5, long[] jArr2, int[] iArr2, int[] iArr3, boolean z4, long j2, int i6) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzgrc.zza(length == length2);
        zzgrc.zza(jArr.length == length2);
        int length3 = iArr2.length;
        zzgrc.zza(length3 == length2);
        this.zza = zzalcVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i5;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = iArr3;
        this.zzj = z4;
        this.zzi = j2;
        this.zzb = i6;
        if (length3 > 0) {
            int i7 = length3 - 1;
            iArr2[i7] = iArr2[i7] | 536870912;
        }
    }

    public final int zza(long j2) {
        int i5 = 0;
        if (this.zzj) {
            return zzfj.zzm(this.zzf, j2, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i6 = -1;
        while (i5 <= length) {
            int i7 = ((length - i5) / 2) + i5;
            if (this.zzf[iArr[i7]] <= j2) {
                i5 = i7 + 1;
                i6 = i7;
            } else {
                length = i7 - 1;
            }
        }
        if (i6 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j5 = jArr[iArr[i6]];
        if (j5 == j2) {
            while (i6 > 0) {
                int i8 = i6 - 1;
                if (jArr[iArr[i8]] != j5) {
                    break;
                }
                i6 = i8;
            }
        }
        return iArr[i6];
    }

    public final int zzb(long j2) {
        int i5 = 0;
        if (this.zzj) {
            return zzfj.zzo(this.zzf, j2, true, false);
        }
        int[] iArr = this.zzh;
        int length = iArr.length - 1;
        int i6 = -1;
        while (i5 <= length) {
            int i7 = ((length - i5) / 2) + i5;
            if (this.zzf[iArr[i7]] >= j2) {
                length = i7 - 1;
                i6 = i7;
            } else {
                i5 = i7 + 1;
            }
        }
        if (i6 == -1) {
            return -1;
        }
        long[] jArr = this.zzf;
        long j5 = jArr[iArr[i6]];
        if (j5 == j2) {
            while (i6 < iArr.length - 1) {
                int i8 = i6 + 1;
                if (jArr[iArr[i8]] != j5) {
                    break;
                }
                i6 = i8;
            }
        }
        return iArr[i6];
    }
}
