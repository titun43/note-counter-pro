package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes.dex */
final class zzacd extends HandlerThread implements Handler.Callback {
    private zzdt zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzace zze;

    public zzacd() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdt zzdtVar;
        int i5 = message.what;
        try {
            if (i5 == 1) {
                try {
                    int i6 = message.arg1;
                    zzdt zzdtVar2 = this.zza;
                    if (zzdtVar2 == null) {
                        throw null;
                    }
                    zzdtVar2.zza(i6);
                    this.zze = new zzace(this, this.zza.zzc(), i6 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzdu e4) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.zzd = new IllegalStateException(e4);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e5) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                    this.zzc = e5;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e6) {
                    zzee.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.zzd = e6;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i5 == 2) {
                try {
                    zzdtVar = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzdtVar == null) {
                    throw null;
                }
                zzdtVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzace zza(int i5) {
        boolean z4;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdt(handler, null);
        synchronized (this) {
            z4 = false;
            this.zzb.obtainMessage(1, i5, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzace zzaceVar = this.zze;
        zzaceVar.getClass();
        return zzaceVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
