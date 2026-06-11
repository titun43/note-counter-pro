package com.google.android.gms.internal.ads;

import f4.p;
import o4.t;
import t3.h;

/* loaded from: classes.dex */
final class zzgac extends y3.g implements p {
    int zza;
    final /* synthetic */ zzgaf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgac(zzgaf zzgafVar, w3.c cVar) {
        super(2, cVar);
        this.zzb = zzgafVar;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        return new zzgac(this.zzb, cVar);
    }

    @Override // f4.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgac) create((t) obj, (w3.c) obj2)).invokeSuspend(h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        x3.a aVar = x3.a.f3712g;
        int i5 = this.zza;
        b3.g.x(obj);
        if (i5 == 0) {
            zzgaf zzgafVar = this.zzb;
            this.zza = 1;
            if (zzgafVar.zzm(this) == aVar) {
                return aVar;
            }
        }
        return h.f3400a;
    }
}
