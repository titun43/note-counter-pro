package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.api.j;
import f2.q;
import h3.b;
import h3.g;
import h3.i;
import h3.n;
import q2.a;
import t2.f;

/* loaded from: classes.dex */
public final class zzr implements a {
    private final a zza;
    private final a zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, f.f3374b);
        this.zzb = zzl.zzc(context);
    }

    public static g zza(zzr zzrVar, g gVar) {
        if (!gVar.c() && !((n) gVar).f1730d) {
            Exception a5 = gVar.a();
            if (a5 instanceof j) {
                int i5 = ((j) a5).f1032g.f929g;
                if (i5 == 43001 || i5 == 43002 || i5 == 43003 || i5 == 17) {
                    return zzrVar.zzb.getAppSetIdInfo();
                }
                if (i5 == 43000) {
                    Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    n nVar = new n();
                    nVar.d(exc);
                    return nVar;
                }
                if (i5 == 15) {
                    Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
                    n nVar2 = new n();
                    nVar2.d(exc2);
                    return nVar2;
                }
            }
        }
        return gVar;
    }

    @Override // q2.a
    public final g getAppSetIdInfo() {
        g appSetIdInfo = this.zza.getAppSetIdInfo();
        b bVar = new b() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // h3.b
            public final Object then(g gVar) {
                return zzr.zza(zzr.this, gVar);
            }
        };
        n nVar = (n) appSetIdInfo;
        nVar.getClass();
        q qVar = i.f1714a;
        n nVar2 = new n();
        nVar.f1728b.a(new h3.j(qVar, bVar, nVar2, 1));
        nVar.h();
        return nVar2;
    }
}
