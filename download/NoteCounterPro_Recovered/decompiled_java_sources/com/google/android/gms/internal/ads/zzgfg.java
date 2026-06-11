package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgfg {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzgfg(byte[] bArr) {
        for (int i5 = 0; i5 < 256; i5++) {
            this.zza[i5] = (byte) i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            byte[] bArr2 = this.zza;
            byte b2 = bArr2[i7];
            i6 = (i6 + b2 + bArr[i7 % bArr.length]) & 255;
            bArr2[i7] = bArr2[i6];
            bArr2[i6] = b2;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i5 = this.zzb;
        int i6 = this.zzc;
        for (int i7 = 0; i7 < 256; i7++) {
            byte[] bArr2 = this.zza;
            i5 = (i5 + 1) & 255;
            byte b2 = bArr2[i5];
            i6 = (i6 + b2) & 255;
            bArr2[i5] = bArr2[i6];
            bArr2[i6] = b2;
            bArr[i7] = (byte) (bArr2[(bArr2[i5] + b2) & 255] ^ bArr[i7]);
        }
        this.zzb = i5;
        this.zzc = i6;
    }
}
