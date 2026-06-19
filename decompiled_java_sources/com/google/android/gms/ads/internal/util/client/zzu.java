package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzu implements zze {
    private final Context zza;
    private final String zzb;
    private String zzc;

    public zzu(Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    private final URL zzd(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (IllegalArgumentException e4) {
            e = e4;
            zzf(str, e);
        } catch (MalformedURLException e5) {
            e = e5;
            zzf(str, e);
        } catch (URISyntaxException e6) {
            zzf(str, e6);
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzf)).booleanValue()) {
                url = zze(str);
            }
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        zzo.zzd(sb.toString());
        return new URL(str);
    }

    private final URL zze(String str) {
        URL url;
        URI uri;
        try {
            zzo.zzd("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException e4) {
            e = e4;
            url = null;
        }
        try {
            String obj = uri.toString();
            StringBuilder sb = new StringBuilder(str.length() + 114 + obj.length());
            sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
            sb.append(str);
            sb.append("\" -> encoded URI: ");
            sb.append(obj);
            zzo.zzd(sb.toString());
            return url;
        } catch (IllegalArgumentException e5) {
            e = e5;
            zzf(str, e);
            return url;
        } catch (MalformedURLException e6) {
            e = e6;
            zzf(str, e);
            return url;
        } catch (URISyntaxException e7) {
            e = e7;
            zzf(str, e);
            return url;
        }
    }

    private final void zzf(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        zzo.zzi(sb.toString());
        zzbyp.zza(this.zza).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) zzbd.zzc().zzd(zzbhe.zzoi)).intValue() / 100.0f);
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String str) {
        return zzc(str, null);
    }

    public final String zzb() {
        return this.zzc;
    }

    public final zzt zzc(String str, Map map) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        if (str != null) {
            if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzg)).booleanValue() || !str.isEmpty()) {
                if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue() || !zzbb.zze()) {
                    try {
                        StringBuilder sb = new StringBuilder(str.length() + 13);
                        sb.append("Pinging URL: ");
                        sb.append(str);
                        zzo.zzd(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) zzd(str).openConnection();
                        try {
                            zzbb.zza();
                            String str2 = this.zzb;
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setInstanceFollowRedirects(true);
                            httpURLConnection.setReadTimeout(60000);
                            if (str2 != null) {
                                httpURLConnection.setRequestProperty("User-Agent", str2);
                            }
                            httpURLConnection.setUseCaches(false);
                            if (map != null) {
                                for (Map.Entry entry : map.entrySet()) {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            zzl zzlVar = new zzl(null);
                            zzlVar.zza(httpURLConnection, null);
                            int responseCode = httpURLConnection.getResponseCode();
                            zzlVar.zzc(httpURLConnection, responseCode);
                            if (responseCode >= 200 && responseCode < 300) {
                                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzjc)).booleanValue()) {
                                    this.zzc = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                                }
                                zztVar = zzt.SUCCESS;
                                httpURLConnection.disconnect();
                                return zztVar;
                            }
                            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 54 + str.length());
                            sb2.append("Received non-success response code ");
                            sb2.append(responseCode);
                            sb2.append(" from pinging URL: ");
                            sb2.append(str);
                            zzo.zzi(sb2.toString());
                            if (responseCode == 502) {
                                zztVar = zzt.RETRIABLE_FAILURE;
                            }
                            httpURLConnection.disconnect();
                            return zztVar;
                        } catch (Throwable th) {
                            httpURLConnection.disconnect();
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        String message = e.getMessage();
                        StringBuilder sb3 = new StringBuilder(str.length() + 27 + String.valueOf(message).length());
                        sb3.append("Error while pinging URL: ");
                        sb3.append(str);
                        sb3.append(". ");
                        sb3.append(message);
                        zzo.zzi(sb3.toString());
                        return zzt.RETRIABLE_FAILURE;
                    } catch (IndexOutOfBoundsException e5) {
                        e = e5;
                        zzf(str, e);
                        return zztVar;
                    } catch (RuntimeException e6) {
                        e = e6;
                        String message2 = e.getMessage();
                        StringBuilder sb32 = new StringBuilder(str.length() + 27 + String.valueOf(message2).length());
                        sb32.append("Error while pinging URL: ");
                        sb32.append(str);
                        sb32.append(". ");
                        sb32.append(message2);
                        zzo.zzi(sb32.toString());
                        return zzt.RETRIABLE_FAILURE;
                    } catch (MalformedURLException e7) {
                        e = e7;
                        zzf(str, e);
                        return zztVar;
                    } finally {
                    }
                }
            }
        }
        return zztVar;
    }
}
