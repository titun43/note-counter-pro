package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final zzbe createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        String str = null;
        int i5 = 0;
        short s5 = 0;
        int i6 = 0;
        double d5 = 0.0d;
        double d6 = 0.0d;
        float f5 = 0.0f;
        long j2 = 0;
        int i7 = -1;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.o(parcel, readInt);
                    break;
                case 2:
                    j2 = b.M(parcel, readInt);
                    break;
                case 3:
                    b.R(parcel, readInt, 4);
                    s5 = (short) parcel.readInt();
                    break;
                case 4:
                    b.R(parcel, readInt, 8);
                    d5 = parcel.readDouble();
                    break;
                case 5:
                    b.R(parcel, readInt, 8);
                    d6 = parcel.readDouble();
                    break;
                case 6:
                    f5 = b.I(parcel, readInt);
                    break;
                case 7:
                    i5 = b.L(parcel, readInt);
                    break;
                case '\b':
                    i6 = b.L(parcel, readInt);
                    break;
                case '\t':
                    i7 = b.L(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzbe(str, i5, s5, d5, d6, f5, j2, i6, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i5) {
        return new zzbe[i5];
    }
}
