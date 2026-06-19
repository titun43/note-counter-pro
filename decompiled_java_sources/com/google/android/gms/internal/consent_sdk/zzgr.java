package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class zzgr extends zzqm implements zzrr {
    private static final zzgr zzb;
    private int zzd;
    private int zze;
    private zzgp zzf;

    static {
        zzgr zzgrVar = new zzgr();
        zzb = zzgrVar;
        zzqm.zzz(zzgr.class, zzgrVar);
    }

    private zzgr() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", zzgl.zza, "zzf"});
        }
        if (i6 == 3) {
            return new zzgr();
        }
        zzgq zzgqVar = null;
        if (i6 == 4) {
            return new zzgk(zzgqVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
