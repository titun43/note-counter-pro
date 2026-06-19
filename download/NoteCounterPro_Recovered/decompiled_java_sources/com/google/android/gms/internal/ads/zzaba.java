package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.zzbgj;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaba extends Handler implements Runnable {
    final /* synthetic */ zzabf zza;
    private final zzabb zzb;
    private final long zzc;
    private zzaax zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaba(zzabf zzabfVar, Looper looper, zzabb zzabbVar, zzaax zzaaxVar, int i5, long j2) {
        super(looper);
        Objects.requireNonNull(zzabfVar);
        this.zza = zzabfVar;
        this.zzb = zzabbVar;
        this.zzd = zzaaxVar;
        this.zzc = j2;
    }

    private final void zzd() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.zzc;
        zzaax zzaaxVar = this.zzd;
        zzaaxVar.getClass();
        zzaaxVar.zzC(this.zzb, elapsedRealtime, j2, this.zzf);
        this.zze = null;
        zzabf zzabfVar = this.zza;
        zzaba zzj = zzabfVar.zzj();
        zzj.getClass();
        zzabfVar.zzi().execute(zzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i5 = message.what;
        if (i5 == 1) {
            zzd();
            return;
        }
        if (i5 == 4) {
            throw ((Error) message.obj);
        }
        zzabf zzabfVar = this.zza;
        zzabfVar.zzk(null);
        long j2 = this.zzc;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = elapsedRealtime - j2;
        zzaax zzaaxVar = this.zzd;
        zzaaxVar.getClass();
        if (this.zzh) {
            zzaaxVar.zzA(this.zzb, elapsedRealtime, j5, false);
            return;
        }
        int i6 = message.what;
        if (i6 == 2) {
            try {
                zzaaxVar.zzB(this.zzb, elapsedRealtime, j5);
                return;
            } catch (RuntimeException e4) {
                zzee.zzf("LoadTask", "Unexpected exception handling load completed", e4);
                this.zza.zzl(new zzabe(e4));
                return;
            }
        }
        if (i6 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i7 = this.zzf + 1;
        this.zzf = i7;
        zzaaz zzz = zzaaxVar.zzz(this.zzb, elapsedRealtime, j5, iOException, i7);
        if (zzz.zzb() == 3) {
            zzabfVar.zzl(this.zze);
        } else if (zzz.zzb() != 2) {
            if (zzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzz.zzc() != -9223372036854775807L ? zzz.zzc() : Math.min((this.zzf - 1) * zzbgj.zzq.zzf, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z4) {
                zzabb zzabbVar = this.zzb;
                String simpleName = zzabbVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(simpleName.length() + 5);
                sb.append("load:");
                sb.append(simpleName);
                Trace.beginSection(sb.toString());
                try {
                    zzabbVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e4) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e4).sendToTarget();
        } catch (Exception e5) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "Unexpected exception loading stream", e5);
            obtainMessage(3, new zzabe(e5)).sendToTarget();
        } catch (OutOfMemoryError e6) {
            if (this.zzi) {
                return;
            }
            zzee.zzf("LoadTask", "OutOfMemory error loading stream", e6);
            obtainMessage(3, new zzabe(e6)).sendToTarget();
        } catch (Error e7) {
            if (!this.zzi) {
                zzee.zzf("LoadTask", "Unexpected error loading stream", e7);
                obtainMessage(4, e7).sendToTarget();
            }
            throw e7;
        }
    }

    public final void zza(int i5) {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i5) {
            throw iOException;
        }
    }

    public final void zzb(long j2) {
        zzabf zzabfVar = this.zza;
        zzgrc.zzi(zzabfVar.zzj() == null);
        zzabfVar.zzk(this);
        if (j2 > 0) {
            sendEmptyMessageDelayed(1, j2);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z4) {
        this.zzi = z4;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.zza.zzk(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzaax zzaaxVar = this.zzd;
            zzaaxVar.getClass();
            zzaaxVar.zzA(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
