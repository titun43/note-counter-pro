package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzgtb {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        String obj3 = obj.toString();
        throw new NullPointerException(h1.b(new StringBuilder(obj3.length() + 26), "null value in entry: ", obj3, "=null"));
    }

    public static int zzb(int i5, String str) {
        if (i5 >= 0) {
            return i5;
        }
        StringBuilder sb = new StringBuilder(str.length() + 29 + String.valueOf(i5).length());
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }
}
