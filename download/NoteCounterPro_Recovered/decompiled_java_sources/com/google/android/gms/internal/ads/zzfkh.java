package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;

/* loaded from: classes.dex */
public final class zzfkh {
    public static void zza(int i5, Throwable th, String str) {
        String l5 = u.l(new StringBuilder(String.valueOf(i5).length() + 20), "Ad failed to load : ", i5);
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(l5);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i5 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, str);
    }

    public static void zzb(Context context, boolean z4) {
        if (z4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        String zzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        String b2 = h1.b(new StringBuilder(String.valueOf(zzD).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", zzD, "\")) to get test ads on this device.");
        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(b2);
    }
}
