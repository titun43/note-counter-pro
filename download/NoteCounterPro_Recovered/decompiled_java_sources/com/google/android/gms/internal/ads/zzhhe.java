package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class zzhhe {
    int[] zza;
    private final int zzb;

    public zzhhe(byte[] bArr, int i5) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhhc.zzd(bArr);
        this.zzb = i5;
    }

    public abstract int[] zza(int[] iArr, int i5);

    public abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int zzb = zzb();
            throw new GeneralSecurityException(u.l(new StringBuilder(String.valueOf(zzb).length() + 36), "The nonce length (in bytes) must be ", zzb));
        }
        int remaining = byteBuffer.remaining();
        int i5 = remaining / 64;
        for (int i6 = 0; i6 < i5 + 1; i6++) {
            ByteBuffer zzd = zzd(bArr, this.zzb + i6);
            if (i6 == i5) {
                zzhwr.zzc(allocate, byteBuffer, zzd, remaining % 64);
            } else {
                zzhwr.zzc(allocate, byteBuffer, zzd, 64);
            }
        }
        return allocate.array();
    }

    public final ByteBuffer zzd(byte[] bArr, int i5) {
        int[] zza = zza(zzhhc.zzd(bArr), i5);
        int[] iArr = (int[]) zza.clone();
        zzhhc.zzb(iArr);
        for (int i6 = 0; i6 < 16; i6++) {
            zza[i6] = zza[i6] + iArr[i6];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }
}
