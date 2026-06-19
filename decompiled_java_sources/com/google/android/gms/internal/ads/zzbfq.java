package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzbfq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        boolean z4 = false;
        int i5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j2 = 0;
        long j5 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = y4.b.o(parcel, readInt);
                    break;
                case 3:
                    j2 = y4.b.M(parcel, readInt);
                    break;
                case 4:
                    str2 = y4.b.o(parcel, readInt);
                    break;
                case 5:
                    str3 = y4.b.o(parcel, readInt);
                    break;
                case 6:
                    str4 = y4.b.o(parcel, readInt);
                    break;
                case 7:
                    bundle = y4.b.l(parcel, readInt);
                    break;
                case '\b':
                    z4 = y4.b.G(parcel, readInt);
                    break;
                case '\t':
                    j5 = y4.b.M(parcel, readInt);
                    break;
                case '\n':
                    str5 = y4.b.o(parcel, readInt);
                    break;
                case 11:
                    i5 = y4.b.L(parcel, readInt);
                    break;
                default:
                    y4.b.P(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzbfp(str, j2, str2, str3, str4, bundle, z4, j5, str5, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbfp[i5];
    }
}
