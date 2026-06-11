package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhpg extends zzibr implements zzidd {
    private static final zzhpg zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhpg zzhpgVar = new zzhpg();
        zzd = zzhpgVar;
        zzibr.zzbu(zzhpg.class, zzhpgVar);
    }

    private zzhpg() {
    }

    public static zzhpf zzb() {
        return (zzhpf) zzd.zzbn();
    }

    public static zzhpg zzc() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzb = zzhpt.zzb(this.zza);
        return zzb == null ? zzhpt.UNRECOGNIZED : zzb;
    }

    public final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhpg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhpf(bArr);
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
        synchronized (zzhpg.class) {
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

    public final int zzg() {
        int i5 = this.zzb;
        int i6 = i5 != 0 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final int zzh() {
        int i5 = this.zzc;
        int i6 = i5 != 0 ? i5 != 1 ? i5 != 2 ? 0 : 4 : 3 : 2;
        if (i6 == 0) {
            return 1;
        }
        return i6;
    }

    public final /* synthetic */ void zzi(int i5) {
        this.zzb = zzhps.zza(i5);
    }

    public final /* synthetic */ void zzj(int i5) {
        this.zzc = zzhpl.zza(i5);
    }
}
