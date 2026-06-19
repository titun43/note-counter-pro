package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class zzajf implements zzafy {
    private final zzaei zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzajf(SparseArray sparseArray, long j2, int i5, long j5, long j6) {
        int i6;
        this.zzb = sparseArray;
        this.zzc = j2;
        this.zzd = i5;
        List list = (List) sparseArray.get(i5);
        zzaei zzaeiVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                zzaje zzajeVar = (zzaje) list.get(i8);
                jArr3[i8] = zzajeVar.zza();
                jArr[i8] = zzajeVar.zzb();
            }
            while (true) {
                i6 = size - 1;
                if (i7 >= i6) {
                    break;
                }
                int i9 = i7 + 1;
                iArr[i7] = (int) (jArr[i9] - jArr[i7]);
                jArr2[i7] = jArr3[i9] - jArr3[i7];
                i7 = i9;
            }
            int i10 = i6;
            while (i10 > 0 && jArr3[i10] >= j2) {
                i10--;
            }
            iArr[i10] = (int) ((j5 + j6) - jArr[i10]);
            jArr2[i10] = j2 - jArr3[i10];
            if (i10 < i6) {
                zzee.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i11 = i10 + 1;
                iArr = Arrays.copyOf(iArr, i11);
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                jArr3 = Arrays.copyOf(jArr3, i11);
            }
            zzaeiVar = new zzaei(iArr, jArr, jArr2, jArr3);
        }
        this.zza = zzaeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzaei zzaeiVar = this.zza;
        if (zzaeiVar != null) {
            return zzaeiVar.zzc(j2);
        }
        zzafz zzafzVar = zzafz.zza;
        return new zzafw(zzafzVar, zzafzVar);
    }
}
