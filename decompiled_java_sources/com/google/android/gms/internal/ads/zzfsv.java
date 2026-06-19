package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import k1.m;

/* loaded from: classes.dex */
public final class zzfsv {
    private final zzfsx zza;
    private final WebView zzb;
    private zzfuy zzc;
    private final HashMap zzd;
    private final zzftl zze;

    private zzfsv(zzfsx zzfsxVar, WebView webView, boolean z4) {
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        this.zze = new zzftl();
        zzfuh.zza();
        this.zza = zzfsxVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((zzfsj) it.next()).zzb(webView);
            }
            this.zzc = new zzfuy(webView);
        }
        if (!a.a.q("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        j1.f.b(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfst(this));
    }

    public static zzfsv zza(zzfsx zzfsxVar, WebView webView, boolean z4) {
        return new zzfsv(zzfsxVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebView webView = this.zzb;
        boolean z4 = j1.f.f2020a;
        if (!m.f2419d.b()) {
            throw m.a();
        }
        j1.f.d(webView).f2425a.removeWebMessageListener("omidJsSessionService");
    }

    public final void zzb(zzfsu zzfsuVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfsj) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfss(this, zzfsuVar, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzc() {
        zzfuy zzfuyVar = this.zzc;
        if (zzfuyVar == null) {
            return null;
        }
        return (View) zzfuyVar.get();
    }

    public final void zzd(View view, zzfsq zzfsqVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfsj) it.next()).zzd(view, zzfsqVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfsqVar, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(String str) {
        zzfso zzfsoVar = zzfso.DEFINED_BY_JAVASCRIPT;
        zzfsr zzfsrVar = zzfsr.DEFINED_BY_JAVASCRIPT;
        zzfsw zzfswVar = zzfsw.JAVASCRIPT;
        zzfsn zzfsnVar = new zzfsn(zzfsk.zza(zzfsoVar, zzfsrVar, zzfswVar, zzfswVar, false), zzfsl.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfsnVar);
        zzfsnVar.zzb(zzc());
        for (zzftk zzftkVar : this.zze.zza()) {
            zzfsnVar.zzd((View) zzftkVar.zza().get(), zzftkVar.zzc(), zzftkVar.zzd());
        }
        zzfsnVar.zza();
    }

    public final /* synthetic */ void zzg(String str) {
        HashMap hashMap = this.zzd;
        zzfsj zzfsjVar = (zzfsj) hashMap.get(str);
        if (zzfsjVar != null) {
            zzfsjVar.zzc();
            hashMap.remove(str);
        }
    }
}
