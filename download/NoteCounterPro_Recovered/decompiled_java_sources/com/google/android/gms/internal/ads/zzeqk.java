package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeqk {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzeqk(Executor executor) {
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzl();
        zzj();
        zzk();
    }

    private final synchronized void zzj() {
        JSONObject zzg;
        if (!((Boolean) zzbjk.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcr)).booleanValue() && (zzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                try {
                    JSONArray jSONArray = zzg.getJSONArray("signal_adapters");
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        Bundle zzp = zzp(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzeqo(optString, optBoolean2, optBoolean, true, zzp));
                        }
                    }
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e4);
                }
            }
        }
    }

    private final synchronized void zzk() {
        JSONObject zzg;
        try {
            if (!((Boolean) zzbjk.zzb.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcs)).booleanValue() && (zzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg()) != null) {
                    JSONArray jSONArray = zzg.getJSONArray("adapter_settings");
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i5);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzeqo zzeqoVar = new zzeqo(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.zzd.put(optString, zzeqoVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.zze.put(optString, zzeqoVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e4);
        } finally {
        }
    }

    private final synchronized void zzl() {
        JSONArray optJSONArray;
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzg();
            if (zzg != null) {
                try {
                    JSONArray optJSONArray2 = zzg.optJSONArray("ad_unit_id_settings");
                    this.zzg = zzg.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i5);
                            String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmr)).booleanValue() ? jSONObject.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            String optString = jSONObject.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                    arrayList.addAll(zzm(optJSONArray.getJSONObject(i6), optString));
                                }
                            }
                            zzn(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Malformed config loading JSON.", e4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzm(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle zzp = zzp(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                        String optString = optJSONArray.optString(i5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        String str2 = (String) arrayList2.get(i6);
                        zze(str2);
                        if (((zzeqm) this.zza.get(str2)) != null) {
                            arrayList.add(new zzeqm(str2, str, zzp));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.zzc;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List list2 = (List) map2.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map2.put(str2, list2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized zzgui zzo(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
                boolean matches = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzea), str);
                boolean matches2 = Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeb), str);
                if (matches) {
                    hashMap = new HashMap(this.zze);
                } else if (matches2) {
                    hashMap = new HashMap(this.zzd);
                }
                return zzgui.zzc(hashMap);
            }
            return zzgui.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Bundle zzp(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            }
        }
        return bundle;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzk(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeqk.this.zzf();
            }
        });
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeqk.this.zzg();
            }
        });
    }

    public final synchronized Map zzb() {
        if (TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd())) {
            return zzgui.zza();
        }
        return zzgui.zzc(this.zzb);
    }

    public final synchronized Map zzc(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzeqm> list = (List) map.get(str2);
                if (list == null) {
                    String zza = zzdvw.zza(this.zzg, str2, str);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmr)).booleanValue()) {
                        zza = zza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(zza);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzeqm zzeqmVar : list) {
                        String str3 = zzeqmVar.zza;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzeqmVar.zzb);
                    }
                    return zzgui.zzc(hashMap);
                }
            }
            return zzgui.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzd(String str, String str2) {
        HashMap hashMap;
        try {
            Map zzc = zzc(str, str2);
            zzgui zzo = zzo(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : zzc.entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzo.containsKey(str3)) {
                    zzeqo zzeqoVar = (zzeqo) zzo.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new zzeqo(str3, zzeqoVar.zzb, zzeqoVar.zzc, zzeqoVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgwt it = zzo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((zzeqo) entry2.getValue()).zzd) {
                    hashMap.put(str4, (zzeqo) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized void zze(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new zzeqm(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new Bundle()));
            }
        }
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeqk.this.zzh();
            }
        });
    }
}
