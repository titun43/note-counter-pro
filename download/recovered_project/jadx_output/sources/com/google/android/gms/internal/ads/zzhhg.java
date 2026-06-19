package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes.dex */
abstract class zzhhg {
    private final zzhhe zza;
    private final zzhhe zzb;

    public zzhhg(byte[] bArr) {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    public abstract zzhhe zza(byte[] bArr, int i5);

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.zzb.zzd(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i5 = length & 15;
            int i6 = i5 == 0 ? length : (length + 16) - i5;
            int remaining = byteBuffer.remaining();
            int i7 = remaining % 16;
            int i8 = (i7 == 0 ? remaining : (remaining + 16) - i7) + i6;
            ByteBuffer order = ByteBuffer.allocate(i8 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i6);
            order.put(byteBuffer);
            order.position(i8);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(zzhhk.zza(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.zza.zzc(bArr, byteBuffer);
        } catch (GeneralSecurityException e4) {
            throw new AEADBadTagException(e4.toString());
        }
    }
}
