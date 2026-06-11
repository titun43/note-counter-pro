package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;

/* loaded from: classes.dex */
public final class zzgjg extends RuntimeException {
    public zzgjg() {
        this(0);
    }

    public zzgjg(int i5) {
        super(u.l(new StringBuilder(String.valueOf(i5).length() + 3), "r: ", i5));
    }

    public zzgjg(int i5, Throwable th) {
        super("r: 2", th);
    }
}
