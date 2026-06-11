package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 2) {
                str = b.o(parcel, readInt);
            } else if (c5 == 3) {
                i5 = b.L(parcel, readInt);
            } else if (c5 == 4) {
                i6 = b.L(parcel, readInt);
            } else if (c5 == 5) {
                z4 = b.G(parcel, readInt);
            } else if (c5 != 6) {
                b.P(parcel, readInt);
            } else {
                z5 = b.G(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new VersionInfoParcel(str, i5, i6, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new VersionInfoParcel[i5];
    }
}
