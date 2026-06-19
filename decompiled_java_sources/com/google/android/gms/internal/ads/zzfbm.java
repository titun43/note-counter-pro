package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzfbm implements zzfax {
    private final zzgzy zza;
    private final Context zzb;

    public zzfbm(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbm.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 39;
    }

    public final /* synthetic */ zzfbk zzc() {
        boolean z4;
        int i5;
        Context context = this.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzc();
        int i6 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzF(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i5 = type;
                i6 = ordinal;
            } else {
                i5 = -1;
            }
            z4 = connectivityManager.isActiveNetworkMetered();
        } else {
            z4 = false;
            i5 = -2;
        }
        return new zzfbk(networkOperator, i5, com.google.android.gms.ads.internal.zzt.zzf().zzm(context), phoneType, z4, i6);
    }
}
