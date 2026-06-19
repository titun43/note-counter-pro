package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfud {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static void zza(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject zzb(int i5, int i6, int i7, int i8) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i5 / zza);
            jSONObject.put("y", i6 / zza);
            jSONObject.put("width", i7 / zza);
            jSONObject.put("height", i8 / zza);
            return jSONObject;
        } catch (JSONException e4) {
            zzfue.zza("Error with creating viewStateObject", e4);
            return jSONObject;
        }
    }

    public static void zzc(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e4) {
            StringBuilder sb = new StringBuilder(str.length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            zzfue.zza(sb.toString(), e4);
        }
    }

    public static void zzd(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e4) {
            zzfue.zza("Error with setting ad session id", e4);
        }
    }

    public static void zze(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public static void zzf(JSONObject jSONObject) {
        float f5;
        float f6;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f7 = point.x;
            float f8 = zza;
            f5 = f7 / f8;
            f6 = point.y / f8;
        } else {
            f5 = 0.0f;
            f6 = 0.0f;
        }
        try {
            jSONObject.put("width", f5);
            jSONObject.put("height", f6);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public static boolean zzg(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i5 = 0;
            while (true) {
                if (i5 < 4) {
                    String str = strArr[i5];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i5++;
                } else if (jSONObject.optString("adSessionId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(jSONObject2.optString("adSessionId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzh(optJSONArray, optJSONArray2)) {
                            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                if (!optJSONArray.optString(i6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(optJSONArray2.optString(i6, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzh(optJSONArray3, optJSONArray4)) {
                            for (int i7 = 0; i7 < optJSONArray3.length(); i7++) {
                                if (zzg(optJSONArray3.optJSONObject(i7), optJSONArray4.optJSONObject(i7))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
