package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzavq extends zzibr implements zzidd {
    private static final zzavq zzo;
    private static volatile zzidk zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzicd zzm = zzibr.zzbM();

    static {
        zzavq zzavqVar = new zzavq();
        zzo = zzavqVar;
        zzibr.zzbu(zzavq.class, zzavqVar);
    }

    private zzavq() {
    }

    public static zzavm zza() {
        return (zzavm) zzo.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzc(long j2) {
        this.zza |= 2;
        this.zzc = j2;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzavo.class, "zzn", zzavp.zza});
        }
        if (ordinal == 3) {
            return new zzavq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzavm(bArr);
        }
        if (ordinal == 5) {
            return zzo;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzp;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzavq.class) {
            try {
                zzidkVar = zzp;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzo);
                    zzp = zzidkVar;
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

    public final /* synthetic */ void zzg(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void zzj(int i5) {
        this.zzn = i5 - 1;
        this.zza |= 2048;
    }
}
