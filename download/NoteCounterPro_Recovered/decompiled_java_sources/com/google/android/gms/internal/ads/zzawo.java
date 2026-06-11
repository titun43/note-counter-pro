package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzawo extends zzibr implements zzidd {
    private static final zzawo zzf;
    private static volatile zzidk zzg;
    private int zza;
    private int zzb = zzbgj.zzq.zzf;
    private int zzc = zzbgj.zzq.zzf;
    private int zzd = zzbgj.zzq.zzf;
    private int zze = zzbgj.zzq.zzf;

    static {
        zzawo zzawoVar = new zzawo();
        zzf = zzawoVar;
        zzibr.zzbu(zzawo.class, zzawoVar);
    }

    private zzawo() {
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
            return zzibr.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", zzibxVar, "zzc", zzibxVar, "zzd", zzibxVar, "zze", zzibxVar});
        }
        if (ordinal == 3) {
            return new zzawo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzawn(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzg;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzawo.class) {
            try {
                zzidkVar = zzg;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzf);
                    zzg = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
