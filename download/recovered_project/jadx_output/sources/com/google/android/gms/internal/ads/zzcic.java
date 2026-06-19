package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.h1;
import com.getcapacitor.Bridge;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class zzcic extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzht zzg;
    private zzhf zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcic(String str, zzhz zzhzVar, int i5, int i6, int i7) {
        super(true);
        this.zzc = new zzcib(this);
        this.zzr = new HashSet();
        zzdg.zza(str);
        this.zzf = str;
        this.zzg = new zzht();
        this.zzd = i5;
        this.zze = i6;
        this.zzq = i7;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e4);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j2 = this.zzo;
                    long j5 = this.zzm;
                    if (j2 == j5) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.zzj.read(bArr2, 0, (int) Math.min(j5 - j2, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzo += read;
                    zzh(read);
                }
            }
            if (i6 == 0) {
                return 0;
            }
            long j6 = this.zzn;
            if (j6 != -1) {
                long j7 = j6 - this.zzp;
                if (j7 == 0) {
                    return -1;
                }
                i6 = (int) Math.min(i6, j7);
            }
            int read2 = this.zzj.read(bArr, i5, i6);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzh(read2);
            return read2;
        } catch (IOException e4) {
            throw new zzhq(e4, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0127, code lost:
    
        if (r2 == r16) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027d A[Catch: IOException -> 0x0044, TryCatch #3 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:9:0x0047, B:10:0x005f, B:12:0x0065, B:19:0x0092, B:21:0x00b2, B:22:0x00d1, B:23:0x00d6, B:25:0x00df, B:26:0x00e6, B:39:0x010f, B:100:0x0270, B:102:0x027d, B:104:0x028e, B:110:0x0297, B:111:0x02a4, B:114:0x02ae, B:115:0x02b5, B:118:0x02b6, B:119:0x02d3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df A[Catch: IOException -> 0x0044, TryCatch #3 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:9:0x0047, B:10:0x005f, B:12:0x0065, B:19:0x0092, B:21:0x00b2, B:22:0x00d1, B:23:0x00d6, B:25:0x00df, B:26:0x00e6, B:39:0x010f, B:100:0x0270, B:102:0x027d, B:104:0x028e, B:110:0x0297, B:111:0x02a4, B:114:0x02ae, B:115:0x02b5, B:118:0x02b6, B:119:0x02d3), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhf zzhfVar) {
        long j2;
        int responseCode;
        String headerField;
        long j5;
        long parseLong;
        String headerField2;
        this.zzh = zzhfVar;
        long j6 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzhfVar.zza.toString());
            long j7 = zzhfVar.zze;
            long j8 = zzhfVar.zzf;
            boolean zza2 = zzhfVar.zza(1);
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                long j9 = j6;
                if (i5 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i6);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Map.Entry entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    j7 = j7;
                }
                long j10 = j7;
                if (j10 == j9) {
                    if (j8 != -1) {
                        j2 = j9;
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zza2) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzhs zzhsVar = new zzhs(this.zzl, null, null, headerFields, zzhfVar, zzfj.zzb);
                                if (this.zzl != 416) {
                                    throw zzhsVar;
                                }
                                zzhsVar.initCause(new zzhc(2008));
                                throw zzhsVar;
                            }
                            if (responseCode2 == 200) {
                                j5 = zzhfVar.zze;
                            }
                            j5 = j9;
                            this.zzm = j5;
                            if (zzhfVar.zza(1)) {
                                this.zzn = zzhfVar.zzf;
                            } else {
                                long j11 = zzhfVar.zzf;
                                if (j11 != -1) {
                                    this.zzn = j11;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        try {
                                            parseLong = Long.parseLong(headerField3);
                                        } catch (NumberFormatException unused) {
                                            String b2 = h1.b(new StringBuilder(String.valueOf(headerField3).length() + 28), "Unexpected Content-Length [", headerField3, "]");
                                            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(b2);
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                            Matcher matcher = zza.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                    if (parseLong < j9) {
                                                        parseLong = parseLong2;
                                                    } else if (parseLong != parseLong2) {
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField2).length() + 1);
                                                        sb2.append("Inconsistent headers [");
                                                        sb2.append(headerField3);
                                                        sb2.append("] [");
                                                        sb2.append(headerField2);
                                                        sb2.append("]");
                                                        String sb3 = sb2.toString();
                                                        int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb3);
                                                        parseLong = Math.max(parseLong, parseLong2);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    String b5 = h1.b(new StringBuilder(String.valueOf(headerField2).length() + 27), "Unexpected Content-Range [", headerField2, "]");
                                                    int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzf(b5);
                                                }
                                            }
                                        }
                                        this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                    }
                                    parseLong = -1;
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                    }
                                    this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzg(zzhfVar);
                                return this.zzn;
                            } catch (IOException e4) {
                                zzn();
                                throw new zzhq(e4, zzhfVar, 2000, 1);
                            }
                        } catch (IOException e5) {
                            zzn();
                            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e5, zzhfVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!Bridge.CAPACITOR_HTTPS_SCHEME.equals(protocol) && !Bridge.CAPACITOR_HTTP_SCHEME.equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i5 = i6;
                    j6 = j9;
                    j7 = j10;
                } else {
                    j2 = j10;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j2).length() + 7);
                sb4.append("bytes=");
                sb4.append(j2);
                sb4.append("-");
                String sb5 = sb4.toString();
                if (j8 != -1) {
                    long j12 = (j2 + j8) - 1;
                    StringBuilder sb6 = new StringBuilder(sb5.length() + String.valueOf(j12).length());
                    sb6.append(sb5);
                    sb6.append(j12);
                    sb5 = sb6.toString();
                }
                httpURLConnection.setRequestProperty("Range", sb5);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zza2) {
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e6) {
            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e6, zzhfVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new zzhq(e4, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzk(int i5) {
        this.zzq = i5;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e4) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e4);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
