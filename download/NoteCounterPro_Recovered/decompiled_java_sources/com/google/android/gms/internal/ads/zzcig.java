package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzcig extends zzgt {
    private final Context zza;
    private final zzhb zzb;
    private final zzcie zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbfp zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private j3.a zzp;
    private final AtomicLong zzq;

    public zzcig(Context context, zzhb zzhbVar, String str, int i5, zzhz zzhzVar, zzcie zzcieVar) {
        super(false);
        this.zza = context;
        this.zzb = zzhbVar;
        this.zzc = zzcieVar;
        this.zzd = str;
        this.zze = i5;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
        zze(zzhzVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfm)).booleanValue() || this.zzm) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfn)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int read = inputStream != null ? inputStream.read(bArr, i5, i6) : this.zzb.zza(bArr, i5, i6);
        if (this.zzf && this.zzg == null) {
            return read;
        }
        zzh(read);
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0227  */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhf zzhfVar) {
        zzbfm zzbfmVar;
        Long l5;
        boolean z4;
        boolean z5;
        long elapsedRealtime;
        StringBuilder sb;
        zzbgb zzbgbVar;
        if (this.zzh) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z6 = true;
        this.zzh = true;
        Uri uri = zzhfVar.zza;
        this.zzi = uri;
        boolean z7 = this.zzf;
        if (!z7) {
            zzg(zzhfVar);
        }
        this.zzj = zzbfp.zza(uri);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
            if (this.zzj != null) {
                this.zzj.zzh = zzhfVar.zze;
                this.zzj.zzi = zzgrt.zza(this.zzd);
                this.zzj.zzj = this.zze;
                zzbfmVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzj);
            } else {
                zzbfmVar = null;
            }
            if (zzbfmVar != null && zzbfmVar.zza()) {
                this.zzk = zzbfmVar.zzd();
                this.zzm = zzbfmVar.zzg();
                this.zzn = zzbfmVar.zze();
                this.zzo = zzbfmVar.zzf();
                this.zzl = true;
                if (!zzr()) {
                    this.zzg = zzbfmVar.zzb();
                    if (this.zzf) {
                        zzg(zzhfVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzj != null) {
            this.zzj.zzh = zzhfVar.zze;
            this.zzj.zzi = zzgrt.zza(this.zzd);
            this.zzj.zzj = this.zze;
            if (this.zzj.zzg) {
                l5 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfl);
            } else {
                l5 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfk);
            }
            long longValue = l5.longValue();
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future zza = zzbga.zza(this.zza, this.zzj);
            try {
                try {
                    zzbgbVar = (zzbgb) zza.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z6 = z7;
                }
                try {
                    this.zzk = zzbgbVar.zzc();
                    this.zzm = zzbgbVar.zzd();
                    this.zzn = zzbgbVar.zzf();
                    this.zzo = zzbgbVar.zze();
                } catch (InterruptedException unused) {
                    z5 = true;
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z5, elapsedRealtime);
                    this.zzl = z5;
                    int length = String.valueOf(elapsedRealtime).length() + 24;
                    sb = new StringBuilder(length);
                    z7 = length;
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzb.zzb(zzhfVar);
                } catch (ExecutionException | TimeoutException unused2) {
                    z4 = true;
                    zza.cancel(true);
                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z4, elapsedRealtime);
                    this.zzl = z4;
                    int length2 = String.valueOf(elapsedRealtime).length() + 24;
                    sb = new StringBuilder(length2);
                    z7 = length2;
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime);
                    sb.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    this.zzl = false;
                    if (this.zzj != null) {
                    }
                    return this.zzb.zzb(zzhfVar);
                } catch (Throwable th2) {
                    th = th2;
                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    this.zzc.zza(z6, elapsedRealtime3);
                    this.zzl = z6;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                    sb2.append("Cache connection took ");
                    sb2.append(elapsedRealtime3);
                    sb2.append("ms");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z5 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z4 = false;
            } catch (Throwable th3) {
                th = th3;
                z6 = false;
            }
            if (!zzr()) {
                this.zzg = zzbgbVar.zzb();
                if (z7) {
                    zzg(zzhfVar);
                }
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long elapsedRealtime4 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                this.zzc.zza(true, elapsedRealtime4);
                this.zzl = true;
                StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                sb3.append("Cache connection took ");
                sb3.append(elapsedRealtime4);
                sb3.append("ms");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                return -1L;
            }
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long elapsedRealtime5 = SystemClock.elapsedRealtime() - elapsedRealtime2;
            this.zzc.zza(true, elapsedRealtime5);
            this.zzl = true;
            sb = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
            sb.append("Cache connection took ");
            sb.append(elapsedRealtime5);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        this.zzl = false;
        if (this.zzj != null) {
            zzhe zzb = zzhfVar.zzb();
            zzb.zza(Uri.parse(this.zzj.zza));
            zzhfVar = zzb.zze();
        }
        return this.zzb.zzb(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z4 = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            x2.d.c(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z4) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj != null) {
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.zzp == null) {
                        this.zzp = zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcif
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return zzcig.this.zzq();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzq() {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().zzd(this.zzj));
    }
}
