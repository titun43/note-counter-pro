package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzrh extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzrh(long j2, long j5) {
        super(r2.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(j5).length() + 63 + String.valueOf(j2).length());
        u.t(sb, "Unexpected audio track timestamp discontinuity: expected ", j5, ", got ");
        sb.append(j2);
    }
}
