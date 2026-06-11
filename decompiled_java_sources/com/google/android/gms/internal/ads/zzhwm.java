package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzhwm implements zzhas {
    private static final ThreadLocal zza = new zzhwl();
    private final byte[] zzb;
    private final zzhnp zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    private zzhwm(byte[] bArr, int i5, byte[] bArr2) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i5 != 12 && i5 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zze = i5;
        int length = bArr.length;
        zzhyc.zza(length);
        this.zzd = new SecretKeySpec(bArr, "AES");
        this.zzc = zzhxr.zzb(zzhnn.zzc(zzhno.zzb(length), zzhyg.zza(bArr, zzhax.zza())));
        this.zzb = bArr2;
    }

    public static zzhas zzb(zzhcx zzhcxVar) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhcxVar.zzf();
        return new zzhwm(zzhcxVar.zze().zzc(zzhax.zza()), zzhcxVar.zzf().zzd(), zzhcxVar.zzc().zzc());
    }

    private final byte[] zzc(int i5, byte[] bArr, int i6, int i7) {
        byte[] bArr2 = new byte[i7 + 16];
        bArr2[15] = (byte) i5;
        System.arraycopy(bArr, i6, bArr2, 16, i7);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i5 = this.zze;
        int i6 = ((length - length2) - i5) - 16;
        if (i6 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] zzc = zzc(0, bArr, length2, i5);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] zzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] zzc3 = zzc(2, bArr, length2 + i5, i6);
        int i7 = length - 16;
        byte b2 = 0;
        for (int i8 = 0; i8 < 16; i8++) {
            b2 = (byte) (b2 | (((bArr[i7 + i8] ^ zzc2[i8]) ^ zzc[i8]) ^ zzc3[i8]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(zzc));
        return cipher.doFinal(bArr, bArr3.length + i5, i6);
    }
}
