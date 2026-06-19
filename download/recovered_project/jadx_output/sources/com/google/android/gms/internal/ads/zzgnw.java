package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzgnw extends BroadcastReceiver implements zzgnb, zzgdd {
    private final Context zza;
    private final ExecutorService zzb;
    private boolean zzc = true;

    public zzgnw(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    private final synchronized void zzg(boolean z4) {
        this.zzc = z4;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzg(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final j3.a zza() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgnw.this.zzf();
                return null;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final /* synthetic */ Void zzf() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.zza.registerReceiver(this, intentFilter);
        return null;
    }
}
