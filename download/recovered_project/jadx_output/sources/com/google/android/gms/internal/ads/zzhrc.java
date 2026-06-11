package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhrc extends zzibr implements zzidd {
    private static final zzhrc zze;
    private static volatile zzidk zzf;
    private int zza;
    private zzhre zzb;
    private int zzc;
    private zzian zzd = zzian.zza;

    static {
        zzhrc zzhrcVar = new zzhrc();
        zze = zzhrcVar;
        zzibr.zzbu(zzhrc.class, zzhrcVar);
    }

    private zzhrc() {
    }

    public static zzhrc zzd(zzian zzianVar, zzibb zzibbVar) {
        return (zzhrc) zzibr.zzbT(zze, zzianVar, zzibbVar);
    }

    public static zzhrb zze() {
        return (zzhrb) zze.zzbn();
    }

    public final zzhre zza() {
        zzhre zzhreVar = this.zzb;
        return zzhreVar == null ? zzhre.zzc() : zzhreVar;
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
            return new zzhrc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrb(bArr);
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
        synchronized (zzhrc.class) {
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

    public final /* synthetic */ void zzg(zzhre zzhreVar) {
        zzhreVar.getClass();
        this.zzb = zzhreVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(int i5) {
        this.zzc = i5;
    }

    public final /* synthetic */ void zzi(zzian zzianVar) {
        this.zzd = zzianVar;
    }
}
