package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzikr {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzikr(int i5, int i6, zzikq zzikqVar) {
        this.zza = zzikd.zza(i5);
        this.zzb = zzikd.zza(i6);
    }

    public final zzikr zza(zzikp zzikpVar) {
        this.zza.add(zzikpVar);
        return this;
    }

    public final zzikr zzb(zzikp zzikpVar) {
        this.zzb.add(zzikpVar);
        return this;
    }

    public final zziks zzc() {
        return new zziks(this.zza, this.zzb, null);
    }
}
