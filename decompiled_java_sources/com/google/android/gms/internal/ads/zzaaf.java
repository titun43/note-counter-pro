package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaaf {
    private final int[] zza;
    private final zzyn[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzyn zze;

    public zzaaf(String[] strArr, int[] iArr, zzyn[] zzynVarArr, int[] iArr2, int[][][] iArr3, zzyn zzynVar) {
        this.zza = iArr;
        this.zzb = zzynVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzynVar;
    }

    public final int zza(int i5) {
        return this.zza[i5];
    }

    public final zzyn zzb(int i5) {
        return this.zzb[i5];
    }

    public final int zzc(int i5, int i6, int i7) {
        return this.zzd[i5][i6][i7];
    }

    public final int zzd(int i5, int i6, boolean z4) {
        zzyn[] zzynVarArr = this.zzb;
        int i7 = zzynVarArr[i5].zza(i6).zza;
        int[] iArr = new int[i7];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            if ((this.zzd[i5][i6][i10] & 7) == 4) {
                iArr[i9] = i10;
                i9++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i9);
        String str = null;
        int i11 = 0;
        int i12 = 16;
        boolean z5 = false;
        while (i8 < copyOf.length) {
            String str2 = zzynVarArr[i5].zza(i6).zza(copyOf[i8]).zzo;
            int i13 = i11 + 1;
            if (i11 == 0) {
                str = str2;
            } else {
                z5 |= !Objects.equals(str, str2);
            }
            i12 = Math.min(i12, this.zzd[i5][i6][i8] & 24);
            i8++;
            i11 = i13;
        }
        return z5 ? Math.min(i12, this.zzc[i5]) : i12;
    }

    public final zzyn zze() {
        return this.zze;
    }
}
