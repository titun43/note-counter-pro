package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzhqx extends zzibr implements zzidd {
    private static final zzhqx zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzhqf zzc;

    static {
        zzhqx zzhqxVar = new zzhqx();
        zzd = zzhqxVar;
        zzibr.zzbu(zzhqx.class, zzhqxVar);
    }

    private zzhqx() {
    }

    public static zzhqx zzc(zzian zzianVar, zzibb zzibbVar) {
        return (zzhqx) zzibr.zzbT(zzd, zzianVar, zzibbVar);
    }

    public static zzhqw zzd() {
        return (zzhqw) zzd.zzbn();
    }

    public static zzhqx zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhqf zzb() {
        zzhqf zzhqfVar = this.zzc;
        return zzhqfVar == null ? zzhqf.zzh() : zzhqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhqx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqw(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zze;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhqx.class) {
            try {
                zzidkVar = zze;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzd);
                    zze = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzh(zzhqf zzhqfVar) {
        zzhqfVar.getClass();
        this.zzc = zzhqfVar;
        this.zza |= 1;
    }
}
