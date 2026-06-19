package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class f0 extends zzb {

    /* renamed from: g, reason: collision with root package name */
    public f f1045g;
    public final int h;

    public f0(f fVar, int i5) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f1045g = fVar;
        this.h = i5;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i5, Parcel parcel, Parcel parcel2, int i6) {
        int i7 = this.h;
        if (i5 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
            zzc.zzf(parcel);
            b0.h(this.f1045g, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1045g.onPostInitHandler(readInt, readStrongBinder, bundle, i7);
            this.f1045g = null;
        } else if (i5 == 2) {
            parcel.readInt();
            zzc.zzf(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i5 != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            j0 j0Var = (j0) zzc.zzb(parcel, j0.CREATOR);
            zzc.zzf(parcel);
            f fVar = this.f1045g;
            b0.h(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            b0.g(j0Var);
            fVar.zzc(j0Var);
            Bundle bundle2 = j0Var.f1065g;
            b0.h(this.f1045g, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f1045g.onPostInitHandler(readInt2, readStrongBinder2, bundle2, i7);
            this.f1045g = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
