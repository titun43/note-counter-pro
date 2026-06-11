package com.google.android.gms.internal.common;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (objArr[i6] == null) {
                throw new NullPointerException(u.l(new StringBuilder(String.valueOf(i6).length() + 9), "at index ", i6));
            }
        }
        return objArr;
    }
}
