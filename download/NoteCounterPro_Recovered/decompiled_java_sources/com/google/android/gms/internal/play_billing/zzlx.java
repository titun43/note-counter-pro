package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzlx extends zzhk implements zzin {
    private static final zzlx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzhk.zzx(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    public static /* synthetic */ void zzC(zzlx zzlxVar, boolean z4) {
        zzlxVar.zzd |= 2;
        zzlxVar.zzf = true;
    }

    public static zzlv zzc() {
        return (zzlv) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i6 == 3) {
            return new zzlx();
        }
        zzlw zzlwVar = null;
        if (i6 == 4) {
            return new zzlv(zzlwVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
