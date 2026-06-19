package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfwd extends zzibr implements zzidd {
    private static final zzfwd zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfwa zze;

    static {
        zzfwd zzfwdVar = new zzfwd();
        zzf = zzfwdVar;
        zzibr.zzbu(zzfwd.class, zzfwdVar);
    }

    private zzfwd() {
    }

    public static zzfwb zza() {
        return (zzfwb) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzc(zzfwa zzfwaVar) {
        zzfwaVar.getClass();
        this.zze = zzfwaVar;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfwc.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfwd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfwb(bArr);
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
        synchronized (zzfwd.class) {
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

    public final /* synthetic */ void zze(int i5) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
