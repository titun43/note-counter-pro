package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class zzbeo extends zzbeg {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbeo(int i5) {
        int i6 = i5 >> 3;
        this.zzc = (i5 & 7) > 0 ? i6 + 1 : i6;
        this.zzd = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest zzb = zzb();
                this.zzb = zzb;
                if (zzb == null) {
                    return new byte[0];
                }
                zzb.reset();
                this.zzb.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.zzb.digest();
                int length = digest.length;
                int i5 = this.zzc;
                if (length > i5) {
                    length = i5;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i6 = this.zzd & 7;
                if (i6 > 0) {
                    long j2 = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        if (i7 > 0) {
                            j2 <<= 8;
                        }
                        j2 += bArr[i7] & 255;
                    }
                    long j5 = j2 >>> (8 - i6);
                    while (true) {
                        i5--;
                        if (i5 < 0) {
                            break;
                        }
                        bArr[i5] = (byte) (255 & j5);
                        j5 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
