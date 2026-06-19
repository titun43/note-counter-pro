package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjk;
import com.google.android.gms.internal.ads.zzfot;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzaa {
    public static boolean zza(zzfjc zzfjcVar) {
        return zzg(zzfjcVar.zza.zza) != 1;
    }

    public static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zzfot zzd(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    return zzfot.SCAR_REQUEST_TYPE_ADMOB;
                }
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    return zzfot.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                }
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    return zzfot.SCAR_REQUEST_TYPE_GBID;
                }
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    return zzfot.SCAR_REQUEST_TYPE_GOLDENEYE;
                }
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    return zzfot.SCAR_REQUEST_TYPE_YAVIN;
                }
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    return zzfot.SCAR_REQUEST_TYPE_UNITY;
                }
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    return zzfot.SCAR_REQUEST_TYPE_PAW;
                }
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    return zzfot.SCAR_REQUEST_TYPE_GUILDER;
                }
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    return zzfot.SCAR_REQUEST_TYPE_GAM_S2S;
                }
                break;
        }
        return zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
    }

    public static void zze(final zzdye zzdyeVar, zzdxt zzdxtVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhR)).booleanValue()) {
            final zzdxt zzdxtVar2 = null;
            zzcei.zza.execute(new Runnable(zzdxtVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzaa.zzf(zzdye.this, null, this.zzb, this.zzc);
                }
            });
        }
    }

    public static /* synthetic */ void zzf(zzdye zzdyeVar, zzdxt zzdxtVar, String str, Pair[] pairArr) {
        ConcurrentHashMap zzd = zzdyeVar.zzd();
        zzh(zzd, "action", str);
        for (Pair pair : pairArr) {
            zzh(zzd, (String) pair.first, (String) pair.second);
        }
        zzdyeVar.zzb(zzd);
    }

    public static int zzg(zzfjk zzfjkVar) {
        if (zzfjkVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjkVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzh(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
