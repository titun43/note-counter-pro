package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzcdn {
    final /* synthetic */ zzcdo zza;
    private long zzb;
    private long zzc;

    public zzcdn(zzcdo zzcdoVar) {
        Objects.requireNonNull(zzcdoVar);
        this.zza = zzcdoVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        ((x2.c) this.zza.zzk()).getClass();
        this.zzc = SystemClock.elapsedRealtime();
    }

    public final void zzc() {
        ((x2.c) this.zza.zzk()).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}
