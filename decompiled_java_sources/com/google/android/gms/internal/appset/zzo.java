package com.google.android.gms.internal.appset;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.s;
import h3.h;
import q2.b;
import q2.d;

/* loaded from: classes.dex */
final class zzo extends zze {
    final /* synthetic */ h zza;

    public zzo(zzp zzpVar, h hVar) {
        this.zza = hVar;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, d dVar) {
        b bVar = dVar != null ? new b(dVar.f3087g, dVar.h) : null;
        h hVar = this.zza;
        if (status.f929g <= 0) {
            hVar.a(bVar);
        } else {
            hVar.f1713a.d(status.f930i != null ? new s(status) : new j(status));
        }
    }
}
