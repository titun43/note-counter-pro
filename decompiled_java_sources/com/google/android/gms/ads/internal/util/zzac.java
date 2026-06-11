package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzgal;
import com.google.android.gms.internal.ads.zzgam;
import com.google.android.gms.internal.ads.zzgan;
import com.google.android.gms.internal.ads.zzgqq;
import com.google.android.gms.internal.ads.zzgrr;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzac {
    public static void zza(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzgal zzh = zzgal.zzh(context);
            zzgam zzh2 = zzgam.zzh(context);
            zzgan zza = zzgan.zza(context);
            zzh.zzk();
            zzh.zzl();
            zzh2.zzj();
            zza.zzb(null);
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e4, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e5) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e5, "clearStorageOnIdlessMode_scar");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle zzb(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e4) {
                int i5 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("JSON parsing error", e4);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i7 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i7 != 0) {
                    List zze = zzgrr.zza(zzgqq.zzc('/')).zze(optString2);
                    if (zze.size() > 2 || zze.isEmpty()) {
                        obj = null;
                    } else {
                        if (zze.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) zze.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) zze.get(0), 0);
                            str2 = (String) zze.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i8 = i7 - 1;
                        if (i8 != 0) {
                            if (i8 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static Bundle zzc(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }
}
