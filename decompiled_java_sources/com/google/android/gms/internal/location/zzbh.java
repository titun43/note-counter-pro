package com.google.android.gms.internal.location;

import c3.i;
import c3.j;
import c3.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.t;

/* loaded from: classes.dex */
final class zzbh extends x {
    final /* synthetic */ i zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbi zzbiVar, p pVar, i iVar, String str) {
        super(pVar);
        this.zza = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return new j(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzL(this.zza, this, null);
    }
}
