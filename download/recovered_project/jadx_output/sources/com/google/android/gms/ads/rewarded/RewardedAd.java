package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcbi;

/* loaded from: classes.dex */
public abstract class RewardedAd {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        b0.h(context, "Context cannot be null.");
        b0.h(str, "AdUnitId cannot be null.");
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzf(str);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return false;
        }
    }

    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        b0.h(context, "Context cannot be null.");
        b0.h(str, "AdUnitId cannot be null.");
        b0.h(adRequest, "AdRequest cannot be null.");
        b0.h(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        b0.d("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        RewardedAdLoadCallback rewardedAdLoadCallback2 = rewardedAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzcbi(context2, str).zza(adRequest2.zza(), rewardedAdLoadCallback2);
                        } catch (IllegalStateException e4) {
                            zzbyp.zza(context2).zzh(e4, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzo.zzd("Loading on UI thread");
        new zzcbi(context, str).zza(adRequest.zza(), rewardedAdLoadCallback);
    }

    @Deprecated
    public static RewardedAd pollAd(Context context, String str) {
        b0.h(context, "Context cannot be null.");
        b0.h(str, "AdUnitId cannot be null.");
        try {
            zzcaz zzg = com.google.android.gms.ads.zzb.zza(context).zzg(str);
            if (zzg != null) {
                return new zzcbi(context, str, zzg);
            }
            zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            return null;
        }
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z4);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j2);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedAdLoadCallback rewardedAdLoadCallback) {
        b0.h(context, "Context cannot be null.");
        b0.h(str, "AdUnitId cannot be null.");
        b0.h(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        b0.h(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        b0.d("#008 Must be called on the main UI thread.");
        zzbhe.zza(context);
        if (((Boolean) zzbjc.zzk.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmF)).booleanValue()) {
                zzo.zzd("Loading on background thread");
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        RewardedAdLoadCallback rewardedAdLoadCallback2 = rewardedAdLoadCallback;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        Context context2 = context;
                        try {
                            new zzcbi(context2, str).zza(adManagerAdRequest2.zza(), rewardedAdLoadCallback2);
                        } catch (IllegalStateException e4) {
                            zzbyp.zza(context2).zzh(e4, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        zzo.zzd("Loading on UI thread");
        new zzcbi(context, str).zza(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
