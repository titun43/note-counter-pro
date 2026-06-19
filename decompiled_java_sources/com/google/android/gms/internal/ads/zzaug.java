package com.google.android.gms.internal.ads;

import java.util.Optional;

/* loaded from: classes.dex */
public final class zzaug {
    public static zzavg zza(final long j2) {
        return zzavg.zzf(new zzauy() { // from class: com.google.android.gms.internal.ads.zzauf
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzavb) obj).zzb.zzb(zzavg.zzb(j2));
                    return Optional.empty();
                } catch (zzauw unused) {
                    return Optional.of(zzatq.zza);
                }
            }
        });
    }

    public static int zzb(long j2, zzavf zzavfVar, boolean z4) {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j5 = jArr[0];
        long j6 = jArr[1];
        long j7 = jArr[2];
        long j8 = jArr[3];
        long j9 = jArr[4];
        long j10 = jArr[5];
        long j11 = jArr[6];
        long j12 = jArr[7];
        long j13 = (((((~j5) & j6) | j7) + ((j5 & j8) | j9)) - j10) + j11;
        long j14 = j12 % 1629190168;
        int i5 = ((((~1725868784) & 388366538) | 739792167) + ((1725868784 & 1395525853) | 1087913783)) - 2073845026;
        int i6 = 1550046828 % 184366026;
        int i7 = ((((~84870791) & 719462960) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1437974767;
        int i8 = 2023762697 % 959200313;
        int i9 = ((((~294151249) & 1465191424) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1330100008;
        int i10 = 1583887958 % 619175679;
        long j15 = z4 ? (j2 >> ((((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - 2090967727) ^ (2014126950 % 228698447))) ^ (j2 + j2) : j2;
        int i11 = 1;
        while (true) {
            long j16 = j13 ^ j14;
            long j17 = j15 >>> (i7 ^ i8);
            boolean z5 = j17 != 0 || i11 < 0;
            int i12 = (int) (j15 & j16);
            if (z5) {
                int i13 = i5 ^ i6;
                i12 = ((i12 | (i9 ^ i10)) << i13) >> i13;
            }
            zzavfVar.zza((byte) i12);
            if (!z5) {
                return i11;
            }
            i11++;
            j15 = j17;
        }
    }
}
