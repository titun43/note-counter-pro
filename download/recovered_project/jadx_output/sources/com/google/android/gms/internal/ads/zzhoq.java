package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhoq extends zzibr implements zzidd {
    private static final zzhoq zzb;
    private static volatile zzidk zzc;
    private int zza;

    static {
        zzhoq zzhoqVar = new zzhoq();
        zzb = zzhoqVar;
        zzibr.zzbu(zzhoq.class, zzhoqVar);
    }

    private zzhoq() {
    }

    public static zzhop zzb() {
        return (zzhop) zzb.zzbn();
    }

    public static zzhoq zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(int i5) {
        this.zza = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhoq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhop(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzc;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzhoq.class) {
            try {
                zzidkVar = zzc;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzb);
                    zzc = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
