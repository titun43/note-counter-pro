package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzflh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i5 = y4.b.L(parcel, readInt);
                    break;
                case 2:
                    i6 = y4.b.L(parcel, readInt);
                    break;
                case 3:
                    i7 = y4.b.L(parcel, readInt);
                    break;
                case 4:
                    i8 = y4.b.L(parcel, readInt);
                    break;
                case 5:
                    str = y4.b.o(parcel, readInt);
                    break;
                case 6:
                    i9 = y4.b.L(parcel, readInt);
                    break;
                case 7:
                    i10 = y4.b.L(parcel, readInt);
                    break;
                default:
                    y4.b.P(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzflg(i5, i6, i7, i8, str, i9, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzflg[i5];
    }
}
