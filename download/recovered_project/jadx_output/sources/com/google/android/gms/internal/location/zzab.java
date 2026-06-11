package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import y4.b;

/* loaded from: classes.dex */
public final class zzab implements Parcelable.Creator<zzaa> {
    @Override // android.os.Parcelable.Creator
    public final zzaa createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        Status status = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.P(parcel, readInt);
            } else {
                status = (Status) b.n(parcel, readInt, Status.CREATOR);
            }
        }
        b.t(parcel, Q);
        return new zzaa(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa[] newArray(int i5) {
        return new zzaa[i5];
    }
}
