package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzaoa implements zzama {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzaoa(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzanq zzanqVar = (zzanq) list.get(i5);
            long[] jArr = this.zzb;
            int i6 = i5 + i5;
            jArr[i6] = zzanqVar.zzb;
            jArr[i6 + 1] = zzanqVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final long zzb(int i5) {
        zzgrc.zza(i5 >= 0);
        long[] jArr = this.zzc;
        zzgrc.zza(i5 < jArr.length);
        return jArr[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzama
    public final List zzc(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            List list = this.zza;
            if (i5 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i6 = i5 + i5;
            if (jArr[i6] <= j2 && j2 < jArr[i6 + 1]) {
                zzanq zzanqVar = (zzanq) list.get(i5);
                zzcx zzcxVar = zzanqVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzanqVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i5++;
        }
        Collections.sort(arrayList2, zzanz.zza);
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            zzcw zza = ((zzanq) arrayList2.get(i7)).zza.zza();
            zza.zzf((-1) - i7, 1);
            arrayList.add(zza.zzr());
        }
        return arrayList;
    }
}
