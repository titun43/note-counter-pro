package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes.dex */
public final class zzgxf {
    public static final /* synthetic */ int zza = 0;

    static {
        new zzgxd();
    }

    public static byte[] zza(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        int i5 = 0;
        while (i5 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i5);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i6 = 0;
            while (i6 < min2) {
                int read = inputStream.read(bArr, i6, min2 - i6);
                if (read == -1) {
                    return zzc(arrayDeque, i5);
                }
                i6 += read;
                i5 += read;
            }
            min = zzgxz.zzb(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream zzb(InputStream inputStream, long j2) {
        return new zzgxe(inputStream, j2);
    }

    private static byte[] zzc(Queue queue, int i5) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i5) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        int i6 = i5 - length;
        while (i6 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i6, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i5 - i6, min);
            i6 -= min;
        }
        return copyOf;
    }
}
