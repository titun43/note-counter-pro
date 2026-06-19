package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final /* synthetic */ class zzeyp implements Callable {
    static final /* synthetic */ zzeyp zza = new zzeyp();

    private /* synthetic */ zzeyp() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j2;
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzt.zzh().zzl());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpO)).booleanValue()) {
            ActivityManager.MemoryInfo zzw = com.google.android.gms.ads.internal.zzt.zzh().zzw();
            if (zzw != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    j2 = zzw.advertisedMem;
                    bundle.putLong("a_ad_mem", j2);
                }
                bundle.putLong("a_total", zzw.totalMem);
                bundle.putLong("a_avai", zzw.availMem);
                bundle.putLong("a_threshold", zzw.threshold);
                bundle.putBoolean("a_is_low_mem", zzw.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzeyr(bundle);
    }
}
