package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhwr {
    public static byte[] zza(byte[]... bArr) {
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= bArr.length) {
                byte[] bArr2 = new byte[i6];
                int i7 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i7, length);
                    i7 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i5].length;
            if (i6 > com.google.android.gms.common.api.f.API_PRIORITY_OTHER - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i6 += length2;
            i5++;
        }
    }

    public static final byte[] zzb(byte[] bArr, int i5, byte[] bArr2, int i6, int i7) {
        if (bArr.length - 16 < i5) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[i8] = (byte) (bArr[i8 + i5] ^ bArr2[i8]);
        }
        return bArr3;
    }

    public static final void zzc(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i5) {
        if (i5 < 0 || byteBuffer2.remaining() < i5 || byteBuffer3.remaining() < i5 || byteBuffer.remaining() < i5) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }
}
