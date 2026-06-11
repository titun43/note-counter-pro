package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzkm extends zzqm implements zzrr {
    private static final zzkm zzb;
    private int zzd;
    private boolean zze;

    static {
        zzkm zzkmVar = new zzkm();
        zzb = zzkmVar;
        zzqm.zzz(zzkm.class, zzkmVar);
    }

    private zzkm() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i6 == 3) {
            return new zzkm();
        }
        zzkz zzkzVar = null;
        if (i6 == 4) {
            return new zzkl(zzkzVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
