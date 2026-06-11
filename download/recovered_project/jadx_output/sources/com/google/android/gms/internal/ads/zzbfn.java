package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbfn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) y4.b.n(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c5 == 3) {
                z4 = y4.b.G(parcel, readInt);
            } else if (c5 == 4) {
                z5 = y4.b.G(parcel, readInt);
            } else if (c5 == 5) {
                j2 = y4.b.M(parcel, readInt);
            } else if (c5 != 6) {
                y4.b.P(parcel, readInt);
            } else {
                z6 = y4.b.G(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbfm(parcelFileDescriptor, z4, z5, j2, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbfm[i5];
    }
}
