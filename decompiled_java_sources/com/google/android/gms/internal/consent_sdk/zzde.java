package com.google.android.gms.internal.consent_sdk;

import s.c;

/* loaded from: classes.dex */
final class zzde extends zzdd {
    public zzde(char c5) {
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i5 = 44;
        for (int i6 = 0; i6 < 4; i6++) {
            cArr[5 - i6] = "0123456789ABCDEF".charAt(i5 & 15);
            i5 >>= 4;
        }
        return c.b("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
