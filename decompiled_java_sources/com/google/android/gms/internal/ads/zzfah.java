package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfah implements zzfax {
    private final zzccq zza;
    private final zzgzy zzb;
    private final Context zzc;

    public zzfah(zzccq zzccqVar, zzgzy zzgzyVar, Context context) {
        this.zza = zzccqVar;
        this.zzb = zzgzyVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfah.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 34;
    }

    public final /* synthetic */ zzfai zzc() {
        zzccq zzccqVar = this.zza;
        Context context = this.zzc;
        if (!zzccqVar.zza(context)) {
            return new zzfai(null, null, null, null, null);
        }
        String zzh = zzccqVar.zzh(context);
        String str = zzh == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzh;
        String zzi = zzccqVar.zzi(context);
        String str2 = zzi == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzi;
        String zzj = zzccqVar.zzj(context);
        String str3 = zzj == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzj;
        String str4 = true != zzccqVar.zza(context) ? null : "fa";
        return new zzfai(str, str2, str3, str4 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzaR) : null);
    }
}
