package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgtn {
    public static Object zza(int i5) {
        if (i5 < 2 || i5 > 1073741824 || Integer.highestOneBit(i5) != i5) {
            throw new IllegalArgumentException(u.l(new StringBuilder(String.valueOf(i5).length() + 41), "must be power of 2 between 2^1 and 2^30: ", i5));
        }
        return i5 <= 256 ? new byte[i5] : i5 <= 65536 ? new short[i5] : new int[i5];
    }

    public static int zzb(Object obj, int i5) {
        return obj instanceof byte[] ? ((byte[]) obj)[i5] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i5] : ((int[]) obj)[i5];
    }

    public static void zzc(Object obj, int i5, int i6) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i5] = (byte) i6;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i5] = (short) i6;
        } else {
            ((int[]) obj)[i5] = i6;
        }
    }

    public static int zzd(int i5) {
        return (i5 + 1) * (i5 < 32 ? 4 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r5 != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        zzc(r11, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zze(Object obj, Object obj2, int i5, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int zzb = zzgty.zzb(obj);
        int i6 = zzb & i5;
        int zzb2 = zzb(obj3, i6);
        if (zzb2 != 0) {
            int i7 = ~i5;
            int i8 = zzb & i7;
            int i9 = -1;
            while (true) {
                int i10 = zzb2 - 1;
                int i11 = iArr[i10];
                int i12 = i11 & i5;
                if ((i11 & i7) != i8 || !Objects.equals(obj, objArr[i10]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i10]))) {
                    if (i12 == 0) {
                        break;
                    }
                    i9 = i10;
                    zzb2 = i12;
                }
            }
        }
        return -1;
    }
}
