package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzaey {
    public static void zza(boolean z4, String str) {
        if (!z4) {
            throw zzat.zzb(str, null);
        }
    }

    public static int zzb(zzaev zzaevVar, byte[] bArr, int i5, int i6) {
        int i7 = 0;
        while (i7 < i6) {
            int zzg = zzaevVar.zzg(bArr, i5 + i7, i6 - i7);
            if (zzg == -1) {
                break;
            }
            i7 += zzg;
        }
        return i7;
    }

    public static boolean zzc(zzaev zzaevVar, byte[] bArr, int i5, int i6) {
        try {
            zzaevVar.zzc(bArr, i5, i6);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzaev zzaevVar, int i5) {
        try {
            zzaevVar.zzf(i5);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzaev zzaevVar, byte[] bArr, int i5, int i6, boolean z4) {
        try {
            return zzaevVar.zzh(bArr, 0, i6, z4);
        } catch (EOFException e4) {
            if (z4) {
                return false;
            }
            throw e4;
        }
    }

    public static int zzf(int i5) {
        if (i5 == 20) {
            return 63750;
        }
        if (i5 == 30) {
            return 2250000;
        }
        switch (i5) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i5) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
