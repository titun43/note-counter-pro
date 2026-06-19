package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaak {
    public final int zza;
    public final zzmo[] zzb;
    public final zzaac[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzaak(zzmo[] zzmoVarArr, zzaac[] zzaacVarArr, zzbn zzbnVar, Object obj) {
        int length = zzmoVarArr.length;
        zzgrc.zza(length == zzaacVarArr.length);
        this.zzb = zzmoVarArr;
        this.zzc = (zzaac[]) zzaacVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i5) {
        return this.zzb[i5] != null;
    }

    public final boolean zzb(zzaak zzaakVar, int i5) {
        return zzaakVar != null && Objects.equals(this.zzb[i5], zzaakVar.zzb[i5]) && Objects.equals(this.zzc[i5], zzaakVar.zzc[i5]);
    }
}
