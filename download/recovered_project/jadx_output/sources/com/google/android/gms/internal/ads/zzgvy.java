package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzgvy {
    public static Object[] zza(Object[] objArr, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            zzb(objArr[i6], i6);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i5) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(u.l(new StringBuilder(String.valueOf(i5).length() + 9), "at index ", i5));
    }
}
