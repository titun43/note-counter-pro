package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzl(boolean z4, boolean z5, String str, boolean z6, float f5, int i5, boolean z7, boolean z8, boolean z9) {
        this.zza = z4;
        this.zzb = z5;
        this.zzc = str;
        this.zzd = z6;
        this.zze = f5;
        this.zzf = i5;
        this.zzg = z7;
        this.zzh = z8;
        this.zzi = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        boolean z4 = this.zza;
        int O = b.O(parcel, 20293);
        b.N(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzb;
        b.N(parcel, 3, 4);
        parcel.writeInt(z5 ? 1 : 0);
        b.I(parcel, 4, this.zzc);
        boolean z6 = this.zzd;
        b.N(parcel, 5, 4);
        parcel.writeInt(z6 ? 1 : 0);
        float f5 = this.zze;
        b.N(parcel, 6, 4);
        parcel.writeFloat(f5);
        int i6 = this.zzf;
        b.N(parcel, 7, 4);
        parcel.writeInt(i6);
        boolean z7 = this.zzg;
        b.N(parcel, 8, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzh;
        b.N(parcel, 9, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.zzi;
        b.N(parcel, 10, 4);
        parcel.writeInt(z9 ? 1 : 0);
        b.P(parcel, O);
    }

    public zzl(boolean z4, boolean z5, boolean z6, float f5, int i5, boolean z7, boolean z8, boolean z9) {
        this(z4, z5, null, z6, f5, -1, z7, z8, z9);
    }
}
