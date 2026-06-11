package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbpt extends u2.a {
    public static final Parcelable.Creator<zzbpt> CREATOR = new zzbpu();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    public zzbpt(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, str);
        z2.b.J(parcel, 2, this.zzb);
        z2.b.J(parcel, 3, this.zzc);
        z2.b.P(parcel, O);
    }
}
