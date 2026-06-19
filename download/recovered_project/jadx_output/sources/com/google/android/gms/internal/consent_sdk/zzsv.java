package com.google.android.gms.internal.consent_sdk;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zzsv {
    final Unsafe zza;

    public zzsv(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j2);

    public abstract float zzb(Object obj, long j2);

    public abstract void zzc(Object obj, long j2, boolean z4);

    public abstract void zzd(Object obj, long j2, byte b2);

    public abstract void zze(Object obj, long j2, double d5);

    public abstract void zzf(Object obj, long j2, float f5);

    public abstract boolean zzg(Object obj, long j2);
}
