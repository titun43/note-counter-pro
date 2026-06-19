package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import com.getcapacitor.PluginCall;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdxf implements zzdel, zzdct, zzdbi, zzdjy {
    private final zzdxt zza;
    private final zzdye zzb;
    private final int zzc;

    public zzdxf(zzdxt zzdxtVar, zzdye zzdyeVar, int i5) {
        this.zza = zzdxtVar;
        this.zzb = zzdyeVar;
        this.zzc = i5;
    }

    private final void zzc(Bundle bundle, zzguf zzgufVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() || bundle == null) {
            return;
        }
        u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), bundle, zzdxh.PUBLIC_API_CALLBACK.zza());
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdxtVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgufVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzdxi zzdxiVar = (zzdxi) zzgufVar.get(i5);
            long j2 = bundle.getLong(zzdxiVar.zzb().zza(), -1L);
            long j5 = bundle.getLong(zzdxiVar.zzc().zza(), -1L);
            if (j2 > 0 && j5 > 0) {
                zzdxtVar.zzd(zzdxiVar.zza(), String.valueOf(j5 - j2));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdxtVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdxtVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j2 = bundle.getLong(str);
            if (j2 >= 0) {
                this.zza.zzd(str, String.valueOf(j2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    @Override // com.google.android.gms.internal.ads.zzdjy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        String str;
        zzbzu zzbzuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbjVar == null) {
                zzdxt zzdxtVar = this.zza;
                zzdxtVar.zzc().put("action", "sgs");
                zzdxtVar.zzc().put("request_id", PluginCall.CALLBACK_ID_DANGLING);
                this.zzb.zzb(zzdxtVar.zzc());
                return;
            }
            zzbzu zzbzuVar2 = zzbjVar.zzd;
            Bundle bundle = zzbjVar.zze;
            if (zzbzuVar2 != null) {
                zzc(zzbzuVar2.zzm, zzdxi.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdxi.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbjVar.zzc) ? zzbjVar.zzb : zzbjVar.zzc);
                zzdxt zzdxtVar2 = this.zza;
                zzdxtVar2.zzc().put("action", "sgs");
                Map zzc = zzdxtVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzle)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e4) {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e4);
                    }
                    zzc.put("tpc", str);
                    zzbzuVar = zzbjVar.zzd;
                    if (zzbzuVar != null) {
                        this.zza.zzb(zzbzuVar.zza);
                    }
                    zzdxt zzdxtVar3 = this.zza;
                    zzdxtVar3.zzg();
                    this.zzb.zzb(zzdxtVar3.zzc());
                }
                str = "na";
                zzc.put("tpc", str);
                zzbzuVar = zzbjVar.zzd;
                if (zzbzuVar != null) {
                }
                zzdxt zzdxtVar32 = this.zza;
                zzdxtVar32.zzg();
                this.zzb.zzb(zzdxtVar32.zzc());
            } catch (JSONException unused) {
                zzdxt zzdxtVar4 = this.zza;
                zzdxtVar4.zzc().put("action", "sgf");
                zzdxtVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdxtVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", "ftl");
        zzdxtVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdxtVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzig)).booleanValue()) {
            zzdxtVar.zzd("emsg", zzeVar.zzb);
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        this.zza.zzb(zzbzuVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        this.zza.zza(zzfjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdxt zzdxtVar = this.zza;
            zzdxtVar.zzc().put("action", "sgf");
            zzdxtVar.zzd("sgf_reason", str);
            zzdxtVar.zzg();
            this.zzb.zzb(zzdxtVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", "loaded");
        zzc(zzdxtVar.zze(), zzdxi.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoc)).booleanValue()) {
            zzdxtVar.zzc().put("mafe", true != a.a.q("MUTE_AUDIO") ? "0" : "1");
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }
}
