package com.google.android.gms.internal.measurement;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
final class zzmz extends IllegalArgumentException {
    public zzmz(int i5, int i6) {
        super(u.g(i5, i6, "Unpaired surrogate at index ", " of "));
    }
}
