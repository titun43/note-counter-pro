package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes.dex */
final class zzaq implements k {
    final /* synthetic */ LocationAvailability zza;

    public zzaq(zzar zzarVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
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
