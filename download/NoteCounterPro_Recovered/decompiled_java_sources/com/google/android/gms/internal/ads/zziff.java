package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zziff extends zzibr implements zzidd {
    private static final zziff zzc;
    private static volatile zzidk zzd;
    private zzibz zza = zzibr.zzbC();
    private zzibz zzb = zzibr.zzbC();

    static {
        zziff zziffVar = new zziff();
        zzc = zziffVar;
        zzibr.zzbu(zziff.class, zziffVar);
    }

    private zziff() {
    }

    public static zziff zzc(byte[] bArr, zzibb zzibbVar) {
        return (zziff) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zziff();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzife(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzd;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zziff.class) {
            try {
                zzidkVar = zzd;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzc);
                    zzd = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
