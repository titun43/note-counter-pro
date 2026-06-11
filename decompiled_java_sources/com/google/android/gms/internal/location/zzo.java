package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;

/* loaded from: classes.dex */
final class zzo extends zzx {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzz zzzVar, p pVar, boolean z4) {
        super(pVar);
        this.zza = z4;
    }

    @Override // com.google.android.gms.common.api.internal.c
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzI(this.zza);
        setResult((zzo) Status.f924k);
    }
}
