package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class zzyf {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzyf(int i5) {
        this(0, new Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final int zzb(int i5) {
        int i6 = this.zzc[i5] + 1;
        int[] iArr = this.zzb;
        if (i6 < iArr.length) {
            return iArr[i6];
        }
        return -1;
    }

    public final int zzc(int i5) {
        int i6 = this.zzc[i5] - 1;
        if (i6 >= 0) {
            return this.zzb[i6];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final zzyf zzf(int i5, int i6) {
        int[] iArr = new int[i6];
        int[] iArr2 = new int[i6];
        int i7 = 0;
        while (i7 < i6) {
            Random random = this.zza;
            iArr[i7] = random.nextInt(this.zzb.length + 1);
            int i8 = i7 + 1;
            int nextInt = random.nextInt(i8);
            iArr2[i7] = iArr2[nextInt];
            iArr2[nextInt] = i7;
            i7 = i8;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i6];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iArr3.length + i6; i11++) {
            if (i9 >= i6 || i10 != iArr[i9]) {
                int i12 = i10 + 1;
                int i13 = iArr3[i10];
                iArr4[i11] = i13;
                if (i13 >= 0) {
                    iArr4[i11] = i13 + i6;
                }
                i10 = i12;
            } else {
                iArr4[i11] = iArr2[i9];
                i9++;
            }
        }
        return new zzyf(iArr4, new Random(this.zza.nextLong()));
    }

    public final zzyf zzg() {
        return new zzyf(0, new Random(this.zza.nextLong()));
    }

    private zzyf(int i5, Random random) {
        this(new int[0], random);
    }

    private zzyf(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            this.zzc[iArr[i5]] = i5;
        }
    }
}
