package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.b0;
import java.util.Random;

/* loaded from: classes.dex */
public final class zzfra {
    private final long zza;
    private final long zzb;
    private final x2.b zzf;
    private long zzg;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzh = new Random();
    private long zzc = 0;

    public zzfra(long j2, double d5, long j5, double d6, x2.b bVar) {
        this.zza = j2;
        this.zzb = j5;
        this.zzf = bVar;
        zza();
    }

    public final void zza() {
        this.zzg = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final long zzb() {
        double d5 = this.zzg;
        double d6 = 0.2d * d5;
        long j2 = (long) (d5 + d6);
        return ((long) (d5 - d6)) + ((long) (this.zzh.nextDouble() * ((j2 - r0) + 1)));
    }

    public final void zzc() {
        x2.b bVar = this.zzf;
        long zzb = zzb();
        ((x2.c) bVar).getClass();
        this.zze = System.currentTimeMillis() + zzb;
        double d5 = this.zzg;
        this.zzg = Math.min((long) (d5 + d5), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        ((x2.c) this.zzf).getClass();
        return System.currentTimeMillis() < this.zze;
    }

    public final boolean zze() {
        zzbgv zzbgvVar = zzbhe.zzJ;
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue() >= 0 && this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue()) && this.zzg >= this.zzb;
    }

    public final synchronized void zzf(int i5) {
        b0.b(i5 > 0);
        this.zzd = i5;
    }
}
