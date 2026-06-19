package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbdw implements Runnable {
    final /* synthetic */ zzbdx zza;

    public zzbdw(zzbdx zzbdxVar) {
        Objects.requireNonNull(zzbdxVar);
        this.zza = zzbdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbdx zzbdxVar = this.zza;
        synchronized (zzbdxVar.zzf()) {
            if (zzbdxVar.zzg().get() && zzbdxVar.zzh()) {
                zzbdxVar.zzg().set(false);
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbdxVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbdy) it.next()).zza(false);
                    } catch (Exception e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                    }
                }
            } else {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
