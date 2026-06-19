package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class h0 extends z {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f1052g;
    public final /* synthetic */ f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f fVar, int i5, IBinder iBinder, Bundle bundle) {
        super(fVar, i5, bundle);
        this.h = fVar;
        this.f1052g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.z
    public final boolean a() {
        IBinder iBinder = this.f1052g;
        try {
            b0.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = fVar.getServiceDescriptor();
                Log.w("GmsClient", androidx.emoji2.text.u.n(new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface createServiceInterface = fVar.createServiceInterface(iBinder);
            if (createServiceInterface == null || !(fVar.zze(2, 4, createServiceInterface) || fVar.zze(3, 4, createServiceInterface))) {
                return false;
            }
            fVar.zzn(null);
            b zzk = fVar.zzk();
            Bundle connectionHint = fVar.getConnectionHint();
            if (zzk == null) {
                return true;
            }
            fVar.zzk().onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.z
    public final void b(t2.b bVar) {
        f fVar = this.h;
        if (fVar.zzl() != null) {
            fVar.zzl().onConnectionFailed(bVar);
        }
        fVar.onConnectionFailed(bVar);
    }
}
