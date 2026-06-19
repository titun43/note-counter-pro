package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzrf extends Exception {
    public final boolean zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzrf(int i5, int i6, int i7, int i8, int i9, zzv zzvVar, boolean z4, Exception exc) {
        super(h1.b(r3, ") ", r5, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), exc);
        String valueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i6).length();
        int length2 = String.valueOf(i7).length();
        int length3 = String.valueOf(i8).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i9).length() + 2 + valueOf.length());
        u.s(sb, "AudioTrack init failed 0 Config(", i6, ", ", i7);
        u.s(sb, ", ", i8, ", ", i9);
        this.zza = false;
    }
}
