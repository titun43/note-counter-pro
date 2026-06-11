package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfzz extends y3.c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzgaf zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzz(zzgaf zzgafVar, w3.c cVar) {
        super(cVar);
        this.zzc = zzgafVar;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzh(this);
    }
}
