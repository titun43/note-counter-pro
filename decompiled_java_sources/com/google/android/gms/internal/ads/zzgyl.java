package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgyl extends zzgyn {
    public zzgyl(j3.a aVar, zzgyw zzgywVar) {
        super(aVar, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* synthetic */ void zze(Object obj) {
        zzk((j3.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) {
        zzgyw zzgywVar = (zzgyw) obj;
        j3.a zza = zzgywVar.zza(obj2);
        zzgrc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return zza;
    }
}
