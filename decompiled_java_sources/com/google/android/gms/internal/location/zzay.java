package com.google.android.gms.internal.location;

import c3.j;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.internal.b0;

/* loaded from: classes.dex */
final class zzay extends zzan {
    private d zza;

    public zzay(d dVar) {
        b0.a("listener can't be null.", dVar != null);
        this.zza = dVar;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(j jVar) {
        this.zza.setResult(jVar);
        this.zza = null;
    }
}
