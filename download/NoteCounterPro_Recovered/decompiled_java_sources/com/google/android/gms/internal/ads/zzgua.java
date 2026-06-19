package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzgua {
    public static int zze(int i5, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i6 <= i5) {
            return i5;
        }
        int i7 = i5 + (i5 >> 1) + 1;
        if (i7 < i6) {
            int highestOneBit = Integer.highestOneBit(i6 - 1);
            i7 = highestOneBit + highestOneBit;
        }
        return i7 < 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i7;
    }

    public abstract zzgua zzd(Object obj);
}
