package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
final class zzgar extends zzgyh {
    Object zza;

    public zzgar(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final boolean zzb(Throwable th) {
        return super.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : obj.toString();
    }
}
