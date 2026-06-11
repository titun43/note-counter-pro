package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzhwk implements zzhxp {
    private static final ThreadLocal zza = new zzhwj();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzhwk(byte[] bArr, int i5) {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhyc.zza(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) zza.get()).getBlockSize();
        this.zzd = blockSize;
        if (i5 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzhxp
    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i5 = this.zzc;
        if (length < i5) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        int i6 = length - i5;
        byte[] bArr3 = new byte[i6];
        Cipher cipher = (Cipher) zza.get();
        byte[] bArr4 = new byte[this.zzd];
        System.arraycopy(bArr2, 0, bArr4, 0, i5);
        cipher.init(2, this.zzb, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i5, i6, bArr3, 0) == i6) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
