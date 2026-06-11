package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class g0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f1047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1048b;

    public g0(f fVar, int i5) {
        this.f1048b = fVar;
        this.f1047a = i5;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f1048b;
        if (iBinder == null) {
            fVar.zzf(16);
            return;
        }
        synchronized (fVar.zzh()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar.zzi((queryLocalInterface == null || !(queryLocalInterface instanceof p)) ? new a0(iBinder) : (p) queryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1048b.zzb(0, null, this.f1047a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.f1048b;
        synchronized (fVar.zzh()) {
            fVar.zzi(null);
        }
        f fVar2 = this.f1048b;
        int i5 = this.f1047a;
        Handler handler = fVar2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i5, 1));
    }
}
