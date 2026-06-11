package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.emoji2.text.u;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzgzy;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import x2.c;

/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzazh zzc;
    private final zzfjo zzd;
    private final int zze;
    private final zzdye zzf;
    private final boolean zzg;
    private final zzgzy zzh = zzcei.zzf;
    private final zzfqk zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    public TaggingLibraryJsInterface(WebView webView, zzazh zzazhVar, zzdye zzdyeVar, zzfqk zzfqkVar, zzfjo zzfjoVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzazhVar;
        this.zzf = zzdyeVar;
        zzbhe.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzla)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlb)).booleanValue();
        this.zzi = zzfqkVar;
        this.zzd = zzfjoVar;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String zzg = this.zzc.zzb().zzg(this.zza, str, this.zzb);
            if (!this.zzg) {
                return zzg;
            }
            ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzaa.zze(this.zzf, null, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return zzg;
        } catch (RuntimeException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e4);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "TaggingLibraryJsInterface.getClickSignals");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i5) {
        if (i5 <= 0) {
            String l5 = u.l(new StringBuilder(String.valueOf(i5).length() + 51), "Invalid timeout for getting click signals. Timeout=", i5);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(l5);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return (String) zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i5, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e4);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e4 instanceof TimeoutException ? "17" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbp zzbpVar = new zzbp(this, uuid);
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzj.zzb(this.zzb, zzbpVar);
            return uuid;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzld)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    TaggingLibraryJsInterface.this.zza(bundle, zzbpVar);
                }
            });
            return uuid;
        }
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbpVar);
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String zzj = this.zzc.zzb().zzj(this.zza, this.zzb, null);
            if (!this.zzg) {
                return zzj;
            }
            ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            zzaa.zze(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return zzj;
        } catch (RuntimeException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e4);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "TaggingLibraryJsInterface.getViewSignals");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i5) {
        if (i5 <= 0) {
            String l5 = u.l(new StringBuilder(String.valueOf(i5).length() + 50), "Invalid timeout for getting view signals. Timeout=", i5);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(l5);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return (String) zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i5, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e4);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e4 instanceof TimeoutException ? "17" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlf)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                TaggingLibraryJsInterface.this.zzb(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i5;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i6 = jSONObject.getInt("x");
            int i7 = jSONObject.getInt("y");
            int i8 = jSONObject.getInt("duration_ms");
            float f5 = (float) jSONObject.getDouble("force");
            int i9 = jSONObject.getInt("type");
            if (i9 != 0) {
                i5 = 1;
                if (i9 != 1) {
                    i5 = 2;
                    if (i9 != 2) {
                        i5 = 3;
                        if (i9 != 3) {
                            i5 = -1;
                        }
                    }
                }
            } else {
                i5 = 0;
            }
            try {
                this.zzc.zzc(MotionEvent.obtain(0L, i8, i5, i6, i7, f5, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e4) {
                e = e4;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e5) {
                e = e5;
                int i102 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e6) {
            e = e6;
        }
    }

    public final /* synthetic */ void zza(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzz zzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        CookieManager zza = zzf.zza(context);
        bundle.putBoolean("accept_3p_cookie", zza != null ? zza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzb(String str) {
        zzfjo zzfjoVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || (zzfjoVar = this.zzd) == null) ? this.zzc.zzd(parse, this.zza, this.zzb, null) : zzfjoVar.zza(parse, this.zza, this.zzb, null);
        } catch (zzazi e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e4);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzb(parse.toString(), null, null, null);
    }

    public final /* synthetic */ WebView zzc() {
        return this.zzb;
    }

    public final /* synthetic */ zzgzy zzd() {
        return this.zzh;
    }

    public final /* synthetic */ zzf zze() {
        return this.zzk;
    }

    public final /* synthetic */ zzj zzf() {
        return this.zzl;
    }
}
