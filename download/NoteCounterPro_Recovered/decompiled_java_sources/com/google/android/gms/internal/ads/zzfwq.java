package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfwq {
    private final zzbcp zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfwq(zzbcp zzbcpVar, File file, File file2, File file3) {
        this.zza = zzbcpVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzbcp zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zzd() {
        byte[] bArr;
        FileInputStream fileInputStream;
        byte[] bArr2;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzian zzianVar = zzian.zza;
                    ArrayList arrayList = new ArrayList();
                    int i5 = 256;
                    while (true) {
                        byte[] bArr3 = new byte[i5];
                        int i6 = 0;
                        while (i6 < i5) {
                            int read = fileInputStream.read(bArr3, i6, i5 - i6);
                            if (read == -1) {
                                break;
                            }
                            i6 += read;
                        }
                        zzian zzs = i6 == 0 ? null : zzian.zzs(bArr3, 0, i6);
                        if (zzs == null) {
                            break;
                        }
                        arrayList.add(zzs);
                        i5 = Math.min(i5 + i5, 8192);
                    }
                    bArr2 = zzian.zzw(arrayList).zzy();
                    x2.d.c(fileInputStream);
                } catch (IOException unused) {
                    x2.d.c(fileInputStream);
                    bArr2 = null;
                    this.zze = bArr2;
                    bArr = this.zze;
                    if (bArr != null) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    x2.d.c(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArr2;
        }
        bArr = this.zze;
        if (bArr != null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean zze(long j2) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
