package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzfst implements j1.e {
    final /* synthetic */ zzfsv zza;

    public zzfst(zzfsv zzfsvVar) {
        Objects.requireNonNull(zzfsvVar);
        this.zza = zzfsvVar;
    }

    @Override // j1.e
    public final void onPostMessage(WebView webView, j1.c cVar, Uri uri, boolean z4, j1.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfsg.zza.getClass();
            }
        } catch (JSONException e4) {
            zzfue.zza("Error parsing JS message in JavaScriptSessionService.", e4);
        }
    }
}
