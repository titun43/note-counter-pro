package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return this.zza.equals(((zzs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i5) {
        return this.zza.get(i5);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i5) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgrc.zzm(i5, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i5);
    }
}
