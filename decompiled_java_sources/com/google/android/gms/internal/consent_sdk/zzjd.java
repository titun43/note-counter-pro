package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzjd extends zzqm implements zzrr {
    private static final zzjd zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzjd zzjdVar = new zzjd();
        zzb = zzjdVar;
        zzqm.zzz(zzjd.class, zzjdVar);
    }

    private zzjd() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006င\u0002\t᠌\u0006\n᠌\u0007", new Object[]{"zzd", "zze", zzja.zza, "zzf", "zzh", "zzi", "zzj", zziz.zza, "zzg", "zzk", zzjb.zza, "zzl", zzjc.zza});
        }
        if (i6 == 3) {
            return new zzjd();
        }
        zzje zzjeVar = null;
        if (i6 == 4) {
            return new zziy(zzjeVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
