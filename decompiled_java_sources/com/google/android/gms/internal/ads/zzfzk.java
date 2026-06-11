package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfzk extends y3.c {
    Object zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgaf zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzk(zzgaf zzgafVar, w3.c cVar) {
        super(cVar);
        this.zzd = zzgafVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        Object zzs;
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        zzs = this.zzd.zzs(null, this);
        return zzs;
    }
}
