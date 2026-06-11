package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import i3.b;
import i3.e;
import i3.f;
import i3.g;
import i3.i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzw {
    private final Application zza;
    private final Handler zzb;
    private final Executor zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzn zzf;
    private final zzz zzg;
    private final zze zzh;
    private final zzcr zzi;

    public zzw(Application application, zzad zzadVar, Handler handler, Executor executor, zzaq zzaqVar, zzbq zzbqVar, zzn zznVar, zzz zzzVar, zze zzeVar, zzcr zzcrVar) {
        this.zza = application;
        this.zzb = handler;
        this.zzc = executor;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zznVar;
        this.zzg = zzzVar;
        this.zzh = zzeVar;
        this.zzi = zzcrVar;
    }

    public static void zza(final zzw zzwVar, Activity activity, i iVar, final f fVar, final e eVar) {
        try {
            b bVar = iVar.f1864b;
            if (bVar != null) {
                if (!bVar.f1858a) {
                }
                final zzab zzb = zzwVar.zzg.zzb(zzwVar.zzd(zzwVar.zzf.zzc(activity, iVar)));
                zzaq zzaqVar = zzwVar.zzd;
                zzaqVar.zzg(zzb.zza);
                zzaqVar.zzi(zzb.zzb);
                zzwVar.zze.zzd(zzb.zzc);
                zzwVar.zzi.zzg(null);
                zzwVar.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzw.zzb(zzw.this, fVar, zzb);
                    }
                });
            }
            Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + zzct.zza(zzwVar.zza) + "\") to set this as a debug device.");
            final zzab zzb2 = zzwVar.zzg.zzb(zzwVar.zzd(zzwVar.zzf.zzc(activity, iVar)));
            zzaq zzaqVar2 = zzwVar.zzd;
            zzaqVar2.zzg(zzb2.zza);
            zzaqVar2.zzi(zzb2.zzb);
            zzwVar.zze.zzd(zzb2.zzc);
            zzwVar.zzi.zzg(null);
            zzwVar.zzh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                @Override // java.lang.Runnable
                public final void run() {
                    zzw.zzb(zzw.this, fVar, zzb2);
                }
            });
        } catch (zzg e4) {
            zzwVar.zzi.zzg("RequestConsentUpdate exception. Error: " + e4.getMessage() + ", cause: " + String.valueOf(e4.getCause()));
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.onConsentInfoUpdateFailure(e4.zza());
                }
            });
        } catch (RuntimeException e5) {
            zzwVar.zzi.zzg("RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e5.getMessage())));
            final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e5))));
            zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.onConsentInfoUpdateFailure(zzgVar.zza());
                }
            });
        }
    }

    public static /* synthetic */ void zzb(zzw zzwVar, final f fVar, zzab zzabVar) {
        Objects.requireNonNull(fVar);
        zzwVar.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
            @Override // java.lang.Runnable
            public final void run() {
                f.this.onConsentInfoUpdateSuccess();
            }
        });
        if (zzabVar.zzb != g.h) {
            zzwVar.zze.zzc();
        }
    }

    private final zzcn zzd(zzcl zzclVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = zzclVar.zza;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = zzclVar.zzb;
                    if (str2 != null) {
                        jsonWriter.name("consent_syncing_id");
                        jsonWriter.value(str2);
                    }
                    zzch zzchVar = zzclVar.zzc;
                    if (zzchVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i5 = zzchVar.zzc;
                        if (i5 != 1) {
                            jsonWriter.name("os_type");
                            int i6 = i5 - 1;
                            if (i6 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i6 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str3 = zzchVar.zza;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = zzchVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str4 = zzclVar.zzd;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = zzclVar.zze;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = zzclVar.zzf;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzcj zzcjVar = zzclVar.zzg;
                    if (zzcjVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzcjVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzcjVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d5 = zzcjVar.zzc;
                        if (d5 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d5);
                        }
                        List<zzci> list = zzcjVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzci zzciVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzciVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzciVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzciVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzciVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzcf zzcfVar = zzclVar.zzh;
                    if (zzcfVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = zzcfVar.zza;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = zzcfVar.zzb;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = zzcfVar.zzc;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    zzck zzckVar = zzclVar.zzi;
                    if (zzckVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str8 = zzckVar.zza;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    List list2 = zzclVar.zzj;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            switch ((zzcg) it.next()) {
                                case DEBUG_PARAM_UNKNOWN:
                                    jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                                    break;
                                case ALWAYS_SHOW:
                                    jsonWriter.value("ALWAYS_SHOW");
                                    break;
                                case GEO_OVERRIDE_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_EEA");
                                    break;
                                case GEO_OVERRIDE_REGULATED_US_STATE:
                                    jsonWriter.value("GEO_OVERRIDE_REGULATED_US_STATE");
                                    break;
                                case GEO_OVERRIDE_OTHER:
                                    jsonWriter.value("GEO_OVERRIDE_OTHER");
                                    break;
                                case GEO_OVERRIDE_NON_EEA:
                                    jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                                    break;
                                case PREVIEWING_DEBUG_MESSAGES:
                                    jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                                    break;
                                case GEO_OVERRIDE_USFL:
                                    jsonWriter.value("GEO_OVERRIDE_USFL");
                                    break;
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzcn zza = zzcn.zza(new JsonReader(new StringReader(headerField)));
                        zza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzcn zza2 = zzcn.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zza2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e4) {
            throw new zzg(4, "The server timed out.", e4);
        } catch (IOException e5) {
            throw new zzg(2, "Error making request.", e5);
        }
    }

    public final void zzc(final Activity activity, final i iVar, final f fVar, final e eVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
            @Override // java.lang.Runnable
            public final void run() {
                zzw.zza(zzw.this, activity, iVar, fVar, eVar);
            }
        });
    }
}
