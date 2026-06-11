package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c3.o;
import c3.p;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final p zzc;
    final zzai zzd;

    public zzl(int i5, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i5;
        this.zzb = zzjVar;
        zzai zzaiVar = null;
        this.zzc = iBinder == null ? null : o.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaiVar = queryLocalInterface instanceof zzai ? (zzai) queryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        int i6 = this.zza;
        b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        b.H(parcel, 2, this.zzb, i5);
        p pVar = this.zzc;
        b.G(parcel, 3, pVar == null ? null : pVar.asBinder());
        zzai zzaiVar = this.zzd;
        b.G(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null);
        b.P(parcel, O);
    }
}
