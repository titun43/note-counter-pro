package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.getcapacitor.plugin.util.a;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzcla;
import com.google.android.gms.internal.ads.zzejf;

/* loaded from: classes.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzt, com.google.android.gms.ads.internal.util.zzz
    public final zzcjw zzb(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z4, zzejf zzejfVar) {
        return new zzcla(zzcjlVar, zzbgdVar, z4, zzejfVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final zzbgj.zzq zzf(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!zzs.zzF(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return zzbgj.zzq.ENUM_FALSE;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? zzbgj.zzq.ENUM_TRUE : zzbgj.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzg(Context context, String str, String str2) {
        a.r();
        NotificationChannel e4 = a.e(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjO)).intValue());
        e4.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(e4);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzh(Context context, String str) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final Intent zzi(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
