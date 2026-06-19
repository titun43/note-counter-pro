package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcbu implements zzgzl {
    final /* synthetic */ j3.a zza;

    public zzcbu(zzcbz zzcbzVar, j3.a aVar) {
        this.zza = aVar;
        Objects.requireNonNull(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        List list;
        list = zzcbz.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzcbz.zzc;
        list.remove(this.zza);
    }
}
