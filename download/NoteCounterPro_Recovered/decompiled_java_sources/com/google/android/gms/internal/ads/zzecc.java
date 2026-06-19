package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzecc extends com.google.android.gms.ads.internal.client.zzdv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzebq zzd;
    private final zzgzy zze;
    private zzebf zzf;

    public zzecc(Context context, WeakReference weakReference, zzebq zzebqVar, zzece zzeceVar, zzgzy zzgzyVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzebqVar;
        this.zze = zzgzyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzebx(this), this.zze);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzeby(this), this.zze);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzd = responseInfo.zzd()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return zzd.zzj();
        } catch (RemoteException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    public final void zzb(zzebf zzebfVar) {
        this.zzf = zzebfVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzecd zzecdVar) {
        try {
            String zzb = zzecdVar.zzb();
            switch (zzb.hashCode()) {
                case -1999289321:
                    if (zzb.equals("NATIVE")) {
                        final String zza = zzecdVar.zza();
                        AdLoader.Builder builder = new AdLoader.Builder(zzl(), zza);
                        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzeca
                            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                                zzecc.this.zzf(zza, nativeAd);
                            }
                        });
                        builder.withAdListener(new zzebw(this));
                        NativeAdOptions zze = zzecdVar.zze();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkQ)).booleanValue() && zze != null) {
                            builder.withNativeAdOptions(zze);
                        }
                        builder.build().loadAd(zzecdVar.zzc());
                        return;
                    }
                    break;
                case -1372958932:
                    if (zzb.equals("INTERSTITIAL")) {
                        String zza2 = zzecdVar.zza();
                        InterstitialAd.load(zzl(), zza2, zzecdVar.zzc(), new zzebt(this, zza2));
                        return;
                    }
                    break;
                case -428325382:
                    if (zzb.equals("APP_OPEN_AD")) {
                        String zza3 = zzecdVar.zza();
                        AppOpenAd.load(zzl(), zza3, zzecdVar.zzc(), new zzebr(this, zza3));
                        return;
                    }
                    break;
                case 543046670:
                    if (zzb.equals("REWARDED")) {
                        String zza4 = zzecdVar.zza();
                        RewardedAd.load(zzl(), zza4, zzecdVar.zzc(), new zzebu(this, zza4));
                        return;
                    }
                    break;
                case 1854800829:
                    if (zzb.equals("REWARDED_INTERSTITIAL")) {
                        String zza5 = zzecdVar.zza();
                        RewardedInterstitialAd.load(zzl(), zza5, zzecdVar.zzc(), new zzebv(this, zza5));
                        return;
                    }
                    break;
                case 1951953708:
                    if (zzb.equals("BANNER")) {
                        String zza6 = zzecdVar.zza();
                        zzbgv zzbgvVar = zzbhe.zzkQ;
                        BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzecdVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
                        adManagerAdView.setAdSize(zzecdVar.zzd());
                        adManagerAdView.setAdUnitId(zza6);
                        adManagerAdView.setAdListener(new zzebs(this, zza6, adManagerAdView));
                        VideoOptions zzf = zzecdVar.zzf();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzecdVar.zzg() && zzf != null) {
                            ((AdManagerAdView) adManagerAdView).setVideoOptions(zzf);
                        }
                        adManagerAdView.loadAd(zzecdVar.zzc());
                        return;
                    }
                    break;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003b, B:24:0x0046, B:27:0x004d, B:29:0x0051, B:32:0x0058, B:34:0x005c, B:37:0x0065, B:39:0x0069, B:42:0x0072, B:44:0x0082, B:46:0x0086, B:48:0x008a, B:51:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:9:0x000b, B:11:0x0013, B:13:0x0025, B:15:0x0029, B:17:0x002d, B:19:0x0031, B:22:0x003b, B:24:0x0046, B:27:0x004d, B:29:0x0051, B:32:0x0058, B:34:0x005c, B:37:0x0065, B:39:0x0069, B:42:0x0072, B:44:0x0082, B:46:0x0086, B:48:0x008a, B:51:0x0038), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        try {
            Activity zzo = this.zzd.zzo();
            if (zzo != null && (obj = (map = this.zza).get(str)) != null) {
                zzbgv zzbgvVar = zzbhe.zzkP;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    if (!(obj instanceof AppOpenAd)) {
                        if (!(obj instanceof InterstitialAd)) {
                            if (!(obj instanceof RewardedAd)) {
                                if (obj instanceof RewardedInterstitialAd) {
                                }
                                zzk(zzm(obj));
                                if (!(obj instanceof AppOpenAd)) {
                                    ((AppOpenAd) obj).show(zzo);
                                    return;
                                }
                                if (obj instanceof InterstitialAd) {
                                    ((InterstitialAd) obj).show(zzo);
                                    return;
                                }
                                if (obj instanceof RewardedAd) {
                                    ((RewardedAd) obj).show(zzo, zzecb.zza);
                                    return;
                                }
                                if (obj instanceof RewardedInterstitialAd) {
                                    ((RewardedInterstitialAd) obj).show(zzo, zzebz.zza);
                                    return;
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                                    Intent intent = new Intent();
                                    Context zzl = zzl();
                                    intent.setClassName(zzl, OutOfContextTestingActivity.CLASS_NAME);
                                    intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    com.google.android.gms.ads.internal.util.zzs.zzaa(zzl, intent);
                                    return;
                                }
                            }
                        }
                    }
                }
                map.remove(str);
                zzk(zzm(obj));
                if (!(obj instanceof AppOpenAd)) {
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, a3.a aVar, a3.a aVar2) {
        Context context = (Context) a3.b.b(aVar);
        ViewGroup viewGroup = (ViewGroup) a3.b.b(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzece.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzece.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    public final /* synthetic */ zzebq zzi() {
        return this.zzd;
    }
}
