package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbec implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbdu zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbee zze;

    public zzbec(zzbee zzbeeVar, final zzbdu zzbduVar, final WebView webView, final boolean z4) {
        this.zzb = zzbduVar;
        this.zzc = webView;
        this.zzd = z4;
        Objects.requireNonNull(zzbeeVar);
        this.zze = zzbeeVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbeb
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                zzbec.this.zze.zzd(zzbduVar, webView, (String) obj, z4);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
        }
    }
}
