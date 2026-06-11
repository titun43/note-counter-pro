package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcq {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzcp zzc;

    public final zzcq zza(Object obj, Object obj2) {
        int i5 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i6 = i5 + i5;
        if (i6 > length) {
            this.zza = Arrays.copyOf(objArr, zzci.zzc(length, i6));
        }
        zzbw.zzb(obj, obj2);
        Object[] objArr2 = this.zza;
        int i7 = this.zzb;
        int i8 = i7 + i7;
        objArr2[i8] = obj;
        objArr2[i8 + 1] = obj2;
        this.zzb = i7 + 1;
        return this;
    }

    public final zzcr zzb() {
        zzcp zzcpVar = this.zzc;
        if (zzcpVar != null) {
            throw zzcpVar.zza();
        }
        zzdp zzg = zzdp.zzg(this.zzb, this.zza, this);
        zzcp zzcpVar2 = this.zzc;
        if (zzcpVar2 == null) {
            return zzg;
        }
        throw zzcpVar2.zza();
    }
}
