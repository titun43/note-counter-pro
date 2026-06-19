package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgn {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzgn(byte[] bArr, int i5, int i6) {
        this.zza = bArr;
        this.zzc = i5;
        this.zzb = i6;
        zzk();
    }

    private final int zzi() {
        int i5 = 0;
        while (!zze()) {
            i5++;
        }
        return ((1 << i5) - 1) + (i5 > 0 ? zzf(i5) : 0);
    }

    private final boolean zzj(int i5) {
        if (i5 < 2 || i5 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i5] == 3 && bArr[i5 + (-2)] == 0 && bArr[i5 + (-1)] == 0;
    }

    private final void zzk() {
        int i5;
        int i6 = this.zzc;
        boolean z4 = false;
        if (i6 >= 0 && (i6 < (i5 = this.zzb) || (i6 == i5 && this.zzd == 0))) {
            z4 = true;
        }
        zzgrc.zzi(z4);
    }

    public final void zza() {
        int i5 = this.zzd + 1;
        this.zzd = i5;
        if (i5 == 8) {
            this.zzd = 0;
            int i6 = this.zzc;
            this.zzc = i6 + (true == zzj(i6 + 1) ? 2 : 1);
        }
        zzk();
    }

    public final void zzb(int i5) {
        int i6 = this.zzc;
        int i7 = i5 / 8;
        int i8 = i6 + i7;
        this.zzc = i8;
        int i9 = (i5 - (i7 * 8)) + this.zzd;
        this.zzd = i9;
        if (i9 > 7) {
            this.zzc = i8 + 1;
            this.zzd = i9 - 8;
        }
        while (true) {
            i6++;
            if (i6 > this.zzc) {
                zzk();
                return;
            } else if (zzj(i6)) {
                this.zzc++;
                i6 += 2;
            }
        }
    }

    public final void zzc() {
        int i5 = this.zzd;
        if (i5 > 0) {
            zzb(8 - i5);
        }
    }

    public final boolean zzd(int i5) {
        int i6 = this.zzc;
        int i7 = i5 / 8;
        int i8 = i6 + i7;
        int i9 = (this.zzd + i5) - (i7 * 8);
        if (i9 > 7) {
            i8++;
            i9 -= 8;
        }
        while (true) {
            i6++;
            if (i6 > i8 || i8 >= this.zzb) {
                break;
            }
            if (zzj(i6)) {
                i8++;
                i6 += 2;
            }
        }
        int i10 = this.zzb;
        if (i8 >= i10) {
            return i8 == i10 && i9 == 0;
        }
        return true;
    }

    public final boolean zze() {
        int i5 = this.zza[this.zzc] & (128 >> this.zzd);
        zza();
        return i5 != 0;
    }

    public final int zzf(int i5) {
        int i6;
        this.zzd += i5;
        int i7 = 0;
        while (true) {
            i6 = this.zzd;
            if (i6 <= 8) {
                break;
            }
            int i8 = i6 - 8;
            this.zzd = i8;
            byte[] bArr = this.zza;
            int i9 = this.zzc;
            i7 |= (bArr[i9] & 255) << i8;
            if (true != zzj(i9 + 1)) {
                r3 = 1;
            }
            this.zzc = i9 + r3;
        }
        byte[] bArr2 = this.zza;
        int i10 = this.zzc;
        int i11 = i7 | ((bArr2[i10] & 255) >> (8 - i6));
        int i12 = 32 - i5;
        if (i6 == 8) {
            this.zzd = 0;
            this.zzc = i10 + (true != zzj(i10 + 1) ? 1 : 2);
        }
        int i13 = ((-1) >>> i12) & i11;
        zzk();
        return i13;
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int zzi = zzi();
        int i5 = zzi % 2;
        return ((zzi + 1) / 2) * (i5 == 0 ? -1 : 1);
    }
}
