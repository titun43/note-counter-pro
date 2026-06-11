package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zzayz implements zzazc {
    private static zzayz zzb;
    private final Context zzc;
    private final zzfwr zzd;
    private final zzfwy zze;
    private final zzfxa zzf;
    private final zzbae zzg;
    private final zzfvh zzh;
    private final Executor zzi;
    private final zzbch zzj;
    private final zzfwx zzk;
    private final zzbat zzm;
    private final zzbal zzn;
    private final zzbac zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    public zzayz(Context context, zzfvh zzfvhVar, zzfwr zzfwrVar, zzfwy zzfwyVar, zzfxa zzfxaVar, zzbae zzbaeVar, Executor executor, zzfvc zzfvcVar, zzbch zzbchVar, zzbat zzbatVar, zzbal zzbalVar, zzbac zzbacVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfvhVar;
        this.zzd = zzfwrVar;
        this.zze = zzfwyVar;
        this.zzf = zzfxaVar;
        this.zzg = zzbaeVar;
        this.zzi = executor;
        this.zzj = zzbchVar;
        this.zzm = zzbatVar;
        this.zzn = zzbalVar;
        this.zzo = zzbacVar;
        this.zzr = false;
        this.zzk = new zzayx(this, zzfvcVar);
    }

    public static synchronized zzayz zza(Context context, zzavi zzaviVar, boolean z4) {
        zzayz zzs;
        synchronized (zzayz.class) {
            zzfvi zzh = zzfvj.zzh();
            zzh.zza(zzaviVar.zza());
            zzh.zzb(zzaviVar.zzb());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzh.zzh(), z4);
        }
        return zzs;
    }

    private static synchronized zzayz zzs(Context context, Executor executor, zzfvj zzfvjVar, boolean z4) {
        zzayz zzayzVar;
        synchronized (zzayz.class) {
            try {
                if (zzb == null) {
                    zzfvh zza = zzfvh.zza(context, executor, z4);
                    zzazn zza2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzej)).booleanValue() ? zzazn.zza(context) : null;
                    zzbat zza3 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzek)).booleanValue() ? zzbat.zza(context, executor) : null;
                    zzbal zzbalVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue() ? new zzbal() : null;
                    zzbac zzbacVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue() ? new zzbac() : null;
                    zzfvx zza4 = zzfvx.zza(context, executor, zza, zzfvjVar);
                    zzbad zzbadVar = new zzbad(context);
                    zzbae zzbaeVar = new zzbae(zzfvjVar, zza4, new zzbar(context, zzbadVar), zzbadVar, zza2, zza3, zzbalVar, zzbacVar);
                    zzbch zzb2 = zzfwe.zzb(context, zza);
                    zzfvc zzfvcVar = new zzfvc();
                    zzayz zzayzVar2 = new zzayz(context, zza, new zzfwr(context, zzb2), new zzfwy(context, zzb2, new zzayw(zza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdc)).booleanValue()), new zzfxa(context, zzbaeVar, zza, zzfvcVar, false), zzbaeVar, executor, zzfvcVar, zzb2, zza3, zzbalVar, zzbacVar);
                    zzb = zzayzVar2;
                    zzayzVar2.zzc();
                    zzb.zzm();
                }
                zzayzVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzayzVar;
    }

    private final void zzt() {
        zzbat zzbatVar = this.zzm;
        if (zzbatVar != null) {
            zzbatVar.zzb();
        }
    }

    private final zzfwq zzu(int i5) {
        if (zzfwe.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzda)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    public final synchronized void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfwq zzu = zzu(1);
        if (zzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zza(zzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzd(MotionEvent motionEvent) {
        zzfvk zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            try {
                zzb2.zzd(null, motionEvent);
            } catch (zzfwz e4) {
                this.zzh.zzc(e4.zza(), -1L, e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zze(int i5, int i6, int i7) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznu)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f5 = i5;
        float f6 = displayMetrics.density;
        float f7 = i6;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f5 * f6, f7 * f6, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain);
        obtain.recycle();
        float f8 = displayMetrics.density;
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f5 * f8, f7 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain2);
        obtain2.recycle();
        float f9 = displayMetrics.density;
        MotionEvent obtain3 = MotionEvent.obtain(0L, i7, 1, f5 * f9, f7 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfvk zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zzb2.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar = this.zzo;
        if (zzbacVar != null) {
            zzbacVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfvk zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb3 = zzb2.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - currentTimeMillis, zzb3, null);
        return zzb3;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfvk zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zzb2.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - currentTimeMillis, zza, null);
        return zza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfwq zzc = this.zzf.zzc();
                    if ((zzc == null || zzc.zze(3600L)) && zzfwe.zza(this.zzj)) {
                        this.zzi.execute(new zzayy(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzn() {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfwq zzu = zzu(1);
        if (zzu != null) {
            String zza2 = zzu.zza().zza();
            str2 = zzu.zza().zzb();
            str = zza2;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbch zzbchVar = this.zzj;
                zzfvh zzfvhVar = this.zzh;
                zzfwv zza3 = zzfvq.zza(context, 1, zzbchVar, str, str2, "1", zzfvhVar);
                byte[] bArr = zza3.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfvhVar.zzb(5009, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzbcj zzd = zzbcj.zzd(zzian.zzs(bArr, 0, length), zzibb.zza());
                        if (!zzd.zza().zza().isEmpty()) {
                            if (!zzd.zza().zzb().isEmpty()) {
                                if (zzd.zzc().zzy().length != 0) {
                                    zzfwq zzu2 = zzu(1);
                                    if (zzu2 != null) {
                                        zzbcp zza4 = zzu2.zza();
                                        if (zza4 != null) {
                                            if (zzd.zza().zza().equals(zza4.zza())) {
                                                if (!zzd.zza().zzb().equals(zza4.zzb())) {
                                                }
                                            }
                                        }
                                    }
                                    zzfwx zzfwxVar = this.zzk;
                                    int i5 = zza3.zzc;
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzda)).booleanValue()) {
                                        zza = this.zzd.zza(zzd, zzfwxVar);
                                    } else if (i5 == 3) {
                                        zza = this.zze.zzb(zzd);
                                    } else {
                                        if (i5 == 4) {
                                            zza = this.zze.zza(zzd, zzfwxVar);
                                        }
                                        this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (zza) {
                                        zzfwq zzu3 = zzu(1);
                                        if (zzu3 != null) {
                                            if (this.zzf.zza(zzu3)) {
                                                this.zzr = true;
                                            }
                                            this.zza = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.zzh.zzb(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzicg e4) {
                this.zzh.zzc(4002, System.currentTimeMillis() - currentTimeMillis, e4);
            }
            this.zzl.countDown();
        } catch (Throwable th) {
            this.zzl.countDown();
            throw th;
        }
    }

    public final /* synthetic */ zzfvh zzo() {
        return this.zzh;
    }

    public final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    public final /* synthetic */ void zzr(boolean z4) {
        this.zzq = z4;
    }
}
