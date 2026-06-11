package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* loaded from: classes.dex */
public final class zzcbn extends u2.a {
    public static final Parcelable.Creator<zzcbn> CREATOR = new zzcbo();
    public final String zza;
    public final String zzb;

    public zzcbn(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, str);
        z2.b.I(parcel, 2, this.zzb);
        z2.b.P(parcel, O);
    }

    public zzcbn(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }
}
