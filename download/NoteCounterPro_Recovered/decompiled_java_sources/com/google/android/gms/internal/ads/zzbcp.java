package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzbcp extends zzibr implements zzidd {
    private static final zzbcp zzg;
    private static volatile zzidk zzh;
    private int zza;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzbcp zzbcpVar = new zzbcp();
        zzg = zzbcpVar;
        zzibr.zzbu(zzbcp.class, zzbcpVar);
    }

    private zzbcp() {
    }

    public static zzbcp zzg(zzian zzianVar) {
        return (zzbcp) zzibr.zzbS(zzg, zzianVar);
    }

    public static zzbcp zzh(zzian zzianVar, zzibb zzibbVar) {
        return (zzbcp) zzibr.zzbT(zzg, zzianVar, zzibbVar);
    }

    public static zzbco zzi() {
        return (zzbco) zzg.zzbn();
    }

    public static zzbcp zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzbcp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbco(bArr);
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
        synchronized (zzbcp.class) {
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

    public final long zze() {
        return this.zzf;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzm(long j2) {
        this.zza |= 4;
        this.zzd = j2;
    }

    public final /* synthetic */ void zzn(long j2) {
        this.zza |= 8;
        this.zze = j2;
    }

    public final /* synthetic */ void zzo(long j2) {
        this.zza |= 16;
        this.zzf = j2;
    }
}
