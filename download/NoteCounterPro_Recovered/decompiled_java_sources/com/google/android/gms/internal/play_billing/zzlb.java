package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzlb extends zzhk implements zzin {
    private static final zzlb zzb;
    private int zzd;
    private int zze;

    static {
        zzlb zzlbVar = new zzlb();
        zzb = zzlbVar;
        zzhk.zzx(zzlb.class, zzlbVar);
    }

    private zzlb() {
    }

    public static /* synthetic */ void zzC(zzlb zzlbVar, int i5) {
        zzlbVar.zze = i5 - 1;
        zzlbVar.zzd |= 1;
    }

    public static zzky zzc() {
        return (zzky) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkz.zza});
        }
        if (i6 == 3) {
            return new zzlb();
        }
        zzla zzlaVar = null;
        if (i6 == 4) {
            return new zzky(zzlaVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
