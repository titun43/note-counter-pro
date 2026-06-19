package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzwb {
    private static final AtomicLong zza = new AtomicLong();

    public zzwb(long j2, zzhf zzhfVar, Uri uri, Map map, long j5, long j6, long j7) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
