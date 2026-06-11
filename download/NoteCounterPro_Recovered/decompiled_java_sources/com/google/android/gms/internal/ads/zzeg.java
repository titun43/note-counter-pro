package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class zzeg {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzeg() {
        throw null;
    }

    public final void zza(long j2) {
        int i5 = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i5 == length) {
            int i6 = length + length;
            if (i6 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i6];
            int i7 = this.zza;
            int i8 = length - i7;
            System.arraycopy(jArr, i7, jArr2, 0, i8);
            System.arraycopy(this.zzd, 0, jArr2, i8, i7);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i9 = (this.zzb + 1) & this.zze;
        this.zzb = i9;
        jArr[i9] = j2;
        this.zzc++;
    }

    public final long zzb() {
        int i5 = this.zzc;
        if (i5 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i6 = this.zza;
        long j2 = jArr[i6];
        this.zza = this.zze & (i6 + 1);
        this.zzc = i5 - 1;
        return j2;
    }

    public final long zzc() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }

    public final void zze() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public zzeg(int i5) {
        int i6 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i6 = highestOneBit + highestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        this.zzd = new long[i6];
        this.zze = r3.length - 1;
    }
}
