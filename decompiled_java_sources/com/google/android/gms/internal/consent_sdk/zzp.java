package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import i3.b;
import i3.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final b zzc;
    private final i zzd;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, b bVar, i iVar, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = bVar;
        this.zzd = iVar;
    }

    public static zzcl zza(zzp zzpVar) {
        Bundle bundle;
        String string;
        Application application;
        Application application2;
        List list;
        zzaq zzaqVar;
        Application application3;
        Application application4;
        Application application5;
        List<Rect> boundingRects;
        List list2;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        Application application9;
        zzcl zzclVar = new zzcl();
        zzpVar.zzd.getClass();
        if (TextUtils.isEmpty(null)) {
            try {
                zzn zznVar = zzpVar.zza;
                application = zznVar.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        zzclVar.zza = string;
        b bVar = zzpVar.zzc;
        if (bVar.f1858a) {
            ArrayList arrayList = new ArrayList();
            int i5 = bVar.f1859b;
            if (i5 == 1) {
                arrayList.add(zzcg.GEO_OVERRIDE_EEA);
            } else if (i5 == 2) {
                arrayList.add(zzcg.GEO_OVERRIDE_NON_EEA);
            } else if (i5 == 3) {
                arrayList.add(zzcg.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (i5 == 4) {
                arrayList.add(zzcg.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzcg.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        zzclVar.zzj = list;
        zzn zznVar2 = zzpVar.zza;
        zzaqVar = zznVar2.zzb;
        zzclVar.zzf = zzaqVar.zzc();
        zzclVar.zze = Boolean.valueOf(zzpVar.zzd.f1863a);
        zzclVar.zzd = Locale.getDefault().toLanguageTag();
        zzch zzchVar = new zzch();
        int i6 = Build.VERSION.SDK_INT;
        zzchVar.zzb = Integer.valueOf(i6);
        zzchVar.zza = Build.MODEL;
        zzchVar.zzc = 2;
        zzclVar.zzc = zzchVar;
        application3 = zznVar2.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar2.zza;
        application4.getResources().getConfiguration();
        zzcj zzcjVar = new zzcj();
        zzcjVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcjVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar2.zza;
        zzcjVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i6 < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            Activity activity = zzpVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        zzci zzciVar = new zzci();
                        zzciVar.zzb = Integer.valueOf(rect.left);
                        zzciVar.zzc = Integer.valueOf(rect.right);
                        zzciVar.zza = Integer.valueOf(rect.top);
                        zzciVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzciVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzcjVar.zzd = list2;
        zzclVar.zzg = zzcjVar;
        application6 = zznVar2.zza;
        try {
            application9 = zznVar2.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcf zzcfVar = new zzcf();
        zzcfVar.zza = application6.getPackageName();
        zzn zznVar3 = zzpVar.zza;
        application7 = zznVar3.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar3.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        zzcfVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcfVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzclVar.zzh = zzcfVar;
        zzck zzckVar = new zzck();
        zzckVar.zza = "4.0.0";
        zzclVar.zzi = zzckVar;
        zzpVar.zzd.getClass();
        zzclVar.zzb = null;
        return zzclVar;
    }
}
