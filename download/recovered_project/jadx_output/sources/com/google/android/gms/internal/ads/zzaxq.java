package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzaxq extends zzibr implements zzidd {
    private static final zzaxq zzh;
    private static volatile zzidk zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = "D";

    static {
        zzaxq zzaxqVar = new zzaxq();
        zzh = zzaxqVar;
        zzibr.zzbu(zzaxq.class, zzaxqVar);
    }

    private zzaxq() {
    }

    public static zzaxp zza() {
        return (zzaxp) zzh.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    public final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzd(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzaxq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxp(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzi;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzaxq.class) {
            try {
                zzidkVar = zzi;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzh);
                    zzi = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }

    public final /* synthetic */ void zzh(long j2) {
        this.zza |= 32;
        this.zzg = j2;
    }
}
