package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import q.i;
import q.j;
import q.m;

/* loaded from: classes.dex */
public final class zzgck implements zzgce {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgck(ExecutorService executorService, String str, long j2) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j2;
    }

    private final j3.a zze(final String str, final boolean z4, final byte[] bArr, final String str2) {
        return a.a.l(new j() { // from class: com.google.android.gms.internal.ads.zzgch
            @Override // q.j
            public final /* synthetic */ Object attachCompleter(i iVar) {
                return zzgck.this.zzc(str, z4, str2, bArr, iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(String str, i iVar, boolean z4, String str2, byte[] bArr) {
        Throwable th;
        SocketTimeoutException e4;
        final HttpURLConnection httpURLConnection;
        byte[] byteArray;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
            } finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        } catch (SocketTimeoutException e5) {
            e4 = e5;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Objects.requireNonNull(httpURLConnection);
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgci
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    httpURLConnection.disconnect();
                }
            };
            ExecutorService executorService = this.zza;
            m mVar = iVar.f3070c;
            if (mVar != null) {
                mVar.addListener(runnable, executorService);
            }
            httpURLConnection.setRequestProperty("User-Agent", this.zzb);
            int i5 = (int) this.zzc;
            httpURLConnection.setConnectTimeout(i5);
            httpURLConnection.setReadTimeout(i5);
            if (z4) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("Content-Type", str2);
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                try {
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.close();
                } finally {
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (inputStream == null) {
                        byteArray = new byte[0];
                        byteArrayOutputStream.close();
                    } else {
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStream.close();
                    }
                    iVar.a(new zzgcj(responseCode, byteArray));
                } finally {
                }
            } finally {
            }
        } catch (SocketTimeoutException e6) {
            e4 = e6;
            httpURLConnection2 = httpURLConnection;
            String message = e4.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
            sb.append("Timeout: ");
            sb.append(message);
            iVar.b(new TimeoutException(sb.toString()));
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            iVar.b(th);
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final j3.a zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgce
    public final j3.a zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, "application/x-protobuf");
    }

    public final /* synthetic */ Object zzc(final String str, final boolean z4, final String str2, final byte[] bArr, final i iVar) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgcg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgck.this.zzd(str, iVar, z4, str2, bArr);
            }
        });
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}
