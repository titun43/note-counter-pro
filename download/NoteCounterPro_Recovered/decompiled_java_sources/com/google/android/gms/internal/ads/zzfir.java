package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfir {
    public final zzccb zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfjn zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final Bundle zzaF;
    public final boolean zzaG;
    public final int zzaH;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbxy zzad;
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzcas zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfiw zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v125, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v212, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.List] */
    public zzfir(JsonReader jsonReader) {
        List list;
        List list2;
        List list3 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzguf.zzi();
        zzguf zzi = zzguf.zzi();
        HashMap hashMap = new HashMap();
        zzguf zzi2 = zzguf.zzi();
        zzguf zzi3 = zzguf.zzi();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        int i5 = 0;
        List list4 = list3;
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzguf zzgufVar = zzi;
        HashMap hashMap2 = hashMap;
        zzguf zzgufVar2 = zzi2;
        zzguf zzgufVar3 = zzi3;
        Bundle bundle2 = bundle;
        boolean z4 = true;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        int i12 = 0;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        int i13 = 0;
        int i14 = 2;
        double d5 = 0.0d;
        zzcas zzcasVar = null;
        zzfiw zzfiwVar = null;
        zzccb zzccbVar = null;
        zzbxy zzbxyVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        String str = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar = null;
        String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        String str20 = str19;
        String str21 = str20;
        List list5 = list4;
        List list6 = list5;
        List list7 = list6;
        List list8 = list7;
        List list9 = list8;
        List list10 = list9;
        List list11 = list10;
        List list12 = list11;
        List list13 = list12;
        List list14 = list13;
        List list15 = list14;
        JSONObject jSONObject12 = jSONObject;
        List list16 = list15;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_instance_name")) {
                        str16 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1980587809:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("debug_signals")) {
                        jSONObject7 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1965512151:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("omid_settings")) {
                        jSONObject9 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1964744830:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("offline_ad_config")) {
                        if (((Boolean) zzbhe.zzjT.zzg()).booleanValue()) {
                            zzwVar = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1871425831:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("recursive_server_response_data")) {
                        str19 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1843156475:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_consent")) {
                        z22 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1840512279:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("presentation_urls")) {
                        zzgufVar2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1828733410:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("network_ping_config")) {
                        if (((Boolean) zzbhe.zzjR.zzg()).booleanValue()) {
                            zzvVar = com.google.android.gms.ads.internal.util.client.zzv.zzb(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1812055556:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("play_prewarm_options")) {
                        zzbxyVar = zzbxy.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1785028569:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("parallel_key")) {
                        str21 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1776946669:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_name")) {
                        str14 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1662989631:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_interscroller")) {
                        z16 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1620552059:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("preload_sort_type")) {
                        i14 = zzfrn.zza(jsonReader.nextInt());
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1620470467:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("backend_query_id")) {
                        str11 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1550155393:
                    list = list11;
                    list2 = list12;
                    if (!str22.equals("nofill_urls")) {
                        jsonReader.skipValue();
                        list12 = list2;
                        list11 = list;
                        break;
                    } else {
                        list11 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        break;
                    }
                case -1440104884:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_custom_close_blocked")) {
                        z10 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1439500848:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("orientation")) {
                        i6 = zze(jsonReader.nextString());
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1428969291:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("enable_omid")) {
                        z12 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1406227629:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        z20 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1403779768:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("showable_impression_type")) {
                        i11 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1375413093:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_cover")) {
                        jSONObject10 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1360811658:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_sizes")) {
                        list13 = zzfis.zza(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1306015996:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("adapters")) {
                        list14 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1303332046:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("test_mode_enabled")) {
                        z9 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1289032093:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("extras")) {
                        jSONObject8 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1240082064:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_event_value")) {
                        zztVar = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1234181075:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        z5 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1168140544:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("presentation_error_urls")) {
                        list12 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1152230954:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_type")) {
                        i5 = zzc(jsonReader.nextString());
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1146534047:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_scroll_aware")) {
                        z14 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1115838944:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("fill_urls")) {
                        list10 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1081936678:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allocation_id")) {
                        str4 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1078050970:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("video_complete_urls")) {
                        list9 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1051269058:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("active_view")) {
                        str7 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader).toString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -982608540:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("valid_from_timestamp")) {
                        str2 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -972056451:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_instance_id")) {
                        str17 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -776859333:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("click_urls")) {
                        list16 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -652881372:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("on_device_storage_configs")) {
                        if (((Boolean) zzbhe.zziP.zzg()).booleanValue()) {
                            zzgufVar3 = zzdzd.zza(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -570101180:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("late_load_urls")) {
                        zzgufVar = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -544216775:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("safe_browsing")) {
                        zzccbVar = zzccb.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -437057161:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("imp_urls")) {
                        list5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -404433734:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("rtb_native_required_assets")) {
                        jSONObject11 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -404326515:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("render_timeout_ms")) {
                        i10 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -397704715:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_close_time_ms")) {
                        i7 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -388807511:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("content_url")) {
                        str = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -369773488:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -213449460:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        z19 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -213424028:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("watermark")) {
                        str10 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -180214626:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("native_required_asset_viewability")) {
                        z18 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -154616268:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_offline_ad")) {
                        z17 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -29338502:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allow_custom_click_gesture")) {
                        z7 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 3107:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad")) {
                        zzfiwVar = new zzfiw(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        list12 = list2;
                        list11 = list;
                    }
                case 3355:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("id")) {
                        str5 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 3076010:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("data")) {
                        jSONObject12 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 37109963:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("request_id")) {
                        str18 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 63195984:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("render_test_label")) {
                        z8 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 107433883:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("qdata")) {
                        str6 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 230323073:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_load_urls")) {
                        list6 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 281223176:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_secondary_analytics_logging_enabled")) {
                        z4 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 418392395:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_closable_area_disabled")) {
                        z11 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 542250332:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("consent_form_action_identifier")) {
                        i12 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 549176928:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        i13 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 597473788:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("debug_dialog_string")) {
                        str8 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 639133141:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("response_info_extras_override")) {
                        if (((Boolean) zzbhe.zzhJ.zzg()).booleanValue()) {
                            try {
                                Bundle zzl = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                                if (zzl != null) {
                                    bundle2 = zzl;
                                }
                            } catch (IllegalStateException unused) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 754887508:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("container_sizes")) {
                        list15 = zzfis.zza(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 791122864:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("impression_type")) {
                        i9 = zzd(jsonReader.nextInt());
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 805095541:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) zzbhe.zzaK.zzg()).booleanValue()) {
                            hashMap2 = com.google.android.gms.ads.internal.util.zzbp.zzc(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1010584092:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("transaction_id")) {
                        str3 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1100650276:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("rewards")) {
                        zzcasVar = zzcas.zza(com.google.android.gms.ads.internal.util.zzbp.zze(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1141602460:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("adapter_response_info_key")) {
                        str20 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1186014765:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("cache_hit_urls")) {
                        com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1303622534:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("preload_sort_value")) {
                        d5 = jsonReader.nextDouble();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1321720943:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        z6 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1422388341:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_collapsible")) {
                        z21 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1437255331:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_id")) {
                        str15 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1556932485:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        if (((Boolean) zzbhe.zzoo.zzg()).booleanValue()) {
                            i8 = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1565514205:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("adapter_only_third_party_impression")) {
                        z25 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1637553475:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("bid_response")) {
                        str9 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1638957285:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("video_start_urls")) {
                        list7 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1686319423:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_network_class_name")) {
                        str13 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1688341040:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("video_reward_urls")) {
                        list8 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1799285870:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("use_third_party_container_height")) {
                        z15 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1839650832:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("renderers")) {
                        list3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1875425491:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        z13 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2068142375:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("rule_line_external_id")) {
                        str12 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2072888499:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("manual_tracking_urls")) {
                        list4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2075506442:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("render_serially")) {
                        z23 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2117205836:
                    list2 = list12;
                    list = list11;
                    if (str22.equals("flow_control")) {
                        z24 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                default:
                    list = list11;
                    list2 = list12;
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = list3;
        this.zzb = i5;
        this.zzc = list16;
        this.zzd = list5;
        this.zzf = list6;
        this.zze = i9;
        this.zzg = list7;
        this.zzh = list8;
        this.zzi = list9;
        this.zzj = str3;
        this.zzk = str2;
        this.zzl = zzcasVar;
        this.zzm = list10;
        this.zzn = list11;
        this.zzo = list12;
        this.zzp = list4;
        this.zzq = i13;
        this.zzr = list15;
        this.zzs = zzfiwVar;
        this.zzt = list14;
        this.zzu = list13;
        this.zzw = str4;
        this.zzv = jSONObject12;
        this.zzx = str5;
        this.zzy = str6;
        this.zzz = str7;
        this.zzA = zzccbVar;
        this.zzB = str8;
        this.zzC = jSONObject7;
        this.zzD = jSONObject8;
        this.zzJ = z5;
        this.zzK = z6;
        this.zzL = z7;
        this.zzM = z8;
        this.zzN = z9;
        this.zzO = z10;
        this.zzP = z11;
        this.zzQ = i6;
        this.zzR = i10;
        this.zzT = z12;
        this.zzU = str9;
        this.zzV = new zzfjn(jSONObject9);
        this.zzW = z13;
        this.zzX = z14;
        this.zzY = i11;
        this.zzZ = str10;
        this.zzaa = i7;
        this.zzab = str11;
        this.zzac = z15;
        this.zzad = zzbxyVar;
        this.zzae = zztVar;
        this.zzaf = str12;
        this.zzag = z16;
        this.zzah = jSONObject10;
        this.zzE = str13;
        this.zzF = str14;
        this.zzG = str15;
        this.zzH = str16;
        this.zzI = str17;
        this.zzai = z17;
        this.zzaj = jSONObject11;
        this.zzak = z18;
        this.zzal = str;
        this.zzam = z19;
        this.zzS = z20;
        this.zzan = str18;
        this.zzao = str19;
        this.zzap = str20;
        this.zzaq = z21;
        this.zzar = z22;
        this.zzas = i12;
        this.zzau = zzgufVar;
        this.zzat = str21;
        this.zzav = z23;
        this.zzaw = hashMap2;
        this.zzax = zzvVar;
        this.zzay = zzwVar;
        this.zzaz = d5;
        this.zzaH = i14;
        this.zzaA = zzgufVar2;
        this.zzaB = z24;
        this.zzaC = zzgufVar3;
        this.zzaD = z25;
        this.zzaE = i8;
        this.zzaF = bundle2;
        this.zzaG = z4;
    }

    public static String zza(int i5) {
        switch (i5) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i5) {
        if (i5 == 0 || i5 == 1 || i5 == 3 || i5 == 4) {
            return i5;
        }
        return 0;
    }

    private static int zze(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
