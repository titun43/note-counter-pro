package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzfwh extends u2.a {
    public static final Parcelable.Creator<zzfwh> CREATOR = new zzfwi();
    public final int zza;
    public final byte[] zzb;

    public zzfwh(int i5, byte[] bArr) {
        this.zza = i5;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        z2.b.F(parcel, 2, this.zzb);
        z2.b.P(parcel, O);
    }

    public zzfwh(byte[] bArr) {
        this(1, bArr);
    }
}
