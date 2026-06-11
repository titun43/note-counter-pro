package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class zzih extends zzic {
    public zzv zza;
    public final zzie zzb = new zzie();
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzal.zzb("media3.decoder");
    }

    public zzih(int i5, int i6) {
        this.zzg = i5;
    }

    private final ByteBuffer zzm(int i5) {
        int i6 = this.zzg;
        if (i6 == 1) {
            return ByteBuffer.allocate(i5);
        }
        if (i6 == 2) {
            return ByteBuffer.allocateDirect(i5);
        }
        ByteBuffer byteBuffer = this.zzc;
        throw new zzig(byteBuffer == null ? 0 : byteBuffer.capacity(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzic
    public void zza() {
        super.zza();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    public final void zzj(int i5) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzm(i5);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i6 = i5 + position;
        if (capacity >= i6) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer zzm = zzm(i6);
        zzm.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzm.put(byteBuffer);
        }
        this.zzc = zzm;
    }

    public final boolean zzk() {
        return zzi(1073741824);
    }

    public final void zzl() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
