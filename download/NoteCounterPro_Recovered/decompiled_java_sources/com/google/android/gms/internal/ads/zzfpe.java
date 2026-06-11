package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfpe extends zzibr implements zzidd {
    private static final zzfpe zzc;
    private static volatile zzidk zzd;
    private String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzb;

    static {
        zzfpe zzfpeVar = new zzfpe();
        zzc = zzfpeVar;
        zzibr.zzbu(zzfpe.class, zzfpeVar);
    }

    private zzfpe() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfpe();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpd(bArr);
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
        synchronized (zzfpe.class) {
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
