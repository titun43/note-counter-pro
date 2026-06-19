package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfor implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdvm zzj;
    private final List zzk;
    private final zzclx zzl;
    private final zzcac zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfov zzg = zzfoy.zzb();
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private boolean zzm = false;

    public zzfor(Context context, VersionInfoParcel versionInfoParcel, zzdvm zzdvmVar, zzehb zzehbVar, zzcac zzcacVar, zzclx zzclxVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdvmVar;
        this.zzn = zzcacVar;
        this.zzl = zzclxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkg)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzk();
        } else {
            this.zzk = zzguf.zzi();
        }
    }

    public static boolean zza() {
        boolean booleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbix.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbix.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                booleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] zzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfov zzfovVar = this.zzg;
                            zzaN = ((zzfoy) zzfovVar.zzbu()).zzaN();
                            zzfovVar.zzc();
                        }
                        new zzeha(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(new zzegy((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzka), 60000, new HashMap(), zzaN, "application/x-protobuf", false));
                    } catch (Exception e4) {
                        if ((e4 instanceof zzecr) && ((zzecr) e4).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e4, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(final zzfoh zzfohVar) {
        zzcei.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfoq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfor.this.zzc(zzfohVar);
            }
        });
    }

    public final void zzc(zzfoh zzfohVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzt(this.zze);
                        } catch (RemoteException | RuntimeException e4) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        t2.f fVar = t2.f.f3374b;
                        Context context = this.zze;
                        fVar.getClass();
                        this.zzi = t2.f.a(context);
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkb)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznp)).booleanValue()) {
                            long j2 = intValue;
                            zzcei.zzd.scheduleWithFixedDelay(this, j2, j2, TimeUnit.MILLISECONDS);
                        } else {
                            long j5 = intValue;
                            zzcei.zzd.scheduleAtFixedRate(this, j5, j5, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfohVar != null) {
            synchronized (zzc) {
                try {
                    zzfov zzfovVar = this.zzg;
                    if (zzfovVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkc)).intValue()) {
                        return;
                    }
                    zzfos zza2 = zzfou.zza();
                    zza2.zzv(zzfohVar.zzm());
                    zza2.zza(zzfohVar.zzb());
                    zza2.zzb(zzfohVar.zza());
                    zza2.zzw(3);
                    zza2.zzd(this.zzf.afmaVersion);
                    zza2.zze(this.zzh);
                    zza2.zzf(Build.VERSION.RELEASE);
                    zza2.zzg(Build.VERSION.SDK_INT);
                    zza2.zzx(zzfohVar.zzo());
                    zza2.zzi(zzfohVar.zzc());
                    zza2.zzj(this.zzi);
                    zza2.zzy(zzfohVar.zzn());
                    zza2.zzk(zzfohVar.zzd());
                    zza2.zzl(zzfohVar.zze());
                    zza2.zzm(zzfohVar.zzf());
                    zza2.zzn(this.zzj.zzd(zzfohVar.zzf()));
                    zza2.zzo(zzfohVar.zzg());
                    zza2.zzs(zzfohVar.zzh());
                    zza2.zzr(zzfohVar.zzk());
                    zza2.zzp(zzfohVar.zzi());
                    zza2.zzq(zzfohVar.zzj());
                    zza2.zzc(zzfohVar.zzl());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkg)).booleanValue()) {
                        zza2.zzh(this.zzk);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue()) {
                        zzclx zzclxVar = this.zzl;
                        zziff zzd2 = zzclxVar.zzd();
                        String zzc2 = zzclxVar.zzc();
                        if (zzd2 != null) {
                            zza2.zzt(zzd2);
                        }
                        if (zzc2 != null) {
                            zza2.zzu(zzc2);
                        }
                    }
                    zzfow zza3 = zzfox.zza();
                    zza3.zza(zza2);
                    zzfovVar.zzb(zza3);
                } finally {
                }
            }
        }
    }
}
