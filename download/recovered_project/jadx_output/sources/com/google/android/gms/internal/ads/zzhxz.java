package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzhxz implements zzhbs {
    private final RSAPublicKey zza;
    private final zzhxn zzb;
    private final zzhxn zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    public /* synthetic */ zzhxz(RSAPublicKey rSAPublicKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (zzhie.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhyc.zzb(zzhxnVar);
        if (!zzhxnVar.equals(zzhxnVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
        zzhyc.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhxnVar;
        this.zzc = zzhxnVar2;
        this.zzd = i5;
        this.zze = bArr;
        this.zzf = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] zzb = zzhig.zzb(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
        int bitLength3 = modulus.bitLength() - 1;
        zzhxn zzhxnVar = this.zzb;
        zzhyc.zzb(zzhxnVar);
        zzhxe zzhxeVar = zzhxe.zzd;
        MessageDigest messageDigest = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(zzhxnVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = zzb.length;
        int i5 = this.zzd;
        if (length < digestLength + i5 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (zzb[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i6 = length - digestLength;
        int i7 = i6 - 1;
        byte[] copyOf = Arrays.copyOf(zzb, i7);
        int length2 = copyOf.length;
        byte[] copyOfRange = Arrays.copyOfRange(zzb, length2, length2 + digestLength);
        int i8 = 0;
        while (true) {
            long j2 = (length * 8) - bitLength3;
            if (i8 < j2) {
                if (((copyOf[i8 / 8] >> (7 - (i8 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i8++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(this.zzc));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i7];
                int i9 = 0;
                int i10 = 0;
                while (i9 <= (i6 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(copyOfRange);
                    int i11 = i5;
                    messageDigest2.update(zzhig.zzb(BigInteger.valueOf(i9), 4));
                    byte[] digest2 = messageDigest2.digest();
                    int length3 = digest2.length;
                    System.arraycopy(digest2, 0, bArr4, i10, Math.min(length3, i7 - i10));
                    i10 += length3;
                    i9++;
                    i5 = i11;
                    messageDigest2 = messageDigest2;
                }
                int i12 = i5;
                byte[] bArr5 = new byte[i7];
                for (int i13 = 0; i13 < i7; i13++) {
                    bArr5[i13] = (byte) (bArr4[i13] ^ copyOf[i13]);
                }
                for (int i14 = 0; i14 <= j2; i14++) {
                    int i15 = i14 / 8;
                    bArr5[i15] = (byte) ((~(1 << (7 - (i14 % 8)))) & bArr5[i15]);
                }
                int i16 = 0;
                while (true) {
                    int i17 = (i6 - i12) - 2;
                    if (i16 >= i17) {
                        if (bArr5[i17] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i7 - i12, i7);
                        int i18 = digestLength + 8;
                        byte[] bArr6 = new byte[i18 + i12];
                        System.arraycopy(digest, 0, bArr6, 8, digest.length);
                        System.arraycopy(copyOfRange2, 0, bArr6, i18, copyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i16] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i16++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zze;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
