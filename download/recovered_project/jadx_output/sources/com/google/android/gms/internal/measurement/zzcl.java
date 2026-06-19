package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzcl extends a {
    public static final Parcelable.Creator<zzcl> CREATOR = new zzcm();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzcl(long j2, long j5, boolean z4, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j2;
        this.zzb = j5;
        this.zzc = z4;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        long j2 = this.zza;
        b.N(parcel, 1, 8);
        parcel.writeLong(j2);
        long j5 = this.zzb;
        b.N(parcel, 2, 8);
        parcel.writeLong(j5);
        boolean z4 = this.zzc;
        b.N(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        b.I(parcel, 4, this.zzd);
        b.I(parcel, 5, this.zze);
        b.I(parcel, 6, this.zzf);
        b.E(parcel, 7, this.zzg);
        b.I(parcel, 8, this.zzh);
        b.P(parcel, O);
    }
}
