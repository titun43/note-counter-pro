package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c3.r;
import c3.t;
import c3.v;
import c3.w;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzbc extends a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final w zzc;
    final PendingIntent zzd;
    final t zze;
    final zzai zzf;

    public zzbc(int i5, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.zza = i5;
        this.zzb = zzbaVar;
        zzai zzaiVar = null;
        this.zzc = iBinder == null ? null : v.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : r.zzb(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaiVar = queryLocalInterface instanceof zzai ? (zzai) queryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, c3.w] */
    public static zzbc zza(w wVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, wVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, c3.t] */
    public static zzbc zzc(t tVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, tVar, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        int i6 = this.zza;
        b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        b.H(parcel, 2, this.zzb, i5);
        w wVar = this.zzc;
        b.G(parcel, 3, wVar == null ? null : wVar.asBinder());
        b.H(parcel, 4, this.zzd, i5);
        t tVar = this.zze;
        b.G(parcel, 5, tVar == null ? null : tVar.asBinder());
        zzai zzaiVar = this.zzf;
        b.G(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null);
        b.P(parcel, O);
    }
}
