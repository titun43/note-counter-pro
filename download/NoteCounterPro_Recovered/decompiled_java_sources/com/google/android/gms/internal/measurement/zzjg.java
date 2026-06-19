package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzjg extends zzjj {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzjg(byte[] bArr, int i5, int i6) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i6) | i6) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i6)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i6;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzb(byte b2) {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            this.zzd = i5 + 1;
            bArr[i5] = b2;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    public final void zzc(byte[] bArr, int i5, int i6) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i6);
            this.zzd += i6;
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i6)), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzd(int i5, boolean z4) {
        zzq(i5 << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zze(int i5, zzjb zzjbVar) {
        zzq((i5 << 3) | 2);
        zzq(zzjbVar.zzd());
        zzjbVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzf(int i5, int i6) {
        zzq((i5 << 3) | 5);
        zzg(i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzg(int i5) {
        try {
            byte[] bArr = this.zzb;
            int i6 = this.zzd;
            int i7 = i6 + 1;
            this.zzd = i7;
            bArr[i6] = (byte) (i5 & 255);
            int i8 = i6 + 2;
            this.zzd = i8;
            bArr[i7] = (byte) ((i5 >> 8) & 255);
            int i9 = i6 + 3;
            this.zzd = i9;
            bArr[i8] = (byte) ((i5 >> 16) & 255);
            this.zzd = i6 + 4;
            bArr[i9] = (byte) ((i5 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzh(int i5, long j2) {
        zzq((i5 << 3) | 1);
        zzi(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzi(long j2) {
        try {
            byte[] bArr = this.zzb;
            int i5 = this.zzd;
            int i6 = i5 + 1;
            this.zzd = i6;
            bArr[i5] = (byte) (((int) j2) & 255);
            int i7 = i5 + 2;
            this.zzd = i7;
            bArr[i6] = (byte) (((int) (j2 >> 8)) & 255);
            int i8 = i5 + 3;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) (j2 >> 16)) & 255);
            int i9 = i5 + 4;
            this.zzd = i9;
            bArr[i8] = (byte) (((int) (j2 >> 24)) & 255);
            int i10 = i5 + 5;
            this.zzd = i10;
            bArr[i9] = (byte) (((int) (j2 >> 32)) & 255);
            int i11 = i5 + 6;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j2 >> 40)) & 255);
            int i12 = i5 + 7;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j2 >> 48)) & 255);
            this.zzd = i5 + 8;
            bArr[i12] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzj(int i5, int i6) {
        zzq(i5 << 3);
        zzk(i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzk(int i5) {
        if (i5 >= 0) {
            zzq(i5);
        } else {
            zzs(i5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzl(byte[] bArr, int i5, int i6) {
        zzc(bArr, 0, i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzm(int i5, String str) {
        zzq((i5 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i5 = this.zzd;
        try {
            int zzA = zzjj.zzA(str.length() * 3);
            int zzA2 = zzjj.zzA(str.length());
            if (zzA2 != zzA) {
                zzq(zzna.zzc(str));
                byte[] bArr = this.zzb;
                int i6 = this.zzd;
                this.zzd = zzna.zzb(str, bArr, i6, this.zzc - i6);
                return;
            }
            int i7 = i5 + zzA2;
            this.zzd = i7;
            int zzb = zzna.zzb(str, this.zzb, i7, this.zzc - i7);
            this.zzd = i5;
            zzq((zzb - i5) - zzA2);
            this.zzd = zzb;
        } catch (zzmz e4) {
            this.zzd = i5;
            zzE(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new zzjh(e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzo(int i5, int i6) {
        zzq((i5 << 3) | i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzp(int i5, int i6) {
        zzq(i5 << 3);
        zzq(i6);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzq(int i5) {
        while ((i5 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i6 = this.zzd;
                this.zzd = i6 + 1;
                bArr[i6] = (byte) ((i5 & 127) | 128);
                i5 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr2 = this.zzb;
        int i7 = this.zzd;
        this.zzd = i7 + 1;
        bArr2[i7] = (byte) i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzr(int i5, long j2) {
        zzq(i5 << 3);
        zzs(j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjj
    public final void zzs(long j2) {
        boolean z4;
        z4 = zzjj.zzc;
        if (z4 && this.zzc - this.zzd >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                zzmv.zzn(bArr, i5, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.zzb;
            int i6 = this.zzd;
            this.zzd = i6 + 1;
            zzmv.zzn(bArr2, i6, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzb;
                int i7 = this.zzd;
                this.zzd = i7 + 1;
                bArr3[i7] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e4);
            }
        }
        byte[] bArr4 = this.zzb;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        bArr4[i8] = (byte) j2;
    }
}
