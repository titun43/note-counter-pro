package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzeaa implements zzgzl {
    final /* synthetic */ zzeak zza;

    public zzeaa(zzeak zzeakVar) {
        Objects.requireNonNull(zzeakVar);
        this.zza = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        synchronized (this) {
            zzeak zzeakVar = this.zza;
            zzeakVar.zzn(true);
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzeakVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (SystemClock.elapsedRealtime() - zzeakVar.zzo()));
            zzeakVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzeak zzeakVar = this.zza;
            zzeakVar.zzn(true);
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzeakVar.zzm("com.google.android.gms.ads.MobileAds", true, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (int) (SystemClock.elapsedRealtime() - zzeakVar.zzo()));
            zzeakVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeaa.this.zza.zzl(str);
                }
            });
        }
    }
}
