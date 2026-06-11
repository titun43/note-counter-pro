package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                y4.b.P(parcel, readInt);
            } else {
                str = y4.b.o(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbzd(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbzd[i5];
    }
}
