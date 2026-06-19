package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbqr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                str = y4.b.o(parcel, readInt);
            } else if (c5 != 2) {
                y4.b.P(parcel, readInt);
            } else {
                bundle = y4.b.l(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbqq(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbqq[i5];
    }
}
