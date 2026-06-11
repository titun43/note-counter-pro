package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import x2.c;

/* loaded from: classes.dex */
public final class zzq {
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzq(QueryInfo queryInfo, String str, long j2, int i5) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = i5;
    }

    public final QueryInfo zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        ((c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
        return this.zzc <= System.currentTimeMillis();
    }

    public final int zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zze.get();
    }

    public final void zzf() {
        this.zze.set(true);
    }
}
