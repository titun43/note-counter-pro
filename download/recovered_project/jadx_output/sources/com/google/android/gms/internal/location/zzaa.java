package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class zzaa extends a implements t {
    private final Status zzb;
    public static final zzaa zza = new zzaa(Status.f924k);
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();

    public zzaa(Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        b.H(parcel, 1, this.zzb, i5);
        b.P(parcel, O);
    }
}
