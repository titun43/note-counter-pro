package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final zzbc createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        int i5 = 1;
        zzba zzbaVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i5 = b.L(parcel, readInt);
                    break;
                case 2:
                    zzbaVar = (zzba) b.n(parcel, readInt, zzba.CREATOR);
                    break;
                case 3:
                    iBinder = b.K(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.n(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.K(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = b.K(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzbc(i5, zzbaVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i5) {
        return new zzbc[i5];
    }
}
