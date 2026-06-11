package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbqq extends u2.a {
    public static final Parcelable.Creator<zzbqq> CREATOR = new zzbqr();
    public final String zza;
    public final Bundle zzb;

    public zzbqq(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, str);
        z2.b.E(parcel, 2, this.zzb);
        z2.b.P(parcel, O);
    }
}
