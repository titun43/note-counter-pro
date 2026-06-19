package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzfr extends zzqm implements zzrr {
    private static final zzfr zzb;
    private int zzd;
    private zzfy zze;
    private zzfv zzf;

    static {
        zzfr zzfrVar = new zzfr();
        zzb = zzfrVar;
        zzqm.zzz(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new zzfr();
        }
        zzfq zzfqVar = null;
        if (i6 == 4) {
            return new zzfp(zzfqVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
