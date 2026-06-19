package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzgb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 2) {
                z4 = b.G(parcel, readInt);
            } else if (c5 == 3) {
                z5 = b.G(parcel, readInt);
            } else if (c5 != 4) {
                b.P(parcel, readInt);
            } else {
                z6 = b.G(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzga(z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzga[i5];
    }
}
