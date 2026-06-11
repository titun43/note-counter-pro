package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzftz extends WebViewClient {
    final /* synthetic */ zzfub zza;

    public zzftz(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        Log.w("NativeBridge", u.n(new StringBuilder(String.valueOf(obj).length() + 36 + valueOf.length()), "WebView renderer gone: ", obj, "for WebView: ", valueOf));
        zzfub zzfubVar = this.zza;
        if (zzfubVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfubVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
