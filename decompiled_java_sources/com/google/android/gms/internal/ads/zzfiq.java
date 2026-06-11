package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfiq {
    private final x2.b zza;
    private final zzdxz zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfiq(x2.b bVar, zzdxz zzdxzVar) {
        this.zza = bVar;
        this.zzb = zzdxzVar;
    }

    private final void zze() {
        ((x2.c) this.zza).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgT)).longValue() <= currentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i5, int i6) {
        zze();
        Object obj = this.zzc;
        ((x2.c) this.zza).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i5) {
                    return;
                }
                this.zze = i6;
                if (this.zze == 3) {
                    this.zzd = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(boolean z4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoA)).booleanValue()) {
            zzdxy zza = this.zzb.zza();
            zza.zzc("action", "mbs_state");
            zza.zzc("mbs_state", true != z4 ? "0" : "1");
            zza.zzd();
        }
        if (z4) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z4;
        synchronized (this.zzc) {
            zze();
            z4 = this.zze == 2;
        }
        return z4;
    }

    public final boolean zzc() {
        boolean z4;
        synchronized (this.zzc) {
            zze();
            z4 = this.zze == 3;
        }
        return z4;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
