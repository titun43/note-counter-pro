package com.google.android.gms.internal.ads;

import f4.p;
import g4.i;
import t3.h;

/* loaded from: classes.dex */
final class zzfzo extends y3.g implements p {
    public zzfzo(w3.c cVar) {
        super(2, cVar);
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        return new zzfzo(cVar);
    }

    @Override // f4.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzo) create((zzfyy) obj, (w3.c) obj2)).invokeSuspend(h.f3400a);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        x3.a aVar = x3.a.f3712g;
        b3.g.x(obj);
        zzfyy zzd = zzfyy.zzd();
        i.d(zzd, "getDefaultInstance(...)");
        return zzd;
    }
}
