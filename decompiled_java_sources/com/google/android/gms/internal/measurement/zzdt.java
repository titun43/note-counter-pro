package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import x2.c;

/* loaded from: classes.dex */
abstract class zzdt implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzee zzk;

    public zzdt(zzee zzeeVar, boolean z4) {
        this.zzk = zzeeVar;
        ((c) zzeeVar.zza).getClass();
        this.zzh = System.currentTimeMillis();
        ((c) zzeeVar.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        this.zzj = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        z4 = this.zzk.zzh;
        if (z4) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e4) {
            this.zzk.zzS(e4, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
