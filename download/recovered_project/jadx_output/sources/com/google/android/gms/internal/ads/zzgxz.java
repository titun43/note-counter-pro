package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgxz extends zzgya {
    public static int zza(long j2) {
        int i5 = (int) j2;
        zzgrc.zze(((long) i5) == j2, "Out of range: %s", j2);
        return i5;
    }

    public static int zzb(long j2) {
        if (j2 > 2147483647L) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static int zzc(int i5, int i6, int i7) {
        zzgrc.zzg(true, "min (%s) must be less than or equal to max (%s)", i6, 1073741823);
        return Math.min(Math.max(i5, i6), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzgrc.zzg(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b2, byte b5, byte b6, byte b7) {
        return (b2 << 24) | ((b5 & 255) << 16) | ((b6 & 255) << 8) | (b7 & 255);
    }

    public static int[] zzf(Collection collection) {
        if (collection instanceof zzgxy) {
            zzgxy zzgxyVar = (zzgxy) collection;
            return Arrays.copyOfRange(zzgxyVar.zza, zzgxyVar.zzb, zzgxyVar.zzc);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            Object obj = array[i5];
            obj.getClass();
            iArr[i5] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzgxy(iArr, 0, length);
    }

    public static Integer zzh(String str, int i5) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char charAt = str.charAt(0);
            int i6 = charAt == '-' ? 1 : 0;
            if (i6 != str.length()) {
                int i7 = i6 + 1;
                int zza = zzgyb.zza(str.charAt(i6));
                if (zza >= 0 && zza < 10) {
                    long j2 = -zza;
                    while (true) {
                        if (i7 < str.length()) {
                            int i8 = i7 + 1;
                            int zza2 = zzgyb.zza(str.charAt(i7));
                            if (zza2 < 0 || zza2 >= 10 || j2 < -922337203685477580L) {
                                break;
                            }
                            long j5 = j2 * 10;
                            long j6 = zza2;
                            if (j5 < Long.MIN_VALUE + j6) {
                                break;
                            }
                            j2 = j5 - j6;
                            i7 = i8;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j2);
                        } else if (j2 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j2);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static /* synthetic */ int zzi(int[] iArr, int i5, int i6, int i7) {
        while (i6 < i7) {
            if (iArr[i6] == i5) {
                return i6;
            }
            i6++;
        }
        return -1;
    }
}
