package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfzm extends y3.c {
    long zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgaf zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzm(zzgaf zzgafVar, w3.c cVar) {
        super(cVar);
        this.zzd = zzgafVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        Object zzu;
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        zzu = this.zzd.zzu(0L, this);
        return zzu;
    }
}
