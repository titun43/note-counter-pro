package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfpg extends zzibr implements zzidd {
    private static final zzfpg zzb;
    private static volatile zzidk zzc;
    private String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfpg zzfpgVar = new zzfpg();
        zzb = zzfpgVar;
        zzibr.zzbu(zzfpg.class, zzfpgVar);
    }

    private zzfpg() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzfpg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpf(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzc;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzfpg.class) {
            try {
                zzidkVar = zzc;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzb);
                    zzc = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
