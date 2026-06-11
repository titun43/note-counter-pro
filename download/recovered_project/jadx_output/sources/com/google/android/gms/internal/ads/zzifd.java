package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzifd extends zzibr implements zzidd {
    private static final zzifd zzd;
    private static volatile zzidk zze;
    private int zza;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzibz zzc = zzibr.zzbC();

    static {
        zzifd zzifdVar = new zzifd();
        zzd = zzifdVar;
        zzibr.zzbu(zzifd.class, zzifdVar);
    }

    private zzifd() {
    }

    public static zzifc zzc() {
        return (zzifc) zzd.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzifd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzifc(bArr);
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
        synchronized (zzifd.class) {
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

    public final /* synthetic */ void zze(int i5) {
        this.zza = 15;
    }
}
