package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgdk extends zzibr implements zzidd {
    private static final zzgdk zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzavk zzb;

    static {
        zzgdk zzgdkVar = new zzgdk();
        zzc = zzgdkVar;
        zzibr.zzbu(zzgdk.class, zzgdkVar);
    }

    private zzgdk() {
    }

    public static zzgdj zza() {
        return (zzgdj) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(zzavk zzavkVar) {
        zzavkVar.getClass();
        this.zzb = zzavkVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        zzidk zzidkVar;
        int ordinal = zzibqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzibr.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzgdk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgdj(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzidk zzidkVar2 = zzd;
        if (zzidkVar2 != null) {
            return zzidkVar2;
        }
        synchronized (zzgdk.class) {
            try {
                zzidkVar = zzd;
                if (zzidkVar == null) {
                    zzidkVar = new zzibm(zzc);
                    zzd = zzidkVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzidkVar;
    }
}
