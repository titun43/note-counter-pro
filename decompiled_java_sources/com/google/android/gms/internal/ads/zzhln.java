package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhln {
    public static final /* synthetic */ int zza = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final zzhye zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new zzhlm(sb.toString());
            }
            bArr[i5] = (byte) charAt;
        }
        return zzhye.zza(bArr);
    }

    public static final zzhye zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt < '!' || charAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(charAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i5] = (byte) charAt;
        }
        return zzhye.zza(bArr);
    }

    public static boolean zzc() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static Integer zzd() {
        if (zzc()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zze(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if (bArr2[i5] != bArr[i5]) {
                return false;
            }
        }
        return true;
    }
}
