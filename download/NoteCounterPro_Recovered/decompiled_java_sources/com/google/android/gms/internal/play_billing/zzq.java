package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class zzq implements zzeu {
    static final zzf zzb;
    public static final /* synthetic */ int zzf = 0;
    private static final Object zzh;
    volatile Object zzc;
    volatile zzj zzd;
    volatile zzo zze;
    static final boolean zza = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger zzg = Logger.getLogger(zzq.class.getName());

    static {
        zzf zznVar;
        try {
            zznVar = new zzl(AtomicReferenceFieldUpdater.newUpdater(zzo.class, Thread.class, "zzb"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzo.class, "zzc"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, zzo.class, "zze"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, zzj.class, "zzd"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, Object.class, "zzc"));
            th = null;
        } catch (Throwable th) {
            th = th;
            zznVar = new zzn();
        }
        Throwable th2 = th;
        zzb = zznVar;
        if (th2 != null) {
            zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        zzh = new Object();
    }

    public static void zzc(zzq zzqVar) {
        zzo zzoVar;
        zzj zzjVar;
        do {
            zzoVar = zzqVar.zze;
        } while (!zzb.zze(zzqVar, zzoVar, zzo.zza));
        while (zzoVar != null) {
            Thread thread = zzoVar.zzb;
            if (thread != null) {
                zzoVar.zzb = null;
                LockSupport.unpark(thread);
            }
            zzoVar = zzoVar.zzc;
        }
        do {
            zzjVar = zzqVar.zzd;
        } while (!zzb.zzc(zzqVar, zzjVar, zzj.zza));
        zzj zzjVar2 = null;
        while (zzjVar != null) {
            zzj zzjVar3 = zzjVar.zzd;
            zzjVar.zzd = zzjVar2;
            zzjVar2 = zzjVar;
            zzjVar = zzjVar3;
        }
        while (zzjVar2 != null) {
            Runnable runnable = zzjVar2.zzb;
            zzj zzjVar4 = zzjVar2.zzd;
            if (runnable instanceof zzm) {
                throw null;
            }
            zzf(runnable, zzjVar2.zzc);
            zzjVar2 = zzjVar4;
        }
    }

    private final void zze(StringBuilder sb) {
        V v5;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    v5 = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e4) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e4.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e5) {
                sb.append("FAILURE, cause=[");
                sb.append(e5.getCause());
                sb.append("]");
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v5 == this ? "this future" : String.valueOf(v5));
        sb.append("]");
    }

    private static void zzf(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            zzg.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e4);
        }
    }

    private final void zzg(zzo zzoVar) {
        zzoVar.zzb = null;
        while (true) {
            zzo zzoVar2 = this.zze;
            if (zzoVar2 != zzo.zza) {
                zzo zzoVar3 = null;
                while (zzoVar2 != null) {
                    zzo zzoVar4 = zzoVar2.zzc;
                    if (zzoVar2.zzb != null) {
                        zzoVar3 = zzoVar2;
                    } else if (zzoVar3 != null) {
                        zzoVar3.zzc = zzoVar4;
                        if (zzoVar3.zzb == null) {
                            break;
                        }
                    } else if (!zzb.zze(this, zzoVar2, zzoVar4)) {
                        break;
                    }
                    zzoVar2 = zzoVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzh(Object obj) {
        if (obj instanceof zzg) {
            Throwable th = ((zzg) obj).zzc;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzi) {
            throw new ExecutionException(((zzi) obj).zza);
        }
        if (obj == zzh) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.zzc;
        if ((obj instanceof zzm) | (obj == null)) {
            zzg zzgVar = zza ? new zzg(z4, new CancellationException("Future.cancel() was called.")) : z4 ? zzg.zza : zzg.zzb;
            while (!zzb.zzd(this, obj, zzgVar)) {
                obj = this.zzc;
                if (!(obj instanceof zzm)) {
                }
            }
            zzc(this);
            if (obj instanceof zzm) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.zzc;
        if ((obj2 != null) && (!(obj2 instanceof zzm))) {
            return zzh(obj2);
        }
        zzo zzoVar = this.zze;
        if (zzoVar != zzo.zza) {
            zzo zzoVar2 = new zzo();
            do {
                zzf zzfVar = zzb;
                zzfVar.zza(zzoVar2, zzoVar);
                if (zzfVar.zze(this, zzoVar, zzoVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzg(zzoVar2);
                            throw new InterruptedException();
                        }
                        obj = this.zzc;
                    } while (!((obj != null) & (!(obj instanceof zzm))));
                    return zzh(obj);
                }
                zzoVar = this.zze;
            } while (zzoVar != zzo.zza);
        }
        return zzh(this.zzc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc instanceof zzg;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.zzc != null) & (!(r0 instanceof zzm));
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.zzc instanceof zzg) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zze(sb);
        } else {
            try {
                concat = zza();
            } catch (RuntimeException e4) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e4.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                zze(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (this.zzc instanceof zzm) {
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable, Executor executor) {
        executor.getClass();
        zzj zzjVar = this.zzd;
        if (zzjVar != zzj.zza) {
            zzj zzjVar2 = new zzj(runnable, executor);
            do {
                zzjVar2.zzd = zzjVar;
                if (zzb.zzc(this, zzjVar, zzjVar2)) {
                    return;
                } else {
                    zzjVar = this.zzd;
                }
            } while (zzjVar != zzj.zza);
        }
        zzf(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzh;
        }
        if (!zzb.zzd(this, null, obj)) {
            return false;
        }
        zzc(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.zzc;
            boolean z4 = true;
            if ((obj != null) & (!(obj instanceof zzm))) {
                return zzh(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzo zzoVar = this.zze;
                if (zzoVar != zzo.zza) {
                    zzo zzoVar2 = new zzo();
                    do {
                        zzf zzfVar = zzb;
                        zzfVar.zza(zzoVar2, zzoVar);
                        if (zzfVar.zze(this, zzoVar, zzoVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.zzc;
                                    if ((obj2 != null) & (!(obj2 instanceof zzm))) {
                                        return zzh(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzg(zzoVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzg(zzoVar2);
                        } else {
                            zzoVar = this.zze;
                        }
                    } while (zzoVar != zzo.zza);
                }
                return zzh(this.zzc);
            }
            while (nanos > 0) {
                Object obj3 = this.zzc;
                if ((obj3 != null) & (!(obj3 instanceof zzm))) {
                    return zzh(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzqVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z4 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z4) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z4) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(u.k(str, " for ", zzqVar));
        }
        throw new InterruptedException();
    }
}
