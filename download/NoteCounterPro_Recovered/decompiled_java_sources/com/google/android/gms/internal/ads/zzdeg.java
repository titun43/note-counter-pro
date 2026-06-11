package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzdeg extends zzdhd {
    private final ScheduledExecutorService zzb;
    private final x2.b zzc;
    private final zzdxz zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private ScheduledFuture zzj;
    private ScheduledFuture zzk;

    public zzdeg(ScheduledExecutorService scheduledExecutorService, x2.b bVar, zzdxz zzdxzVar) {
        super(Collections.EMPTY_SET);
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = false;
        this.zzb = scheduledExecutorService;
        this.zzc = bVar;
        this.zzd = zzdxzVar;
    }

    private final synchronized void zzf(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            ((x2.c) this.zzc).getClass();
            this.zze = SystemClock.elapsedRealtime() + j2;
            this.zzj = this.zzb.schedule(new zzdee(this, null), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzg(long j2) {
        try {
            ScheduledFuture scheduledFuture = this.zzk;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzk.cancel(false);
            }
            ((x2.c) this.zzc).getClass();
            this.zzf = SystemClock.elapsedRealtime() + j2;
            this.zzk = this.zzb.schedule(new zzdef(this, null), j2, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        try {
            if (this.zzi) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                long j2 = this.zze;
                ((x2.c) this.zzc).getClass();
                this.zzg = j2 - SystemClock.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzk;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzh = -1L;
            } else {
                this.zzk.cancel(false);
                long j5 = this.zzf;
                ((x2.c) this.zzc).getClass();
                this.zzh = j5 - SystemClock.elapsedRealtime();
            }
            this.zzi = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzi) {
                if (this.zzg > 0 && (scheduledFuture2 = this.zzj) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzg);
                }
                if (this.zzh > 0 && (scheduledFuture = this.zzk) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzh);
                }
                this.zzi = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.zzi = false;
        zzf(0L);
    }

    public final synchronized void zzd(int i5) {
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i5);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i5 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i5);
            if (this.zzi) {
                long j2 = this.zzg;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.zzg = millis;
                return;
            }
            ((x2.c) this.zzc).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoJ)).booleanValue()) {
                long j5 = this.zze;
                if (elapsedRealtime >= j5 || j5 - elapsedRealtime > millis) {
                    zzf(millis);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpg)).booleanValue()) {
                        zzdxy zza = this.zzd.zza();
                        zza.zzc("action", "rtnc");
                        zza.zzf();
                    }
                }
            } else {
                long j6 = this.zze;
                if (elapsedRealtime > j6 || j6 - elapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i5) {
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i5);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i5 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i5);
            if (this.zzi) {
                long j2 = this.zzh;
                if (j2 <= 0 || millis >= j2) {
                    millis = j2;
                }
                this.zzh = millis;
                return;
            }
            ((x2.c) this.zzc).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoJ)).booleanValue()) {
                if (elapsedRealtime == this.zzf) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j5 = this.zzf;
                if (elapsedRealtime >= j5 || j5 - elapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j6 = this.zzf;
                if (elapsedRealtime > j6 || j6 - elapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
