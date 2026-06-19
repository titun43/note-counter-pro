package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzfv extends a {
    public static final Parcelable.Creator<zzfv> CREATOR = new zzfw();
    public final int zza;
    public final int zzb;

    public zzfv(int i5, int i6) {
        this.zza = i5;
        this.zzb = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i6 = this.zza;
        int O = b.O(parcel, 20293);
        b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.zzb;
        b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        b.P(parcel, O);
    }

    public zzfv(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
