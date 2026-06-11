package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzcm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        long j2 = 0;
        long j5 = 0;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j2 = b.M(parcel, readInt);
                    break;
                case 2:
                    j5 = b.M(parcel, readInt);
                    break;
                case 3:
                    z4 = b.G(parcel, readInt);
                    break;
                case 4:
                    str = b.o(parcel, readInt);
                    break;
                case 5:
                    str2 = b.o(parcel, readInt);
                    break;
                case 6:
                    str3 = b.o(parcel, readInt);
                    break;
                case 7:
                    bundle = b.l(parcel, readInt);
                    break;
                case '\b':
                    str4 = b.o(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzcl(j2, j5, z4, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcl[i5];
    }
}
