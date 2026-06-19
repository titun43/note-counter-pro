package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzfu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        int i5 = 0;
        String str = null;
        zzm zzmVar = null;
        int i6 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                str = b.o(parcel, readInt);
            } else if (c5 == 2) {
                i5 = b.L(parcel, readInt);
            } else if (c5 == 3) {
                zzmVar = (zzm) b.n(parcel, readInt, zzm.CREATOR);
            } else if (c5 != 4) {
                b.P(parcel, readInt);
            } else {
                i6 = b.L(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzft(str, i5, zzmVar, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzft[i5];
    }
}
