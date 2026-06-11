package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzuq extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzun zzc;
    public final String zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzuq(zzv zzvVar, Throwable th, boolean z4, int i5) {
        this(r4, th, r6, false, null, u.l(new StringBuilder(String.valueOf(r12).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", r12), null);
        String zzvVar2 = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 25 + zzvVar2.length());
        sb.append("Decoder init failed: [");
        sb.append(i5);
        sb.append("], ");
        sb.append(zzvVar2);
        String sb2 = sb.toString();
        String str = zzvVar.zzo;
        int abs = Math.abs(i5);
    }

    public final /* synthetic */ zzuq zza(zzuq zzuqVar) {
        return new zzuq(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zzuqVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzuq(zzv zzvVar, Throwable th, boolean z4, zzun zzunVar) {
        this(u.n(new StringBuilder(r1 + 23 + r3.length()), "Decoder init failed: ", r0, ", ", r3), th, zzvVar.zzo, false, zzunVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
        String str = zzunVar.zza;
        int length = str.length();
        String zzvVar2 = zzvVar.toString();
    }

    private zzuq(String str, Throwable th, String str2, boolean z4, zzun zzunVar, String str3, zzuq zzuqVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzunVar;
        this.zzd = str3;
    }
}
