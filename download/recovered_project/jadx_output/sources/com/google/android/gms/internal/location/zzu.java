package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class zzu extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzz zzzVar, p pVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(pVar);
        this.zza = locationRequest;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzE(this.zza, this.zzb, new zzy(this));
    }
}
