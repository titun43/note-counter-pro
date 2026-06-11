package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgye extends zzgyg {
    public zzgye(j3.a aVar, Class cls, zzgyw zzgywVar) {
        super(aVar, cls, zzgywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* synthetic */ void zze(Object obj) {
        zzk((j3.a) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyg
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) {
        zzgyw zzgywVar = (zzgyw) obj;
        j3.a zza = zzgywVar.zza(th);
        zzgrc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return zza;
    }
}
