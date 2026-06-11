package com.google.android.gms.internal.play_billing;

import s.c;

/* loaded from: classes.dex */
final class zzbw {
    public static int zza(int i5, String str) {
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i5);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(c.b("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
