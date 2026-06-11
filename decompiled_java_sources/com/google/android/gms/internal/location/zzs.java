package com.google.android.gms.internal.location;

import android.os.Looper;
import c3.g;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class zzs extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ g zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzz zzzVar, p pVar, LocationRequest locationRequest, g gVar, Looper looper) {
        super(pVar);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzC(this.zza, b3.g.m(zzbj.zza(this.zzc), null, g.class.getSimpleName()), new zzy(this));
    }
}
