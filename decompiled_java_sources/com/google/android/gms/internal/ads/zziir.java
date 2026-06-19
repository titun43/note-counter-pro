package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zziir extends zzibr implements zzidd {
    private static final zziir zzn;
    private static volatile zzidk zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zziiw zzk;
    private zziiq zzm;
    private String zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zze = 1;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zziir zziirVar = new zziir();
        zzn = zziirVar;
        zzibr.zzbu(zziir.class, zziirVar);
    }

    private zziir() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", zzija.zza, "zze", zziiz.zza, "zzf", "zzg", "zzh", "zzi", "zzj", zziis.zza, "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zziir();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziio(bArr);
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
        synchronized (zziir.class) {
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
}
