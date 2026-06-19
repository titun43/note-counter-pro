package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzte extends zzqm implements zzrr {
    private static final zzte zzb;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zze;
    private int zzf;

    static {
        zzte zzteVar = new zzte();
        zzb = zzteVar;
        zzqm.zzz(zzte.class, zzteVar);
    }

    private zzte() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new zzte();
        }
        zztd zztdVar = null;
        if (i6 == 4) {
            return new zztc(zztdVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
