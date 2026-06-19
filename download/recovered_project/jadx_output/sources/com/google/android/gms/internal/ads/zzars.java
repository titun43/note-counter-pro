package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class zzars extends Thread {
    private final BlockingQueue zza;
    private final zzarr zzb;
    private final zzari zzc;
    private volatile boolean zzd = false;
    private final zzarp zze;

    public zzars(BlockingQueue blockingQueue, zzarr zzarrVar, zzari zzariVar, zzarp zzarpVar) {
        this.zza = blockingQueue;
        this.zzb = zzarrVar;
        this.zzc = zzariVar;
        this.zze = zzarpVar;
    }

    private void zzb() {
        zzary zzaryVar = (zzary) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaryVar.zze(3);
        try {
            try {
                zzaryVar.zzc("network-queue-take");
                zzaryVar.zzl();
                TrafficStats.setThreadStatsTag(zzaryVar.zzb());
                zzaru zza = this.zzb.zza(zzaryVar);
                zzaryVar.zzc("network-http-complete");
                if (zza.zze && zzaryVar.zzq()) {
                    zzaryVar.zzd("not-modified");
                    zzaryVar.zzw();
                } else {
                    zzase zzr = zzaryVar.zzr(zza);
                    zzaryVar.zzc("network-parse-complete");
                    zzarh zzarhVar = zzr.zzb;
                    if (zzarhVar != null) {
                        this.zzc.zzb(zzaryVar.zzi(), zzarhVar);
                        zzaryVar.zzc("network-cache-written");
                    }
                    zzaryVar.zzp();
                    this.zze.zza(zzaryVar, zzr, null);
                    zzaryVar.zzv(zzr);
                }
            } catch (zzash e4) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzaryVar, e4);
                zzaryVar.zzw();
            } catch (Exception e5) {
                zzask.zzd(e5, "Unhandled exception %s", e5.toString());
                zzash zzashVar = new zzash(e5);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzaryVar, zzashVar);
                zzaryVar.zzw();
            }
            zzaryVar.zze(4);
        } catch (Throwable th) {
            zzaryVar.zze(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzask.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
