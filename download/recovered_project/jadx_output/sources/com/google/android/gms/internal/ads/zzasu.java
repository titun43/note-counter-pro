package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class zzasu implements zzari {
    private final zzast zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzasu(zzast zzastVar, int i5) {
        this.zzc = zzastVar;
    }

    public static byte[] zzg(zzass zzassVar, long j2) {
        long zza = zzassVar.zza();
        if (j2 >= 0 && j2 <= zza) {
            int i5 = (int) j2;
            if (i5 == j2) {
                byte[] bArr = new byte[i5];
                new DataInputStream(zzassVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 33 + String.valueOf(zza).length());
        u.t(sb, "streamToBytes length=", j2, ", maxLength=");
        sb.append(zza);
        throw new IOException(sb.toString());
    }

    public static void zzh(OutputStream outputStream, int i5) {
        outputStream.write(i5 & 255);
        outputStream.write((i5 >> 8) & 255);
        outputStream.write((i5 >> 16) & 255);
        outputStream.write((i5 >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j2) {
        outputStream.write((byte) j2);
        outputStream.write((byte) (j2 >>> 8));
        outputStream.write((byte) (j2 >>> 16));
        outputStream.write((byte) (j2 >>> 24));
        outputStream.write((byte) (j2 >>> 32));
        outputStream.write((byte) (j2 >>> 40));
        outputStream.write((byte) (j2 >>> 48));
        outputStream.write((byte) (j2 >>> 56));
    }

    public static long zzk(InputStream inputStream) {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzass zzassVar) {
        return new String(zzg(zzassVar, zzk(zzassVar)), "UTF-8");
    }

    private final void zzn(String str, zzasr zzasrVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzasrVar.zza - ((zzasr) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzasrVar.zza;
        }
        map.put(str, zzasrVar);
    }

    private final void zzo(String str) {
        zzasr zzasrVar = (zzasr) this.zza.remove(str);
        if (zzasrVar != null) {
            this.zzb -= zzasrVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized zzarh zza(String str) {
        zzasr zzasrVar = (zzasr) this.zza.get(str);
        if (zzasrVar == null) {
            return null;
        }
        File zzf = zzf(str);
        try {
            zzass zzassVar = new zzass(new BufferedInputStream(new FileInputStream(zzf)), zzf.length());
            try {
                String str2 = zzasr.zza(zzassVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzask.zzb("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] zzg = zzg(zzassVar, zzassVar.zza());
                zzarh zzarhVar = new zzarh();
                zzarhVar.zza = zzg;
                zzarhVar.zzb = zzasrVar.zzc;
                zzarhVar.zzc = zzasrVar.zzd;
                zzarhVar.zzd = zzasrVar.zze;
                zzarhVar.zze = zzasrVar.zzf;
                zzarhVar.zzf = zzasrVar.zzg;
                List<zzarq> list = zzasrVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzarq zzarqVar : list) {
                    treeMap.put(zzarqVar.zza(), zzarqVar.zzb());
                }
                zzarhVar.zzg = treeMap;
                zzarhVar.zzh = Collections.unmodifiableList(list);
                return zzarhVar;
            } finally {
                zzassVar.close();
            }
        } catch (IOException e4) {
            zzask.zzb("%s: %s", zzf.getAbsolutePath(), e4.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzb(String str, zzarh zzarhVar) {
        float f5;
        try {
            long j2 = this.zzb;
            int length = zzarhVar.zza.length;
            long j5 = j2 + length;
            int i5 = this.zzd;
            float f6 = 0.9f;
            if (j5 <= i5 || length <= i5 * 0.9f) {
                File zzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzf));
                    zzasr zzasrVar = new zzasr(str, zzarhVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzasrVar.zzb);
                        String str2 = zzasrVar.zzc;
                        if (str2 == null) {
                            str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzasrVar.zzd);
                        zzj(bufferedOutputStream, zzasrVar.zze);
                        zzj(bufferedOutputStream, zzasrVar.zzf);
                        zzj(bufferedOutputStream, zzasrVar.zzg);
                        List<zzarq> list = zzasrVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzarq zzarqVar : list) {
                                zzl(bufferedOutputStream, zzarqVar.zza());
                                zzl(bufferedOutputStream, zzarqVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzarhVar.zza);
                        bufferedOutputStream.close();
                        zzasrVar.zza = zzf.length();
                        zzn(str, zzasrVar);
                        long j6 = this.zzb;
                        int i6 = this.zzd;
                        if (j6 >= i6) {
                            boolean z4 = zzask.zzb;
                            if (z4) {
                                zzask.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j7 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i7 = 0;
                            while (it.hasNext()) {
                                zzasr zzasrVar2 = (zzasr) ((Map.Entry) it.next()).getValue();
                                String str3 = zzasrVar2.zzb;
                                if (zzf(str3).delete()) {
                                    f5 = f6;
                                    this.zzb -= zzasrVar2.zza;
                                } else {
                                    f5 = f6;
                                    zzask.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i7++;
                                if (this.zzb < i6 * f5) {
                                    break;
                                } else {
                                    f6 = f5;
                                }
                            }
                            if (z4) {
                                zzask.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i7), Long.valueOf(this.zzb - j7), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e4) {
                        zzask.zzb("%s", e4.toString());
                        bufferedOutputStream.close();
                        zzask.zzb("Failed to write header for %s", zzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzf.delete()) {
                        zzask.zzb("Could not clean up file %s", zzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzask.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzc() {
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzass zzassVar = new zzass(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzasr zza2 = zzasr.zza(zzassVar);
                            zza2.zza = length;
                            zzn(zza2.zzb, zza2);
                            zzassVar.close();
                        } catch (Throwable th) {
                            zzassVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzask.zzc("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzd(String str, boolean z4) {
        zzarh zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzb(str, zza);
        }
    }

    public final synchronized void zze(String str) {
        boolean delete = zzf(str).delete();
        zzo(str);
        if (delete) {
            return;
        }
        zzask.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzasu(File file, int i5) {
        this.zzc = new zzasq(this, file);
    }
}
