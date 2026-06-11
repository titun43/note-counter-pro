package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzeeg {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcma zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfjk zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfoo zzi;
    private final zzdxt zzj;
    private final zzfqk zzk;
    private final zzdej zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzcac zzq;

    public zzeeg(zzcma zzcmaVar, Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, String str, zzfoo zzfooVar, zzdxt zzdxtVar, zzcac zzcacVar, zzehb zzehbVar, ScheduledExecutorService scheduledExecutorService, zzfqk zzfqkVar, zzdej zzdejVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfjkVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfooVar;
        zzcmaVar.zzB();
        this.zzj = zzdxtVar;
        this.zzq = zzcacVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfqkVar;
        this.zzl = zzdejVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final j3.a zzg(String str, final String str2) {
        j3.a zza2;
        String str3;
        String str4;
        String str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (TextUtils.isEmpty(str)) {
            return zzgzo.zzc(new zzenv(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfoe zzn = zzfoe.zzn(context, 11);
        zzn.zza();
        zzbsz zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzx());
        zzbst zzbstVar = zzbsw.zza;
        final zzbsp zza3 = zzb.zza("google.afma.response.normalize", zzbstVar, zzbstVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzia)).booleanValue()) {
            try {
                str3 = str;
            } catch (JSONException unused) {
                str3 = str;
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.zzn = jSONObject.optString("fetch_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)).getJSONArray("nofill_urls"), null);
            } catch (JSONException unused2) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
                str4 = this.zzn;
                final List list = this.zzo;
                if (TextUtils.isEmpty(str4)) {
                }
                zzgyw zzgywVar = new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzeef
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ j3.a zza(Object obj) {
                        String str6 = (String) obj;
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        String str7 = str2;
                        try {
                            jSONObject4.put("headers", new JSONObject());
                            jSONObject4.put("body", str6);
                            jSONObject3.put("base_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            jSONObject3.put("signals", new JSONObject(str7));
                            jSONObject2.put("request", jSONObject3);
                            jSONObject2.put("response", jSONObject4);
                            jSONObject2.put("flags", new JSONObject());
                            return zzgzo.zza(jSONObject2);
                        } catch (JSONException e4) {
                            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e4.getCause())));
                        }
                    }
                };
                Executor executor = this.zzf;
                j3.a zzj = zzgzo.zzj(zzgzo.zzj(zzgzo.zzj(zza2, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeeb
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ j3.a zza(Object obj) {
                        return zzeeg.this.zzb(zza3, (JSONObject) obj);
                    }
                }, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeec
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ j3.a zza(Object obj) {
                        return zzeeg.this.zzc((JSONObject) obj);
                    }
                }, executor);
                zzfon.zzd(zzj, this.zzi, zzn);
                zzgzo.zzr(zzj, new zzeea(this), zzcei.zzg);
                return zzj;
            }
            str4 = this.zzn;
            final List list2 = this.zzo;
            if (TextUtils.isEmpty(str4)) {
                this.zzj.zzd("sst", "2");
                String str6 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzic);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzib)).booleanValue()) {
                    List zze = zzgrr.zzb(zza).zze(str4);
                    if (zze.size() < 2) {
                        zza2 = zzgzo.zzc(new zzenv(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) zze.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                final zzegy zzegyVar = new zzegy(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6, false);
                zza2 = (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeed
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzeeg.this.zzd(zzegyVar);
                    }
                })), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzid)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeee
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ j3.a zza(Object obj) {
                        return zzeeg.this.zze(list2, (Exception) obj);
                    }
                }, this.zzf);
            } else {
                zza2 = zzgzo.zza(str3);
                this.zzj.zzd("sst", "1");
            }
        } else {
            zza2 = zzgzo.zza(str);
            this.zzj.zzd("sst", "1");
        }
        zzgyw zzgywVar2 = new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzeef
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                String str62 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str62);
                    jSONObject3.put("base_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgzo.zza(jSONObject2);
                } catch (JSONException e4) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e4.getCause())));
                }
            }
        };
        Executor executor2 = this.zzf;
        j3.a zzj2 = zzgzo.zzj(zzgzo.zzj(zzgzo.zzj(zza2, zzgywVar2, executor2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeeb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzeeg.this.zzb(zza3, (JSONObject) obj);
            }
        }, executor2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzeeg.this.zzc((JSONObject) obj);
            }
        }, executor2);
        zzfon.zzd(zzj2, this.zzi, zzn);
        zzgzo.zzr(zzj2, new zzeea(this), zzcei.zzg);
        return zzj2;
    }

    private final void zzh(zzdxh zzdxhVar) {
        Bundle zze = this.zzj.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), zze, zzdxhVar.zza());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            String concat = "Failed to update the ad types for rendering. ".concat(e4.toString());
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        } catch (JSONException unused) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x022e, code lost:
    
        if (r5.zze(r1, r2, r4) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ec A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:22:0x007e, B:24:0x009c, B:27:0x00a4, B:29:0x00b1, B:31:0x00cb, B:32:0x00fb, B:34:0x0107, B:36:0x010f, B:37:0x0115, B:41:0x011e, B:44:0x0156, B:47:0x0132, B:50:0x0141, B:52:0x015b, B:55:0x00e5, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b6, B:68:0x01cb, B:70:0x01ec, B:71:0x0201, B:74:0x0215, B:76:0x021b, B:77:0x0228, B:79:0x022a, B:81:0x0233, B:86:0x0230, B:87:0x01f6, B:88:0x01de, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x007e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021b A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:22:0x007e, B:24:0x009c, B:27:0x00a4, B:29:0x00b1, B:31:0x00cb, B:32:0x00fb, B:34:0x0107, B:36:0x010f, B:37:0x0115, B:41:0x011e, B:44:0x0156, B:47:0x0132, B:50:0x0141, B:52:0x015b, B:55:0x00e5, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b6, B:68:0x01cb, B:70:0x01ec, B:71:0x0201, B:74:0x0215, B:76:0x021b, B:77:0x0228, B:79:0x022a, B:81:0x0233, B:86:0x0230, B:87:0x01f6, B:88:0x01de, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x007e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022a A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:22:0x007e, B:24:0x009c, B:27:0x00a4, B:29:0x00b1, B:31:0x00cb, B:32:0x00fb, B:34:0x0107, B:36:0x010f, B:37:0x0115, B:41:0x011e, B:44:0x0156, B:47:0x0132, B:50:0x0141, B:52:0x015b, B:55:0x00e5, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b6, B:68:0x01cb, B:70:0x01ec, B:71:0x0201, B:74:0x0215, B:76:0x021b, B:77:0x0228, B:79:0x022a, B:81:0x0233, B:86:0x0230, B:87:0x01f6, B:88:0x01de, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x007e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:22:0x007e, B:24:0x009c, B:27:0x00a4, B:29:0x00b1, B:31:0x00cb, B:32:0x00fb, B:34:0x0107, B:36:0x010f, B:37:0x0115, B:41:0x011e, B:44:0x0156, B:47:0x0132, B:50:0x0141, B:52:0x015b, B:55:0x00e5, B:57:0x016f, B:60:0x018c, B:64:0x0194, B:66:0x01b6, B:68:0x01cb, B:70:0x01ec, B:71:0x0201, B:74:0x0215, B:76:0x021b, B:77:0x0228, B:79:0x022a, B:81:0x0233, B:86:0x0230, B:87:0x01f6, B:88:0x01de, B:91:0x01a2, B:94:0x017c, B:95:0x0181), top: B:21:0x007e, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j3.a zza() {
        String str;
        int i5;
        String str2;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzp = this.zze.zzt;
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzj.zze(), zzdxh.SCAR_PRELOADER_READY.zza());
        }
        String str3 = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(str3)) {
            String zzj = zzj(str3);
            zzbgv zzbgvVar = zzbhe.zzhW;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzj.isEmpty()) {
                int lastIndexOf = str3.lastIndexOf("&request_id=");
                zzj = lastIndexOf != -1 ? str3.substring(lastIndexOf + 12) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (TextUtils.isEmpty(zzj)) {
                return zzgzo.zzc(new zzenv(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                try {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzv zzt = this.zzb.zzt();
                    zzdxt zzdxtVar = this.zzj;
                    String zzb = zzt.zzb(zzj, zzdxtVar);
                    String str4 = null;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && !TextUtils.isEmpty(zzb)) {
                        try {
                            JSONObject optJSONObject = new JSONObject(zzb).optJSONObject("extras");
                            if (optJSONObject != null) {
                                if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhY)).booleanValue() ? Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhZ)).split(",")) : Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhX)).split(","))).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(optJSONObject.optString("query_info_type", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)))) {
                                    int lastIndexOf2 = str3.lastIndexOf("&");
                                    String substring = lastIndexOf2 != -1 ? str3.substring(0, lastIndexOf2) : null;
                                    if (!TextUtils.isEmpty(substring)) {
                                        try {
                                            byte[] decode = Base64.decode(substring, 11);
                                            byte[] bytes = zzj.getBytes(StandardCharsets.UTF_8);
                                            if (!TextUtils.isEmpty(zzb)) {
                                                try {
                                                    string = new JSONObject(zzb).getString("arek");
                                                } catch (JSONException e4) {
                                                    com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e4.toString()));
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "CryptoUtils.getKeyFromQueryJsonMap");
                                                }
                                                str3 = zzfka.zzb(decode, bytes, string, zzdxtVar);
                                            }
                                            string = null;
                                            str3 = zzfka.zzb(decode, bytes, string, zzdxtVar);
                                        } catch (IllegalArgumentException e5) {
                                            com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e5.toString()));
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e5, "PreloadedLoader.decryptAdResponseIfNecessary");
                                        }
                                    }
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        try {
                            str = new JSONObject(str3).optString("render_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        } catch (JSONException unused2) {
                            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        try {
                            str5 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e6) {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e6, "PreloadedLoader.decodeRenderId");
                        }
                        List zze = zzgrr.zza(zzgqq.zzc(':')).zze(str5);
                        if (zze.size() == 2) {
                            str4 = (String) zze.get(0);
                            i5 = Integer.parseInt((String) zze.get(1));
                            Pair pair = str4 == null ? new Pair(str4, Integer.valueOf(i5)) : new Pair(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0);
                            str2 = (String) pair.first;
                            int intValue = ((Integer) pair.second).intValue();
                            if (!TextUtils.isEmpty(str2) && intValue > 0) {
                                if (!zzt.zzd(zzj, str2)) {
                                    return zzgzo.zzc(new zzenv(10, "The ad has already been shown."));
                                }
                            }
                            zzt.zzc(zzj);
                            if (!TextUtils.isEmpty(zzb)) {
                                return zzg(str3, zzi(zzb));
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                        }
                    }
                    i5 = 0;
                    if (str4 == null) {
                    }
                    str2 = (String) pair.first;
                    int intValue2 = ((Integer) pair.second).intValue();
                    if (!TextUtils.isEmpty(str2)) {
                        if (!zzt.zzd(zzj, str2)) {
                        }
                    }
                    zzt.zzc(zzj);
                    if (!TextUtils.isEmpty(zzb)) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhO)).booleanValue()) {
                String str6 = zzcVar.zza;
                String str7 = zzcVar.zzb;
                String zzj2 = zzj(str6);
                String zzj3 = zzj(str7);
                if (TextUtils.isEmpty(zzj3) || !zzj2.equals(zzj3)) {
                    this.zzj.zzc().put("ridmm", "true");
                } else {
                    this.zzb.zzt().zzc(zzj2);
                    this.zzj.zzc().put("request_id", zzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return zzgzo.zzc(new zzenv(14, "Mismatch request IDs."));
    }

    public final j3.a zzb(zzbsp zzbspVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzj.zze(), zzdxh.SCAR_PRELOADER_PROCESSING_DONE.zza());
        }
        return zzbspVar.zzb(jSONObject);
    }

    public final /* synthetic */ j3.a zzc(JSONObject jSONObject) {
        zzfiz zzfizVar = new zzfiz(this.zze);
        String jSONObject2 = jSONObject.toString();
        return zzgzo.zza(new zzfjc(zzfizVar, zzfjb.zza(new StringReader(jSONObject2), this.zzp)));
    }

    public final /* synthetic */ String zzd(zzegy zzegyVar) {
        zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i5 = 0;
        int i6 = -1;
        while (true) {
            try {
                if (i5 >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzie)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i6);
                    throw new zzenv(1, sb.toString());
                }
                zzegz zza2 = new zzeha(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzegyVar);
                int i7 = zza2.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzif)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i5));
                }
                if (i7 == 200) {
                    zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zza2.zzc;
                }
                i5++;
                i6 = i7;
            } catch (Exception e4) {
                throw new zzenv(1, e4.getMessage() == null ? "Fetch failed." : e4.getMessage(), e4);
            }
        }
    }

    public final /* synthetic */ j3.a zze(List list, Exception exc) {
        zzenv zzenvVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzenvVar = new zzenv(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzenv) {
            zzenvVar = (zzenv) exc;
        } else {
            zzenvVar = new zzenv(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzenvVar.getMessage() == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzenvVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zze = zzgrr.zza(zzgqq.zzc(':')).zze(message);
                    if (zze.size() == 2) {
                        message = (String) zze.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfqg.zzd(zzfqg.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgzo.zzc(zzenvVar);
    }

    public final /* synthetic */ zzdej zzf() {
        return this.zzl;
    }
}
