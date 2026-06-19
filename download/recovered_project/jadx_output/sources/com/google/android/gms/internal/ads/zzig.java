package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzig extends IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzig(int i5, int i6) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 21 + String.valueOf(i6).length() + 1);
        u.s(sb, "Buffer too small (", i5, " < ", i6);
        sb.append(")");
    }
}
