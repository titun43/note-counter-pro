package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzavk extends zzibr implements zzidd {
    private static final zzavk zzn;
    private static volatile zzidk zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private zzicd zzb = zzibr.zzbM();
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzj = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzavk zzavkVar = new zzavk();
        zzn = zzavkVar;
        zzibr.zzbu(zzavk.class, zzavkVar);
    }

    private zzavk() {
    }

    public static zzavj zza() {
        return (zzavj) zzn.zzbn();
    }

    public final /* synthetic */ void zzb(zzawc zzawcVar) {
        zzawcVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzawcVar);
    }

    public final /* synthetic */ void zzc() {
        this.zzb = zzibr.zzbM();
    }

    public final /* synthetic */ void zzd(long j2) {
        this.zza |= 1;
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", zzawc.class, "zzc", "zzd", "zze", "zzf", "zzg", zzawa.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zzavk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzavj(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzo;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzavk.class) {
            try {
                zzidkVar = zzo;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzn);
                    zzo = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(long j2) {
        this.zza |= 64;
        this.zzi = j2;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void zzm(long j2) {
        this.zza |= AdRequest.MAX_CONTENT_URL_LENGTH;
        this.zzl = j2;
    }

    public final /* synthetic */ void zzn(long j2) {
        this.zza |= 1024;
        this.zzm = j2;
    }

    public final /* synthetic */ void zzp(int i5) {
        this.zzg = i5 - 1;
        this.zza |= 16;
    }
}
