package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzccc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = y4.b.o(parcel, readInt);
                    break;
                case 3:
                    str2 = y4.b.o(parcel, readInt);
                    break;
                case 4:
                    z4 = y4.b.G(parcel, readInt);
                    break;
                case 5:
                    z5 = y4.b.G(parcel, readInt);
                    break;
                case 6:
                    arrayList = y4.b.q(parcel, readInt);
                    break;
                case 7:
                    z6 = y4.b.G(parcel, readInt);
                    break;
                case '\b':
                    z7 = y4.b.G(parcel, readInt);
                    break;
                case '\t':
                    arrayList2 = y4.b.q(parcel, readInt);
                    break;
                default:
                    y4.b.P(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzccb(str, str2, z4, z5, arrayList, z6, z7, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzccb[i5];
    }
}
