package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzieq extends Exception {
    public zzieq(int i5, int i6) {
        super(s.c.c(new StringBuilder(String.valueOf(i5).length() + 32 + String.valueOf(i6).length()), "Unpaired surrogate at index ", i5, " of ", i6));
    }
}
