package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhpc extends zzibr implements zzidd {
    private static final zzhpc zza;
    private static volatile zzidk zzb;

    static {
        zzhpc zzhpcVar = new zzhpc();
        zza = zzhpcVar;
        zzibr.zzbu(zzhpc.class, zzhpcVar);
    }

    private zzhpc() {
    }

    public static zzhpc zza(zzian zzianVar, zzibb zzibbVar) {
        return (zzhpc) zzibr.zzbT(zza, zzianVar, zzibbVar);
    }

    public static zzhpc zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (ordinal == 2) {
            return zzibr.zzbv(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new zzhpc();
        }
        if (ordinal == 4) {
            return new zzhpb(bArr);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzb;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhpc.class) {
            try {
                zzidkVar = zzb;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zza);
                    zzb = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
