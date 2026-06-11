package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
abstract class zzpq extends zzpv {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzpq(int i5) {
        super(null);
        if (i5 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i5, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final int zzb() {
        throw null;
    }

    public final void zzc(byte b2) {
        byte[] bArr = this.zza;
        int i5 = this.zzc;
        bArr[i5] = b2;
        this.zzc = i5 + 1;
        this.zzd++;
    }

    public final void zzd(int i5) {
        int i6 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i6] = (byte) i5;
        bArr[i6 + 1] = (byte) (i5 >> 8);
        bArr[i6 + 2] = (byte) (i5 >> 16);
        bArr[i6 + 3] = (byte) (i5 >> 24);
        this.zzc = i6 + 4;
        this.zzd += 4;
    }

    public final void zze(long j2) {
        int i5 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i5] = (byte) j2;
        bArr[i5 + 1] = (byte) (j2 >> 8);
        bArr[i5 + 2] = (byte) (j2 >> 16);
        bArr[i5 + 3] = (byte) (j2 >> 24);
        bArr[i5 + 4] = (byte) (j2 >> 32);
        bArr[i5 + 5] = (byte) (j2 >> 40);
        bArr[i5 + 6] = (byte) (j2 >> 48);
        bArr[i5 + 7] = (byte) (j2 >> 56);
        this.zzc = i5 + 8;
        this.zzd += 8;
    }

    public final void zzf(int i5) {
        boolean z4;
        z4 = zzpv.zzb;
        if (!z4) {
            while ((i5 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                bArr[i6] = (byte) (i5 | 128);
                this.zzd++;
                i5 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            bArr2[i7] = (byte) i5;
            this.zzd++;
            return;
        }
        long j2 = this.zzc;
        while ((i5 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i8 = this.zzc;
            this.zzc = i8 + 1;
            zzsw.zzn(bArr3, i8, (byte) (i5 | 128));
            i5 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        zzsw.zzn(bArr4, i9, (byte) i5);
        this.zzd += (int) (this.zzc - j2);
    }

    public final void zzg(long j2) {
        boolean z4;
        z4 = zzpv.zzb;
        if (z4) {
            long j5 = this.zzc;
            while (true) {
                int i5 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i6 = this.zzc;
                    this.zzc = i6 + 1;
                    zzsw.zzn(bArr, i6, (byte) i5);
                    this.zzd += (int) (this.zzc - j5);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                zzsw.zzn(bArr2, i7, (byte) (i5 | 128));
                j2 >>>= 7;
            }
        } else {
            while (true) {
                int i8 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i9 = this.zzc;
                    this.zzc = i9 + 1;
                    bArr3[i9] = (byte) i8;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr4[i10] = (byte) (i8 | 128);
                this.zzd++;
                j2 >>>= 7;
            }
        }
    }
}
