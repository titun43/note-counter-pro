package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                y4.b.P(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) y4.b.n(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbzs(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbzs[i5];
    }
}
