package com.google.android.gms.ads.internal.util;

import android.os.SystemClock;
import x2.c;

/* loaded from: classes.dex */
public final class zzbu {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbu(long j2) {
        this.zza = j2;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            try {
                ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.zzb + this.zza > elapsedRealtime) {
                    return false;
                }
                this.zzb = elapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(long j2) {
        synchronized (this.zzc) {
            this.zza = j2;
        }
    }
}
