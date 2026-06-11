package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzps extends IOException {
    public zzps() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzps(long j2, long j5, int i5, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j2 + ", limit: " + j5 + ", len: " + i5), th);
        Locale locale = Locale.US;
    }

    public zzps(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
