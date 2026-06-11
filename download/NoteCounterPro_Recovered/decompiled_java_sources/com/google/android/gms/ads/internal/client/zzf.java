package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        String str = null;
        String str2 = null;
        zze zzeVar = null;
        IBinder iBinder = null;
        int i5 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                i5 = b.L(parcel, readInt);
            } else if (c5 == 2) {
                str = b.o(parcel, readInt);
            } else if (c5 == 3) {
                str2 = b.o(parcel, readInt);
            } else if (c5 == 4) {
                zzeVar = (zze) b.n(parcel, readInt, zze.CREATOR);
            } else if (c5 != 5) {
                b.P(parcel, readInt);
            } else {
                iBinder = b.K(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zze(i5, str, str2, zzeVar, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zze[i5];
    }
}
