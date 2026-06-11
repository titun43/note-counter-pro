package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbv extends WebViewClient {
    final /* synthetic */ zzbx zza;

    public /* synthetic */ zzbv(zzbx zzbxVar, zzbw zzbwVar) {
        Objects.requireNonNull(zzbxVar);
        this.zza = zzbxVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzcd zzcdVar;
        zzbx zzbxVar = this.zza;
        if (zzbx.zzf(zzbxVar, str)) {
            zzcdVar = zzbxVar.zzb;
            zzcdVar.zze(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z4;
        zzbx zzbxVar = this.zza;
        z4 = zzbxVar.zzc;
        if (z4) {
            return;
        }
        Log.d("UserMessagingPlatform", "Wall html loaded.");
        zzbxVar.zzc = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        zzcd zzcdVar;
        zzcdVar = this.zza.zzb;
        zzcdVar.zzf(i5, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        if (webView == null) {
            return true;
        }
        didCrash = renderProcessGoneDetail.didCrash();
        String str = true != didCrash ? "was stopped by system" : "crashed";
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        Log.w("UserMessagingPlatform", "WebView render process " + str + ". Renderer priority at exit: " + rendererPriorityAtExit);
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzcd zzcdVar;
        String uri = webResourceRequest.getUrl().toString();
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, uri)) {
            return false;
        }
        zzcdVar = zzbxVar.zzb;
        zzcdVar.zze(uri);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzcd zzcdVar;
        zzbx zzbxVar = this.zza;
        if (!zzbx.zzf(zzbxVar, str)) {
            return false;
        }
        zzcdVar = zzbxVar.zzb;
        zzcdVar.zze(str);
        return true;
    }
}
