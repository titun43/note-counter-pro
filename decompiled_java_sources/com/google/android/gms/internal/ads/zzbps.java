package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzbps extends com.google.android.gms.ads.internal.zzc {
    public zzbps(Context context, Looper looper, com.google.android.gms.common.internal.b bVar, com.google.android.gms.common.internal.c cVar) {
        super(zzcae.zza(context), looper, 166, bVar, cVar, null);
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof zzbpz ? (zzbpz) queryLocalInterface : new zzbpz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbpz zzp() {
        return (zzbpz) getService();
    }
}
