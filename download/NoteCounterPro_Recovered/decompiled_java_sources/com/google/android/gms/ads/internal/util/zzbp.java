package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzfiw;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbp {
    public static List zza(JSONArray jSONArray, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                list.add(jSONArray.getString(i5));
            }
        }
        return list;
    }

    public static List zzb(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Map zzc(JsonReader jsonReader) {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            HashMap hashMap2 = new HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                hashMap2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            hashMap.put(nextName, hashMap2);
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static JSONObject zzd(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, zze(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, zzd(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray zze(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(zze(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(zzd(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void zzf(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzf(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    zzg(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public static void zzg(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                Object obj = jSONArray.get(i5);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzf(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    zzg(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public static JSONObject zzh(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject zzi(JSONObject jSONObject, String... strArr) {
        JSONObject zzo = zzo(jSONObject, strArr);
        if (zzo == null) {
            return null;
        }
        return zzo.optJSONObject(strArr[1]);
    }

    public static boolean zzj(boolean z4, JSONObject jSONObject, String... strArr) {
        JSONObject zzo = zzo(jSONObject, strArr);
        if (zzo == null) {
            return false;
        }
        return zzo.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String zzk(String str, JSONObject jSONObject, String... strArr) {
        JSONObject zzo = zzo(jSONObject, strArr);
        return zzo == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzo.optString(strArr[0], RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static Bundle zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i5 = 0;
                        Object obj = null;
                        for (int i6 = 0; obj == null && i6 < length; i6++) {
                            obj = !jSONArray.isNull(i6) ? jSONArray.opt(i6) : null;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            int i7 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Expected JSONArray with at least 1 non-null element for key:".concat(valueOf));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i5 < length) {
                                bundleArr[i5] = !jSONArray.isNull(i5) ? zzl(jSONArray.optJSONObject(i5)) : null;
                                i5++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i5 < length) {
                                dArr[i5] = jSONArray.optDouble(i5);
                                i5++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i5 < length) {
                                strArr[i5] = !jSONArray.isNull(i5) ? jSONArray.optString(i5) : null;
                                i5++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i5 < length) {
                                zArr[i5] = jSONArray.optBoolean(i5);
                                i5++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String str = "JSONArray with unsupported type " + obj.getClass().getCanonicalName() + " for key:" + next;
                            int i8 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(str);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, zzl((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    int i9 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unsupported type for key:".concat(valueOf2));
                }
            }
        }
        return bundle;
    }

    public static String zzm(zzfiw zzfiwVar) {
        if (zzfiwVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            zzn(jsonWriter, zzfiwVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e4) {
            int i5 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error when writing JSON.", e4);
            return null;
        }
    }

    private static void zzn(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzfiw) {
            zzf(jsonWriter, ((zzfiw) obj).zzd);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzn(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                zzn(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    private static JSONObject zzo(JSONObject jSONObject, String[] strArr) {
        for (int i5 = 0; i5 < strArr.length - 1; i5 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }
}
