package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;

/* loaded from: classes.dex */
final class zzgqn extends zzgqm {
    private final char zza;

    public zzgqn(char c5) {
        this.zza = c5;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i5 = this.zza;
        for (int i6 = 0; i6 < 4; i6++) {
            cArr[5 - i6] = "0123456789ABCDEF".charAt(i5 & 15);
            i5 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return h1.b(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzb(char c5) {
        return c5 == this.zza;
    }
}
