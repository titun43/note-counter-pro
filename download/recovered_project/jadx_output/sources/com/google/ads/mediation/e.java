package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbln;

/* loaded from: classes.dex */
public final class e extends AdListener implements zzg, zze, zzd {

    /* renamed from: g, reason: collision with root package name */
    public final AbstractAdViewAdapter f903g;
    public final MediationNativeListener h;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f903g = abstractAdViewAdapter;
        this.h = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.h.onAdClicked(this.f903g);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.h.onAdClosed(this.f903g);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.h.onAdFailedToLoad(this.f903g, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.h.onAdImpression(this.f903g);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.h.onAdOpened(this.f903g);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        a aVar = new a();
        aVar.setHeadline(unifiedNativeAd.zza());
        aVar.setImages(unifiedNativeAd.zzb());
        aVar.setBody(unifiedNativeAd.zzc());
        aVar.setIcon(unifiedNativeAd.zzd());
        aVar.setCallToAction(unifiedNativeAd.zze());
        aVar.setAdvertiser(unifiedNativeAd.zzf());
        aVar.setStarRating(unifiedNativeAd.zzg());
        aVar.setStore(unifiedNativeAd.zzh());
        aVar.setPrice(unifiedNativeAd.zzi());
        aVar.zzb(unifiedNativeAd.zzk());
        aVar.setOverrideImpressionRecording(true);
        aVar.setOverrideClickHandling(true);
        aVar.zza(unifiedNativeAd.zzj());
        this.h.onAdLoaded(this.f903g, aVar);
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbln zzblnVar) {
        this.h.zzc(this.f903g, zzblnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbln zzblnVar, String str) {
        this.h.zzd(this.f903g, zzblnVar, str);
    }
}
