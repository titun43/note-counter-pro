package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zznx extends zzqm implements zzrr {
    private static final zznx zzb;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zznx zznxVar = new zznx();
        zzb = zznxVar;
        zzqm.zzz(zznx.class, zznxVar);
    }

    private zznx() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new zznx();
        }
        zzog zzogVar = null;
        if (i6 == 4) {
            return new zznw(zzogVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
