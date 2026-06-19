package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhwy {
    public static byte[] zza(byte[] bArr) {
        byte[] bArr2;
        int i5;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i6 = length >> 1;
        byte[] zzc = zzc(Arrays.copyOf(bArr, i6));
        byte[] zzc2 = zzc(Arrays.copyOfRange(bArr, i6, length));
        int length2 = zzc.length;
        int length3 = zzc2.length;
        int i7 = length2 + 4 + length3;
        if (i7 >= 128) {
            bArr2 = new byte[i7 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i7;
            i5 = 3;
        } else {
            bArr2 = new byte[i7 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i7;
            i5 = 2;
        }
        int i8 = i5 + 1;
        bArr2[i5] = 2;
        int i9 = i5 + 2;
        bArr2[i8] = (byte) length2;
        System.arraycopy(zzc, 0, bArr2, i9, length2);
        int i10 = i9 + length2;
        bArr2[i10] = 2;
        bArr2[i10 + 1] = (byte) length3;
        System.arraycopy(zzc2, 0, bArr2, i10 + 2, length3);
        return bArr2;
    }

    public static ECParameterSpec zzb(zzhww zzhwwVar) {
        int ordinal = zzhwwVar.ordinal();
        if (ordinal == 0) {
            return zzhis.zza;
        }
        if (ordinal == 1) {
            return zzhis.zzb;
        }
        if (ordinal == 2) {
            return zzhis.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(zzhwwVar.toString()));
    }

    private static byte[] zzc(byte[] bArr) {
        int length;
        int i5 = 0;
        while (true) {
            length = bArr.length;
            if (i5 >= length || bArr[i5] != 0) {
                break;
            }
            i5++;
        }
        if (i5 == length) {
            i5 = length - 1;
        }
        int i6 = (bArr[i5] & 128) == 128 ? 1 : 0;
        int i7 = length - i5;
        byte[] bArr2 = new byte[i7 + i6];
        System.arraycopy(bArr, i5, bArr2, i6, i7);
        return bArr2;
    }
}
