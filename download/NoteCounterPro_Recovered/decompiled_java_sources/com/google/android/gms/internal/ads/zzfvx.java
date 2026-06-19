package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.b0;
import h3.j;
import h3.n;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfvx {
    private final Context zza;
    private final Executor zzb;
    private final zzfvh zzc;
    private final zzfvw zzd;
    private h3.g zze;

    public zzfvx(Context context, Executor executor, zzfvh zzfvhVar, zzfvj zzfvjVar, zzfvt zzfvtVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfvhVar;
        this.zzd = zzfvtVar;
    }

    public static zzfvx zza(Context context, Executor executor, zzfvh zzfvhVar, zzfvj zzfvjVar) {
        final zzfvx zzfvxVar = new zzfvx(context, executor, zzfvhVar, zzfvjVar, new zzfvt());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfvv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfvx.this.zzc();
            }
        };
        Executor executor2 = zzfvxVar.zzb;
        b0.h(executor2, "Executor must not be null");
        n nVar = new n();
        executor2.execute(new c0.a(10, nVar, callable));
        nVar.f1728b.a(new j(executor2, new h3.e() { // from class: com.google.android.gms.internal.ads.zzfvu
            @Override // h3.e
            public final /* synthetic */ void onFailure(Exception exc) {
                zzfvx.this.zzd(exc);
            }
        }));
        nVar.h();
        zzfvxVar.zze = nVar;
        return zzfvxVar;
    }

    public final zzaxg zzb() {
        zzfvw zzfvwVar = this.zzd;
        h3.g gVar = this.zze;
        return !gVar.c() ? zzfvwVar.zza() : (zzaxg) gVar.b();
    }

    public final /* synthetic */ zzaxg zzc() {
        Context context = this.zza;
        return zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
