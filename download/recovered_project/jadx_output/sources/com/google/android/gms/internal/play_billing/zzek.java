package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class zzek implements Runnable {
    final Future zza;
    final zzej zzb;

    public zzek(Future future, zzej zzejVar) {
        this.zza = future;
        this.zzb = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable zza;
        Object obj2 = this.zza;
        if ((obj2 instanceof zzfi) && (zza = zzfj.zza((zzfi) obj2)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            Future future = this.zza;
            if (!future.isDone()) {
                throw new IllegalStateException(zzbf.zza("Future was expected to be done: %s", future));
            }
            boolean z4 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            this.zzb.zzb(obj);
        } catch (ExecutionException e4) {
            this.zzb.zza(e4.getCause());
        } catch (Throwable th2) {
            this.zzb.zza(th2);
        }
    }

    public final String toString() {
        zzba zza = zzbc.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
