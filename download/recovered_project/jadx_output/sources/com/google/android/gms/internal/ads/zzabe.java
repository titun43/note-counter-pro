package com.google.android.gms.internal.ads;

import androidx.fragment.app.h1;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabe extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzabe(Throwable th) {
        super(h1.b(new StringBuilder(r1.length() + r0.length() + 11), "Unexpected ", r0, r1), th);
        String simpleName = th.getClass().getSimpleName();
        String concat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}
