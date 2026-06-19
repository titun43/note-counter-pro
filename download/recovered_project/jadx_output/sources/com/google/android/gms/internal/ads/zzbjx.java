package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
final /* synthetic */ class zzbjx implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzbjx zza = new zzbjx();

    private /* synthetic */ zzbjx() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return queryLocalInterface instanceof zzbjz ? (zzbjz) queryLocalInterface : new zzbjz(iBinder);
    }
}
