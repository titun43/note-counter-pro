package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import h3.g;
import h3.n;
import q2.a;
import q2.c;
import t2.d;
import t2.f;

/* loaded from: classes.dex */
public final class zzp extends m implements a {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;
    private final Context zzd;
    private final f zze;

    static {
        h hVar = new h();
        zza = hVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("AppSet.API", zznVar, hVar);
    }

    public zzp(Context context, f fVar) {
        super(context, zzc, e.f932a, l.f1033c);
        this.zzd = context;
        this.zze = fVar;
    }

    @Override // q2.a
    public final g getAppSetIdInfo() {
        if (this.zze.c(this.zzd, 212800000) != 0) {
            j jVar = new j(new Status(17, null, null, null));
            n nVar = new n();
            nVar.d(jVar);
            return nVar;
        }
        t tVar = new t();
        tVar.f1021b = true;
        tVar.f1023d = 0;
        tVar.f1022c = new d[]{q2.e.f3088a};
        tVar.f1020a = new q() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new c(null, null), new zzo(zzp.this, (h3.h) obj2));
            }
        };
        tVar.f1021b = false;
        tVar.f1023d = 27601;
        return doRead(new k0(tVar, tVar.f1022c, tVar.f1021b, tVar.f1023d));
    }
}
