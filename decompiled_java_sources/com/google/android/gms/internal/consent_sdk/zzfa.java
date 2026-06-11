package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfa extends zzqm implements zzrr {
    private static final zzfa zzb;
    private int zzd;
    private zzew zze;
    private zzey zzf;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfa zzfaVar = new zzfa();
        zzb = zzfaVar;
        zzqm.zzz(zzfa.class, zzfaVar);
    }

    private zzfa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i6 == 3) {
            return new zzfa();
        }
        zzez zzezVar = null;
        if (i6 == 4) {
            return new zzek(zzezVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
