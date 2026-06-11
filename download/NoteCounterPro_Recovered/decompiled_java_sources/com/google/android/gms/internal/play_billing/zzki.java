package com.google.android.gms.internal.play_billing;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzki extends zzhk implements zzin {
    private static final zzki zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzki zzkiVar = new zzki();
        zzb = zzkiVar;
        zzhk.zzx(zzki.class, zzkiVar);
    }

    private zzki() {
    }

    public static /* synthetic */ void zzC(zzki zzkiVar, String str) {
        zzkiVar.zzd |= 8;
        zzkiVar.zzh = str;
    }

    public static /* synthetic */ void zzD(zzki zzkiVar, String str) {
        str.getClass();
        zzkiVar.zzd |= 2;
        zzkiVar.zzf = str;
    }

    public static /* synthetic */ void zzE(zzki zzkiVar, int i5) {
        zzkiVar.zzd |= 1;
        zzkiVar.zze = i5;
    }

    public static /* synthetic */ void zzF(zzki zzkiVar, int i5) {
        zzkiVar.zzg = i5 - 1;
        zzkiVar.zzd |= 4;
    }

    public static zzke zzc() {
        return (zzke) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzkf.zza, "zzh"});
        }
        if (i6 == 3) {
            return new zzki();
        }
        zzkh zzkhVar = null;
        if (i6 == 4) {
            return new zzke(zzkhVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
