package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class zzin {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i5 = this.zza;
        int i6 = this.zzb;
        int i7 = this.zzc;
        int i8 = this.zzd;
        int i9 = this.zze;
        int i10 = this.zzf;
        int i11 = this.zzg;
        int i12 = this.zzh;
        int i13 = this.zzi;
        int i14 = this.zzj;
        long j2 = this.zzk;
        int i15 = this.zzl;
        String str = zzfj.zza;
        Locale locale = Locale.US;
        return "DecoderCounters {\n decoderInits=" + i5 + ",\n decoderReleases=" + i6 + "\n queuedInputBuffers=" + i7 + "\n skippedInputBuffers=" + i8 + "\n renderedOutputBuffers=" + i9 + "\n skippedOutputBuffers=" + i10 + "\n droppedBuffers=" + i11 + "\n droppedInputBuffers=" + i12 + "\n maxConsecutiveDroppedBuffers=" + i13 + "\n droppedToKeyframeEvents=" + i14 + "\n totalVideoFrameProcessingOffsetUs=" + j2 + "\n videoFrameProcessingOffsetCount=" + i15 + "\n}";
    }

    public final synchronized void zza() {
    }
}
