package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbzd extends u2.a {
    public static final Parcelable.Creator<zzbzd> CREATOR = new zzbze();
    public final String zza;

    public zzbzd(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, str);
        z2.b.P(parcel, O);
    }
}
