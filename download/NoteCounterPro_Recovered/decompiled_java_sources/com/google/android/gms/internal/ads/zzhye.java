package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhye {
    private final byte[] zza;

    private zzhye(byte[] bArr, int i5, int i6) {
        byte[] bArr2 = new byte[i6];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i6);
    }

    public static zzhye zza(byte[] bArr) {
        if (bArr != null) {
            return zzb(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzhye zzb(byte[] bArr, int i5, int i6) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i6 > length) {
            i6 = length;
        }
        return new zzhye(bArr, 0, i6);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhye) {
            return Arrays.equals(((zzhye) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        String sb2 = sb.toString();
        return h1.b(new StringBuilder(sb2.length() + 7), "Bytes(", sb2, ")");
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int zzd() {
        return this.zza.length;
    }
}
