package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbgj;

/* loaded from: classes.dex */
public final class zzbqs extends u2.a {
    public static final Parcelable.Creator<zzbqs> CREATOR = new zzbqt();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbqs(int i5, int i6, String str, int i7) {
        this.zza = i5;
        this.zzb = i6;
        this.zzc = str;
        this.zzd = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zzb;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        z2.b.I(parcel, 2, this.zzc);
        int i7 = this.zzd;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i7);
        int i8 = this.zza;
        z2.b.N(parcel, zzbgj.zzq.zzf, 4);
        parcel.writeInt(i8);
        z2.b.P(parcel, O);
    }
}
