package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import u2.a;
import z2.b;

@Deprecated
/* loaded from: classes.dex */
public final class zzx extends a {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    public final int zza;

    public zzx(int i5) {
        this.zza = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = b.O(parcel, 20293);
        b.N(parcel, 2, 4);
        parcel.writeInt(i6);
        b.P(parcel, O);
    }
}
