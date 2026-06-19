package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzfpc extends zzibr implements zzidd {
    private static final zzfpc zzi;
    private static volatile zzidk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfpc zzfpcVar = new zzfpc();
        zzi = zzfpcVar;
        zzibr.zzbu(zzfpc.class, zzfpcVar);
    }

    private zzfpc() {
    }

    public static zzfpb zza() {
        return (zzfpb) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(long j2) {
        this.zzb = j2;
    }

    public final /* synthetic */ void zzd(long j2) {
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
            return zzibr.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzfpc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfpb(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzj;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzfpc.class) {
            try {
                zzidkVar = zzj;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzi);
                    zzj = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }

    public final /* synthetic */ void zze(boolean z4) {
        this.zzd = z4;
    }

    public final /* synthetic */ void zzg(long j2) {
        this.zze = j2;
    }

    public final /* synthetic */ void zzh(long j2) {
        this.zzf = j2;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void zzk(int i5) {
        this.zzh = i5 - 2;
    }
}
