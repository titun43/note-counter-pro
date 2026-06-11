package com.google.android.gms.ads;

import a3.b;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzcdd;
import java.util.List;
import n.a;
import n.h;
import n.o;

/* loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzex.zzb().zzm(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzex.zzb().zzl();
    }

    private static String getInternalVersion() {
        return zzex.zzb().zzo();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzex.zzb().zzp();
    }

    public static VersionInfo getVersion() {
        zzex.zzb();
        String[] split = TextUtils.split("24.9.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        zzex.zzb().zzc(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzex.zzb().zzn(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzex.zzb().zzj(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z4) {
        return zzex.zzb().zzr(z4);
    }

    public static o registerCustomTabsSession(Context context, h hVar, String str, a aVar) {
        zzex.zzb();
        b0.d("#008 Must be called on the main UI thread.");
        zzcdd zza = zzbyj.zza(context);
        if (zza == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (o) b.b(zza.zzm(new b(context), new b(hVar), str, new b(aVar)));
        } catch (RemoteException | IllegalArgumentException e4) {
            zzo.zzg("Unable to register custom tabs session. Error: ", e4);
            return null;
        }
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzex.zzb().zzk(cls);
    }

    public static void registerWebView(WebView webView) {
        zzex.zzb();
        b0.d("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzf("The webview to be registered cannot be null.");
            return;
        }
        zzcdd zza = zzbyj.zza(webView.getContext());
        if (zza == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzj(new b(webView));
        } catch (RemoteException e4) {
            zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
        }
    }

    public static void setAppMuted(boolean z4) {
        zzex.zzb().zzh(z4);
    }

    public static void setAppVolume(float f5) {
        zzex.zzb().zzf(f5);
    }

    private static void setPlugin(String str) {
        zzex.zzb().zzs(str);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzex.zzb().zzq(requestConfiguration);
    }

    @Deprecated
    public static void startPreload(Context context, List<PreloadConfiguration> list, PreloadCallback preloadCallback) {
        zzex.zzb().zze(context, list, preloadCallback);
    }

    private static void stop() {
        zzex.zzb().zzd();
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzex.zzb().zzc(context, null, onInitializationCompleteListener);
    }
}
