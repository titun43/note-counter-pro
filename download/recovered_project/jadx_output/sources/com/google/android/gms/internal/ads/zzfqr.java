package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzfqr {
    private final int zzc;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzfrf zzg;
    private final x2.b zzh;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    final Map zza = new LinkedHashMap();
    final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzfqr(int i5, ScheduledExecutorService scheduledExecutorService, zzfrf zzfrfVar, x2.b bVar) {
        this.zzc = i5;
        this.zzf = scheduledExecutorService;
        this.zzg = zzfrfVar;
        this.zzh = bVar;
    }

    private static String zzl(String str, AdFormat adFormat) {
        return str + ":" + adFormat;
    }

    private final boolean zzm(zzfsa zzfsaVar) {
        AdFormat zzo = zzfsaVar.zzo();
        if (zzo == null) {
            return true;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                return !map.containsKey(zzl(zzfsaVar.zzn(), zzo));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean zzn() {
        Map map = this.zza;
        synchronized (map) {
            try {
                for (zzfsa zzfsaVar : map.values()) {
                    if (zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzo(long j2) {
        if (this.zzb.compareAndSet(false, true)) {
            if (j2 > 0) {
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfqr.this.zzi();
                    }
                }, j2, TimeUnit.MILLISECONDS);
            } else {
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfqr.this.zzh();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzk() {
        zzguf zzq;
        try {
            if (this.zzd.get()) {
                return;
            }
            zzfsa zzfsaVar = null;
            this.zze = null;
            if (zzf() < this.zzc || zzn()) {
                Map map = this.zza;
                synchronized (map) {
                    zzq = zzguf.zzq(map.values());
                }
                int size = zzq.size();
                double d5 = Double.MAX_VALUE;
                for (int i5 = 0; i5 < size; i5++) {
                    zzfsa zzfsaVar2 = (zzfsa) zzq.get(i5);
                    if (zzfsaVar2.zzq()) {
                        double zzp = zzfsaVar2.zzp() / zzfsaVar2.zze.zzd;
                        if (zzp < d5) {
                            d5 = zzp;
                        }
                        if (zzp < d5) {
                            zzfsaVar = zzfsaVar2;
                        }
                    }
                }
                if (zzfsaVar != null) {
                    zzfsaVar.zze();
                    if (zzfsaVar.zzp() > 0) {
                        zzfrf zzfrfVar = this.zzg;
                        ((x2.c) this.zzh).getClass();
                        zzfrfVar.zzq(System.currentTimeMillis(), zzfsaVar.zzn(), zzfsaVar.zze.zza, zzfsaVar.zzo(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), zzf(), this.zzc);
                    }
                }
                int zzf = zzf();
                int i6 = this.zzc;
                if (zzf >= i6) {
                    zzr();
                }
                if (zzf() >= i6) {
                    if (zzn()) {
                    }
                }
                if (zzn()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfqr.this.zzk();
                        }
                    });
                    return;
                }
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqo
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfqr.this.zzj();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzV)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            zzr();
            this.zzb.set(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg() {
        this.zzd.set(false);
        zzk();
    }

    private final void zzr() {
        int size;
        Map map = this.zza;
        synchronized (map) {
            size = map.size();
        }
        zzfrf zzfrfVar = this.zzg;
        x2.b bVar = this.zzh;
        int i5 = this.zzc;
        ((x2.c) bVar).getClass();
        zzfrfVar.zzs(System.currentTimeMillis(), i5, size);
    }

    private final void zzs(zzfsa zzfsaVar, int i5) {
        ((x2.c) this.zzh).getClass();
        this.zzg.zzr(System.currentTimeMillis(), zzfsaVar.zzn(), zzfsaVar.zze.zza, zzfsaVar.zzo(), zzfsaVar.zze.zzd, zzfsaVar.zzp(), i5, zzf(), this.zzc);
    }

    private final synchronized boolean zzt(zzfsa zzfsaVar) {
        if (!this.zzd.get() && zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
            zzfsaVar.zze();
            return true;
        }
        return false;
    }

    private static final int zzu(zzfsa zzfsaVar) {
        int zzp = zzfsaVar.zzp();
        int i5 = zzp - 1;
        if (!zzfsaVar.zzt()) {
            zzp = i5;
        }
        return Math.max(zzp, 0);
    }

    public final void zza(zzfsa zzfsaVar) {
        int i5 = 1;
        if (zzfsaVar.zzp() <= 0 && !zzfsaVar.zzt()) {
            i5 = 0;
        }
        zzc(zzfsaVar, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:8:0x0009, B:10:0x0013, B:12:0x001a, B:15:0x0026, B:17:0x002f, B:18:0x0033, B:21:0x0023, B:22:0x004c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb(zzfsa zzfsaVar) {
        ScheduledFuture scheduledFuture;
        try {
            if (zzm(zzfsaVar)) {
                return;
            }
            long zzy = zzfsaVar.zzy();
            if (zzy <= 0) {
                zza(zzfsaVar);
                return;
            }
            if (zzfsaVar.zzp() <= 0) {
                if (zzfsaVar.zzt()) {
                }
                this.zzd.set(true);
                scheduledFuture = this.zze;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zze = null;
                this.zzb.set(true);
                this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfqr.this.zzg();
                    }
                }, zzy, TimeUnit.MILLISECONDS);
            }
            zzs(zzfsaVar, 1);
            this.zzd.set(true);
            scheduledFuture = this.zze;
            if (scheduledFuture != null) {
            }
            this.zze = null;
            this.zzb.set(true);
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfqr.this.zzg();
                }
            }, zzy, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzc(zzfsa zzfsaVar, int i5) {
        if (zzm(zzfsaVar)) {
            return;
        }
        if (i5 > 0) {
            zzs(zzfsaVar, i5);
        }
        if (!zzt(zzfsaVar)) {
            zzo(0L);
        } else {
            zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzU)).longValue());
        }
    }

    public final void zzd(String str, AdFormat adFormat, zzfsa zzfsaVar) {
        Map map = this.zza;
        String zzl = zzl(str, adFormat);
        synchronized (map) {
            try {
                if (!map.containsKey(zzl)) {
                    map.put(zzl, zzfsaVar);
                    zzt(zzfsaVar);
                    zzo(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzU)).longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(String str, AdFormat adFormat) {
        zzfsa zzfsaVar;
        Map map = this.zza;
        String zzl = zzl(str, adFormat);
        synchronized (map) {
            zzfsaVar = (zzfsa) map.remove(zzl);
        }
        if (zzfsaVar == null) {
            return;
        }
        int zzu = zzu(zzfsaVar);
        if (zzu > 0) {
            zzs(zzfsaVar, zzu);
        }
        if (zzfsaVar.zzp() > 0 || zzfsaVar.zzt()) {
            zzo(0L);
        }
    }

    public final int zzf() {
        int i5;
        Map map = this.zza;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                i5 = 0;
                while (it.hasNext()) {
                    i5 += zzu((zzfsa) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i5;
    }
}
