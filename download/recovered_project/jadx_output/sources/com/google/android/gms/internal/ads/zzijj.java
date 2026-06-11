package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzijj extends zzibr implements zzidd {
    private static final zzijj zze;
    private static volatile zzidk zzf;
    private int zza;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzc;
    private int zzd;

    static {
        zzijj zzijjVar = new zzijj();
        zze = zzijjVar;
        zzibr.zzbu(zzijj.class, zzijjVar);
    }

    private zzijj() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", zzijm.zza, "zzd"});
        }
        if (ordinal == 3) {
            return new zzijj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziji(bArr);
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
        synchronized (zzijj.class) {
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
