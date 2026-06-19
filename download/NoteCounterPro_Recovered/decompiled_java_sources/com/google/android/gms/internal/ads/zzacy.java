package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* loaded from: classes.dex */
final class zzacy extends zzacv implements Choreographer$VsyncCallback {
    private final Handler zzf;

    public /* synthetic */ zzacy(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.zzf = zzfj.zzc(null);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i5) {
        if (i5 == 0) {
            this.zza.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        long frameTimeNanos;
        Choreographer.FrameTimeline[] frameTimelines;
        long expectedPresentationTimeNanos;
        long expectedPresentationTimeNanos2;
        frameTimeNanos = frameData.getFrameTimeNanos();
        this.zzc = frameTimeNanos;
        frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos();
            expectedPresentationTimeNanos2 = frameTimelines[0].getExpectedPresentationTimeNanos();
            long j2 = expectedPresentationTimeNanos - expectedPresentationTimeNanos2;
            this.zzd = j2 != 0 ? j2 : -9223372036854775807L;
        } else {
            this.zzd = -9223372036854775807L;
        }
        this.zzf.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzacy zzacyVar = zzacy.this;
                zzacyVar.zza.postVsyncCallback(zzacyVar);
            }
        }, 500L);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zza() {
        super.zza();
        this.zza.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacv
    public final void zzb() {
        this.zzb.unregisterDisplayListener(this);
        this.zzf.removeCallbacksAndMessages(null);
        this.zza.removeVsyncCallback(this);
        this.zzc = -9223372036854775807L;
        this.zzd = -9223372036854775807L;
    }
}
