package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        int i5 = 0;
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                str = b.o(parcel, readInt);
            } else if (c5 != 2) {
                b.P(parcel, readInt);
            } else {
                i5 = b.L(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzba(str, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzba[i5];
    }
}
