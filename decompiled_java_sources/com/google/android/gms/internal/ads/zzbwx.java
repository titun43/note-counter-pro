package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzbwx {
    private final zzcjl zza;
    private final String zzb;

    public zzbwx(zzcjl zzcjlVar, String str) {
        this.zza = zzcjlVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar != null) {
                zzcjlVar.zzd("onError", put);
            }
        } catch (JSONException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e4);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e4);
        }
    }

    public final void zzi(int i5, int i6, int i7, int i8) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i5).put("y", i6).put("width", i7).put("height", i8));
        } catch (JSONException e4) {
            int i9 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e4);
        }
    }

    public final void zzj(int i5, int i6, int i7, int i8) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i5).put("y", i6).put("width", i7).put("height", i8));
        } catch (JSONException e4) {
            int i9 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e4);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e4) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e4);
        }
    }

    public final void zzl(int i5, int i6, int i7, int i8, float f5, int i9) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i5).put("height", i6).put("maxSizeWidth", i7).put("maxSizeHeight", i8).put("density", f5).put("rotation", i9));
        } catch (JSONException e4) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e4);
        }
    }
}
