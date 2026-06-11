package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhou extends zzibr implements zzidd {
    private static final zzhou zzc;
    private static volatile zzidk zzd;
    private int zza;
    private int zzb;

    static {
        zzhou zzhouVar = new zzhou();
        zzc = zzhouVar;
        zzibr.zzbu(zzhou.class, zzhouVar);
    }

    private zzhou() {
    }

    public static zzhou zzc(zzian zzianVar, zzibb zzibbVar) {
        return (zzhou) zzibr.zzbT(zzc, zzianVar, zzibbVar);
    }

    public static zzhot zzd() {
        return (zzhot) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhou();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhot(bArr);
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
        synchronized (zzhou.class) {
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

    public final /* synthetic */ void zze(int i5) {
        this.zza = i5;
    }
}
