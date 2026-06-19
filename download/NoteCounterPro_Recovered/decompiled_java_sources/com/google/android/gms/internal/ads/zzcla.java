package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzcla extends zzckz {
    public zzcla(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z4, zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z4, zzejfVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcjl zzcjlVar = this.zza;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcjlVar.zzaA(didCrash, rendererPriorityAtExit);
    }
}
