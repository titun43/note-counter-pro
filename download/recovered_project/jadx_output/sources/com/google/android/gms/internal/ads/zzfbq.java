package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
final /* synthetic */ class zzfbq implements zzgyw {
    static final /* synthetic */ zzfbq zza = new zzfbq();

    private /* synthetic */ zzfbq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final j3.a zza(Object obj) {
        x0.b bVar = (x0.b) obj;
        if (bVar == null) {
            return zzgzo.zza(new zzfbs(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 1, null));
        }
        zzifk zzc = zzifl.zzc();
        for (x0.c cVar : bVar.f3694a) {
            zzifi zzc2 = zzifj.zzc();
            zzc2.zza(cVar.f3697c);
            zzc2.zzb(cVar.f3696b);
            zzc2.zzc(cVar.f3695a);
            zzc.zza((zzifj) zzc2.zzbu());
        }
        return zzgzo.zza(new zzfbs(Base64.encodeToString(((zzifl) zzc.zzbu()).zzaN(), 1), 1, null));
    }
}
