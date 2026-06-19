package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzfy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 15) {
                b.P(parcel, readInt);
            } else {
                str = b.o(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzfx(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzfx[i5];
    }
}
