package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbqg extends u2.a {
    public static final Parcelable.Creator<zzbqg> CREATOR = new zzbqh();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzbqg(String str, boolean z4, int i5, String str2) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = i5;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, str);
        boolean z4 = this.zzb;
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i6 = this.zzc;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i6);
        z2.b.I(parcel, 4, this.zzd);
        z2.b.P(parcel, O);
    }
}
