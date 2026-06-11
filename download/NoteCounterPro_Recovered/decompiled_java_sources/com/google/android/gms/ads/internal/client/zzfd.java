package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzfd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        String str = null;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                i5 = b.L(parcel, readInt);
            } else if (c5 == 2) {
                i6 = b.L(parcel, readInt);
            } else if (c5 != 3) {
                b.P(parcel, readInt);
            } else {
                str = b.o(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzfc(i5, i6, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzfc[i5];
    }
}
