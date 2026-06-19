package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzgnk implements zzgnb, zzgdd {
    private final Context zza;
    private final zzgoe zzb;
    private final zzgzy zzc;
    private final zzgbf zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private j3.a zzf = zzgzo.zza(null);

    public zzgnk(Context context, zzgoe zzgoeVar, zzgzy zzgzyVar, zzgbf zzgbfVar) {
        this.zza = context;
        this.zzb = zzgoeVar;
        this.zzc = zzgzyVar;
        this.zzd = zzgbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final j3.a zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zzc()) ? zzgzo.zzb() : this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgnk.this.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    public final /* synthetic */ void zze() {
        j3.a submit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzgni
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgnk.this.zzf();
            }
        });
        this.zzb.zze(53, submit);
        this.zzf = submit;
    }

    public final /* synthetic */ zzaxg zzf() {
        Context context = this.zza;
        try {
            return zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}
