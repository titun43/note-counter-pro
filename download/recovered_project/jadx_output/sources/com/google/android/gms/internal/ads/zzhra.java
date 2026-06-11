package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

@Deprecated
/* loaded from: classes.dex */
public final class zzhra extends zzibr implements zzidd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhra zzd;
    private static volatile zzidk zze;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzicd zzc = zzibr.zzbM();

    static {
        zzhra zzhraVar = new zzhra();
        zzd = zzhraVar;
        zzibr.zzbu(zzhra.class, zzhraVar);
    }

    private zzhra() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhqh.class});
        }
        if (ordinal == 3) {
            return new zzhra();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqz(bArr);
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
        synchronized (zzhra.class) {
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
