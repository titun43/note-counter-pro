package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbpv extends u2.a {
    public static final Parcelable.Creator<zzbpv> CREATOR = new zzbpw();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public zzbpv(boolean z4, String str, int i5, byte[] bArr, String[] strArr, String[] strArr2, boolean z5, long j2) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = i5;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z5;
        this.zzh = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        boolean z4 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(z4 ? 1 : 0);
        z2.b.I(parcel, 2, this.zzb);
        int i6 = this.zzc;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i6);
        z2.b.F(parcel, 4, this.zzd);
        z2.b.J(parcel, 5, this.zze);
        z2.b.J(parcel, 6, this.zzf);
        boolean z5 = this.zzg;
        z2.b.N(parcel, 7, 4);
        parcel.writeInt(z5 ? 1 : 0);
        long j2 = this.zzh;
        z2.b.N(parcel, 8, 8);
        parcel.writeLong(j2);
        z2.b.P(parcel, O);
    }
}
