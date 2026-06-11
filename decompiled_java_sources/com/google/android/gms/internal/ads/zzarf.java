package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class zzarf {
    public static Pair zza(RandomAccessFile randomAccessFile) {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair zze = zze(randomAccessFile, 0);
        return zze != null ? zze : zze(randomAccessFile, 65535);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 16);
    }

    public static void zzc(ByteBuffer byteBuffer, long j2) {
        zzf(byteBuffer);
        int position = byteBuffer.position() + 16;
        if (j2 >= 0 && j2 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + position, (int) j2);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 27);
        sb.append("uint32 value of out range: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static long zzd(ByteBuffer byteBuffer) {
        zzf(byteBuffer);
        return zzg(byteBuffer, byteBuffer.position() + 12);
    }

    private static Pair zze(RandomAccessFile randomAccessFile, int i5) {
        int i6;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i5, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        zzf(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i7 = capacity2 - 22;
            int min = Math.min(i7, 65535);
            for (int i8 = 0; i8 < min; i8++) {
                i6 = i7 - i8;
                if (allocate.getInt(i6) == 101010256 && ((char) allocate.getShort(i6 + 20)) == i8) {
                    break;
                }
            }
        }
        i6 = -1;
        if (i6 == -1) {
            return null;
        }
        allocate.position(i6);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i6));
    }

    private static void zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static long zzg(ByteBuffer byteBuffer, int i5) {
        return byteBuffer.getInt(i5) & 4294967295L;
    }
}
