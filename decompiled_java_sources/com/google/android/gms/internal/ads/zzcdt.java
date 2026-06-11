package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcdt {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzcdt() {
    }

    public final void zza() {
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgT)).longValue() <= currentTimeMillis) {
                        this.zzc = 1;
                    }
                }
            } finally {
            }
        }
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = currentTimeMillis2;
                }
            } finally {
            }
        }
    }

    public /* synthetic */ zzcdt(byte[] bArr) {
    }
}
