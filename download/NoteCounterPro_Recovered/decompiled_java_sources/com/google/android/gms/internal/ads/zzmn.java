package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public interface zzmn {
    static boolean zzaa(int i5, boolean z4) {
        int i6 = i5 & 7;
        if (i6 != 4) {
            return z4 && i6 == 3;
        }
        return true;
    }

    String zzS();

    int zza();

    int zzab(zzv zzvVar);

    int zzu();

    default void zzv(zzmm zzmmVar) {
    }

    default void zzw() {
    }
}
