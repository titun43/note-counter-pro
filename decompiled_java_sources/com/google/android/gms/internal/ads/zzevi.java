package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
final class zzevi {
    public final j3.a zza;
    private final long zzb;
    private final x2.b zzc;

    public zzevi(j3.a aVar, long j2, x2.b bVar) {
        this.zza = aVar;
        this.zzc = bVar;
        ((x2.c) bVar).getClass();
        this.zzb = SystemClock.elapsedRealtime() + j2;
    }

    public final boolean zza() {
        x2.b bVar = this.zzc;
        long j2 = this.zzb;
        ((x2.c) bVar).getClass();
        return j2 < SystemClock.elapsedRealtime();
    }
}
