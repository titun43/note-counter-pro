package com.google.android.gms.internal.ads;

import f4.p;
import g4.i;
import t3.h;

/* loaded from: classes.dex */
final class zzfzs extends y3.g implements p {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfyu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzs(zzfyu zzfyuVar, w3.c cVar) {
        super(2, cVar);
        this.zzb = zzfyuVar;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        zzfzs zzfzsVar = new zzfzs(this.zzb, cVar);
        zzfzsVar.zza = obj;
        return zzfzsVar;
    }

    @Override // f4.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzs) create((zzfyy) obj, (w3.c) obj2)).invokeSuspend(h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        x3.a aVar = x3.a.f3712g;
        b3.g.x(obj);
        zzfza zza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zziev zzb = zza.zzb();
        zzfyu zzfyuVar = this.zzb;
        String zza2 = zzfyuVar.zza();
        i.d(zza2, "getGwsQueryId(...)");
        zza.zzc(zzb, zza2, zzfyuVar);
        return zza.zza();
    }
}
