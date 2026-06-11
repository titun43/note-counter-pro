package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
final /* synthetic */ class zzcbk implements com.google.android.gms.ads.internal.util.client.zzq {
    static final /* synthetic */ zzcbk zza = new zzcbk();

    private /* synthetic */ zzcbk() {
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzq
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return queryLocalInterface instanceof zzcbd ? (zzcbd) queryLocalInterface : new zzcbd(iBinder);
    }
}
