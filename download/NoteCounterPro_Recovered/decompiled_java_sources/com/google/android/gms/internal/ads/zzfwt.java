package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzfwt extends u2.a {
    public static final Parcelable.Creator<zzfwt> CREATOR = new zzfwu();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzfwt(int i5, int i6, int i7, String str, String str2) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.zzb;
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        z2.b.I(parcel, 3, this.zzc);
        z2.b.I(parcel, 4, this.zzd);
        int i8 = this.zze;
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(i8);
        z2.b.P(parcel, O);
    }

    public zzfwt(int i5, zzbch zzbchVar, String str, String str2) {
        this(1, 1, zzbchVar.zza(), str, str2);
    }
}
