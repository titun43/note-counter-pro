package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzeku implements zzdmc {
    final /* synthetic */ zzekj zza;
    final /* synthetic */ zzfir zzb;

    public zzeku(zzekv zzekvVar, zzekj zzekjVar, zzfir zzfirVar) {
        this.zza = zzekjVar;
        this.zzb = zzfirVar;
        Objects.requireNonNull(zzekvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z4, Context context, zzdbs zzdbsVar) {
        try {
            zzfki zzfkiVar = (zzfki) this.zza.zzb;
            zzfkiVar.zzs(z4);
            zzfkiVar.zzz(context);
        } catch (zzfjr e4) {
            throw new zzdmb(e4.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzb;
    }
}
