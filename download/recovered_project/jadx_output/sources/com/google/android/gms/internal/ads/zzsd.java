package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzsd implements zzqc {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private final AudioTrack zzd;
    private final zzql zze;
    private zzru zzf;
    private final zzsk zzg;
    private final boolean zzh;
    private final int zzi;
    private final zzsc zzj;
    private final zzed zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private final zzsh zzr;

    /* JADX WARN: Multi-variable type inference failed */
    public zzsd(AudioTrack audioTrack, zzql zzqlVar, zzsh zzshVar, zzdn zzdnVar) {
        this.zzd = audioTrack;
        this.zze = zzqlVar;
        this.zzr = zzshVar;
        zzed zzedVar = new zzed(Thread.currentThread());
        this.zzk = zzedVar;
        zzedVar.zzg(false);
        boolean zzA = zzfj.zzA(zzqlVar.zza);
        this.zzh = zzA;
        if (zzA) {
            this.zzi = zzfj.zzD(zzqlVar.zza) * Integer.bitCount(zzqlVar.zzc);
        } else {
            this.zzi = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.zzg = new zzsk(new zzrw(this, null), zzdnVar, audioTrack, zzqlVar.zza, this.zzi, zzqlVar.zze);
        if (zzshVar != null) {
            this.zzf = new zzru(audioTrack, zzshVar, objArr2 == true ? 1 : 0);
        }
        this.zzj = zzg() ? new zzsc(this, objArr == true ? 1 : 0) : null;
    }

    public static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, final zzed zzedVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzro
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzrm zzrmVar = zzrm.zza;
                        zzed zzedVar2 = zzed.this;
                        zzedVar2.zzd(-1, zzrmVar);
                        zzedVar2.zze();
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i5 = zzc - 1;
                    zzc = i5;
                    if (i5 == 0) {
                        ScheduledExecutorService scheduledExecutorService = zzb;
                        if (scheduledExecutorService == null) {
                            throw null;
                        }
                        scheduledExecutorService.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzrm zzrmVar = zzrm.zza;
                        zzed zzedVar2 = zzed.this;
                        zzedVar2.zzd(-1, zzrmVar);
                        zzedVar2.zze();
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i6 = zzc - 1;
                    zzc = i6;
                    if (i6 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = zzb;
                        if (scheduledExecutorService2 == null) {
                            throw null;
                        }
                        scheduledExecutorService2.shutdown();
                        zzb = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final long zzq() {
        if (!this.zzh) {
            return this.zzn;
        }
        long j2 = this.zzm;
        int i5 = this.zzi;
        String str = zzfj.zza;
        return ((j2 + r2) - 1) / i5;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zza() {
        this.zzg.zzb();
        if (!this.zzl || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzb() {
        this.zzg.zzf();
        if (!this.zzl || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzc(ByteBuffer byteBuffer, int i5, long j2) {
        zzsh zzshVar;
        boolean z4 = this.zzh;
        if (!z4 && this.zzo == 0) {
            this.zzo = zzsw.zzD(this.zze.zza, byteBuffer);
        }
        zzq();
        int underrunCount = this.zzd.getUnderrunCount();
        int i6 = this.zzp;
        this.zzp = underrunCount;
        if (underrunCount > i6) {
            zzed zzedVar = this.zzk;
            zzedVar.zzd(-1, zzrn.zza);
            zzedVar.zze();
        }
        int remaining = byteBuffer.remaining();
        int write = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            r2 = write == remaining;
            if (z4) {
                this.zzm += write;
                return r2;
            }
            if (r2) {
                this.zzn = (this.zzo * i5) + this.zzn;
            }
            return r2;
        }
        if (write != -6 && write != -32) {
            r2 = false;
        }
        if (r2 && (zzshVar = this.zzr) != null) {
            zzsi zzsiVar = zzshVar.zza;
            if (zzsiVar.zzi() != null) {
                zzps zzpsVar = zzps.zza;
                zzsiVar.zzh(zzpsVar);
                zzsiVar.zzi().zza(zzpsVar);
            }
        }
        throw new zzqb(write, r2);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzd() {
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        this.zzg.zze(zzq());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zze() {
        if (this.zzg.zzc()) {
            this.zzd.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && zzg()) {
            zzsc zzscVar = this.zzj;
            zzscVar.getClass();
            zzscVar.zza();
        }
        zzru zzruVar = this.zzf;
        if (zzruVar != null) {
            zzruVar.zzd();
            this.zzf = null;
        }
        final AudioTrack audioTrack = this.zzd;
        final zzed zzedVar = this.zzk;
        final Handler zzc2 = zzfj.zzc(null);
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = zzfj.zzg("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzsd.zzp(audioTrack, zzc2, zzedVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzf(float f5) {
        this.zzd.setVolume(f5);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzg() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = this.zzd.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final long zzk() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final boolean zzl() {
        return this.zzg.zzd(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzm(zzqa zzqaVar) {
        this.zzk.zzb(zzqaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzn(zzpq zzpqVar) {
        boolean equals;
        LogSessionId unused;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId zza2 = zzpqVar.zza();
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = zza2.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        this.zzd.setLogSessionId(zza2);
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzo(AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    public final /* synthetic */ AudioTrack zzr() {
        return this.zzd;
    }

    public final /* synthetic */ zzed zzs() {
        return this.zzk;
    }
}
