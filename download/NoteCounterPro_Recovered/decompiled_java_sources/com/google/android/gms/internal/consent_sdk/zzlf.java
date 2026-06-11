package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzlf extends zzqm implements zzrr {
    private static final zzlf zzb;
    private int zzd;
    private zzrk zzh = zzrk.zza();
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzqm.zzz(zzlf.class, zzlfVar);
    }

    private zzlf() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzle.zza});
        }
        if (i6 == 3) {
            return new zzlf();
        }
        zzli zzliVar = null;
        if (i6 == 4) {
            return new zzld(zzliVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
