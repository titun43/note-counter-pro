package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final zzl createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        zzj zzjVar = null;
        int i5 = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                i5 = b.L(parcel, readInt);
            } else if (c5 == 2) {
                zzjVar = (zzj) b.n(parcel, readInt, zzj.CREATOR);
            } else if (c5 == 3) {
                iBinder = b.K(parcel, readInt);
            } else if (c5 != 4) {
                b.P(parcel, readInt);
            } else {
                iBinder2 = b.K(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zzl(i5, zzjVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i5) {
        return new zzl[i5];
    }
}
