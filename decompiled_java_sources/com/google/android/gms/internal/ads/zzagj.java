package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzagj {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzagj(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final boolean zza() {
        int i5 = (this.zza[this.zzc] & 255) >> this.zzd;
        zzc(1);
        return 1 == (i5 & 1);
    }

    public final int zzb(int i5) {
        int i6 = this.zzc;
        int i7 = 8 - this.zzd;
        int i8 = i6 + 1;
        byte[] bArr = this.zza;
        int min = Math.min(i5, i7);
        int i9 = ((bArr[i6] & 255) >> this.zzd) & (255 >> (8 - min));
        while (min < i5) {
            i9 |= (bArr[i8] & 255) << min;
            min += 8;
            i8++;
        }
        int i10 = i9 & ((-1) >>> (32 - i5));
        zzc(i5);
        return i10;
    }

    public final void zzc(int i5) {
        int i6;
        int i7 = i5 / 8;
        int i8 = this.zzc + i7;
        this.zzc = i8;
        int i9 = (i5 - (i7 * 8)) + this.zzd;
        this.zzd = i9;
        if (i9 > 7) {
            i8++;
            this.zzc = i8;
            i9 -= 8;
            this.zzd = i9;
        }
        boolean z4 = false;
        if (i8 >= 0 && (i8 < (i6 = this.zzb) || (i8 == i6 && i9 == 0))) {
            z4 = true;
        }
        zzgrc.zzi(z4);
    }

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }
}
