package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import o.h;

/* loaded from: classes.dex */
final class zzua extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzuj zzo;
    private final Object zza = new Object();
    private final h zzd = new h();
    private final h zze = new h();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zzua(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        h hVar = this.zzd;
        hVar.f2725c = hVar.f2724b;
        h hVar2 = this.zze;
        hVar2.f2725c = hVar2.f2724b;
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzl(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzm() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i5) {
        synchronized (this.zza) {
            try {
                this.zzd.a(i5);
                zzuj zzujVar = this.zzo;
                if (zzujVar != null) {
                    zzuu zzuuVar = ((zzus) zzujVar).zza;
                    if (zzuuVar.zzbf() != null) {
                        zzuuVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i5, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzl(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i5);
                this.zzf.add(bufferInfo);
                zzuj zzujVar = this.zzo;
                if (zzujVar != null) {
                    zzuu zzuuVar = ((zzus) zzujVar).zza;
                    if (zzuuVar.zzbf() != null) {
                        zzuuVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzgrc.zzi(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            try {
                zzm();
                int i5 = -1;
                if (zzk()) {
                    return -1;
                }
                h hVar = this.zzd;
                int i6 = hVar.f2724b;
                int i7 = hVar.f2725c;
                if (!(i6 == i7)) {
                    if (i6 == i7) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i5 = hVar.f2723a[i6];
                    hVar.f2724b = (i6 + 1) & hVar.f2726d;
                }
                return i5;
            } finally {
            }
        }
    }

    public final int zze(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzm();
                if (zzk()) {
                    return -1;
                }
                h hVar = this.zze;
                int i5 = hVar.f2724b;
                int i6 = hVar.f2725c;
                if (i5 == i6) {
                    return -1;
                }
                if (i5 == i6) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i7 = hVar.f2723a[i5];
                hVar.f2724b = (i5 + 1) & hVar.f2726d;
                if (i7 >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i7 == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    i7 = -2;
                }
                return i7;
            } finally {
            }
        }
    }

    public final MediaFormat zzf() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzfj.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzua.this.zzi();
                }
            });
        }
    }

    public final void zzh(zzuj zzujVar) {
        synchronized (this.zza) {
            this.zzo = zzujVar;
        }
    }

    public final /* synthetic */ void zzi() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j2 = this.zzl - 1;
                this.zzl = j2;
                if (j2 > 0) {
                    return;
                }
                if (j2 >= 0) {
                    zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
