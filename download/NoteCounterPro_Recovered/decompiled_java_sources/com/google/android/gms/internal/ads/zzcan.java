package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzcan extends u2.a {
    public static final Parcelable.Creator<zzcan> CREATOR = new zzcao();
    public final com.google.android.gms.ads.internal.client.zzm zza;
    public final String zzb;

    public zzcan(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        this.zza = zzmVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.H(parcel, 2, zzmVar, i5);
        z2.b.I(parcel, 3, this.zzb);
        z2.b.P(parcel, O);
    }
}
