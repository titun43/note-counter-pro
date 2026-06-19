package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class zzvh implements zzuk {
    private final MediaCodec zza;
    private final zzug zzb;

    public /* synthetic */ zzvh(MediaCodec mediaCodec, zzug zzugVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzugVar;
        if (Build.VERSION.SDK_INT < 35 || zzugVar == null) {
            return;
        }
        zzugVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zza(int i5, int i6, int i7, long j2, int i8) {
        this.zza.queueInputBuffer(i5, 0, i7, j2, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzb(int i5, int i6, zzie zzieVar, long j2, int i7) {
        this.zza.queueSecureInputBuffer(i5, 0, zzieVar.zzb(), j2, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzc(int i5, boolean z4) {
        this.zza.releaseOutputBuffer(i5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzd(int i5, long j2) {
        this.zza.releaseOutputBuffer(i5, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zze() {
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final ByteBuffer zzh(int i5) {
        return this.zza.getInputBuffer(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final ByteBuffer zzj(int i5) {
        return this.zza.getOutputBuffer(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzl() {
        zzug zzugVar;
        zzug zzugVar2;
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && i5 < 33) {
                this.zza.stop();
            }
            if (i5 >= 35 && (zzugVar2 = this.zzb) != null) {
                zzugVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzugVar = this.zzb) != null) {
                zzugVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzq(int i5) {
        this.zza.setVideoScalingMode(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }
}
