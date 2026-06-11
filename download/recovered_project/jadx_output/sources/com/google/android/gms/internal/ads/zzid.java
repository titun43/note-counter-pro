package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
final class zzid {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public final /* synthetic */ void zza(int i5, int i6) {
        MediaCodec.CryptoInfo.Pattern pattern = this.zzb;
        pattern.set(i5, i6);
        this.zza.setPattern(pattern);
    }
}
