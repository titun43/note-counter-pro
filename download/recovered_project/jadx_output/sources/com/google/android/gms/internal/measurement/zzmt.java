package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzmt extends zzmu {
    public zzmt(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(zzk(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(zzj(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzc(Object obj, long j2, boolean z4) {
        if (zzmv.zzb) {
            zzmv.zzD(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzmv.zzE(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzd(Object obj, long j2, byte b2) {
        if (zzmv.zzb) {
            zzmv.zzD(obj, j2, b2);
        } else {
            zzmv.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zze(Object obj, long j2, double d5) {
        zzo(obj, j2, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzf(Object obj, long j2, float f5) {
        zzn(obj, j2, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzg(Object obj, long j2) {
        return zzmv.zzb ? zzmv.zzt(obj, j2) : zzmv.zzu(obj, j2);
    }
}
