package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzbfo extends com.google.android.gms.ads.internal.zzc {
    public zzbfo(Context context, Looper looper, com.google.android.gms.common.internal.b bVar, com.google.android.gms.common.internal.c cVar) {
        super(zzcae.zza(context), looper, 123, bVar, cVar, null);
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzbfr ? (zzbfr) queryLocalInterface : new zzbfr(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final t2.d[] getApiFeatures() {
        return com.google.android.gms.ads.zzh.zzb;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue() && x2.d.d(getAvailableFeatures(), com.google.android.gms.ads.zzh.zza);
    }

    public final zzbfr zzq() {
        return (zzbfr) getService();
    }
}
