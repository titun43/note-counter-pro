package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzlh extends zzhk implements zzin {
    private static final zzlh zzb;
    private zzho zzd = zzhk.zzs();

    static {
        zzlh zzlhVar = new zzlh();
        zzb = zzlhVar;
        zzhk.zzx(zzlh.class, zzlhVar);
    }

    private zzlh() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzlf.class});
        }
        if (i6 == 3) {
            return new zzlh();
        }
        zzlg zzlgVar = null;
        if (i6 == 4) {
            return new zzlc(zzlgVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
