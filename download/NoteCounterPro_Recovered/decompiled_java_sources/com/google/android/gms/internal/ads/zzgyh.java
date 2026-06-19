package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzgyh<V> extends zzgyi<V> {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgyi.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        public zza(boolean z4, Throwable th) {
            this.zzc = z4;
            this.zzd = th;
        }
    }

    final class zzb<V> implements Runnable {
        final zzgyh<V> zza;
        final j3.a zzb;

        public zzb(zzgyh zzgyhVar, j3.a aVar) {
            this.zza = zzgyhVar;
            this.zzb = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzgyi.zzr(this.zza, this, zzgyh.zze(this.zzb))) {
                zzgyh.zzw(this.zza, false);
            }
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgyh.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    interface zze<V> extends j3.a {
        @Override // j3.a
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    abstract class zzf<V> extends zzgyh<V> implements zze<V> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(j3.a aVar) {
        Throwable zzl;
        if (aVar instanceof zze) {
            Object obj = ((zzgyh) aVar).valueField;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    obj = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((aVar instanceof zzhaq) && (zzl = ((zzhaq) aVar).zzl()) != null) {
            return new zzc(zzl);
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!zzgyi.zzg) && isCancelled) {
            zza zzaVar2 = zza.zzb;
            Objects.requireNonNull(zzaVar2);
            return zzaVar2;
        }
        try {
            Object zzf2 = zzf(aVar);
            if (!isCancelled) {
                return zzf2 == null ? zzgyi.zze : zzf2;
            }
            String valueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(valueOf);
            return new zza(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e4) {
            return new zzc(e4);
        } catch (CancellationException e5) {
            return !isCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e5)) : new zza(false, e5);
        } catch (ExecutionException e6) {
            return isCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e6)) : new zzc(e6.getCause());
        }
    }

    private static Object zzf(Future future) {
        Object obj;
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
        return obj;
    }

    public static Object zzg(Object obj) {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzgyi.zze) {
            return null;
        }
        return obj;
    }

    public static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzgyh zzgyhVar, boolean z4) {
        zzd zzdVar = null;
        while (true) {
            zzgyhVar.zzs();
            if (z4) {
                zzgyhVar.zzi();
            }
            zzgyhVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzq = zzgyhVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzq != null) {
                zzd zzdVar4 = zzq.next;
                zzq.next = zzdVar3;
                zzdVar3 = zzq;
                zzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgyhVar = zzbVar.zza;
                    if (zzgyhVar.valueField == zzbVar && zzgyi.zzr(zzgyhVar, zzbVar, zze(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z4 = false;
        }
    }

    private final void zzx(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        } catch (Exception e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            Logger zza2 = zzgyi.zzf.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", u.n(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyi, j3.a
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzgrc.zzk(runnable, "Runnable was null.");
        zzgrc.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzgyi.zzg) {
            zzaVar = new zza(z4, new CancellationException("Future.cancel() was called."));
        } else {
            zzaVar = z4 ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzgyh<V> zzgyhVar = this;
        boolean z5 = false;
        while (true) {
            if (zzgyi.zzr(zzgyhVar, obj, zzaVar)) {
                zzw(zzgyhVar, z4);
                if (!(obj instanceof zzb)) {
                    break;
                }
                j3.a aVar = ((zzb) obj).zzb;
                if (!(aVar instanceof zze)) {
                    aVar.cancel(z4);
                    break;
                }
                zzgyhVar = (zzgyh) aVar;
                obj = zzgyhVar.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = zzgyhVar.valueField;
                if (zzh(obj)) {
                    return z5;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                j3.a aVar = ((zzb) obj).zzb;
                try {
                    if (aVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(aVar);
                    }
                } catch (Throwable th) {
                    zzhag.zzb(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = zzgrt.zzb(zzd());
                } catch (Throwable th2) {
                    zzhag.zzb(th2);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzx(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean zza(Object obj) {
        if (obj == null) {
            obj = zzgyi.zze;
        }
        if (!zzgyi.zzr(this, null, obj)) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public boolean zzb(Throwable th) {
        th.getClass();
        if (!zzgyi.zzr(this, null, new zzc(th))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public void zzc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public void zzi() {
    }

    public final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    public final boolean zzk(j3.a aVar) {
        zzc zzcVar;
        aVar.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (aVar.isDone()) {
                if (zzgyi.zzr(this, null, zze(aVar))) {
                    zzw(this, false);
                    return true;
                }
                return false;
            }
            zzb zzbVar = new zzb(this, aVar);
            if (zzgyi.zzr(this, null, zzbVar)) {
                try {
                    aVar.addListener(zzbVar, zzgzd.INSTANCE);
                    return true;
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzgyi.zzr(this, zzbVar, zzcVar);
                    return true;
                }
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            aVar.cancel(((zza) obj).zzc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        return zzt(j2, timeUnit);
    }
}
