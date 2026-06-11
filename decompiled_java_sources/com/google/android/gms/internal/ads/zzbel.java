package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class zzbel extends zzbeg {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final byte[] zza(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i5 = 4;
        if (length == 1) {
            int zza = zzbek.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i6 = 0; i6 < split.length; i6++) {
                    int zza2 = zzbek.zza(split[i6]);
                    int i7 = (zza2 >> 16) ^ ((char) zza2);
                    byte b2 = (byte) i7;
                    byte b5 = (byte) (i7 >> 8);
                    int i8 = i6 + i6;
                    bArr[i8] = new byte[]{b2, b5}[0];
                    bArr[i8 + 1] = b5;
                }
            } else {
                bArr = new byte[length];
                for (int i9 = 0; i9 < split.length; i9++) {
                    int zza3 = zzbek.zza(split[i9]);
                    bArr[i9] = (byte) ((zza3 >> 24) ^ (((zza3 & 255) ^ ((zza3 >> 8) & 255)) ^ ((zza3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArr2);
                byte[] digest = this.zzb.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i5 = length2;
                }
                byte[] bArr3 = new byte[i5];
                System.arraycopy(digest, 0, bArr3, 0, i5);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
