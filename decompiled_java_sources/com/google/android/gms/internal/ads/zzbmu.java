package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;

/* loaded from: classes.dex */
public final class zzbmu extends zzbmc {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbmu(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    public final /* synthetic */ OnAdManagerAdViewLoadedListener zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zze(com.google.android.gms.ads.internal.client.zzbx zzbxVar, a3.a aVar) {
        if (zzbxVar == null || aVar == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) a3.b.b(aVar));
        try {
            if (zzbxVar.zzw() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbxVar.zzw();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzk() : null);
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
        try {
            if (zzbxVar.zzv() instanceof zzbdt) {
                zzbdt zzbdtVar = (zzbdt) zzbxVar.zzv();
                adManagerAdView.setAppEventListener(zzbdtVar != null ? zzbdtVar.zzc() : null);
            }
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzbmt(this, adManagerAdView, zzbxVar));
    }
}
