package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzawq extends zzibr implements zzidd {
    private static final zzawq zze;
    private static volatile zzidk zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = zzbgj.zzq.zzf;
    private int zzd = zzbgj.zzq.zzf;

    static {
        zzawq zzawqVar = new zzawq();
        zze = zzawqVar;
        zzibr.zzbu(zzawq.class, zzawqVar);
    }

    private zzawq() {
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzibx zzibxVar = zzaxo.zza;
            return zzibr.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", zzibxVar, "zzd", zzibxVar});
        }
        if (ordinal == 3) {
            return new zzawq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawp(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzf;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzawq.class) {
            try {
                zzidkVar = zzf;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zze);
                    zzf = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
