package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i5 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f5 = 0.0f;
        String str = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    z4 = b.G(parcel, readInt);
                    break;
                case 3:
                    z5 = b.G(parcel, readInt);
                    break;
                case 4:
                    str = b.o(parcel, readInt);
                    break;
                case 5:
                    z6 = b.G(parcel, readInt);
                    break;
                case 6:
                    f5 = b.I(parcel, readInt);
                    break;
                case 7:
                    i5 = b.L(parcel, readInt);
                    break;
                case '\b':
                    z7 = b.G(parcel, readInt);
                    break;
                case '\t':
                    z8 = b.G(parcel, readInt);
                    break;
                case '\n':
                    z9 = b.G(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzl(z4, z5, str, z6, f5, i5, z7, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzl[i5];
    }
}
