package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import x2.b;
import x2.c;

/* loaded from: classes.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final List zzg;
    private static final Object zzb = new Object();
    private static final b zze = c.f3703a;
    private static final Set zzf = new HashSet(Arrays.asList(new String[0]));

    public zzl() {
        throw null;
    }

    public static void zzg() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            zzo.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzh(boolean z4) {
        synchronized (zzb) {
            zzc = true;
            zzd = z4;
        }
    }

    public static boolean zzi() {
        boolean z4;
        synchronized (zzb) {
            z4 = zzc;
        }
        return z4;
    }

    public static boolean zzj() {
        boolean z4;
        synchronized (zzb) {
            try {
                z4 = false;
                if (zzc && zzd) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    public static void zzk(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzp(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzl(int i5, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i5);
        jsonWriter.endObject();
        zzp(jsonWriter, map);
        jsonWriter.endObject();
    }

    private final void zzm(final String str, final String str2, final Map map, final byte[] bArr) {
        zzq("onNetworkRequest", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(JsonWriter jsonWriter) {
                zzl.zzk(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzn(final Map map, final int i5) {
        zzq("onNetworkResponse", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(JsonWriter jsonWriter) {
                zzl.zzl(i5, map, jsonWriter);
            }
        });
    }

    private final void zzo(final String str) {
        zzq("onNetworkRequestError", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(JsonWriter jsonWriter) {
                int i5 = zzl.zza;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void zzp(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!zzf.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        zzo.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zzq(String str, zzk zzkVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            JsonWriter name = jsonWriter.name("timestamp");
            ((c) zze).getClass();
            name.value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e4) {
            zzo.zzg("unable to log", e4);
        }
        zzr(stringWriter.toString());
    }

    private static synchronized void zzr(String str) {
        synchronized (zzl.class) {
            try {
                zzo.zzh("GMA Debug BEGIN");
                int i5 = 0;
                while (i5 < str.length()) {
                    int i6 = i5 + 4000;
                    zzo.zzh("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i5, Math.min(i6, str.length())))));
                    i5 = i6;
                }
                zzo.zzh("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzj()) {
            zzm(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzb(String str, String str2, Map map, byte[] bArr) {
        if (zzj()) {
            zzm(str, "GET", map, bArr);
        }
    }

    public final void zzc(HttpURLConnection httpURLConnection, int i5) {
        if (zzj()) {
            String str = null;
            zzn(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i5);
            if (i5 < 200 || i5 >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e4) {
                    zzo.zzi("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e4.getMessage())));
                }
                zzo(str);
            }
        }
    }

    public final void zzd(Map map, int i5) {
        if (zzj()) {
            zzn(map, i5);
            if (i5 < 200 || i5 >= 300) {
                zzo(null);
            }
        }
    }

    public final void zze(String str) {
        if (zzj() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) {
        zzq("onNetworkResponseBody", new zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final void zza(JsonWriter jsonWriter) {
                int i5 = zzl.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String encodeToString = Base64.encodeToString(bArr2, 0);
                if (length < 10000) {
                    jsonWriter.name("body").value(encodeToString);
                } else {
                    String zzf2 = zzf.zzf(encodeToString);
                    if (zzf2 != null) {
                        jsonWriter.name("bodydigest").value(zzf2);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }

    public zzl(String str) {
        this.zzg = !zzj() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }
}
