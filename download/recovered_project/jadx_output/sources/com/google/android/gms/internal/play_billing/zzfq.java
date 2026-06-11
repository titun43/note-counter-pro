package com.google.android.gms.internal.play_billing;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfq extends zzhk implements zzin {
    private static final zzfq zzb;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfq zzfqVar = new zzfq();
        zzb = zzfqVar;
        zzhk.zzx(zzfq.class, zzfqVar);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return (zzfp) zzb.zzm();
    }

    public static /* synthetic */ void zzc(zzfq zzfqVar, String str) {
        zzfqVar.zzd |= 1;
        zzfqVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new zzfq();
        }
        zzfr zzfrVar = null;
        if (i6 == 4) {
            return new zzfp(zzfrVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
