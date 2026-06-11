package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzev extends zzqm implements zzrr {
    private static final zzev zzb;

    static {
        zzev zzevVar = new zzev();
        zzb = zzevVar;
        zzqm.zzz(zzev.class, zzevVar);
    }

    private zzev() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        zzez zzezVar = null;
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i6 == 3) {
            return new zzev();
        }
        if (i6 == 4) {
            return new zzeu(zzezVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
