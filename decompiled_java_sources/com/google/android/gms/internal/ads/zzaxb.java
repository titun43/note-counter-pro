package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzaxb extends zzibr implements zzidd {
    private static final zzaxb zzd;
    private static volatile zzidk zze;
    private int zza;
    private long zzb = -1;
    private int zzc = zzbgj.zzq.zzf;

    static {
        zzaxb zzaxbVar = new zzaxb();
        zzd = zzaxbVar;
        zzibr.zzbu(zzaxb.class, zzaxbVar);
    }

    private zzaxb() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzaxo.zza});
        }
        if (ordinal == 3) {
            return new zzaxb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxa(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zze;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzaxb.class) {
            try {
                zzidkVar = zze;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzd);
                    zze = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
