package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzclt {
    private final zzclk zza;
    private final zzdxz zzb;

    public zzclt(zzclk zzclkVar, zzdxz zzdxzVar) {
        this.zza = zzclkVar;
        this.zzb = zzdxzVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpr)).booleanValue()) {
            Executor executor = zzcei.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpt)).booleanValue()) {
                zzcls zzclsVar = new zzcls(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpv)).intValue(), null);
                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpu)).intValue();
                executor = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzclsVar);
            }
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclt.this.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzps)).booleanValue()) {
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            zzdxy zza = this.zzb.zza();
            zza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
            sb.append(elapsedRealtime2);
            zza.zzc("webview_startup_l", sb.toString());
            zza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpy)).booleanValue()) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclt.this.zzc();
                }
            });
        }
    }

    public final void zzc() {
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        this.zza.zzb(new zzclo(this, SystemClock.elapsedRealtime()));
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zzb;
    }
}
