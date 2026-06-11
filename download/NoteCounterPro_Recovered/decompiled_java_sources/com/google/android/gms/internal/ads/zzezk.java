package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzezk implements zzfax {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    public zzezk(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        String str;
        String str2;
        String str3;
        InstallSourceInfo installSourceInfo;
        String str4 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str5 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str6 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
            Context context2 = z2.c.a(context).f1474g;
            str = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str4, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzok)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str4);
                } catch (PackageManager.NameNotFoundException e4) {
                    e = e4;
                    str2 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str2 = null;
                        }
                        str3 = installSourceInfo.getInitiatingPackageName();
                    } catch (PackageManager.NameNotFoundException e5) {
                        e = e5;
                    }
                    try {
                    } catch (PackageManager.NameNotFoundException e6) {
                        e = e6;
                        str5 = str3;
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str5;
                        return zzgzo.zza(new zzezl(str4, valueOf, str6, str, str2, str3));
                    }
                    if (TextUtils.isEmpty(str3)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        str3 = str5;
                    }
                    return zzgzo.zza(new zzezl(str4, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return zzgzo.zza(new zzezl(str4, valueOf, str6, str, str2, str3));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 29;
    }
}
