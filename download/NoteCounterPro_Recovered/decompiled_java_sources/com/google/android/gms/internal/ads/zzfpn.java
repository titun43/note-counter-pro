package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfpn extends zzibr implements zzidd {
    private static final zzfpn zzg;
    private static volatile zzidk zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfpn zzfpnVar = new zzfpn();
        zzg = zzfpnVar;
        zzibr.zzbu(zzfpn.class, zzfpnVar);
    }

    private zzfpn() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzfpn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpm(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzh;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzfpn.class) {
            try {
                zzidkVar = zzh;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzg);
                    zzh = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
