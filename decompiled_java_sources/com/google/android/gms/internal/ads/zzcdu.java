package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzcdu {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcdz zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbhj zzh;
    private zzdxz zzi;
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzcdt zzm;
    private final Object zzn;
    private j3.a zzo;
    private final AtomicBoolean zzp;

    public zzcdu() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcdz(com.google.android.gms.ads.internal.client.zzbb.zzf(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzcdt(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
    }

    public final /* synthetic */ VersionInfoParcel zzA() {
        return this.zzf;
    }

    public final /* synthetic */ zzbhj zzB() {
        return this.zzh;
    }

    public final /* synthetic */ AtomicBoolean zzC() {
        return this.zzp;
    }

    public final zzbhj zza() {
        zzbhj zzbhjVar;
        synchronized (this.zza) {
            zzbhjVar = this.zzh;
        }
        return zzbhjVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final void zze(Context context, VersionInfoParcel versionInfoParcel, zzdxz zzdxzVar) {
        zzbhj zzbhjVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(this.zzc);
                    this.zzb.zza(this.zze);
                    zzbyp.zzb(this.zze, this.zzf);
                    this.zzi = zzdxzVar;
                    com.google.android.gms.ads.internal.zzt.zzm();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcD)).booleanValue()) {
                        zzbhjVar = new zzbhj();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbhjVar = null;
                    }
                    this.zzh = zzbhjVar;
                    if (zzbhjVar != null) {
                        zzcel.zza(new zzcdq(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (x2.d.f()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjJ)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcdr(this));
                            } catch (RuntimeException e4) {
                                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e4);
                                this.zzp.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpr)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final Resources zzf() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmq)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot load resource from dynamite apk or local jar", e4);
            return null;
        }
    }

    public final void zzg(Throwable th, String str) {
        zzbyp.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzh(Throwable th, String str) {
        zzbyp.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbjn.zzf.zze()).floatValue());
    }

    public final void zzi(Throwable th, String str) {
        zzbyp.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzo() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final Context zzp() {
        return this.zze;
    }

    public final j3.a zzq() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdJ)).booleanValue()) {
                synchronized (this.zzn) {
                    try {
                        j3.a aVar = this.zzo;
                        if (aVar != null) {
                            return aVar;
                        }
                        j3.a submit = zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcds
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return zzcdu.this.zzx();
                            }
                        });
                        this.zzo = submit;
                        return submit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgzo.zza(new ArrayList());
    }

    public final zzcdz zzr() {
        return this.zzc;
    }

    public final boolean zzs(Context context) {
        if (x2.d.f()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjJ)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzt(String str) {
        this.zzg = str;
    }

    public final String zzu() {
        return this.zzg;
    }

    public final zzdxz zzv() {
        return this.zzi;
    }

    public final ActivityManager.MemoryInfo zzw() {
        return com.google.android.gms.ads.internal.util.client.zzf.zze(this.zze);
    }

    public final /* synthetic */ ArrayList zzx() {
        Context zza = zzcae.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo c5 = z2.c.a(zza).c(4096, zza.getApplicationInfo().packageName);
            if (c5.requestedPermissions != null && c5.requestedPermissionsFlags != null) {
                int i5 = 0;
                while (true) {
                    String[] strArr = c5.requestedPermissions;
                    if (i5 >= strArr.length) {
                        break;
                    }
                    if ((c5.requestedPermissionsFlags[i5] & 2) != 0) {
                        arrayList.add(strArr[i5]);
                    }
                    i5++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final /* synthetic */ Object zzy() {
        return this.zza;
    }

    public final /* synthetic */ Context zzz() {
        return this.zze;
    }
}
