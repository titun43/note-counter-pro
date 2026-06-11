package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zza extends a {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zza(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = b.O(parcel, 20293);
        b.I(parcel, 1, str);
        b.I(parcel, 2, this.zzb);
        b.I(parcel, 3, this.zzc);
        b.P(parcel, O);
    }
}
