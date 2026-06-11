package com.google.android.gms.internal.consent_sdk;

import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzrj {
    private final zzri zza;

    private zzrj(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        this.zza = new zzri(zzszVar, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzszVar2, obj2);
    }

    public static int zzb(zzri zzriVar, Object obj, Object obj2) {
        return zzqf.zza(zzriVar.zza, 1, obj) + zzqf.zza(zzriVar.zzb, 2, obj2);
    }

    public static zzrj zzd(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        return new zzrj(zzszVar, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzszVar2, obj2);
    }

    public final int zza(int i5, Object obj, Object obj2) {
        zzri zzriVar = this.zza;
        int zzC = zzpv.zzC(i5 << 3);
        int zzb = zzb(zzriVar, obj, obj2);
        return u.v(zzb, zzb, zzC);
    }

    public final zzri zzc() {
        return this.zza;
    }
}
