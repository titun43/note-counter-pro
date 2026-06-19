package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhrk extends zzibr implements zzidd {
    private static final zzhrk zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhrm zzb;
    private int zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhrk zzhrkVar = new zzhrk();
        zze = zzhrkVar;
        zzibr.zzbu(zzhrk.class, zzhrkVar);
    }

    private zzhrk() {
    }

    public static zzhrk zzd(zzian zzianVar, zzibb zzibbVar) {
        return (zzhrk) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrj zze() {
        return (zzhrj) zze.zzbn();
    }

    public final zzhrm zza() {
        zzhrm zzhrmVar = this.zzb;
        return zzhrmVar == null ? zzhrm.zze() : zzhrmVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzian zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhrk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrj(bArr);
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
        synchronized (zzhrk.class) {
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

    public final /* synthetic */ void zzg(zzhrm zzhrmVar) {
        zzhrmVar.getClass();
        this.zzb = zzhrmVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(int i5) {
        this.zzc = i5;
    }

    public final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
