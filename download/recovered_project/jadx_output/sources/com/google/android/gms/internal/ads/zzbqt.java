package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbqt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        int i5 = 0;
        int i6 = 0;
        String str = null;
        int i7 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                i7 = y4.b.L(parcel, readInt);
            } else if (c5 == 2) {
                str = y4.b.o(parcel, readInt);
            } else if (c5 == 3) {
                i6 = y4.b.L(parcel, readInt);
            } else if (c5 != 1000) {
                y4.b.P(parcel, readInt);
            } else {
                i5 = y4.b.L(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbqs(i5, i7, str, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbqs[i5];
    }
}
