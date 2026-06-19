package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.emoji2.text.u;
import com.getcapacitor.Bridge;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public final class zzhm extends zzgt implements zzhu {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private final zzht zzf;
    private zzhf zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzhm(String str, int i5, int i6, boolean z4, boolean z5, zzht zzhtVar, zzgrd zzgrdVar, boolean z6, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i5;
        this.zzc = i6;
        this.zza = z4;
        this.zze = zzhtVar;
        this.zzf = new zzht();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i5, byte[] bArr, long j2, long j5, boolean z4, boolean z5, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zze.zza());
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j2 == 0) {
            if (j5 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.zzd;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z4 ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z5);
                httpURLConnection.setDoOutput(false);
                int i6 = zzhf.zzh;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j2 = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j2);
        sb2.append("-");
        if (j5 != -1) {
            sb2.append((j2 + j5) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.zzd;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z4 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z5);
        httpURLConnection.setDoOutput(false);
        int i62 = zzhf.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhf zzhfVar) {
        if (str == null) {
            throw new zzhq("Null location redirect", zzhfVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Bridge.CAPACITOR_HTTPS_SCHEME.equals(protocol) && !Bridge.CAPACITOR_HTTP_SCHEME.equals(protocol)) {
                throw new zzhq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhfVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(u.e(protocol, String.valueOf(protocol2).length() + 40, 1));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzhq(sb.toString(), zzhfVar, 2001, 1);
        } catch (MalformedURLException e4) {
            throw new zzhq(e4, zzhfVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                zzee.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i6) {
        if (i6 == 0) {
            return 0;
        }
        try {
            long j2 = this.zzl;
            if (j2 != -1) {
                long j5 = j2 - this.zzm;
                if (j5 == 0) {
                    return -1;
                }
                i6 = (int) Math.min(i6, j5);
            }
            InputStream inputStream = this.zzi;
            String str = zzfj.zza;
            int read = inputStream.read(bArr, i5, i6);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e4) {
            zzhf zzhfVar = this.zzg;
            String str2 = zzfj.zza;
            throw zzhq.zza(e4, zzhfVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if (r0 == r18) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhf zzhfVar) {
        zzhm zzhmVar;
        long j2;
        int i5;
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        long j5;
        zzhm zzhmVar2 = this;
        zzhmVar2.zzg = zzhfVar;
        long j6 = 0;
        zzhmVar2.zzm = 0L;
        zzhmVar2.zzl = 0L;
        zzf(zzhfVar);
        try {
            URL url = new URL(zzhfVar.zza.toString());
            long j7 = zzhfVar.zze;
            long j8 = zzhfVar.zzf;
            boolean zza = zzhfVar.zza(1);
            int i6 = 0;
            try {
                if (zzhmVar2.zza) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i6 + 1;
                        if (i6 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i8);
                            throw new zzhq(new NoRouteToHostException(sb.toString()), zzhfVar, 2001, 1);
                        }
                        j2 = j6;
                        i5 = i7;
                        zzhmVar2 = this;
                        HttpURLConnection zzk = zzhmVar2.zzk(url, 1, null, j7, j8, zza, false, zzhfVar.zzd);
                        URL url2 = url;
                        long j9 = j8;
                        zzhmVar = zzhmVar2;
                        try {
                            int responseCode = zzk.getResponseCode();
                            String headerField = zzk.getHeaderField("Location");
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnection = zzk;
                                break;
                            }
                            zzk.disconnect();
                            URL zzl = zzhmVar.zzl(url2, headerField, zzhfVar);
                            j8 = j9;
                            url = zzl;
                            i7 = i5;
                            i6 = i8;
                            j6 = j2;
                        } catch (IOException e4) {
                            e = e4;
                            zzhmVar.zzm();
                            throw zzhq.zza(e, zzhfVar, 1);
                        }
                    }
                } else {
                    httpURLConnection = zzhmVar2.zzk(url, 1, null, j7, j8, zza, true, zzhfVar.zzd);
                    zzhmVar = this;
                    j2 = 0;
                    i5 = 0;
                }
                zzhmVar.zzh = httpURLConnection;
                zzhmVar.zzk = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                int i9 = zzhmVar.zzk;
                if (i9 < 200 || i9 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    if (zzhmVar.zzk == 416) {
                        if (zzhfVar.zze == zzhv.zza(httpURLConnection.getHeaderField("Content-Range"))) {
                            zzhmVar.zzj = true;
                            zzg(zzhfVar);
                            long j10 = zzhfVar.zzf;
                            return j10 != -1 ? j10 : j2;
                        }
                    }
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    try {
                        bArr = errorStream != null ? zzgxf.zza(errorStream) : zzfj.zzb;
                    } catch (IOException unused) {
                        bArr = zzfj.zzb;
                    }
                    zzhmVar.zzm();
                    throw new zzhs(zzhmVar.zzk, responseMessage, zzhmVar.zzk == 416 ? new zzhc(2008) : null, headerFields, zzhfVar, bArr);
                }
                httpURLConnection.getContentType();
                if (zzhmVar.zzk == 200) {
                    j5 = zzhfVar.zze;
                }
                j5 = j2;
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
                if (equalsIgnoreCase) {
                    zzhmVar.zzl = zzhfVar.zzf;
                } else {
                    long j11 = zzhfVar.zzf;
                    if (j11 != -1) {
                        zzhmVar.zzl = j11;
                    } else {
                        long zzb = zzhv.zzb(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField("Content-Range"));
                        zzhmVar.zzl = zzb != -1 ? zzb - j5 : -1L;
                    }
                }
                try {
                    zzhmVar.zzi = httpURLConnection.getInputStream();
                    if (equalsIgnoreCase) {
                        zzhmVar.zzi = new GZIPInputStream(zzhmVar.zzi);
                    }
                    zzhmVar.zzj = true;
                    zzg(zzhfVar);
                    if (j5 != j2) {
                        try {
                            byte[] bArr2 = new byte[4096];
                            while (j5 > j2) {
                                int min = (int) Math.min(j5, 4096L);
                                InputStream inputStream = zzhmVar.zzi;
                                String str = zzfj.zza;
                                int read = inputStream.read(bArr2, i5, min);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhq(new InterruptedIOException(), zzhfVar, 2000, 1);
                                }
                                if (read == -1) {
                                    throw new zzhq(zzhfVar, 2008, 1);
                                }
                                j5 -= read;
                                zzhmVar.zzh(read);
                            }
                        } catch (IOException e5) {
                            zzhmVar.zzm();
                            if (e5 instanceof zzhq) {
                                throw ((zzhq) e5);
                            }
                            throw new zzhq(e5, zzhfVar, 2000, 1);
                        }
                    }
                    return zzhmVar.zzl;
                } catch (IOException e6) {
                    zzhmVar.zzm();
                    throw new zzhq(e6, zzhfVar, 2000, 1);
                }
            } catch (IOException e7) {
                e = e7;
                zzhmVar = this;
            }
        } catch (IOException e8) {
            e = e8;
            zzhmVar = zzhmVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhf zzhfVar = this.zzg;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    zzhf zzhfVar = this.zzg;
                    String str = zzfj.zza;
                    throw new zzhq(e4, zzhfVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgui.zza() : new zzhl(httpURLConnection.getHeaderFields());
    }
}
