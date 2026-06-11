package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfpv extends zzibr implements zzidd {
    private static final zzfpv zzc;
    private static volatile zzidk zzd;
    private boolean zza;
    private boolean zzb;

    static {
        zzfpv zzfpvVar = new zzfpv();
        zzc = zzfpvVar;
        zzibr.zzbu(zzfpv.class, zzfpvVar);
    }

    private zzfpv() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfpv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpu(bArr);
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
        synchronized (zzfpv.class) {
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
