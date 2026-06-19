package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzmi extends zzqm implements zzrr {
    private static final zzmi zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzmi zzmiVar = new zzmi();
        zzb = zzmiVar;
        zzqm.zzz(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", zzmh.zza, "zzf", zzmj.zza, "zzg", "zzh"});
        }
        if (i6 == 3) {
            return new zzmi();
        }
        zzmw zzmwVar = null;
        if (i6 == 4) {
            return new zzmg(zzmwVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
