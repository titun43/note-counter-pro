package com.google.android.gms.internal.play_billing;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzln extends zzhk implements zzin {
    private static final zzln zzb;
    private int zzd;
    private int zzf;
    private zzho zze = zzhk.zzs();
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzln zzlnVar = new zzln();
        zzb = zzlnVar;
        zzhk.zzx(zzln.class, zzlnVar);
    }

    private zzln() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new zzln();
        }
        zzlm zzlmVar = null;
        if (i6 == 4) {
            return new zzll(zzlmVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
