package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzeha implements zzfmu {
    protected final Context zza;
    protected final String zzb;
    private final String zzc;

    public zzeha(Context context, String str, zzcac zzcacVar, int i5, String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzegz zza(zzegy zzegyVar) {
        String str = zzegyVar.zza;
        int i5 = zzegyVar.zzb;
        Map map = zzegyVar.zzc;
        byte[] bArr = zzegyVar.zzd;
        String str2 = zzegyVar.zze;
        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        return zzc(str, i5, map, bArr, str2, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0242, code lost:
    
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r3.toString());
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027c, code lost:
    
        throw new com.google.android.gms.internal.ads.zzecr(1, r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzegz zzc(String str, int i5, Map map, byte[] bArr, String str2, long j2) {
        HttpURLConnection httpURLConnection;
        URL url;
        InputStreamReader inputStreamReader;
        try {
            zzegz zzegzVar = new zzegz();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue() && com.google.android.gms.ads.internal.client.zzbb.zze()) {
                zzegzVar.zza = 410;
                return zzegzVar;
            }
            String str3 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String sb2 = sb.toString();
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
            sb3.append("AdRequestServiceImpl: Sending request: ");
            sb3.append(str);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb3.toString());
            URL url2 = new URL(str);
            HashMap hashMap = new HashMap();
            int i7 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                String str4 = this.zzc;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zza, str3, false, httpURLConnection, false, i5);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = null;
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                        try {
                            zzlVar.zza(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Network request logging failed.", th);
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    x2.d.c(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    x2.d.c(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        zzlVar.zzc(httpURLConnection, responseCode);
                        zzegzVar.zza = responseCode;
                        zzegzVar.zzb = hashMap;
                        zzegzVar.zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    StringBuilder sb4 = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int read = inputStreamReader2.read(cArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        sb4.append(cArr, 0, read);
                                    }
                                    String sb5 = sb4.toString();
                                    x2.d.c(inputStreamReader2);
                                    zzlVar.zze(sb5);
                                    zzegzVar.zzc = sb5;
                                    if (TextUtils.isEmpty(sb5)) {
                                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgz)).booleanValue()) {
                                            throw new zzecr(3);
                                        }
                                    }
                                    ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                                    zzegzVar.zzd = SystemClock.elapsedRealtime() - j2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    x2.d.c(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("No location header to follow redirect.");
                                throw new zzecr(1, "No location header to follow redirect");
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzja)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e4) {
                                    throw new zzecr(1, e4.getMessage(), e4);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            int i8 = i7 + 1;
                            if (i8 > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgi)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Too many redirects.");
                                throw new zzecr(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            i7 = i8;
                            url2 = url;
                        }
                    } catch (zzecr e5) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjE)).booleanValue()) {
                            throw e5;
                        }
                        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                        zzegzVar.zzd = SystemClock.elapsedRealtime() - j2;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
            httpURLConnection.disconnect();
            return zzegzVar;
        } catch (IOException e6) {
            String valueOf = String.valueOf(e6.getMessage());
            int i9 = com.google.android.gms.ads.internal.util.zze.zza;
            String concat = "Error while connecting to ad server: ".concat(valueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            throw new zzecr(1, concat, e6);
        }
    }
}
