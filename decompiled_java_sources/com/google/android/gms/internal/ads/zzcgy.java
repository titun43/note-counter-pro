package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzcgy implements zzhb {
    private final Context zza;
    private final zzhb zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbfp zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzhf zzl;

    public zzcgy(Context context, zzhb zzhbVar, String str, int i5, zzhz zzhzVar, zzcgx zzcgxVar) {
        this.zza = context;
        this.zzb = zzhbVar;
        this.zzc = str;
        this.zzd = i5;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfm)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfn)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i5, i6) : this.zzb.zza(bArr, i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        Long l5;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhfVar.zza;
        this.zzh = uri;
        this.zzl = zzhfVar;
        this.zzi = zzbfp.zza(uri);
        zzbfm zzbfmVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhfVar.zze;
                this.zzi.zzi = zzgrt.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbfmVar = com.google.android.gms.ads.internal.zzt.zzj().zzc(this.zzi);
            }
            if (zzbfmVar != null && zzbfmVar.zza()) {
                this.zzj = zzbfmVar.zzg();
                this.zzk = zzbfmVar.zze();
                if (!zzf()) {
                    this.zzf = zzbfmVar.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhfVar.zze;
            this.zzi.zzi = zzgrt.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l5 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfl);
            } else {
                l5 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfk);
            }
            long longValue = l5.longValue();
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            SystemClock.elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzz();
            Future zza = zzbga.zza(this.zza, this.zzi);
            try {
                try {
                    try {
                        zzbgb zzbgbVar = (zzbgb) zza.get(longValue, TimeUnit.MILLISECONDS);
                        zzbgbVar.zzc();
                        this.zzj = zzbgbVar.zzd();
                        this.zzk = zzbgbVar.zzf();
                        zzbgbVar.zze();
                        if (!zzf()) {
                            this.zzf = zzbgbVar.zzb();
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        zza.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    zza.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzhe zzb = zzhfVar.zzb();
            zzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            x2.d.c(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }
}
