package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzfbr implements zzfax {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgzy zzc;
    private final ScheduledExecutorService zzd;
    private final zzeke zze;
    private final zzfjk zzf;
    private final VersionInfoParcel zzg;

    public zzfbr(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzeke zzekeVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzekeVar;
        this.zzf = zzfjkVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzfax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j3.a zza() {
        j3.a zzc;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlR)).booleanValue() && this.zza.zzz()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlV)).booleanValue()) {
            }
            if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlP)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlQ)).intValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlN)).booleanValue()) {
                        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlO);
                        if (!TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        zzc = zzgzo.zzi(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlT)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                    } catch (Exception e4) {
                        zzc = zzgzo.zzc(e4);
                    }
                    zzgzy zzgzyVar = this.zzc;
                    return zzgzo.zzi((zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj(zzgzg.zzw(zzc), zzfbq.zza, zzgzyVar), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfbo
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ j3.a zza(Object obj) {
                            return zzfbr.this.zzc((Throwable) obj);
                        }
                    }, zzgzyVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlT)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                }
            }
        }
        return zzgzo.zza(new zzfbs(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, -1, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 56;
    }

    public final /* synthetic */ j3.a zzc(final Throwable th) {
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlS)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgzo.zza(th instanceof SecurityException ? new zzfbs(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 2, null) : th instanceof IllegalStateException ? new zzfbs(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 3, null) : th instanceof IllegalArgumentException ? new zzfbs(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 4, null) : th instanceof TimeoutException ? new zzfbs(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 5, null) : new zzfbs(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0, null));
    }
}
