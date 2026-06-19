package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzems implements zzemm {
    private final zzdmq zza;
    private final zzgzy zzb;
    private final zzdra zzc;
    private final zzfkj zzd;
    private final zzdtq zze;
    private final zzdxt zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzcca zzi;

    public zzems(zzdmq zzdmqVar, zzgzy zzgzyVar, zzdra zzdraVar, zzfkj zzfkjVar, zzdtq zzdtqVar, zzdxt zzdxtVar, VersionInfoParcel versionInfoParcel, Context context, zzcca zzccaVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzccaVar;
        this.zza = zzdmqVar;
        this.zzb = zzgzyVar;
        this.zzc = zzdraVar;
        this.zzd = zzfkjVar;
        this.zze = zzdtqVar;
        this.zzf = zzdxtVar;
    }

    private final j3.a zzg(final zzfjc zzfjcVar, final zzfir zzfirVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzcce zzcceVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcN)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzf.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final j3.a zzb = this.zzd.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            Context context = this.zzh;
            zzcce zza = zzdba.zza(context, this.zzg, zzfirVar, this.zzi);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zza, null);
            zzcceVar = zza;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
            zzcceVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzcce zzcceVar2 = zzcceVar;
        final j3.a zza2 = this.zzc.zza(zzfjcVar, zzfirVar, jSONObject, zzbVar2, zzcceVar2);
        return zzgzo.zzo(zzb, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzemq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzems.this.zzf(zza2, zzb, zzfjcVar, zzfirVar, jSONObject, zzbVar2, zzcceVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final j3.a zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzf.zze(), zzdxh.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza());
        }
        j3.a zzb = this.zzd.zzb();
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzems.this.zzc(zzfirVar, (zzdtk) obj);
            }
        };
        zzgzy zzgzyVar = this.zzb;
        return zzgzo.zzj(zzgzo.zzj(zzb, zzgywVar, zzgzyVar), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzems.this.zzd(zzfjcVar, zzfirVar, (JSONArray) obj);
            }
        }, zzgzyVar);
    }

    public final j3.a zzc(zzfir zzfirVar, final zzdtk zzdtkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzf.zze(), zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_START.zza());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjX)).booleanValue() && x2.d.g()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfirVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgzo.zzj(zzdtkVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzemo
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzems.this.zze(zzdtkVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ j3.a zzd(zzfjc zzfjcVar, zzfir zzfirVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgzo.zzc(new zzecr(3));
        }
        int i5 = zzfjcVar.zza.zza.zzl;
        if (i5 <= 1) {
            return zzgzo.zzk(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(0)), zzemp.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcO)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i5));
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 < length) {
                arrayList.add(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(i6)));
            } else {
                arrayList.add(zzgzo.zzc(new zzecr(3)));
            }
        }
        return zzgzo.zza(arrayList);
    }

    public final j3.a zze(zzdtk zzdtkVar, JSONObject jSONObject) {
        this.zzd.zzc(zzgzo.zza(zzdtkVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbso("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcM)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzf.zze(), zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_END.zza());
        }
        return zzgzo.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    public final zzdoc zzf(j3.a aVar, j3.a aVar2, zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar) {
        zzdoh zzdohVar = (zzdoh) aVar.get();
        zzdtk zzdtkVar = (zzdtk) aVar2.get();
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzf.zze(), zzdxh.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdoi zzd = this.zza.zzd(new zzcwv(zzfjcVar, zzfirVar, null), new zzdos(zzdohVar), new zzdnd(jSONObject, zzdtkVar, zzbVar, zzcceVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            zzdxt zzdxtVar = this.zzf;
            zzdxtVar.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            zzdxtVar.zze().putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd.zzi().zzb();
        zzd.zzj().zza(zzdtkVar);
        zzd.zzk().zza(zzdohVar.zzT());
        zzd.zzl().zza(this.zze, zzdohVar.zzU());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            u.u((x2.c) com.google.android.gms.ads.internal.zzt.zzk(), this.zzf.zze(), zzdxh.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzd.zzh();
    }
}
