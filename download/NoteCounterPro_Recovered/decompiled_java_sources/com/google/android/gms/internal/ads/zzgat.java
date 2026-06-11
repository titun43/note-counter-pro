package com.google.android.gms.internal.ads;

import h3.j;
import h3.n;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzgat {
    public static j3.a zza(h3.g gVar, h3.a aVar) {
        final zzgar zzgarVar = new zzgar(gVar, null);
        Executor zza = zzhaf.zza();
        h3.d dVar = new h3.d() { // from class: com.google.android.gms.internal.ads.zzgas
            @Override // h3.d
            public final void onComplete(h3.g gVar2) {
                zzgar zzgarVar2 = zzgar.this;
                if (((n) gVar2).f1730d) {
                    zzgarVar2.cancel(false);
                    return;
                }
                if (gVar2.c()) {
                    zzgarVar2.zza(gVar2.b());
                    return;
                }
                Exception a5 = gVar2.a();
                if (a5 == null) {
                    throw new IllegalStateException();
                }
                zzgarVar2.zzb(a5);
            }
        };
        n nVar = (n) gVar;
        nVar.getClass();
        nVar.f1728b.a(new j(zza, dVar));
        nVar.h();
        return zzgarVar;
    }
}
