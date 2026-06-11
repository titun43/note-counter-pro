package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzckw {
    private final zzckv zza;
    private final zzckx zzb;

    public zzckw(zzckx zzckxVar, zzckv zzckvVar) {
        this.zza = zzckvVar;
        this.zzb = zzckxVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzckx zzckxVar = this.zzb;
        zzazh zzS = ((zzcle) zzckxVar).zzS();
        if (zzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzazc zzb = zzS.zzb();
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzckxVar.getContext() != null) {
            return zzb.zzf(zzckxVar.getContext(), str, ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzckx zzckxVar = this.zzb;
        zzazh zzS = ((zzcle) zzckxVar).zzS();
        if (zzS == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzazc zzb = zzS.zzb();
        if (zzb == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (zzckxVar.getContext() != null) {
            return zzb.zzj(zzckxVar.getContext(), ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
        }
        com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        zzckx zzckxVar = this.zzb;
        zzbhe.zza(zzckxVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpi)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzclj zzP = ((zzcjl) zzckxVar).zzP();
            zzczz zzK = zzP != null ? zzP.zzK() : null;
            if (zzK != null) {
                long zza = zzK.zza();
                if (zza > 0) {
                    jSONObject.put("plcmtid", zza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Error constructing JSON.", e4);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzckw.this.zza(str);
                }
            });
        } else {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty, ignoring message");
        }
    }

    public final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
