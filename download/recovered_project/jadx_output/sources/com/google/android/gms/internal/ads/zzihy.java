package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzihy extends zzibr implements zzidd {
    private static final zzihy zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzihy zzihyVar = new zzihy();
        zzd = zzihyVar;
        zzibr.zzbu(zzihy.class, zzihyVar);
    }

    private zzihy() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", zzihx.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzihy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzihw(bArr);
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
        synchronized (zzihy.class) {
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
}
