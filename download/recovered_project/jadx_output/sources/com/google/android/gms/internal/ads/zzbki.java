package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbki implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        com.google.android.gms.ads.internal.client.zzga zzgaVar = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i5 = y4.b.L(parcel, readInt);
                    break;
                case 2:
                    z4 = y4.b.G(parcel, readInt);
                    break;
                case 3:
                    i6 = y4.b.L(parcel, readInt);
                    break;
                case 4:
                    z5 = y4.b.G(parcel, readInt);
                    break;
                case 5:
                    i7 = y4.b.L(parcel, readInt);
                    break;
                case 6:
                    zzgaVar = (com.google.android.gms.ads.internal.client.zzga) y4.b.n(parcel, readInt, com.google.android.gms.ads.internal.client.zzga.CREATOR);
                    break;
                case 7:
                    z6 = y4.b.G(parcel, readInt);
                    break;
                case '\b':
                    i8 = y4.b.L(parcel, readInt);
                    break;
                case '\t':
                    i9 = y4.b.L(parcel, readInt);
                    break;
                case '\n':
                    z7 = y4.b.G(parcel, readInt);
                    break;
                case 11:
                    i10 = y4.b.L(parcel, readInt);
                    break;
                default:
                    y4.b.P(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzbkh(i5, z4, i6, z5, i7, zzgaVar, z6, i8, i9, z7, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbkh[i5];
    }
}
