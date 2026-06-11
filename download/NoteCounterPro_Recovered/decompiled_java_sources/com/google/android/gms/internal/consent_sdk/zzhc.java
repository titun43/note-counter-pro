package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzhc extends zzqm implements zzrr {
    private static final zzhc zzb;
    private int zzd;
    private zzgy zze;
    private zzha zzg;
    private zzgw zzh;
    private zzgt zzi;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzqr zzj = zzqm.zzt();

    static {
        zzhc zzhcVar = new zzhc();
        zzb = zzhcVar;
        zzqm.zzz(zzhc.class, zzhcVar);
    }

    private zzhc() {
    }

    public static zzgu zza() {
        return (zzgu) zzb.zzp();
    }

    public static /* synthetic */ void zzd(zzhc zzhcVar, String str) {
        str.getClass();
        zzqr zzqrVar = zzhcVar.zzj;
        if (!zzqrVar.zzc()) {
            int size = zzqrVar.size();
            zzhcVar.zzj = zzqrVar.zzd(size + size);
        }
        zzhcVar.zzj.add(str);
    }

    public static /* synthetic */ void zze(zzhc zzhcVar, String str) {
        zzhcVar.zzd |= 2;
        zzhcVar.zzf = str;
    }

    public static /* synthetic */ void zzf(zzhc zzhcVar, zzgt zzgtVar) {
        zzhcVar.zzi = zzgtVar;
        zzhcVar.zzd |= 16;
    }

    public static /* synthetic */ void zzg(zzhc zzhcVar, zzgw zzgwVar) {
        zzgwVar.getClass();
        zzhcVar.zzh = zzgwVar;
        zzhcVar.zzd |= 8;
    }

    public static /* synthetic */ void zzh(zzhc zzhcVar, zzgy zzgyVar) {
        zzgyVar.getClass();
        zzhcVar.zze = zzgyVar;
        zzhcVar.zzd |= 1;
    }

    public static /* synthetic */ void zzi(zzhc zzhcVar, zzha zzhaVar) {
        zzhaVar.getClass();
        zzhcVar.zzg = zzhaVar;
        zzhcVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object zzb(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzqm.zzw(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i6 == 3) {
            return new zzhc();
        }
        zzhb zzhbVar = null;
        if (i6 == 4) {
            return new zzgu(zzhbVar);
        }
        if (i6 == 5) {
            return zzb;
        }
        throw null;
    }
}
