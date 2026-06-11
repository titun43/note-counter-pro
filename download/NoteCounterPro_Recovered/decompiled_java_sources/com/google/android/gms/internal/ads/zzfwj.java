package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzfwj extends com.google.android.gms.ads.internal.zzc {
    private final int zze;

    public zzfwj(Context context, Looper looper, com.google.android.gms.common.internal.b bVar, com.google.android.gms.common.internal.c cVar, int i5) {
        super(context, looper, 116, bVar, cVar, null);
        this.zze = i5;
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof zzfwo ? (zzfwo) queryLocalInterface : new zzfwo(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfwo zzp() {
        return (zzfwo) getService();
    }
}
