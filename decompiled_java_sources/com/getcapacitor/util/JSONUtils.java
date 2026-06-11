package com.getcapacitor.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JSONUtils {
    public static String[] getArray(JSONObject jSONObject, String str, String[] strArr) {
        JSONArray jSONArray;
        try {
            jSONArray = getDeepestObject(jSONObject, str).getJSONArray(getDeepestKey(str));
        } catch (JSONException unused) {
        }
        if (jSONArray == null) {
            return strArr;
        }
        int length = jSONArray.length();
        String[] strArr2 = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            strArr2[i5] = (String) jSONArray.get(i5);
        }
        return strArr2;
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z4) {
        try {
            return getDeepestObject(jSONObject, str).getBoolean(getDeepestKey(str));
        } catch (JSONException unused) {
            return z4;
        }
    }

    private static String getDeepestKey(String str) {
        String[] split = str.split("\\.");
        if (split.length > 0) {
            return split[split.length - 1];
        }
        return null;
    }

    private static JSONObject getDeepestObject(JSONObject jSONObject, String str) {
        String[] split = str.split("\\.");
        for (int i5 = 0; i5 < split.length - 1; i5++) {
            jSONObject = jSONObject.getJSONObject(split[i5]);
        }
        return jSONObject;
    }

    public static double getDouble(JSONObject jSONObject, String str, double d5) {
        try {
            return getDeepestObject(jSONObject, str).getDouble(getDeepestKey(str));
        } catch (JSONException unused) {
            return d5;
        }
    }

    public static int getInt(JSONObject jSONObject, String str, int i5) {
        try {
            return getDeepestObject(jSONObject, str).getInt(getDeepestKey(str));
        } catch (JSONException unused) {
            return i5;
        }
    }

    public static JSONObject getObject(JSONObject jSONObject, String str) {
        try {
            return getDeepestObject(jSONObject, str).getJSONObject(getDeepestKey(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        String string;
        try {
            string = getDeepestObject(jSONObject, str).getString(getDeepestKey(str));
        } catch (JSONException unused) {
        }
        return string == null ? str2 : string;
    }
}
