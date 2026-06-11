package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzef {
    private int zza;
    private long[] zzb;

    public zzef() {
        this(32);
    }

    public final void zza(long j2) {
        int i5 = this.zza;
        long[] jArr = this.zzb;
        if (i5 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i5 + i5);
        }
        long[] jArr2 = this.zzb;
        int i6 = this.zza;
        this.zza = i6 + 1;
        jArr2[i6] = 0;
    }

    public final void zzb(long[] jArr) {
        int i5 = this.zza;
        int length = jArr.length;
        int i6 = i5 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i6 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i6));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i6;
    }

    public final long zzc(int i5) {
        if (i5 >= 0 && i5 < this.zza) {
            return this.zzb[i5];
        }
        int i6 = this.zza;
        throw new IndexOutOfBoundsException(s.c.c(new StringBuilder(String.valueOf(i5).length() + 24 + String.valueOf(i6).length()), "Invalid index ", i5, ", size is ", i6));
    }

    public final int zzd() {
        return this.zza;
    }

    public zzef(int i5) {
        this.zzb = new long[i5];
    }
}
