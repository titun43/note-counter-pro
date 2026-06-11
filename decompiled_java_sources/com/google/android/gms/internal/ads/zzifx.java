package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzifx extends zzibr implements zzidd {
    private static final zzifx zzc;
    private static volatile zzidk zzd;
    private int zza;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzifx zzifxVar = new zzifx();
        zzc = zzifxVar;
        zzibr.zzbu(zzifx.class, zzifxVar);
    }

    private zzifx() {
    }

    public static zzifw zzc() {
        return (zzifw) zzc.zzbn();
    }

    public final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzifx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzifw(bArr);
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
        synchronized (zzifx.class) {
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
