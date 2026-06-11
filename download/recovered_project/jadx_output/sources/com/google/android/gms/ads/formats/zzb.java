package com.google.android.gms.ads.formats;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        boolean z4 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.P(parcel, readInt);
            } else {
                z4 = b.G(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new AdManagerAdViewOptions(z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new AdManagerAdViewOptions[i5];
    }
}
