package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbig extends n.a {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlq)).split(","));
    private final zzbij zzc;
    private final n.a zzd;
    private final zzdye zze;

    public zzbig(zzbij zzbijVar, n.a aVar, zzdye zzdyeVar) {
        this.zzd = aVar;
        this.zzc = zzbijVar;
        this.zze = zzdyeVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // n.a
    public final void extraCallback(String str, Bundle bundle) {
        n.a aVar = this.zzd;
        if (aVar != null) {
            aVar.extraCallback(str, bundle);
        }
    }

    @Override // n.a
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        n.a aVar = this.zzd;
        if (aVar != null) {
            return aVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // n.a
    public final void onActivityResized(int i5, int i6, Bundle bundle) {
        n.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onActivityResized(i5, i6, bundle);
        }
    }

    @Override // n.a
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        n.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onMessageChannelReady(bundle);
        }
    }

    @Override // n.a
    public final void onNavigationEvent(int i5, Bundle bundle) {
        this.zza.set(false);
        n.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onNavigationEvent(i5, bundle);
        }
        zzbij zzbijVar = this.zzc;
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        zzbijVar.zzg(System.currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i5))) {
            return;
        }
        zzbijVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // n.a
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e4);
        }
        n.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onPostMessage(str, bundle);
        }
    }

    @Override // n.a
    public final void onRelationshipValidationResult(int i5, Uri uri, boolean z4, Bundle bundle) {
        n.a aVar = this.zzd;
        if (aVar != null) {
            aVar.onRelationshipValidationResult(i5, uri, z4, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
