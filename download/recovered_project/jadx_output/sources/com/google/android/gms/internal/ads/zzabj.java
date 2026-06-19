package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzabj {
    private static final Comparator zza = zzabi.zza;
    private static final Comparator zzb = zzabh.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzabg[] zzd = new zzabg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzabj(int i5) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i5, float f5) {
        zzabg zzabgVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i6 = this.zzh;
        if (i6 > 0) {
            zzabg[] zzabgVarArr = this.zzd;
            int i7 = i6 - 1;
            this.zzh = i7;
            zzabgVar = zzabgVarArr[i7];
        } else {
            zzabgVar = new zzabg(null);
        }
        int i8 = this.zzf;
        this.zzf = i8 + 1;
        zzabgVar.zza = i8;
        zzabgVar.zzb = i5;
        zzabgVar.zzc = f5;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabgVar);
        this.zzg += i5;
        while (true) {
            int i9 = this.zzg;
            if (i9 <= 2000) {
                return;
            }
            int i10 = i9 - 2000;
            zzabg zzabgVar2 = (zzabg) arrayList.get(0);
            int i11 = zzabgVar2.zzb;
            if (i11 <= i10) {
                this.zzg -= i11;
                arrayList.remove(0);
                int i12 = this.zzh;
                if (i12 < 5) {
                    zzabg[] zzabgVarArr2 = this.zzd;
                    this.zzh = i12 + 1;
                    zzabgVarArr2[i12] = zzabgVar2;
                }
            } else {
                zzabgVar2.zzb = i11 - i10;
                this.zzg -= i10;
            }
        }
    }

    public final float zzc(float f5) {
        int i5 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f6 = this.zzg;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i5 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzabg) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f7 = 0.5f * f6;
            zzabg zzabgVar = (zzabg) arrayList.get(i5);
            i6 += zzabgVar.zzb;
            if (i6 >= f7) {
                return zzabgVar.zzc;
            }
            i5++;
        }
    }
}
