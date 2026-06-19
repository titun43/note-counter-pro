package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzgdq implements zzgdh, zzgdd, zzgdw {
    private static final zzifd zza;
    private final Context zzb;
    private final zzgcl zzc;
    private final ExecutorService zzd;
    private final zzgce zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzavj zzq = zzavk.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzifc zzc = zzifd.zzc();
        zzc.zza(17);
        zza = (zzifd) zzc.zzbu();
    }

    public zzgdq(Context context, zzgcl zzgclVar, ExecutorService executorService, zzgce zzgceVar, Random random, String str, long j2, long j5, double d5, String str2, long j6) {
        this.zzb = context;
        this.zzc = zzgclVar;
        this.zzd = executorService;
        this.zze = zzgceVar;
        this.zzg = str;
        this.zzh = j2;
        this.zzi = j5;
        this.zzj = d5;
        this.zzk = str2;
        this.zzl = j6;
        this.zzf = random.nextDouble() < d5;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final j3.a zza() {
        return zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgdq.this.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zzb(int i5, long j2, Throwable th, String str) {
        long longValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap hashMap = this.zzt;
                            Integer valueOf = Integer.valueOf(i5);
                            Long l5 = (Long) hashMap.get(valueOf);
                            if (l5 == null) {
                                l5 = 0L;
                            }
                            longValue = 1 + l5.longValue();
                            hashMap.put(valueOf, Long.valueOf(longValue));
                        } finally {
                        }
                    }
                    list.add(new zzgdn(i5, j2, th, str, longValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdp
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzgdq.this.zzd();
                            }
                        }, this.zzi);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdw
    public final void zzc(zzgdv zzgdvVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgdvVar.zza());
        }
    }

    public final void zzd() {
        zzavj zzavjVar;
        zzguf zzq;
        String str;
        synchronized (this.zzn) {
            zzavjVar = (zzavj) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzq = zzguf.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzq.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            zzgdn zzgdnVar = (zzgdn) zzq.get(i5);
            if (i6 >= this.zzh) {
                zze((zzavk) zzavjVar.zzbu());
                zzavjVar.zzb();
                i6 = 0;
            }
            zzawb zza2 = zzawc.zza();
            zza2.zza(zzgdnVar.zza);
            zza2.zzb(zzgdnVar.zzb);
            zza2.zze(zzgdnVar.zze);
            String str2 = zzgdnVar.zzd;
            if (str2 != null) {
                zza2.zzf(str2);
            }
            Throwable th = zzgdnVar.zzc;
            zza2.zzg(th == null ? 2 : 3);
            if (th != null) {
                zza2.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                zza2.zzd(str);
            }
            zzavjVar.zza((zzawc) zza2.zzbu());
            i5++;
            i6++;
        }
        if (i6 > 0) {
            zze((zzavk) zzavjVar.zzbu());
            zzavjVar.zzb();
        }
    }

    public final void zze(zzavk zzavkVar) {
        try {
            zzgdl zza2 = zzgdm.zza();
            zza2.zzb(zza);
            zzgdj zza3 = zzgdk.zza();
            zza3.zza(zzavkVar);
            zza2.zza((zzgdk) zza3.zzbu());
            this.zze.zzb(this.zzg, ((zzgdm) zza2.zzbu()).zzaN(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    public final /* synthetic */ void zzf() {
        int i5;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d5 = this.zzj;
        long j2 = this.zzl;
        Locale locale = Locale.getDefault();
        zzavj zza2 = zzavk.zza();
        zza2.zzc(Build.VERSION.SDK_INT);
        zza2.zzd(Build.MODEL);
        zza2.zze(locale.getLanguage());
        zza2.zzf(locale.getCountry());
        zza2.zzi(str);
        zza2.zzg(context.getPackageName());
        zza2.zzl(j2);
        if (d5 > 0.0d) {
            zza2.zzk((int) (1.0d / d5));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zza2.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i5 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i5 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i5 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i5 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zza2.zzm(i5);
        } catch (RuntimeException unused2) {
        }
        zzavk zzavkVar = (zzavk) zza2.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzavkVar);
        }
    }
}
