package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcrv {
    zzbyr zza;
    zzbyr zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzekc zze;
    private final zzdva zzf;
    private final zzgzy zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcrv(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzekc zzekcVar, zzdva zzdvaVar, zzgzy zzgzyVar, zzgzy zzgzyVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzekcVar;
        this.zzf = zzdvaVar;
        this.zzg = zzgzyVar;
        this.zzh = zzgzyVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlF));
    }

    private final j3.a zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlF)) || this.zzd.zzx()) {
                return zzgzo.zza(str);
            }
            final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlG), String.valueOf(random.nextInt(com.google.android.gms.common.api.f.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrp
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ j3.a zza(Object obj) {
                        return zzcrv.this.zze(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrq
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ j3.a zza(Object obj) {
                        return zzcrv.this.zzf(buildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "11");
            return zzgzo.zza(buildUpon.toString());
        } catch (Exception e4) {
            return zzgzo.zzc(e4);
        }
    }

    public final void zza(String str, zzfqk zzfqkVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgzo.zzr(zzgzo.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlL)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcro(this, zzfqkVar, str, zzvVar), this.zzg);
    }

    public final j3.a zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgzo.zza(str) : zzgzo.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzcrv.this.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ j3.a zzd(String str, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcrv.this.zzh(th);
            }
        });
        return zzgzo.zza(str);
    }

    public final /* synthetic */ j3.a zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "10");
            return zzgzo.zza(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlI), "1");
        buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlJ))) {
            buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlK));
        }
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(this.zze.zzb(buildUpon.build(), inputEvent)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcrr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgzo.zza(builder2.toString());
            }
        }, this.zzh);
    }

    public final /* synthetic */ j3.a zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcrv.this.zzg(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlH), "9");
        return zzgzo.zza(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyr zzc = zzbyp.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
        } else {
            zzbyr zza = zzbyp.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue()) {
            zzbyr zzc = zzbyp.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbyr zza = zzbyp.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzgzy zzj() {
        return this.zzg;
    }
}
