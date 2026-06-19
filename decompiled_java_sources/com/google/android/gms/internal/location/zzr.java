package com.google.android.gms.internal.location;

import c3.g;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class zzr extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ g zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzz zzzVar, p pVar, LocationRequest locationRequest, g gVar) {
        super(pVar);
        this.zza = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzC(this.zza, b3.g.m(zzbj.zzb(), null, g.class.getSimpleName()), new zzy(this));
    }
}
