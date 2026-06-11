package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbst;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzcdp;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzgzy;
import j3.a;
import org.json.JSONObject;
import x2.c;

/* loaded from: classes.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final a zzd(Long l5, zzdxz zzdxzVar, zzfoe zzfoeVar, zzfor zzforVar, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l5 != null) {
                ((c) zzt.zzk()).getClass();
                zzf(zzdxzVar, "cld_s", SystemClock.elapsedRealtime() - l5.longValue());
            }
        }
        String optString = jSONObject.optString("errorReason", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (!TextUtils.isEmpty(optString)) {
            zzfoeVar.zzk(optString);
        }
        zzfoeVar.zzd(optBoolean);
        zzforVar.zzb(zzfoeVar.zzm());
        return zzgzo.zza(null);
    }

    public static final void zze(zzdxz zzdxzVar, Long l5) {
        ((c) zzt.zzk()).getClass();
        zzf(zzdxzVar, "cld_r", SystemClock.elapsedRealtime() - l5.longValue());
    }

    private static final void zzf(zzdxz zzdxzVar, String str, long j2) {
        if (zzdxzVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzoe)).booleanValue()) {
                zzdxy zza = zzdxzVar.zza();
                zza.zzc("action", "lat_init");
                zza.zzc(str, Long.toString(j2));
                zza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfor zzforVar, zzdxz zzdxzVar, Long l5, boolean z4) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzforVar, zzdxzVar, l5, z4);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcdp zzcdpVar, zzfor zzforVar, boolean z4) {
        zzc(context, versionInfoParcel, false, zzcdpVar, zzcdpVar != null ? zzcdpVar.zze() : null, str, null, zzforVar, null, null, z4);
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z4, zzcdp zzcdpVar, String str, String str2, Runnable runnable, final zzfor zzforVar, final zzdxz zzdxzVar, final Long l5, boolean z5) {
        zzfoe zzfoeVar;
        Exception exc;
        PackageInfo c5;
        ((c) zzt.zzk()).getClass();
        if (SystemClock.elapsedRealtime() - this.zzb < 5000) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        ((c) zzt.zzk()).getClass();
        this.zzb = SystemClock.elapsedRealtime();
        if (zzcdpVar != null && !TextUtils.isEmpty(zzcdpVar.zzd())) {
            long zzb = zzcdpVar.zzb();
            ((c) zzt.zzk()).getClass();
            if (System.currentTimeMillis() - zzb <= ((Long) zzbd.zzc().zzd(zzbhe.zzfa)).longValue() && zzcdpVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfoe zzn = zzfoe.zzn(context, 4);
        zzn.zza();
        zzbsz zzb2 = zzt.zzr().zzb(this.zza, versionInfoParcel, zzforVar);
        zzbst zzbstVar = zzbsw.zza;
        zzbsp zza = zzb2.zza("google.afma.config.fetchAppSettings", zzbstVar, zzbstVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z4);
                jSONObject.put("pn", context.getPackageName());
                zzbgv zzbgvVar = zzbhe.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbd.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkW)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z5);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (c5 = z2.c.a(context).c(0, applicationInfo.packageName)) != null) {
                        jSONObject.put("version", c5.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                a zzb3 = zza.zzb(jSONObject);
                try {
                    zzgyw zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ a zza(Object obj) {
                            return zzf.zzd(l5, zzdxzVar, zzn, zzforVar, (JSONObject) obj);
                        }
                    };
                    zzfoeVar = zzn;
                    try {
                        zzgzy zzgzyVar = zzcei.zzg;
                        a zzj = zzgzo.zzj(zzb3, zzgywVar, zzgzyVar);
                        if (runnable != null) {
                            zzb3.addListener(runnable, zzgzyVar);
                        }
                        if (l5 != null) {
                            zzb3.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzf.zze(zzdxzVar, l5);
                                }
                            }, zzgzyVar);
                        }
                        if (((Boolean) zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
                            zzcel.zzb(zzj, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            zzcel.zza(zzj, "ConfigLoader.maybeFetchNewAppSettings");
                        }
                    } catch (Exception e4) {
                        e = e4;
                        exc = e;
                        int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                        zzfoeVar.zzj(exc);
                        zzfoeVar.zzd(false);
                        zzforVar.zzb(zzfoeVar.zzm());
                    }
                } catch (Exception e5) {
                    e = e5;
                    zzfoeVar = zzn;
                }
            } catch (Exception e6) {
                exc = e6;
                zzfoeVar = zzn;
                int i82 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzfoeVar.zzj(exc);
                zzfoeVar.zzd(false);
                zzforVar.zzb(zzfoeVar.zzm());
            }
        } catch (Exception e7) {
            e = e7;
            zzfoeVar = zzn;
        }
    }
}
