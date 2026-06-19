package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfwv extends u2.a {
    public static final Parcelable.Creator<zzfwv> CREATOR = new zzfww();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzfwv(int i5, byte[] bArr, int i6) {
        this.zza = i5;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        z2.b.F(parcel, 2, this.zzb);
        int i7 = this.zzc;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i7);
        z2.b.P(parcel, O);
    }

    public zzfwv(byte[] bArr, int i5) {
        this(1, null, 1);
    }
}
