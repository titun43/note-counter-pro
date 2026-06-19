package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzcdh extends u2.a {
    public static final Parcelable.Creator<zzcdh> CREATOR = new zzcdi();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzr zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final int zze;
    public final String zzf;

    public zzcdh(String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i5, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = zzmVar;
        this.zze = i5;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, str);
        z2.b.I(parcel, 2, this.zzb);
        z2.b.H(parcel, 3, this.zzc, i5);
        z2.b.H(parcel, 4, this.zzd, i5);
        int i6 = this.zze;
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(i6);
        z2.b.I(parcel, 6, this.zzf);
        z2.b.P(parcel, O);
    }
}
