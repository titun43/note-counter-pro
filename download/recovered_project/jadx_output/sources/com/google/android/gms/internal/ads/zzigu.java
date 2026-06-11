package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzigu extends zzibr implements zzidd {
    private static final zzigu zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzb;
    private zzigt zzc;
    private zzigt zzd;

    static {
        zzigu zziguVar = new zzigu();
        zze = zziguVar;
        zzibr.zzbu(zzigu.class, zziguVar);
    }

    private zzigu() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zza", "zzb", zzigr.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzigu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzigq(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzf;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzigu.class) {
            try {
                zzidkVar = zzf;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zze);
                    zzf = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
