package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class zzaqz implements zzaqy {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaqz(FileChannel fileChannel, long j2, long j5) {
        this.zza = fileChannel;
        this.zzb = j2;
        this.zzc = j5;
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final void zzb(MessageDigest[] messageDigestArr, long j2, int i5) {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j2, i5);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
