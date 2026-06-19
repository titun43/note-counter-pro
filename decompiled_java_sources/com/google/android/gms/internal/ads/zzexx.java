package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzexx implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzexx(zzgzy zzgzyVar, Context context) {
        this.zzb = zzgzyVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzexx.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 57;
    }

    public final /* synthetic */ zzexy zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzexy(com.google.android.gms.ads.internal.util.zzs.zzw(this.zza));
    }
}
