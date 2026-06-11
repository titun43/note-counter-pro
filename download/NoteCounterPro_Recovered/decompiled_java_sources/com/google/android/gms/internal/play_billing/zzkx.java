package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzkx extends zzhk implements zzin {
    private static final zzkx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzkx zzkxVar = new zzkx();
        zzb = zzkxVar;
        zzhk.zzx(zzkx.class, zzkxVar);
    }

    private zzkx() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new zzkx();
        }
        zzkw zzkwVar = null;
        if (i6 == 4) {
            return new zzkv(zzkwVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
