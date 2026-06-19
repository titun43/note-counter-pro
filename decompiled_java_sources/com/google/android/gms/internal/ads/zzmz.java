package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzmz {
    private final zzs zza;
    private final SparseArray zzb;

    public zzmz(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i5 = 0; i5 < zzsVar.zzb(); i5++) {
            int zzc = zzsVar.zzc(i5);
            zzmy zzmyVar = (zzmy) sparseArray.get(zzc);
            zzmyVar.getClass();
            sparseArray2.append(zzc, zzmyVar);
        }
        this.zzb = sparseArray2;
    }

    public final zzmy zza(int i5) {
        zzmy zzmyVar = (zzmy) this.zzb.get(i5);
        zzmyVar.getClass();
        return zzmyVar;
    }

    public final boolean zzb(int i5) {
        return this.zza.zza(i5);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i5) {
        return this.zza.zzc(i5);
    }
}
