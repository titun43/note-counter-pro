package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzff {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzff() {
        throw null;
    }

    private final Object zzf() {
        zzgrc.zzi(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i5 = this.zzc;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.zzc = (i5 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized void zza(long j2, Object obj) {
        try {
            if (this.zzd > 0) {
                if (j2 <= this.zza[((this.zzc + r0) - 1) % this.zzb.length]) {
                    zzb();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i5 = length + length;
                long[] jArr = new long[i5];
                Object[] objArr = new Object[i5];
                int i6 = this.zzc;
                int i7 = length - i6;
                System.arraycopy(this.zza, i6, jArr, 0, i7);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i7);
                int i8 = this.zzc;
                if (i8 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i7, i8);
                    System.arraycopy(this.zzb, 0, objArr, i7, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i9 = this.zzc;
            int i10 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i9 + i10) % objArr2.length;
            this.zza[length2] = j2;
            objArr2[length2] = obj;
            this.zzd = i10 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    public final synchronized Object zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized Object zze(long j2) {
        Object obj;
        obj = null;
        while (this.zzd > 0 && j2 - this.zza[this.zzc] >= 0) {
            obj = zzf();
        }
        return obj;
    }

    public zzff(int i5) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}
