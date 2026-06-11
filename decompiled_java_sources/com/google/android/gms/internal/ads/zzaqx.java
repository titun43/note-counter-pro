package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class zzaqx implements zzaqy {
    private final ByteBuffer zza;

    public zzaqx(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final void zzb(MessageDigest[] messageDigestArr, long j2, int i5) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = this.zza;
        synchronized (byteBuffer) {
            int i6 = (int) j2;
            byteBuffer.position(i6);
            byteBuffer.limit(i6 + i5);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
