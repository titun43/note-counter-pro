package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfbd implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzfbd(Context context, zzgzy zzgzyVar) {
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return ((Boolean) zzbiw.zzb.zze()).booleanValue() ? this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbd.this.zzc();
            }
        }) : zzgzo.zza(new zzfbe(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzfbe zzc() {
        Context context = this.zza;
        return new zzfbe(zzbgp.zzc(context), zzbgp.zzd(context));
    }
}
