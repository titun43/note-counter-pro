package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzefu {
    private final zzcma zza;
    private final Context zzb;
    private final Executor zzc;

    public zzefu(zzcma zzcmaVar, Context context, Executor executor) {
        this.zza = zzcmaVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzefu.this.zzb();
            }
        });
    }

    public final /* synthetic */ void zzb() {
        zzefw zzh = this.zza.zzh();
        zzh.zzb(this.zzb);
        zzh.zza().zza().zza();
    }
}
