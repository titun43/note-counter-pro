package com.google.android.gms.internal.play_billing;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzlf extends zzhk implements zzin {
    private static final zzlf zzb;
    private int zzd;
    private int zze;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzlf zzlfVar = new zzlf();
        zzb = zzlfVar;
        zzhk.zzx(zzlf.class, zzlfVar);
    }

    private zzlf() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzle.zza, "zzf"});
        }
        if (i6 == 3) {
            return new zzlf();
        }
        zzlg zzlgVar = null;
        if (i6 == 4) {
            return new zzld(zzlgVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
