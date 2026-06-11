package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        IBinder iBinder = null;
        boolean z4 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                z4 = b.G(parcel, readInt);
            } else if (c5 == 2) {
                iBinder = b.K(parcel, readInt);
            } else if (c5 != 3) {
                b.P(parcel, readInt);
            } else {
                iBinder2 = b.K(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new PublisherAdViewOptions(z4, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new PublisherAdViewOptions[i5];
    }
}
