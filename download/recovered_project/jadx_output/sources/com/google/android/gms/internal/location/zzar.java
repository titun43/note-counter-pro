package com.google.android.gms.internal.location;

import c3.r;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes.dex */
final class zzar extends r {
    private final l zza;

    public zzar(l lVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.zza = lVar;
    }

    public final synchronized void zzc() {
        l lVar = this.zza;
        lVar.f1005b = null;
        lVar.f1006c = null;
    }

    @Override // c3.t
    public final void zzd(LocationResult locationResult) {
        this.zza.a(new zzap(this, locationResult));
    }

    @Override // c3.t
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.a(new zzaq(this, locationAvailability));
    }
}
