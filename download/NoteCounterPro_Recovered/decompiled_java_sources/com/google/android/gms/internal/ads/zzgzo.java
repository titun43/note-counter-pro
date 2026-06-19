package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzgzo extends zzgzq {
    public static j3.a zza(Object obj) {
        return obj == null ? zzgzs.zza : new zzgzs(obj);
    }

    public static j3.a zzb() {
        return zzgzs.zza;
    }

    public static j3.a zzc(Throwable th) {
        th.getClass();
        return new zzgzr(th);
    }

    public static j3.a zzd(Callable callable, Executor executor) {
        zzhan zzhanVar = new zzhan(callable);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static j3.a zze(Runnable runnable, Executor executor) {
        zzhan zze = zzhan.zze(runnable, null);
        executor.execute(zze);
        return zze;
    }

    public static j3.a zzf(zzgyv zzgyvVar, Executor executor) {
        zzhan zzhanVar = new zzhan(zzgyvVar);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static j3.a zzg(j3.a aVar, Class cls, zzgqt zzgqtVar, Executor executor) {
        int i5 = zzgyg.zzd;
        zzgyf zzgyfVar = new zzgyf(aVar, cls, zzgqtVar);
        aVar.addListener(zzgyfVar, zzhaf.zzd(executor, zzgyfVar));
        return zzgyfVar;
    }

    public static j3.a zzh(j3.a aVar, Class cls, zzgyw zzgywVar, Executor executor) {
        int i5 = zzgyg.zzd;
        zzgye zzgyeVar = new zzgye(aVar, cls, zzgywVar);
        aVar.addListener(zzgyeVar, zzhaf.zzd(executor, zzgyeVar));
        return zzgyeVar;
    }

    public static j3.a zzi(j3.a aVar, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return aVar.isDone() ? aVar : zzhak.zze(aVar, j2, timeUnit, scheduledExecutorService);
    }

    public static j3.a zzj(j3.a aVar, zzgyw zzgywVar, Executor executor) {
        int i5 = zzgyn.zzc;
        zzgyl zzgylVar = new zzgyl(aVar, zzgywVar);
        aVar.addListener(zzgylVar, zzhaf.zzd(executor, zzgylVar));
        return zzgylVar;
    }

    public static j3.a zzk(j3.a aVar, zzgqt zzgqtVar, Executor executor) {
        int i5 = zzgyn.zzc;
        zzgym zzgymVar = new zzgym(aVar, zzgqtVar);
        aVar.addListener(zzgymVar, zzhaf.zzd(executor, zzgymVar));
        return zzgymVar;
    }

    @SafeVarargs
    public static j3.a zzl(j3.a... aVarArr) {
        return new zzgyx(zzguf.zzr(aVarArr), true);
    }

    public static j3.a zzm(Iterable iterable) {
        return new zzgyx(zzguf.zzp(iterable), true);
    }

    public static zzgzn zzn(Iterable iterable) {
        return new zzgzn(false, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgzn zzo(j3.a... aVarArr) {
        return new zzgzn(true, zzguf.zzr(aVarArr), null);
    }

    public static zzgzn zzp(Iterable iterable) {
        return new zzgzn(true, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static j3.a zzq(j3.a... aVarArr) {
        return new zzgyx(zzguf.zzr(aVarArr), false);
    }

    public static void zzr(j3.a aVar, zzgzl zzgzlVar, Executor executor) {
        zzgzlVar.getClass();
        aVar.addListener(new zzgzm(aVar, zzgzlVar), executor);
    }

    public static Object zzs(Future future) {
        if (future.isDone()) {
            return zzhap.zza(future);
        }
        throw new IllegalStateException(zzgrt.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhap.zza(future);
        } catch (ExecutionException e4) {
            if (e4.getCause() instanceof Error) {
                throw new zzgze((Error) e4.getCause());
            }
            throw new zzhao(e4.getCause());
        }
    }
}
