package com.google.android.gms.internal.ads;

import f4.p;
import t3.h;

/* loaded from: classes.dex */
final class zzfzl extends y3.g implements p {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzl(String str, w3.c cVar) {
        super(2, cVar);
        this.zzb = str;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        zzfzl zzfzlVar = new zzfzl(this.zzb, cVar);
        zzfzlVar.zza = obj;
        return zzfzlVar;
    }

    @Override // f4.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzl) create((zzfyy) obj, (w3.c) obj2)).invokeSuspend(h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        x3.a aVar = x3.a.f3712g;
        b3.g.x(obj);
        zzfza zza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zza.zzd(zza.zzb(), this.zzb);
        return zza.zza();
    }
}
