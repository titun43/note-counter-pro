package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zziin extends zzibr implements zzidd {
    private static final zziin zzb;
    private static volatile zzidk zzc;
    private zzicd zza = zzibr.zzbM();

    static {
        zziin zziinVar = new zziin();
        zzb = zziinVar;
        zzibr.zzbu(zziin.class, zziinVar);
    }

    private zziin() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zziil.class});
        }
        if (ordinal == 3) {
            return new zziin();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziim(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzc;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zziin.class) {
            try {
                zzidkVar = zzc;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzb);
                    zzc = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
