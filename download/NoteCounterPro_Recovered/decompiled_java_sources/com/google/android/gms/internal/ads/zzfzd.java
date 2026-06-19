package com.google.android.gms.internal.ads;

import android.content.Context;
import g4.i;
import java.io.File;
import k0.d0;
import o4.t;
import u3.o;

/* loaded from: classes.dex */
public final class zzfzd implements zzikg {
    private final zzikp zza;

    private zzfzd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzfzd zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfzd(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        final Context zza = ((zzcmh) this.zza).zza();
        zzfzh zzc = zzcml.zzc();
        i.e(zza, "context");
        i.e(zzc, "coroutineScopeProvider");
        zzfzb zzfzbVar = zzfzb.zza;
        t zza2 = zzc.zza();
        f4.a aVar = new f4.a() { // from class: com.google.android.gms.internal.ads.zzfzc
            @Override // f4.a
            public final Object invoke() {
                Context context = zza;
                i.e(context, "<this>");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/ad_quality_data.pb");
            }
        };
        i.e(zzfzbVar, "serializer");
        i.e(zza2, "scope");
        d0 d0Var = new d0(aVar, zzfzbVar, y4.b.y(new k0.b(o.f3547g, (w3.c) null, 0)), new t2.i(18), zza2);
        zziko.zzb(d0Var);
        return d0Var;
    }
}
