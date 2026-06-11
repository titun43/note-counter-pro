package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfpp extends zzibr implements zzidd {
    private static final zzfpp zze;
    private static volatile zzidk zzf;
    private int zza;
    private int zzc;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfpp zzfppVar = new zzfpp();
        zze = zzfppVar;
        zzibr.zzbu(zzfpp.class, zzfppVar);
    }

    private zzfpp() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzfpp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpo(bArr);
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
        synchronized (zzfpp.class) {
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
