package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import c3.e;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;

/* loaded from: classes.dex */
final class zzac extends zzae {
    final /* synthetic */ e zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzafVar, p pVar, e eVar, PendingIntent pendingIntent) {
        super(pVar);
        this.zza = eVar;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzv(this.zza, this.zzb, this);
    }
}
