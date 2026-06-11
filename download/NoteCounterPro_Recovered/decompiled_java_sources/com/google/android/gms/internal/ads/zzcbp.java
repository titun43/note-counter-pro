package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
public final class zzcbp implements MediationRewardedAdCallback {
    private final zzbtz zza;

    public zzcbp(zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onAdFailedToShow.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        int length = String.valueOf(code).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
        sb.append("Mediation ad failed to show: Error Code = ");
        sb.append(code);
        sb.append(". Error Message = ");
        sb.append(message);
        sb.append(" Error Domain = ");
        sb.append(domain);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        try {
            this.zza.zzy(adError.zza());
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward() {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzz();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onVideoComplete.");
        try {
            this.zza.zzt();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onVideoStart.");
        try {
            this.zza.zzo();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called reportAdImpression.");
        try {
            this.zza.zzk();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzr(new zzcbq(rewardItem));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        b0.d("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Adapter called onAdFailedToShow.");
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzv(str);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }
}
