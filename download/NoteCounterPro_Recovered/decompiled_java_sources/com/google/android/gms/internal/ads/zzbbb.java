package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbb extends zzbby {
    private final long zzh;

    public zzbbb(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, long j2, int i5, int i6) {
        super(zzbakVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", zzawgVar, i5, 25);
        this.zzh = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        long longValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzac(longValue);
                long j2 = this.zzh;
                if (j2 != 0) {
                    zzawgVar.zzk(longValue - j2);
                    zzawgVar.zzn(j2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
