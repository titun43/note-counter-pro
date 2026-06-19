package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbuu extends zzbtv {
    private final Object zza;
    private zzbuw zzb;
    private zzcar zzc;
    private a3.a zzd;
    private View zze;
    private MediationInterstitialAd zzf;
    private UnifiedNativeAdMapper zzg;
    private NativeAdMapper zzh;
    private MediationRewardedAd zzi;
    private MediationInterscrollerAd zzj;
    private MediationAppOpenAd zzk;
    private final String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public zzbuu(Adapter adapter) {
        this.zza = adapter;
    }

    private final Bundle zzV(String str, com.google.android.gms.ads.internal.client.zzm zzmVar, String str2) {
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    private final Bundle zzW(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzX(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzw();
    }

    private static final String zzY(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzmVar.zzu;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzA(boolean z4) {
        Object obj = this.zza;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z4);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final com.google.android.gms.ads.internal.client.zzed zzB() {
        Object obj = this.zza;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbui zzC() {
        UnifiedNativeAdMapper zzb;
        Object obj = this.zza;
        if (obj instanceof MediationNativeAdapter) {
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar == null || (zzb = zzbuwVar.zzb()) == null) {
                return null;
            }
            return new zzbva(zzb);
        }
        if (!(obj instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.zzh;
        if (nativeAdMapper != null) {
            return new zzbuy(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.zzg;
        if (unifiedNativeAdMapper != null) {
            return new zzbva(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzD(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedAd(new MediationRewardedAdConfiguration((Context) a3.b.b(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new zzbus(this, zzbtzVar));
                return;
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                zzbtq.zza(aVar, e4, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzE(a3.a aVar) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzi;
        if (mediationRewardedAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) a3.b.b(aVar));
        } catch (RuntimeException e4) {
            zzbtq.zza(aVar, e4, "adapter.rewarded.showAd");
            throw e4;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzF(a3.a aVar, zzbqk zzbqkVar, List list) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            throw new RemoteException();
        }
        zzbun zzbunVar = new zzbun(this, zzbqkVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqq zzbqqVar = (zzbqq) it.next();
            String str = zzbqqVar.zza;
            AdFormat adFormat = null;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    }
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznn)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbqqVar.zzb));
            }
        }
        ((Adapter) obj).initialize((Context) a3.b.b(aVar), zzbunVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzG(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) obj).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) a3.b.b(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new zzbus(this, zzbtzVar));
                return;
            } catch (Exception e4) {
                zzbtq.zza(aVar, e4, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbwh zzH() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbwh.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbwh zzI() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            return zzbwh.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzJ(a3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) obj;
            zzbum zzbumVar = new zzbum(this, zzbtzVar, adapter);
            zzV(str, zzmVar, str2);
            zzW(zzmVar);
            zzX(zzmVar);
            Location location = zzmVar.zzk;
            zzY(str, zzmVar);
            com.google.android.gms.ads.zzc.zzc(zzrVar.zze, zzrVar.zzb);
            zzbumVar.onFailure(new AdError(7, adapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            zzbtq.zza(aVar, e4, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbuc zzK() {
        MediationInterscrollerAd mediationInterscrollerAd = this.zzj;
        if (mediationInterscrollerAd != null) {
            return new zzbuv(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzL(a3.a aVar) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            s.c.e(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            zzh();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.zzf;
        if (mediationInterstitialAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) a3.b.b(aVar));
        } catch (RuntimeException e4) {
            zzbtq.zza(aVar, e4, "adapter.interstitial.showAd");
            throw e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzM(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting app open ad from adapter.");
            try {
                ((Adapter) obj).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) a3.b.b(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzV(str, zzmVar, null), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new zzbut(this, zzbtzVar));
                return;
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
                zzbtq.zza(aVar, e4, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzN(a3.a aVar) {
        Object obj = this.zza;
        if (!(obj instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.zzk;
        if (mediationAppOpenAd == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) a3.b.b(aVar));
        } catch (RuntimeException e4) {
            zzbtq.zza(aVar, e4, "adapter.appOpen.showAd");
            throw e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbue zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzbuf zzP() {
        return null;
    }

    public final /* synthetic */ void zzQ(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzg = unifiedNativeAdMapper;
    }

    public final /* synthetic */ void zzR(NativeAdMapper nativeAdMapper) {
        this.zzh = nativeAdMapper;
    }

    public final /* synthetic */ void zzS(MediationRewardedAd mediationRewardedAd) {
        this.zzi = mediationRewardedAd;
    }

    public final /* synthetic */ void zzT(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zzj = mediationInterscrollerAd;
    }

    public final /* synthetic */ void zzU(MediationAppOpenAd mediationAppOpenAd) {
        this.zzk = mediationAppOpenAd;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze = view;
    }

    public final /* synthetic */ void zzd(MediationInterstitialAd mediationInterstitialAd) {
        this.zzf = mediationInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zze(a3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        zzj(aVar, zzrVar, zzmVar, str, null, zzbtzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final a3.a zzf() {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new a3.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return new a3.b(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        s.c.e(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzg(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtz zzbtzVar) {
        zzk(aVar, zzmVar, str, null, zzbtzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzh() {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzi() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzj(a3.a aVar, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) {
        String str3;
        MediationBannerAdapter mediationBannerAdapter;
        zzbul zzbulVar;
        Bundle bundle;
        Context context;
        zzbuw zzbuwVar;
        Bundle zzV;
        Object obj = this.zza;
        boolean z4 = obj instanceof MediationBannerAdapter;
        if (!z4 && !(obj instanceof Adapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            s.c.e(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting banner ad from adapter.");
        AdSize zzb = zzrVar.zzn ? com.google.android.gms.ads.zzc.zzb(zzrVar.zze, zzrVar.zzb) : com.google.android.gms.ads.zzc.zza(zzrVar.zze, zzrVar.zzb, zzrVar.zza);
        if (!z4) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) a3.b.b(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), zzb, this.zzl), new zzbuo(this, zzbtzVar));
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                    zzbtq.zza(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = zzmVar.zzb;
            zzbulVar = new zzbul(j2 == -1 ? null : new Date(j2), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle2 = zzmVar.zzm;
            bundle = bundle2 != null ? bundle2.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            context = (Context) a3.b.b(aVar);
            zzbuwVar = new zzbuw(zzbtzVar);
            zzV = zzV(str, zzmVar, str2);
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } catch (Throwable th2) {
            th = th2;
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            mediationBannerAdapter.requestBannerAd(context, zzbuwVar, zzV, zzb, zzbulVar, bundle);
        } catch (Throwable th3) {
            th = th3;
            com.google.android.gms.ads.internal.util.client.zzo.zzg(str3, th);
            zzbtq.zza(aVar, th, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzk(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar) {
        Object obj = this.zza;
        boolean z4 = obj instanceof MediationInterstitialAdapter;
        if (!z4 && !(obj instanceof Adapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            s.c.e(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting interstitial ad from adapter.");
        if (!z4) {
            Object obj2 = this.zza;
            if (obj2 instanceof Adapter) {
                try {
                    ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) a3.b.b(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl), new zzbup(this, zzbtzVar));
                    return;
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                    zzbtq.zza(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = zzmVar.zzb;
            zzbul zzbulVar = new zzbul(j2 == -1 ? null : new Date(j2), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) a3.b.b(aVar), new zzbuw(zzbtzVar), zzV(str, zzmVar, str2), zzbulVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th2);
            zzbtq.zza(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzl() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzm() {
        Object obj = this.zza;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzn(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzcar zzcarVar, String str2) {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = aVar;
            this.zzc = zzcarVar;
            zzcarVar.zze(new a3.b(obj));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        zzv(zzmVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzp() {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.zzi;
            if (mediationRewardedAd == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
            try {
                mediationRewardedAd.showAd((Context) a3.b.b(this.zzd));
                return;
            } catch (RuntimeException e4) {
                zzbtq.zza(this.zzd, e4, "adapter.showVideo");
                throw e4;
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzq() {
        Object obj = this.zza;
        if ((obj instanceof Adapter) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzr(a3.a aVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtz zzbtzVar, zzbkh zzbkhVar, List list) {
        Object obj = this.zza;
        boolean z4 = obj instanceof MediationNativeAdapter;
        if (!z4 && !(obj instanceof Adapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            s.c.e(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            throw new RemoteException();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Requesting native ad from adapter.");
        if (z4) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = zzmVar.zze;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j2 = zzmVar.zzb;
                zzbuz zzbuzVar = new zzbuz(j2 == -1 ? null : new Date(j2), zzmVar.zzd, hashSet, zzmVar.zzk, zzX(zzmVar), zzmVar.zzg, zzbkhVar, list, zzmVar.zzr, zzmVar.zzt, zzY(str, zzmVar));
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbuw(zzbtzVar);
                mediationNativeAdapter.requestNativeAd((Context) a3.b.b(aVar), this.zzb, zzV(str, zzmVar, str2), zzbuzVar, bundle2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                zzbtq.zza(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) a3.b.b(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbkhVar), new zzbur(this, zzbtzVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th2);
                zzbtq.zza(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Adapter) this.zza).loadNativeAd(new MediationNativeAdConfiguration((Context) a3.b.b(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzV(str, zzmVar, str2), zzW(zzmVar), zzX(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzY(str, zzmVar), this.zzl, zzbkhVar), new zzbuq(this, zzbtzVar));
                } catch (Throwable th3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th3);
                    zzbtq.zza(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) {
        Object obj = this.zza;
        if (obj instanceof Adapter) {
            zzD(this.zzd, zzmVar, str, new zzbux((Adapter) obj, this.zzc));
            return;
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzw(a3.a aVar) {
        Context context = (Context) a3.b.b(aVar);
        Object obj = this.zza;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzy(a3.a aVar, zzcar zzcarVar, List list) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final zzblm zzz() {
        zzbln zze;
        zzbuw zzbuwVar = this.zzb;
        if (zzbuwVar == null || (zze = zzbuwVar.zze()) == null) {
            return null;
        }
        return zze.zza();
    }

    public zzbuu(MediationAdapter mediationAdapter) {
        this.zza = mediationAdapter;
    }
}
