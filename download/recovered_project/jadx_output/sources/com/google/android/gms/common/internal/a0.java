package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class a0 implements p {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f1038g;

    public a0(IBinder iBinder) {
        this.f1038g = iBinder;
    }

    public final void a(f0 f0Var, k kVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(f0Var.asBinder());
            obtain.writeInt(1);
            k0.a(kVar, obtain, 0);
            this.f1038g.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1038g;
    }
}
