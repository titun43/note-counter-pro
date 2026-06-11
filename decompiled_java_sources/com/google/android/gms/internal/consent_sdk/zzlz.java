package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzlz extends zzqm implements zzrr {
    private static final zzlz zzb;
    private int zzd;
    private zzlx zze;
    private zzej zzf;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzlz zzlzVar = new zzlz();
        zzb = zzlzVar;
        zzqm.zzz(zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new zzlz();
        }
        zzly zzlyVar = null;
        if (i6 == 4) {
            return new zzlp(zzlyVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
