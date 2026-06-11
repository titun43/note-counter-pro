package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;

/* loaded from: classes.dex */
public final class zzpq {
    public static final zzpq zza;
    public final String zzb;
    private final zzpp zzc;

    static {
        new zzpq(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        zza = new zzpq("preload");
    }

    public zzpq(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzpp() : null;
    }

    public final synchronized LogSessionId zza() {
        zzpp zzppVar;
        zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        return zzppVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        boolean equals;
        LogSessionId unused;
        zzpp zzppVar = this.zzc;
        if (zzppVar == null) {
            throw null;
        }
        LogSessionId logSessionId2 = zzppVar.zza;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(LogSessionId.LOG_SESSION_ID_NONE);
        zzgrc.zzi(equals);
        zzppVar.zza = logSessionId;
    }
}
