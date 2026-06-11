package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfro {
    private final Object zza;
    private final long zzb;
    private final x2.b zzc;
    private final long zzd;
    private final double zze;
    private final int zzf;

    public zzfro(Object obj, x2.b bVar, double d5, int i5) {
        this.zza = obj;
        this.zzc = bVar;
        ((x2.c) bVar).getClass();
        this.zzb = System.currentTimeMillis();
        this.zzd = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzW)).longValue() * 1000;
        this.zze = d5;
        this.zzf = i5;
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        long j2 = this.zzb;
        long j5 = this.zzd;
        ((x2.c) this.zzc).getClass();
        return System.currentTimeMillis() >= j2 + j5;
    }

    public final long zzc() {
        long min = this.zzd + Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzF)).longValue(), -900000L), 10000L);
        ((x2.c) this.zzc).getClass();
        return min - (System.currentTimeMillis() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
