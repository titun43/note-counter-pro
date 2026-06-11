package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzkw extends zzqm implements zzrr {
    private static final zzkw zzb;
    private zzqq zzd = zzqm.zzs();

    static {
        zzkw zzkwVar = new zzkw();
        zzb = zzkwVar;
        zzqm.zzz(zzkw.class, zzkwVar);
    }

    private zzkw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", zzkv.zza});
        }
        if (i6 == 3) {
            return new zzkw();
        }
        zzkz zzkzVar = null;
        if (i6 == 4) {
            return new zzku(zzkzVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
