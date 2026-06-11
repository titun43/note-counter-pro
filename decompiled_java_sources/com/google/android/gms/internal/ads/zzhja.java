package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* loaded from: classes.dex */
public final class zzhja {
    public static boolean zza(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 != length) {
            char charAt = str.charAt(i5);
            int i6 = i5 + 1;
            if (!Character.isSurrogate(charAt)) {
                i5 = i6;
            } else {
                if (Character.isLowSurrogate(charAt) || i6 == length || !Character.isLowSurrogate(str.charAt(i6))) {
                    return false;
                }
                i5 += 2;
            }
        }
        return true;
    }

    public static zzhyl zzb(String str) {
        try {
            zzhzq zzhzqVar = new zzhzq(new StringReader(str));
            zzhzqVar.zza(zzhyq.LEGACY_STRICT);
            return zzhiy.zzb(zzhzqVar);
        } catch (NumberFormatException e4) {
            throw new IOException(e4);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhiz) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
