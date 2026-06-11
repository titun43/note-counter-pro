package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
final class zzsv {
    private Exception zza;
    private long zzb = -9223372036854775807L;
    private long zzc = -9223372036854775807L;

    public final void zza(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == -9223372036854775807L && !zzsw.zzG()) {
            this.zzb = 200 + elapsedRealtime;
        }
        long j2 = this.zzb;
        if (j2 == -9223372036854775807L || elapsedRealtime < j2) {
            this.zzc = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.zza;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.zza;
        zzc();
        throw exc3;
    }

    public final boolean zzb() {
        if (this.zza == null) {
            return false;
        }
        return zzsw.zzG() || SystemClock.elapsedRealtime() < this.zzc;
    }

    public final void zzc() {
        this.zza = null;
        this.zzb = -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }
}
