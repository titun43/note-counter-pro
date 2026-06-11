package com.google.android.gms.internal.ads;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcei {
    public static final zzgzy zza;
    public static final zzgzy zzb;
    public static final zzgzy zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgzz zze;
    public static final zzgzy zzf;
    public static final zzgzy zzg;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        zzbgv zzbgvVar = zzbhe.zzmK;
        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar) != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar)).booleanValue()) {
            zzbgv zzbgvVar2 = zzbhe.zzmL;
            if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar2) != null) {
                zzbgv zzbgvVar3 = zzbhe.zzmM;
                if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcef("Default"));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbgvVar3)).booleanValue());
                    zza = new zzceh(threadPoolExecutor, null);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new zzcef("Loader"));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    zzb = new zzceh(threadPoolExecutor2, null);
                    ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new zzcef("Activeview"));
                    threadPoolExecutor3.allowCoreThreadTimeOut(true);
                    zzc = new zzceh(threadPoolExecutor3, null);
                    zzcee zzceeVar = new zzcee(3, new zzcef("Schedule"));
                    zzd = zzceeVar;
                    zze = zzhaf.zzc(zzceeVar);
                    zzf = new zzceh(new zzceg(), null);
                    zzg = new zzceh(zzhaf.zza(), null);
                }
            }
        }
        threadPoolExecutor = new ThreadPoolExecutor(2, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcef("Default"));
        zza = new zzceh(threadPoolExecutor, null);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor22 = new ThreadPoolExecutor(5, 5, 10L, timeUnit2, new LinkedBlockingQueue(), new zzcef("Loader"));
        threadPoolExecutor22.allowCoreThreadTimeOut(true);
        zzb = new zzceh(threadPoolExecutor22, null);
        ThreadPoolExecutor threadPoolExecutor32 = new ThreadPoolExecutor(1, 1, 10L, timeUnit2, new LinkedBlockingQueue(), new zzcef("Activeview"));
        threadPoolExecutor32.allowCoreThreadTimeOut(true);
        zzc = new zzceh(threadPoolExecutor32, null);
        zzcee zzceeVar2 = new zzcee(3, new zzcef("Schedule"));
        zzd = zzceeVar2;
        zze = zzhaf.zzc(zzceeVar2);
        zzf = new zzceh(new zzceg(), null);
        zzg = new zzceh(zzhaf.zza(), null);
    }
}
