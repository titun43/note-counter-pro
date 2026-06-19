package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaej {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzaei zzaeiVar) {
        long[] jArr = zzaeiVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzaeiVar);
        }
    }

    public final zzaei zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzaei zzaeiVar : this.zza.values()) {
            arrayList.add(zzaeiVar.zzb);
            arrayList2.add(zzaeiVar.zzc);
            arrayList3.add(zzaeiVar.zzd);
            arrayList4.add(zzaeiVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j2 = 0;
        for (int[] iArr2 : iArr) {
            j2 += iArr2.length;
        }
        int i5 = (int) j2;
        zzgrc.zze(j2 == ((long) i5), "the total number of elements (%s) in the arrays must fit in an int", j2);
        int[] iArr3 = new int[i5];
        int i6 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i6, length);
            i6 += length;
        }
        return new zzaei(iArr3, zzgyc.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzgyc.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzgyc.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
