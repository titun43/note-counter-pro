package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zziau extends IOException {
    public zziau() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziau(long j2, long j5, int i5, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j2 + ", limit: " + j5 + ", len: " + i5), th);
        Locale locale = Locale.US;
    }

    public zziau(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
