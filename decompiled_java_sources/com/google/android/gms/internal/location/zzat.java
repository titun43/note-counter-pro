package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.k;

/* loaded from: classes.dex */
final class zzat implements k {
    final /* synthetic */ Location zza;

    public zzat(zzau zzauVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final /* synthetic */ void notifyListener(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.api.internal.k
    public final void onNotifyListenerFailed() {
    }
}
