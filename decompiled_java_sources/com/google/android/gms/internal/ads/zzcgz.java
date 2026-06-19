package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzcgz implements zzijs {
    private final ByteBuffer zza;

    public zzcgz(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final int zza(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[min];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final long zzb() {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final long zzc() {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final void zzd(long j2) {
        this.zza.position((int) j2);
    }

    @Override // com.google.android.gms.internal.ads.zzijs
    public final ByteBuffer zze(long j2, long j5) {
        ByteBuffer byteBuffer = this.zza;
        int position = byteBuffer.position();
        byteBuffer.position((int) j2);
        ByteBuffer slice = byteBuffer.slice();
        slice.limit((int) j5);
        byteBuffer.position(position);
        return slice;
    }
}
