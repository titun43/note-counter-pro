package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzio {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzio(String str, zzv zzvVar, zzv zzvVar2, int i5, int i6) {
        boolean z4;
        if (i5 != 0) {
            z4 = false;
            i6 = i6 == 0 ? 0 : i6;
            zzgrc.zza(z4);
            zzgrc.zza(true ^ TextUtils.isEmpty(str));
            this.zza = str;
            this.zzb = zzvVar;
            zzvVar2.getClass();
            this.zzc = zzvVar2;
            this.zzd = i5;
            this.zze = i6;
        }
        z4 = true;
        zzgrc.zza(z4);
        zzgrc.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i5;
        this.zze = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzio.class == obj.getClass()) {
            zzio zzioVar = (zzio) obj;
            if (this.zzd == zzioVar.zzd && this.zze == zzioVar.zze && this.zza.equals(zzioVar.zza) && this.zzb.equals(zzioVar.zzb) && this.zzc.equals(zzioVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzd + 527;
        String str = this.zza;
        int hashCode = str.hashCode() + (((i5 * 31) + this.zze) * 31);
        int hashCode2 = this.zzb.hashCode() + (hashCode * 31);
        return this.zzc.hashCode() + (hashCode2 * 31);
    }
}
