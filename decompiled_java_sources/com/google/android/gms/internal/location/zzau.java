package com.google.android.gms.internal.location;

import android.location.Location;
import c3.v;
import com.google.android.gms.common.api.internal.l;

/* loaded from: classes.dex */
final class zzau extends v {
    private final l zza;

    public zzau(l lVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.zza = lVar;
    }

    public final synchronized void zzc() {
        l lVar = this.zza;
        lVar.f1005b = null;
        lVar.f1006c = null;
    }

    @Override // c3.w
    public final synchronized void zzd(Location location) {
        this.zza.a(new zzat(this, location));
    }
}
