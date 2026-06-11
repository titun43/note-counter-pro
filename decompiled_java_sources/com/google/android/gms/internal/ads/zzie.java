package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class zzie {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final MediaCodec.CryptoInfo zzi;
    private final zzid zzj;

    public zzie() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = new zzid(cryptoInfo, null);
    }

    public final void zza(int i5, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i6, int i7, int i8) {
        this.zzf = i5;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i6;
        this.zzg = i7;
        this.zzh = i8;
        MediaCodec.CryptoInfo cryptoInfo = this.zzi;
        cryptoInfo.numSubSamples = i5;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i6;
        zzid zzidVar = this.zzj;
        zzidVar.getClass();
        zzidVar.zza(i7, i8);
    }

    public final MediaCodec.CryptoInfo zzb() {
        return this.zzi;
    }

    public final void zzc(int i5) {
        if (i5 == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.zzi.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i5;
    }
}
