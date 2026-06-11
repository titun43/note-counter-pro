package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzcao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 2) {
                zzmVar = (com.google.android.gms.ads.internal.client.zzm) y4.b.n(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            } else if (c5 != 3) {
                y4.b.P(parcel, readInt);
            } else {
                str = y4.b.o(parcel, readInt);
            }
        }
        y4.b.t(parcel, Q);
        return new zzcan(zzmVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcan[i5];
    }
}
