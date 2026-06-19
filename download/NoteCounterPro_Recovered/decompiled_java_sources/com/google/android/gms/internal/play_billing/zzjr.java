package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzjr {
    public static /* bridge */ /* synthetic */ void zza(byte b2, byte b5, byte b6, byte b7, char[] cArr, int i5) {
        if (!zze(b5)) {
            if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !zze(b6) && !zze(b7)) {
                int i6 = ((b2 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
                cArr[i5] = (char) ((i6 >>> 10) + 55232);
                cArr[i5 + 1] = (char) ((i6 & 1023) + 56320);
                return;
            }
        }
        throw new zzhr("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b2, byte b5, byte b6, char[] cArr, int i5) {
        if (!zze(b5)) {
            if (b2 == -32) {
                if (b5 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b5 < -96) {
                    b2 = -19;
                }
            }
            if (!zze(b6)) {
                cArr[i5] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                return;
            }
        }
        throw new zzhr("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b2, byte b5, char[] cArr, int i5) {
        if (b2 < -62 || zze(b5)) {
            throw new zzhr("Protocol message had invalid UTF-8.");
        }
        cArr[i5] = (char) (((b2 & 31) << 6) | (b5 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
