package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    public zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    private final j3.a zze(j3.a aVar, zzdxh zzdxhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(aVar, new zzdqx(this, zzdxhVar), this.zza);
        }
        return aVar;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final j3.a zza(final zzfjc zzfjcVar, final zzfir zzfirVar, final JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        j3.a zza;
        JSONArray optJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzd.zze(), zzdxh.RENDERING_NATIVE_ASSETS_LOADING_START.zza());
        }
        final j3.a submit = this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdra.this.zzb(zzfjcVar, zzfirVar, jSONObject);
            }
        });
        zze(submit, zzdxh.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdrp zzdrpVar = this.zzb;
        final j3.a zzb = zzdrpVar.zzb(jSONObject, "images", zzdxh.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(zzb, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
        final j3.a zzc = zzdrpVar.zzc(jSONObject, "images", zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(zzc, zzdxh.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final j3.a zza2 = zzdrpVar.zza(jSONObject, "secondary_image", zzdxh.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(zza2, zzdxh.NATIVE_ASSETS_LOADING_LOGO_END);
        final j3.a zza3 = zzdrpVar.zza(jSONObject, "app_icon", zzdxh.NATIVE_ASSETS_LOADING_ICON_START);
        zze(zza3, zzdxh.NATIVE_ASSETS_LOADING_ICON_END);
        final j3.a zzd = zzdrpVar.zzd(jSONObject, "attribution", zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(zzd, zzdxh.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final j3.a zzg = zzdrpVar.zzg(jSONObject, zzfirVar, zzfiuVar, zzbVar, zzcceVar);
        zze(zzg, zzdxh.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzow)).booleanValue() && jSONObject.has("video")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i5);
                    if (optJSONObject2 == null || !optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i5++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                zza = this.zzb.zzf(zzg);
                                zze(zza, zzdxh.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        zza = zzgzo.zza(new Bundle());
        final j3.a zza4 = this.zzc.zza(jSONObject, "custom_assets");
        zze(zza4, zzdxh.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final j3.a zze = this.zzb.zze(jSONObject, zzbVar, zzcceVar);
        zze(zze, zzdxh.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(submit);
        arrayList.add(zzb);
        arrayList.add(zzc);
        arrayList.add(zza2);
        arrayList.add(zza3);
        arrayList.add(zzd);
        arrayList.add(zzg);
        arrayList.add(zza);
        arrayList.add(zza4);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            arrayList.add(zze);
        }
        final j3.a aVar = zza;
        return zzgzo.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdra.this.zzc(submit, zzb, zza3, zza2, zzd, jSONObject, zzg, aVar, zzc, zze, zza4);
            }
        }, this.zza);
    }

    public final zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzd.zze(), zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int zzx = zzdohVar.zzx();
            throw new zzenv(1, u.l(new StringBuilder(String.valueOf(zzx).length() + 21), "Invalid template ID: ", zzx));
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String optString = jSONObject.optString("headline", null);
        if (zzfirVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String zzD = com.google.android.gms.ads.internal.util.zzs.zzD();
            optString = h1.b(new StringBuilder(String.valueOf(zzD).length() + 3 + String.valueOf(optString).length()), zzD, " : ", optString);
        }
        zzdohVar.zzs("headline", optString);
        zzdohVar.zzs("body", jSONObject.optString("body", null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdohVar.zzs("store", jSONObject.optString("store", null));
        zzdohVar.zzs("price", jSONObject.optString("price", null));
        zzdohVar.zzs("advertiser", jSONObject.optString("advertiser", null));
        return zzdohVar;
    }

    public final zzdoh zzc(j3.a aVar, j3.a aVar2, j3.a aVar3, j3.a aVar4, j3.a aVar5, JSONObject jSONObject, j3.a aVar6, j3.a aVar7, j3.a aVar8, j3.a aVar9, j3.a aVar10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzd.zze(), zzdxh.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdoh zzdohVar = (zzdoh) aVar.get();
        zzdohVar.zzd((List) aVar2.get());
        zzdohVar.zzj((zzbks) aVar3.get());
        zzdohVar.zzk((zzbks) aVar4.get());
        zzdohVar.zzc((zzbkl) aVar5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) aVar6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) aVar7.get());
        zzcjl zzcjlVar2 = (zzcjl) aVar8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) aVar9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(aVar9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) aVar10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }

    public final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }
}
