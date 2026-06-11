package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbvx implements MediationAdLoadCallback {
    final /* synthetic */ zzbvg zza;
    final /* synthetic */ zzbtz zzb;

    public zzbvx(zzbwf zzbwfVar, zzbvg zzbvgVar, zzbtz zzbtzVar) {
        this.zza = zzbvgVar;
        this.zzb = zzbtzVar;
        Objects.requireNonNull(zzbwfVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzg(adError.zza());
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object obj) {
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd != null) {
            try {
                this.zza.zze(new a3.b(mediationBannerAd.getView()));
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            }
            return new zzbwg(this.zzb);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e5);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}
