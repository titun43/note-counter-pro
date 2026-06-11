package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzsa extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzsc zza;

    public zzsa(zzsc zzscVar) {
        Objects.requireNonNull(zzscVar);
        this.zza = zzscVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i5) {
        zzed zzs = this.zza.zza.zzs();
        zzs.zzd(-1, zzrz.zza);
        zzs.zze();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzed zzs = this.zza.zza.zzs();
        zzs.zzd(-1, zzrx.zza);
        zzs.zze();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzed zzs = this.zza.zza.zzs();
        zzs.zzd(-1, zzry.zza);
        zzs.zze();
    }
}
