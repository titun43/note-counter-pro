package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzevc implements zzfax {
    private final zzgzy zza;
    private final Context zzb;

    public zzevc(zzgzy zzgzyVar, Context context) {
        this.zza = zzgzyVar;
        this.zzb = context;
    }

    private final Intent zzd() {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmw)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            return this.zzb.registerReceiver(null, intentFilter);
        }
        registerReceiver = this.zzb.registerReceiver(null, intentFilter, 4);
        return registerReceiver;
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final j3.a zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzevc.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 14;
    }

    public final /* synthetic */ zzevd zzc() {
        double intExtra;
        boolean z4;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznw)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? batteryManager.getIntProperty(4) / 100.0d : -1.0d;
            z4 = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            Intent zzd = zzd();
            boolean zze = zze(zzd);
            intExtra = zzd != null ? zzd.getIntExtra("level", -1) / zzd.getIntExtra("scale", -1) : -1.0d;
            z4 = zze;
        }
        return new zzevd(intExtra, z4);
    }
}
