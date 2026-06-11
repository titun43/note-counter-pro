package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbf(zzbe zzbeVar, byte[] bArr) {
        int size = zzbeVar.zzd().size();
        this.zza = (String[]) zzbeVar.zzc().toArray(new String[size]);
        this.zzb = zzc(zzbeVar.zzd());
        this.zzc = zzc(zzbeVar.zze());
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i5 = 0; i5 < size; i5++) {
            dArr[i5] = ((Double) list.get(i5)).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d5) {
        this.zze++;
        int i5 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i5 >= dArr.length) {
                return;
            }
            double d6 = dArr[i5];
            if (d6 <= d5 && d5 < this.zzb[i5]) {
                int[] iArr = this.zzd;
                iArr[i5] = iArr[i5] + 1;
            }
            if (d5 < d6) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final List zzb() {
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i5 = 0; i5 < strArr.length; i5++) {
            String str = strArr[i5];
            double[] dArr = this.zzc;
            double[] dArr2 = this.zzb;
            int[] iArr = this.zzd;
            double d5 = dArr[i5];
            double d6 = dArr2[i5];
            int i6 = iArr[i5];
            arrayList.add(new zzbd(str, d5, d6, i6 / this.zze, i6));
        }
        return arrayList;
    }
}
