package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class zzgzm implements Runnable {
    final Future zza;
    final zzgzl zzb;

    public zzgzm(Future future, zzgzl zzgzlVar) {
        this.zza = future;
        this.zzb = zzgzlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzhaq) && (zza = zzhar.zza((zzhaq) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgzo.zzs(future));
        } catch (ExecutionException e4) {
            this.zzb.zza(e4.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgqy zzb = zzgqz.zzb(this);
        zzb.zza(this.zzb);
        return zzb.toString();
    }
}
