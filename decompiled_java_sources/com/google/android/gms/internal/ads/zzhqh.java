package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

@Deprecated
/* loaded from: classes.dex */
public final class zzhqh extends zzibr implements zzidd {
    private static final zzhqh zzf;
    private static volatile zzidk zzg;
    private int zzc;
    private boolean zzd;
    private String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzhqh zzhqhVar = new zzhqh();
        zzf = zzhqhVar;
        zzibr.zzbu(zzhqh.class, zzhqhVar);
    }

    private zzhqh() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhqh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhqg(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzg;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhqh.class) {
            try {
                zzidkVar = zzg;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzf);
                    zzg = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
