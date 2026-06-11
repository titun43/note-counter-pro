package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class zzfkj {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgzy zzc;

    public zzfkj(Callable callable, zzgzy zzgzyVar) {
        this.zzb = callable;
        this.zzc = zzgzyVar;
    }

    public final synchronized void zza(int i5) {
        Deque deque = this.zza;
        int size = i5 - deque.size();
        for (int i6 = 0; i6 < size; i6++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    public final synchronized j3.a zzb() {
        zza(1);
        return (j3.a) this.zza.poll();
    }

    public final synchronized void zzc(j3.a aVar) {
        this.zza.addFirst(aVar);
    }
}
