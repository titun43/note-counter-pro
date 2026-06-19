package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgno implements zzgnb, zzgdd {
    private final Context zza;
    private final ExecutorService zzb;
    private NetworkCapabilities zzc = null;

    public zzgno(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final j3.a zza() {
        return zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgno.this.zze();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        NetworkCapabilities networkCapabilities;
        long j2;
        synchronized (this) {
            networkCapabilities = this.zzc;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            try {
                NetworkCapabilities networkCapabilities2 = this.zzc;
                if (networkCapabilities2 != null) {
                    if (networkCapabilities2.hasTransport(4)) {
                        j2 = 2;
                    } else if (this.zzc.hasTransport(1)) {
                        j2 = 1;
                    } else if (this.zzc.hasTransport(0)) {
                        j2 = 0;
                    }
                }
                j2 = -1;
            } finally {
            }
        }
        map.put("nt", Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
    }

    public final /* synthetic */ void zze() {
        zzgnm zzgnmVar = new zzgnm(this);
        try {
            Object systemService = this.zza.getSystemService("connectivity");
            if (systemService == null) {
                throw null;
            }
            ((ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgnmVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzf(NetworkCapabilities networkCapabilities) {
        this.zzc = networkCapabilities;
    }
}
