package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.h1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzciw extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private zzhf zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzciw(String str, zzhz zzhzVar, int i5, int i6, long j2, long j5) {
        super(true);
        zzdg.zza(str);
        this.zzd = str;
        this.zze = new zzht();
        this.zzb = i5;
        this.zzc = i6;
        this.zzh = new ArrayDeque();
        this.zzq = j2;
        this.zzr = j5;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e4) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e4);
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
            long j5 = this.zzm;
            if (j2 - j5 == 0) {
                return -1;
            }
            long j6 = this.zzn + j5;
            long j7 = i6;
            long j8 = j6 + j7 + this.zzr;
            long j9 = this.zzp;
            long j10 = j9 + 1;
            if (j8 > j10) {
                long j11 = this.zzo;
                if (j9 < j11) {
                    long min = Math.min(j11, Math.max(((this.zzq + j10) - r4) - 1, (j10 + j7) - 1));
                    zzk(j10, min, 2);
                    this.zzp = min;
                    j9 = min;
                }
            }
            int read = this.zzi.read(bArr, i5, (int) Math.min(j7, ((j9 + 1) - this.zzn) - this.zzm));
            if (read == -1) {
                throw new EOFException();
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e4) {
            throw new zzhq(e4, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        this.zzf = zzhfVar;
        this.zzm = 0L;
        long j2 = zzhfVar.zze;
        long j5 = zzhfVar.zzf;
        long min = j5 == -1 ? this.zzq : Math.min(this.zzq, j5);
        this.zzn = j2;
        HttpURLConnection zzk = zzk(j2, (min + j2) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j6 = zzhfVar.zzf;
                    if (j6 != -1) {
                        this.zzl = j6;
                        this.zzo = Math.max(parseLong, (this.zzn + j6) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzg(zzhfVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String b2 = h1.b(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(b2);
                }
            }
        }
        throw new zzciu(headerField, zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new zzhq(e4, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j2, long j5, int i5) {
        int i6;
        IOException iOException;
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e4) {
                    iOException = e4;
                    i6 = i5;
                    String valueOf = String.valueOf(uri);
                    throw new zzhq("Unable to connect to ".concat(valueOf), iOException, this.zzf, 2000, i6);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 7 + String.valueOf(j5).length());
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            sb.append(j5);
            httpURLConnection.setRequestProperty("Range", sb.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String uri2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzciv(this.zzk, headerFields, this.zzf, i5);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e5) {
                    zzl();
                    throw new zzhq(e5, this.zzf, 2000, i5);
                }
            } catch (IOException e6) {
                zzl();
                String valueOf2 = String.valueOf(uri2);
                throw new zzhq("Unable to connect to ".concat(valueOf2), e6, this.zzf, 2000, i5);
            }
        } catch (IOException e7) {
            i6 = i5;
            iOException = e7;
        }
    }
}
