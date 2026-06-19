package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        ArrayList arrayList = null;
        boolean z4 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 2) {
                z4 = y4.b.G(parcel, readInt);
            } else if (c5 != 3) {
                y4.b.P(parcel, readInt);
            } else {
                arrayList = y4.b.q(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzbzb(z4, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbzb[i5];
    }
}
