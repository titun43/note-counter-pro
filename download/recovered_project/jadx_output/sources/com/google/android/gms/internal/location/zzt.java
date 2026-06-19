package com.google.android.gms.internal.location;

import android.os.Looper;
import b3.g;
import c3.f;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ f zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzz zzzVar, p pVar, LocationRequest locationRequest, f fVar, Looper looper) {
        super(pVar);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzB(zzba.zza(null, this.zza), g.m(zzbj.zza(this.zzc), null, f.class.getSimpleName()), new zzy(this));
    }
}
