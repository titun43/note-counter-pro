package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzv extends a {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzv(String str, long j2, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j2;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = b.O(parcel, 20293);
        b.I(parcel, 1, str);
        long j2 = this.zzb;
        b.N(parcel, 2, 8);
        parcel.writeLong(j2);
        b.H(parcel, 3, this.zzc, i5);
        b.E(parcel, 4, this.zzd);
        b.I(parcel, 5, this.zze);
        b.I(parcel, 6, this.zzf);
        b.I(parcel, 7, this.zzg);
        b.I(parcel, 8, this.zzh);
        b.P(parcel, O);
    }
}
