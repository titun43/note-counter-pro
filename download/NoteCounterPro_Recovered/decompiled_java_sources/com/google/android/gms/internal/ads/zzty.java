package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzty implements zzul {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdq zzg;
    private boolean zzh;

    public zzty(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdqVar;
        this.zzf = new AtomicReference();
    }

    private static zztx zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zztx();
                }
                return (zztx) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zztw(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzb(int i5, int i6, int i7, long j2, int i8) {
        zzg();
        zztx zzi = zzi();
        zzi.zza(i5, 0, i7, j2, i8);
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(1, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzc(int i5, int i6, zzie zzieVar, long j2, int i7) {
        zzg();
        zztx zzi = zzi();
        zzi.zza(i5, 0, 0, j2, i7);
        MediaCodec.CryptoInfo cryptoInfo = zzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzk = zzk(zzieVar.zzb, cryptoInfo.key);
        zzk.getClass();
        cryptoInfo.key = zzk;
        byte[] zzk2 = zzk(zzieVar.zza, cryptoInfo.iv);
        zzk2.getClass();
        cryptoInfo.iv = zzk2;
        cryptoInfo.mode = zzieVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(2, zzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdq zzdqVar = this.zzg;
                zzdqVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdqVar.zzc();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzul
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final /* synthetic */ void zzh(Message message) {
        int i5 = message.what;
        zztx zztxVar = null;
        if (i5 == 1) {
            zztx zztxVar2 = (zztx) message.obj;
            try {
                this.zzc.queueInputBuffer(zztxVar2.zza, 0, zztxVar2.zzc, zztxVar2.zze, zztxVar2.zzf);
            } catch (RuntimeException e4) {
                AtomicReference atomicReference = this.zzf;
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            zztxVar = zztxVar2;
        } else if (i5 == 2) {
            zztx zztxVar3 = (zztx) message.obj;
            int i6 = zztxVar3.zza;
            MediaCodec.CryptoInfo cryptoInfo = zztxVar3.zzd;
            long j2 = zztxVar3.zze;
            int i7 = zztxVar3.zzf;
            try {
                synchronized (zzb) {
                    this.zzc.queueSecureInputBuffer(i6, 0, cryptoInfo, j2, i7);
                }
            } catch (RuntimeException e5) {
                AtomicReference atomicReference2 = this.zzf;
                while (!atomicReference2.compareAndSet(null, e5) && atomicReference2.get() == null) {
                }
            }
            zztxVar = zztxVar3;
        } else if (i5 == 3) {
            this.zzg.zza();
        } else if (i5 != 4) {
            AtomicReference atomicReference3 = this.zzf;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                this.zzc.setParameters((Bundle) message.obj);
            } catch (RuntimeException e6) {
                AtomicReference atomicReference4 = this.zzf;
                while (!atomicReference4.compareAndSet(null, e6) && atomicReference4.get() == null) {
                }
            }
        }
        if (zztxVar != null) {
            ArrayDeque arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zztxVar);
            }
        }
    }
}
