package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbpw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        long j2 = 0;
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z4 = y4.b.G(parcel, readInt);
                    break;
                case 2:
                    str = y4.b.o(parcel, readInt);
                    break;
                case 3:
                    i5 = y4.b.L(parcel, readInt);
                    break;
                case 4:
                    bArr = y4.b.m(parcel, readInt);
                    break;
                case 5:
                    strArr = y4.b.p(parcel, readInt);
                    break;
                case 6:
                    strArr2 = y4.b.p(parcel, readInt);
                    break;
                case 7:
                    z5 = y4.b.G(parcel, readInt);
                    break;
                case '\b':
                    j2 = y4.b.M(parcel, readInt);
                    break;
                default:
                    y4.b.P(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzbpv(z4, str, i5, bArr, strArr, strArr2, z5, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbpv[i5];
    }
}
