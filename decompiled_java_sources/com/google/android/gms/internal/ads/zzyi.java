package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class zzyi {
    private int zza;
    private final SparseArray zzb;
    private final zzdr zzc;

    public zzyi() {
        this(zzyh.zza);
    }

    public final Object zza(int i5) {
        SparseArray sparseArray;
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i6 = this.zza;
            if (i6 > 0 && i5 < this.zzb.keyAt(i6)) {
                this.zza--;
            }
        }
        while (true) {
            int i7 = this.zza;
            sparseArray = this.zzb;
            if (i7 >= sparseArray.size() - 1 || i5 < sparseArray.keyAt(this.zza + 1)) {
                break;
            }
            this.zza++;
        }
        return sparseArray.valueAt(this.zza);
    }

    public final void zzb(int i5, Object obj) {
        if (this.zza == -1) {
            zzgrc.zzi(this.zzb.size() == 0);
            this.zza = 0;
        }
        SparseArray sparseArray = this.zzb;
        if (sparseArray.size() > 0) {
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            zzgrc.zza(i5 >= keyAt);
            if (keyAt == i5) {
                this.zzc.zza(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i5, obj);
    }

    public final Object zzc() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzd(int i5) {
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i6 >= sparseArray.size() - 1) {
                return;
            }
            int i7 = i6 + 1;
            if (i5 < sparseArray.keyAt(i7)) {
                return;
            }
            this.zzc.zza(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = this.zza;
            if (i8 > 0) {
                this.zza = i8 - 1;
            }
            i6 = i7;
        }
    }

    public final void zze() {
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.zzb;
            if (i5 >= sparseArray.size()) {
                this.zza = -1;
                sparseArray.clear();
                return;
            } else {
                this.zzc.zza(sparseArray.valueAt(i5));
                i5++;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzyi(zzdr zzdrVar) {
        this.zzb = new SparseArray();
        this.zzc = zzdrVar;
        this.zza = -1;
    }
}
