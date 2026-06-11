package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzei implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        int i5 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.P(parcel, readInt);
            } else {
                i5 = b.L(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzeh(i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzeh[i5];
    }
}
