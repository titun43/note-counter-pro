package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zziej extends zziel {
    public zziej(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zza(Object obj, long j2, byte b2) {
        if (zziem.zzb) {
            zziem.zzF(obj, j2, b2);
        } else {
            zziem.zzG(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final boolean zzb(Object obj, long j2) {
        return zziem.zzb ? zziem.zzw(obj, j2) : zziem.zzx(obj, j2);
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zzc(Object obj, long j2, boolean z4) {
        if (zziem.zzb) {
            zziem.zzF(obj, j2, r3 ? (byte) 1 : (byte) 0);
        } else {
            zziem.zzG(obj, j2, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final float zzd(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zze(Object obj, long j2, float f5) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f5));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final double zzf(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final void zzg(Object obj, long j2, double d5) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.ads.zziel
    public final byte zzh(long j2) {
        return Memory.peekByte((int) j2);
    }
}
