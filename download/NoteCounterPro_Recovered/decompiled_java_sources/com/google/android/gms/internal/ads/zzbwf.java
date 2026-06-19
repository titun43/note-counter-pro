package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbwf extends zzbvr {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public zzbwf(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzw();
    }

    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.zzu;
        }
    }

    public final /* synthetic */ void zzc(MediationInterstitialAd mediationInterstitialAd) {
        this.zzb = mediationInterstitialAd;
    }

    public final /* synthetic */ void zzd(MediationRewardedAd mediationRewardedAd) {
        this.zzc = mediationRewardedAd;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zze(a3.a aVar, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbvv zzbvvVar) {
        AdFormat adFormat;
        try {
            zzbwd zzbwdVar = new zzbwd(this, zzbvvVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mediationConfiguration);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) a3.b.b(aVar), arrayList, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbwdVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(mediationConfiguration2);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) a3.b.b(aVar), arrayList2, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbwdVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        MediationConfiguration mediationConfiguration22 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList22 = new ArrayList();
                        arrayList22.add(mediationConfiguration22);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) a3.b.b(aVar), arrayList22, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbwdVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        MediationConfiguration mediationConfiguration222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222 = new ArrayList();
                        arrayList222.add(mediationConfiguration222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) a3.b.b(aVar), arrayList222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbwdVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1167692200:
                    if (str.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration2222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList2222 = new ArrayList();
                        arrayList2222.add(mediationConfiguration2222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) a3.b.b(aVar), arrayList2222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbwdVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznn)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            MediationConfiguration mediationConfiguration22222 = new MediationConfiguration(adFormat, bundle2);
                            ArrayList arrayList22222 = new ArrayList();
                            arrayList22222.add(mediationConfiguration22222);
                            rtbAdapter.collectSignals(new RtbSignalData((Context) a3.b.b(aVar), arrayList22222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbwdVar);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        MediationConfiguration mediationConfiguration222222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(mediationConfiguration222222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) a3.b.b(aVar), arrayList222222, bundle, com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza)), zzbwdVar);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error generating signals for RTB", th);
            zzbtq.zza(aVar, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwh zzf() {
        return zzbwh.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final zzbwh zzg() {
        return zzbwh.zza(this.zza.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final com.google.android.gms.ads.internal.client.zzed zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) a3.b.b(aVar), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza), this.zze), new zzbvx(this, zzbvgVar, zzbtzVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render banner ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvj zzbvjVar, zzbtz zzbtzVar) {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) a3.b.b(aVar), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbvz(this, zzbvjVar, zzbtzVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render interstitial ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzk(a3.a aVar) {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) a3.b.b(aVar));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            zzbtq.zza(aVar, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) a3.b.b(aVar), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbwe(this, zzbvpVar, zzbtzVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render rewarded ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzm(a3.a aVar) {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) a3.b.b(aVar));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            zzbtq.zza(aVar, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar) {
        zzr(str, str2, zzmVar, aVar, zzbvmVar, zzbtzVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzo(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvp zzbvpVar, zzbtz zzbtzVar) {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) a3.b.b(aVar), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbwe(this, zzbvpVar, zzbtzVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render rewarded interstitial ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvg zzbvgVar, zzbtz zzbtzVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        try {
            zzbvy zzbvyVar = new zzbvy(this, zzbvgVar, zzbtzVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(zzmVar);
            zzx(zzmVar);
            Location location = zzmVar.zzk;
            zzy(str2, zzmVar);
            com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
            zzbvyVar.onFailure(new AdError(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render interscroller ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvm zzbvmVar, zzbtz zzbtzVar, zzbkh zzbkhVar) {
        try {
            this.zza.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) a3.b.b(aVar), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbkhVar), new zzbwa(this, zzbvmVar, zzbtzVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render native ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) a3.b.b(aVar), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbkhVar), new zzbwb(this, zzbvmVar, zzbtzVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render native ad.", th2);
                zzbtq.zza(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, a3.a aVar, zzbvd zzbvdVar, zzbtz zzbtzVar) {
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) a3.b.b(aVar), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbwc(this, zzbvdVar, zzbtzVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Adapter failed to render app open ad.", th);
            zzbtq.zza(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvs
    public final boolean zzt(a3.a aVar) {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) a3.b.b(aVar));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            zzbtq.zza(aVar, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    public final /* synthetic */ void zzu(MediationAppOpenAd mediationAppOpenAd) {
        this.zzd = mediationAppOpenAd;
    }
}
