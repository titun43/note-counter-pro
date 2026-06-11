package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zziel {
    final Unsafe zza;

    public zziel(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j2, byte b2);

    public abstract boolean zzb(Object obj, long j2);

    public abstract void zzc(Object obj, long j2, boolean z4);

    public abstract float zzd(Object obj, long j2);

    public abstract void zze(Object obj, long j2, float f5);

    public abstract double zzf(Object obj, long j2);

    public abstract void zzg(Object obj, long j2, double d5);

    public abstract byte zzh(long j2);
}
