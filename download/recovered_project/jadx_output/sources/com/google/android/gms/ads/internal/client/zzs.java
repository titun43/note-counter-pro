package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        zzr[] zzrVarArr = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.o(parcel, readInt);
                    break;
                case 3:
                    i5 = b.L(parcel, readInt);
                    break;
                case 4:
                    i6 = b.L(parcel, readInt);
                    break;
                case 5:
                    z4 = b.G(parcel, readInt);
                    break;
                case 6:
                    i7 = b.L(parcel, readInt);
                    break;
                case 7:
                    i8 = b.L(parcel, readInt);
                    break;
                case '\b':
                    zzrVarArr = (zzr[]) b.r(parcel, readInt, zzr.CREATOR);
                    break;
                case '\t':
                    z5 = b.G(parcel, readInt);
                    break;
                case '\n':
                    z6 = b.G(parcel, readInt);
                    break;
                case 11:
                    z7 = b.G(parcel, readInt);
                    break;
                case '\f':
                    z8 = b.G(parcel, readInt);
                    break;
                case '\r':
                    z9 = b.G(parcel, readInt);
                    break;
                case 14:
                    z10 = b.G(parcel, readInt);
                    break;
                case 15:
                    z11 = b.G(parcel, readInt);
                    break;
                case 16:
                    z12 = b.G(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzr(str, i5, i6, z4, i7, i8, zzrVarArr, z5, z6, z7, z8, z9, z10, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzr[i5];
    }
}
