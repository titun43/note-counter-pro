package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfrn {
    public static int zza(int i5) {
        int[] iArr = {1, 2, 3};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr[i6];
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == i5) {
                return i7;
            }
        }
        return 2;
    }
}
