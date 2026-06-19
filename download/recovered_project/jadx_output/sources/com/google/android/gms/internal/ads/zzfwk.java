package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzfwk extends u2.a {
    public static final Parcelable.Creator<zzfwk> CREATOR = new zzfwl();
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zzfwk(int i5, String str, String str2) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        z2.b.I(parcel, 2, this.zzb);
        z2.b.I(parcel, 3, this.zzc);
        z2.b.P(parcel, O);
    }

    public zzfwk(String str, String str2) {
        this(1, str, str2);
    }
}
