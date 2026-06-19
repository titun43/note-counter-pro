package com.google.android.gms.internal.play_billing;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzdd {
    public static Object zza(Object obj, int i5) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(u.h(i5, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            zza(objArr[i6], i6);
        }
        return objArr;
    }
}
