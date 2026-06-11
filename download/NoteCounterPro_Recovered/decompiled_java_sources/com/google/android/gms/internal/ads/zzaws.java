package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaws extends zzibr implements zzidd {
    private static final zzaws zzc;
    private static volatile zzidk zzd;
    private int zza;
    private long zzb = -1;

    static {
        zzaws zzawsVar = new zzaws();
        zzc = zzawsVar;
        zzibr.zzbu(zzaws.class, zzawsVar);
    }

    private zzaws() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzaws();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawr(bArr);
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
        synchronized (zzaws.class) {
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
