package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class zzfl extends zzhk implements zzin {
    private static final zzfl zzb;
    private int zzd;
    private zzfq zze;
    private zzfq zzf;
    private int zzg;

    static {
        zzfl zzflVar = new zzfl();
        zzb = zzflVar;
        zzhk.zzx(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static zzfk zza() {
        return (zzfk) zzb.zzm();
    }

    public static /* synthetic */ void zzc(zzfl zzflVar, zzfq zzfqVar) {
        zzfqVar.getClass();
        zzflVar.zze = zzfqVar;
        zzflVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzft.zza()});
        }
        if (i6 == 3) {
            return new zzfl();
        }
        zzfo zzfoVar = null;
        if (i6 == 4) {
            return new zzfk(zzfoVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
