package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzyu extends zzyw {
    public zzyu(zzbg zzbgVar, int[] iArr, int i5, zzaas zzaasVar, long j2, long j5, long j6, int i6, int i7, float f5, float f6, List list, zzdn zzdnVar) {
        super(zzbgVar, iArr, 0);
        zzguf.zzq(list);
    }

    public static /* synthetic */ zzguf zzd(zzaab[] zzaabVarArr) {
        int i5;
        int i6;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i5 = 1;
            if (i8 >= 2) {
                break;
            }
            zzaab zzaabVar = zzaabVarArr[i8];
            if (zzaabVar == null || zzaabVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i9 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                zzgucVar.zzf(new zzys(0L, 0L));
                arrayList.add(zzgucVar);
            }
            i8++;
        }
        long[][] jArr2 = new long[2][];
        for (int i10 = 0; i10 < 2; i10++) {
            zzaab zzaabVar2 = zzaabVarArr[i10];
            if (zzaabVar2 == null) {
                jArr2[i10] = new long[0];
            } else {
                int[] iArr = zzaabVar2.zzb;
                jArr2[i10] = new long[iArr.length];
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    long j2 = zzaabVar2.zza.zza(iArr[i11]).zzj;
                    long[] jArr3 = jArr2[i10];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr3[i11] = j2;
                }
                Arrays.sort(jArr2[i10]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i12 = 0; i12 < 2; i12++) {
            long[] jArr5 = jArr2[i12];
            jArr4[i12] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgva zza = zzgvu.zzc(zzgvz.zzb()).zzb(2).zza();
        int i13 = 0;
        while (i13 < 2) {
            int length = jArr2[i13].length;
            if (length <= i5) {
                i6 = i7;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i14 = i7;
                while (true) {
                    long[] jArr6 = jArr2[i13];
                    double d5 = 0.0d;
                    if (i14 >= jArr6.length) {
                        break;
                    }
                    int i15 = i7;
                    long[][] jArr7 = jArr2;
                    long j5 = jArr6[i14];
                    if (j5 != -1) {
                        d5 = Math.log(j5);
                    }
                    dArr[i14] = d5;
                    i14++;
                    i7 = i15;
                    jArr2 = jArr7;
                }
                i6 = i7;
                jArr = jArr2;
                int i16 = length - 1;
                double d6 = dArr[i16] - dArr[i6];
                int i17 = i6;
                while (i17 < i16) {
                    double d7 = dArr[i17];
                    i17++;
                    zza.zze(Double.valueOf(d6 == 0.0d ? 1.0d : (((d7 + dArr[i17]) * 0.5d) - dArr[i6]) / d6), Integer.valueOf(i13));
                    i5 = i5;
                }
            }
            i13++;
            i7 = i6;
            jArr2 = jArr;
            i5 = i5;
        }
        int i18 = i7;
        long[][] jArr8 = jArr2;
        zzguf zzq = zzguf.zzq(zza.zzt());
        for (int i19 = i18; i19 < zzq.size(); i19++) {
            int intValue = ((Integer) zzq.get(i19)).intValue();
            int i20 = iArr2[intValue] + 1;
            iArr2[intValue] = i20;
            jArr4[intValue] = jArr8[intValue][i20];
            zzi(arrayList, jArr4);
        }
        for (int i21 = i18; i21 < 2; i21++) {
            if (arrayList.get(i21) != null) {
                long j6 = jArr4[i21];
                jArr4[i21] = j6 + j6;
            }
        }
        zzi(arrayList, jArr4);
        zzguc zzgucVar2 = new zzguc();
        while (i18 < arrayList.size()) {
            zzguc zzgucVar3 = (zzguc) arrayList.get(i18);
            zzgucVar2.zzf(zzgucVar3 == null ? zzguf.zzi() : zzgucVar3.zzi());
            i18++;
        }
        return zzgucVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j2 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            j2 += jArr[i5];
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzguc zzgucVar = (zzguc) list.get(i6);
            if (zzgucVar != null) {
                zzgucVar.zzf(new zzys(j2, jArr[i6]));
            }
        }
    }
}
