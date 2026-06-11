package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public class zzci {
    public static int zzc(int i5, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i6 <= i5) {
            return i5;
        }
        int i7 = i5 + (i5 >> 1) + 1;
        if (i7 < i6) {
            int highestOneBit = Integer.highestOneBit(i6 - 1);
            i7 = highestOneBit + highestOneBit;
        }
        return i7 < 0 ? f.API_PRIORITY_OTHER : i7;
    }
}
