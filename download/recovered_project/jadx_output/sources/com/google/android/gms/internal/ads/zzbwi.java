package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbwi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                i5 = y4.b.L(parcel, readInt);
            } else if (c5 == 2) {
                i6 = y4.b.L(parcel, readInt);
            } else if (c5 != 3) {
                y4.b.P(parcel, readInt);
            } else {
                i7 = y4.b.L(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbwh(i5, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbwh[i5];
    }
}
