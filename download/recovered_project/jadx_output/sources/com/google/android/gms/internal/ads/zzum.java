package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class zzum extends zzif {
    public final int zza;

    public zzum(Throwable th, zzun zzunVar) {
        super("Decoder failed: ".concat(String.valueOf(zzunVar == null ? null : zzunVar.zza)), th);
        int i5;
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            i5 = codecException.getErrorCode();
        } else {
            i5 = 0;
        }
        this.zza = i5;
    }
}
