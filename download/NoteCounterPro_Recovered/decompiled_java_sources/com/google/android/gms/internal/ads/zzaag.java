package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzaag extends zzaaj {
    public abstract Pair zzh(zzaaf zzaafVar, int[][][] iArr, int[] iArr2, zzwk zzwkVar, zzbf zzbfVar);

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzp(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) {
        List[] listArr;
        boolean z4;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = zzynVar.zzb;
            zzbgVarArr[i5] = new zzbg[i6];
            iArr3[i5] = new int[i6][];
        }
        int i7 = 2;
        int[] iArr4 = new int[2];
        for (int i8 = 0; i8 < 2; i8++) {
            iArr4[i8] = zzmnVarArr[i8].zzu();
        }
        int i9 = 0;
        while (i9 < zzynVar.zzb) {
            zzbg zza = zzynVar.zza(i9);
            int i10 = zza.zzc;
            int i11 = i7;
            int i12 = 0;
            int i13 = 0;
            boolean z5 = true;
            while (i12 < i7) {
                zzmn zzmnVar = zzmnVarArr[i12];
                int i14 = 0;
                for (int i15 = 0; i15 < zza.zza; i15++) {
                    i14 = Math.max(i14, zzmnVar.zzab(zza.zza(i15)) & 7);
                }
                boolean z6 = iArr2[i12] == 0;
                if (i14 > i13) {
                    z5 = z6;
                    i11 = i12;
                    i13 = i14;
                } else if (i14 == i13 && i10 == 5 && !z5 && z6) {
                    i11 = i12;
                    i13 = i14;
                    z5 = true;
                }
                i12++;
                i7 = 2;
            }
            if (i11 == i7) {
                iArr = new int[zza.zza];
            } else {
                zzmn zzmnVar2 = zzmnVarArr[i11];
                int i16 = zza.zza;
                int[] iArr5 = new int[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    iArr5[i17] = zzmnVar2.zzab(zza.zza(i17));
                }
                iArr = iArr5;
            }
            int i18 = iArr2[i11];
            zzbgVarArr[i11][i18] = zza;
            iArr3[i11][i18] = iArr;
            iArr2[i11] = i18 + 1;
            i9++;
            i7 = 2;
        }
        zzyn[] zzynVarArr = new zzyn[i7];
        String[] strArr = new String[i7];
        int[] iArr6 = new int[i7];
        int i19 = 0;
        while (i19 < i7) {
            int i20 = iArr2[i19];
            zzynVarArr[i19] = new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i19], i20));
            iArr3[i19] = (int[][]) zzfj.zzb(iArr3[i19], i20);
            strArr[i19] = zzmnVarArr[i19].zzS();
            iArr6[i19] = zzmnVarArr[i19].zza();
            i19++;
            i7 = 2;
        }
        int i21 = i7;
        zzaaf zzaafVar = new zzaaf(strArr, iArr6, zzynVarArr, iArr4, iArr3, new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i21], iArr2[i21])));
        Pair zzh = zzh(zzaafVar, iArr3, iArr4, zzwkVar, zzbfVar);
        zzaah[] zzaahVarArr = (zzaah[]) zzh.second;
        List[] listArr2 = new List[zzaahVarArr.length];
        for (int i22 = 0; i22 < zzaahVarArr.length; i22++) {
            zzaah zzaahVar = zzaahVarArr[i22];
            listArr2[i22] = zzaahVar != null ? zzguf.zzj(zzaahVar) : zzguf.zzi();
        }
        zzguc zzgucVar = new zzguc();
        for (int i23 = 0; i23 < 2; i23++) {
            zzyn zzb = zzaafVar.zzb(i23);
            List list = listArr2[i23];
            int i24 = 0;
            while (i24 < zzb.zzb) {
                zzbg zza2 = zzb.zza(i24);
                boolean z7 = zzaafVar.zzd(i23, i24, false) != 0;
                int i25 = zza2.zza;
                int[] iArr7 = new int[i25];
                boolean[] zArr = new boolean[i25];
                int i26 = 0;
                while (i26 < i25) {
                    iArr7[i26] = zzaafVar.zzc(i23, i24, i26) & 7;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= list.size()) {
                            listArr = listArr2;
                            z4 = false;
                            break;
                        }
                        zzaah zzaahVar2 = (zzaah) list.get(i27);
                        listArr = listArr2;
                        if (zzaahVar2.zza().equals(zza2) && zzaahVar2.zzg(i26) != -1) {
                            z4 = true;
                            break;
                        }
                        i27++;
                        listArr2 = listArr;
                    }
                    zArr[i26] = z4;
                    i26++;
                    listArr2 = listArr;
                }
                zzgucVar.zzf(new zzbm(zza2, z7, iArr7, zArr));
                i24++;
                listArr2 = listArr2;
            }
        }
        zzyn zze = zzaafVar.zze();
        for (int i28 = 0; i28 < zze.zzb; i28++) {
            zzbg zza3 = zze.zza(i28);
            int i29 = zza3.zza;
            int[] iArr8 = new int[i29];
            Arrays.fill(iArr8, 0);
            zzgucVar.zzf(new zzbm(zza3, false, iArr8, new boolean[i29]));
        }
        return new zzaak((zzmo[]) zzh.first, (zzaac[]) zzh.second, new zzbn(zzgucVar.zzi()), zzaafVar);
    }
}
