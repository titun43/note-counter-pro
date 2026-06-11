package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
class zzch extends zzci {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzch(int i5) {
        zzbw.zza(i5, "initialCapacity");
        this.zza = new Object[i5];
        this.zzb = 0;
    }

    private final void zzd(int i5) {
        int length = this.zza.length;
        int zzc = zzci.zzc(length, this.zzb + i5);
        if (zzc > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zzc);
            this.zzc = false;
        }
    }

    public final zzch zza(Object obj) {
        obj.getClass();
        zzd(1);
        Object[] objArr = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 + 1;
        objArr[i5] = obj;
        return this;
    }

    public final void zzb(Object[] objArr, int i5) {
        zzdd.zzb(objArr, i5);
        zzd(i5);
        System.arraycopy(objArr, 0, this.zza, this.zzb, i5);
        this.zzb += i5;
    }
}
