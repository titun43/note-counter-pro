package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzafu {
    public static List zza(byte[] bArr) {
        long zze = zze(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzi(zze)));
        arrayList.add(zzh(zzi(3840L)));
        return arrayList;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i5;
        if ((byteBuffer.get(5) & 2) == 0) {
            i5 = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i6 = 28;
            int i7 = 28;
            for (int i8 = 0; i8 < b2; i8++) {
                i7 += byteBuffer.get(i8 + 27);
            }
            byte b5 = byteBuffer.get(i7 + 26);
            for (int i9 = 0; i9 < b5; i9++) {
                i6 += byteBuffer.get(i7 + 27 + i9);
            }
            i5 = i7 + i6;
        }
        int i10 = byteBuffer.get(i5 + 26) + 27 + i5;
        return (int) ((zzg(byteBuffer.get(i10), byteBuffer.limit() - i10 > 1 ? byteBuffer.get(i10 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int zze(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean zzf(long j2, long j5) {
        return j2 - j5 <= zzi(3840L) / 1000;
    }

    private static long zzg(byte b2, byte b5) {
        int i5;
        int i6 = b2 & 255;
        int i7 = b2 & 3;
        if (i7 != 0) {
            i5 = 2;
            if (i7 != 1 && i7 != 2) {
                i5 = b5 & 63;
            }
        } else {
            i5 = 1;
        }
        int i8 = i6 >> 3;
        return i5 * (i8 >= 16 ? 2500 << r6 : i8 >= 12 ? 10000 << (i8 & 1) : (i8 & 3) == 3 ? 60000 : 10000 << r6);
    }

    private static byte[] zzh(long j2) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j2).array();
    }

    private static long zzi(long j2) {
        return (j2 * 1000000000) / 48000;
    }
}
