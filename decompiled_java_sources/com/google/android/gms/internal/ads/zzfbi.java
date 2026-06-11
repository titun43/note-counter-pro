package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzfbi implements zzfax {
    private final zzgzy zza;
    private final Context zzb;
    private final zzecp zzc;

    public zzfbi(zzgzy zzgzyVar, Context context, zzecp zzecpVar) {
        this.zza = zzgzyVar;
        this.zzb = context;
        this.zzc = zzecpVar;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbi.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfbg zzc() {
        ActivityInfo activityInfo;
        boolean z4;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z5;
        PackageInfo c5;
        Context context = this.zzb;
        PackageManager packageManager = context.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        boolean zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw();
        boolean h = x2.d.h(context);
        boolean k5 = x2.d.k(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i5 = 0; i5 < localeList.size(); i5++) {
            arrayList.add(localeList.get(i5).getLanguage());
        }
        ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        String str7 = null;
        if (zzd3 == null || (activityInfo = zzd3.activityInfo) == null) {
            str = null;
            z4 = true;
        } else {
            try {
                z4 = true;
                try {
                    PackageInfo c6 = z2.c.a(context).c(0, activityInfo.packageName);
                    if (c6 != null) {
                        int i6 = c6.versionCode;
                        String str8 = activityInfo.packageName;
                        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 1 + String.valueOf(str8).length());
                        sb.append(i6);
                        sb.append(".");
                        sb.append(str8);
                        str = sb.toString();
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                z4 = true;
            }
            str = null;
        }
        try {
            c5 = z2.c.a(this.zzb).c(128, "com.android.vending");
        } catch (Exception unused3) {
        }
        if (c5 != null) {
            int i7 = c5.versionCode;
            String str9 = c5.packageName;
            str2 = str;
            try {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(str9).length());
                sb2.append(i7);
                sb2.append(".");
                sb2.append(str9);
                str3 = sb2.toString();
            } catch (Exception unused4) {
            }
            boolean z6 = false;
            String str10 = Build.FINGERPRINT;
            String language2 = Locale.getDefault().getLanguage();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoU)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoT)).booleanValue()) {
                    language2 = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb).zzb();
                }
                str4 = language2;
                str5 = null;
            } else {
                com.google.android.gms.ads.internal.util.zzq zzm = com.google.android.gms.ads.internal.util.zzs.zzm(this.zzb);
                String zzb = zzm.zzb();
                str5 = zzm.zza();
                str4 = zzb;
            }
            Context context2 = this.zzb;
            if (packageManager != null) {
                str6 = str3;
            } else {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                if (queryIntentActivities != null && resolveActivity != null) {
                    int i8 = 0;
                    while (i8 < queryIntentActivities.size()) {
                        str6 = str3;
                        if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i8).activityInfo.name)) {
                            z6 = resolveActivity.activityInfo.packageName.equals(zzikw.zza(context2));
                            break;
                        }
                        i8++;
                        str3 = str6;
                    }
                }
                str6 = str3;
                z6 = false;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzG(context2)) {
                    z5 = z4;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
                        try {
                            Bundle bundle = z2.c.a(context2).b(128, context2.getPackageName()).metaData;
                            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                                str7 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                            }
                        } catch (PackageManager.NameNotFoundException unused5) {
                        }
                    } else {
                        str7 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    return new zzfbg(zzd != null ? z4 : false, zzd2 != null ? z4 : false, country, zzw, h, k5, language, arrayList, str2, str6, str10, z6, Build.MODEL, availableBytes, z5, str7, Build.VERSION.SDK_INT, str4, str5, this.zzc.zza());
                }
            }
            z5 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
            }
            if (zzd2 != null) {
            }
            return new zzfbg(zzd != null ? z4 : false, zzd2 != null ? z4 : false, country, zzw, h, k5, language, arrayList, str2, str6, str10, z6, Build.MODEL, availableBytes, z5, str7, Build.VERSION.SDK_INT, str4, str5, this.zzc.zza());
        }
        str2 = str;
        str3 = null;
        boolean z62 = false;
        String str102 = Build.FINGERPRINT;
        String language22 = Locale.getDefault().getLanguage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoU)).booleanValue()) {
        }
        Context context22 = this.zzb;
        if (packageManager != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmO)).booleanValue()) {
        }
        z5 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmS)).booleanValue()) {
        }
        if (zzd2 != null) {
        }
        return new zzfbg(zzd != null ? z4 : false, zzd2 != null ? z4 : false, country, zzw, h, k5, language, arrayList, str2, str6, str102, z62, Build.MODEL, availableBytes2, z5, str7, Build.VERSION.SDK_INT, str4, str5, this.zzc.zza());
    }
}
