package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzhg extends zzqm implements zzrr {
    private static final zzhg zzb;

    static {
        zzhg zzhgVar = new zzhg();
        zzb = zzhgVar;
        zzqm.zzz(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        zzhk zzhkVar = null;
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0000", null);
        }
        if (i6 == 3) {
            return new zzhg();
        }
        if (i6 == 4) {
            return new zzhf(zzhkVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
