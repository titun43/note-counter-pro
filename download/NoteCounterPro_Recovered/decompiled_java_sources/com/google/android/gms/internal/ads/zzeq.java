package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzeq {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzeq(byte[] bArr, int i5) {
        this.zza = bArr;
        this.zzd = i5;
    }

    private final void zzq() {
        int i5;
        int i6 = this.zzb;
        boolean z4 = false;
        if (i6 >= 0 && (i6 < (i5 = this.zzd) || (i6 == i5 && this.zzc == 0))) {
            z4 = true;
        }
        zzgrc.zzi(z4);
    }

    public final void zza(zzer zzerVar) {
        zzb(zzerVar.zzi(), zzerVar.zze());
        zzf(zzerVar.zzg() * 8);
    }

    public final void zzb(byte[] bArr, int i5) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i5;
    }

    public final int zzc() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzd() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zze() {
        zzgrc.zzi(this.zzc == 0);
        return this.zzb;
    }

    public final void zzf(int i5) {
        int i6 = i5 / 8;
        this.zzb = i6;
        this.zzc = i5 - (i6 * 8);
        zzq();
    }

    public final void zzg() {
        int i5 = this.zzc + 1;
        this.zzc = i5;
        if (i5 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzh(int i5) {
        int i6 = i5 / 8;
        int i7 = this.zzb + i6;
        this.zzb = i7;
        int i8 = (i5 - (i6 * 8)) + this.zzc;
        this.zzc = i8;
        if (i8 > 7) {
            this.zzb = i7 + 1;
            this.zzc = i8 - 8;
        }
        zzq();
    }

    public final boolean zzi() {
        int i5 = this.zza[this.zzb] & (128 >> this.zzc);
        zzg();
        return i5 != 0;
    }

    public final int zzj(int i5) {
        int i6;
        if (i5 == 0) {
            return 0;
        }
        this.zzc += i5;
        int i7 = 0;
        while (true) {
            i6 = this.zzc;
            if (i6 <= 8) {
                break;
            }
            int i8 = i6 - 8;
            this.zzc = i8;
            byte[] bArr = this.zza;
            int i9 = this.zzb;
            this.zzb = i9 + 1;
            i7 |= (bArr[i9] & 255) << i8;
        }
        byte[] bArr2 = this.zza;
        int i10 = this.zzb;
        int i11 = i7 | ((bArr2[i10] & 255) >> (8 - i6));
        int i12 = 32 - i5;
        if (i6 == 8) {
            this.zzc = 0;
            this.zzb = i10 + 1;
        }
        int i13 = ((-1) >>> i12) & i11;
        zzq();
        return i13;
    }

    public final long zzk(int i5) {
        if (i5 <= 32) {
            int zzj = zzj(i5);
            String str = zzfj.zza;
            return 4294967295L & zzj;
        }
        int zzj2 = zzj(i5 - 32);
        int zzj3 = zzj(32);
        String str2 = zzfj.zza;
        return (4294967295L & zzj3) | ((zzj2 & 4294967295L) << 32);
    }

    public final void zzl(byte[] bArr, int i5, int i6) {
        int i7;
        int i8 = 0;
        while (true) {
            i7 = i6 >> 3;
            if (i8 >= i7) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i9 = this.zzb;
            int i10 = i9 + 1;
            this.zzb = i10;
            byte b2 = bArr2[i9];
            int i11 = this.zzc;
            byte b5 = (byte) (b2 << i11);
            bArr[i8] = b5;
            bArr[i8] = (byte) (((bArr2[i10] & 255) >> (8 - i11)) | b5);
            i8++;
        }
        int i12 = i6 & 7;
        if (i12 == 0) {
            return;
        }
        byte b6 = (byte) (bArr[i7] & (255 >> i12));
        bArr[i7] = b6;
        int i13 = this.zzc;
        if (i13 + i12 > 8) {
            byte[] bArr3 = this.zza;
            int i14 = this.zzb;
            this.zzb = i14 + 1;
            b6 = (byte) (b6 | ((bArr3[i14] & 255) << i13));
            bArr[i7] = b6;
            i13 -= 8;
        }
        int i15 = i13 + i12;
        this.zzc = i15;
        byte[] bArr4 = this.zza;
        int i16 = this.zzb;
        bArr[i7] = (byte) (((byte) (((255 & bArr4[i16]) >> (8 - i15)) << (8 - i12))) | b6);
        if (i15 == 8) {
            this.zzc = 0;
            this.zzb = i16 + 1;
        }
        zzq();
    }

    public final void zzm() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzn(byte[] bArr, int i5, int i6) {
        zzgrc.zzi(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i6);
        this.zzb += i6;
        zzq();
    }

    public final void zzo(int i5) {
        zzgrc.zzi(this.zzc == 0);
        this.zzb += i5;
        zzq();
    }

    public final void zzp(int i5, int i6) {
        int min = Math.min(8 - this.zzc, 14);
        int i7 = this.zzc;
        int i8 = (8 - i7) - min;
        byte[] bArr = this.zza;
        int i9 = this.zzb;
        byte b2 = (byte) (((65280 >> i7) | ((1 << i8) - 1)) & bArr[i9]);
        bArr[i9] = b2;
        int i10 = 14 - min;
        int i11 = i5 & 16383;
        bArr[i9] = (byte) (b2 | ((i11 >>> i10) << i8));
        int i12 = i9 + 1;
        while (i10 > 8) {
            i10 -= 8;
            this.zza[i12] = (byte) (i11 >>> i10);
            i12++;
        }
        byte[] bArr2 = this.zza;
        byte b5 = (byte) (bArr2[i12] & ((1 << r0) - 1));
        bArr2[i12] = b5;
        bArr2[i12] = (byte) (((i11 & ((1 << i10) - 1)) << (8 - i10)) | b5);
        zzh(14);
        zzq();
    }

    public zzeq() {
        this.zza = zzfj.zzb;
    }
}
