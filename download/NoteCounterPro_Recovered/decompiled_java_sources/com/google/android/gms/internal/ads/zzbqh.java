package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbqh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        String str = null;
        boolean z4 = false;
        int i5 = 0;
        String str2 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                str = y4.b.o(parcel, readInt);
            } else if (c5 == 2) {
                z4 = y4.b.G(parcel, readInt);
            } else if (c5 == 3) {
                i5 = y4.b.L(parcel, readInt);
            } else if (c5 != 4) {
                y4.b.P(parcel, readInt);
            } else {
                str2 = y4.b.o(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbqg(str, z4, i5, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbqg[i5];
    }
}
