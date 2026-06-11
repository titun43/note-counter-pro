package com.google.android.gms.internal.consent_sdk;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzsu extends zzsv {
    public zzsu(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzc(Object obj, long j2, boolean z4) {
        if (zzsw.zzb) {
            zzsw.zzD(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzsw.zzE(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzd(Object obj, long j2, byte b2) {
        if (zzsw.zzb) {
            zzsw.zzD(obj, j2, b2);
        } else {
            zzsw.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zze(Object obj, long j2, double d5) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final void zzf(Object obj, long j2, float f5) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsv
    public final boolean zzg(Object obj, long j2) {
        return zzsw.zzb ? zzsw.zzt(obj, j2) : zzsw.zzu(obj, j2);
    }
}
