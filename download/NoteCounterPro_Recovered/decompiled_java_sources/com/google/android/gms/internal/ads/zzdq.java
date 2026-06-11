package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzdq {
    private boolean zza;

    public zzdq() {
        throw null;
    }

    public final synchronized boolean zza() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean zzb() {
        boolean z4;
        z4 = this.zza;
        this.zza = false;
        return z4;
    }

    public final synchronized void zzc() {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized void zzd() {
        boolean z4 = false;
        while (!this.zza) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean zze(long j2) {
        if (j2 > 0) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j5 = j2 + elapsedRealtime;
                if (j5 < elapsedRealtime) {
                    zzd();
                } else {
                    boolean z4 = false;
                    while (!this.zza && elapsedRealtime < j5) {
                        try {
                            wait(j5 - elapsedRealtime);
                        } catch (InterruptedException unused) {
                            z4 = true;
                        }
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zza;
    }

    public final synchronized boolean zzf() {
        return this.zza;
    }

    public zzdq(zzdn zzdnVar) {
    }
}
