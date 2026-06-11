package com.google.android.gms.ads.internal.overlay;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class zzq implements Callable {
    private final long zza;

    public zzq(long j2) {
        this.zza = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ConcurrentHashMap concurrentHashMap;
        long j2 = this.zza;
        concurrentHashMap = AdOverlayInfoParcel.zzz;
        if (concurrentHashMap.remove(Long.valueOf(j2)) == null) {
            return null;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzg(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
