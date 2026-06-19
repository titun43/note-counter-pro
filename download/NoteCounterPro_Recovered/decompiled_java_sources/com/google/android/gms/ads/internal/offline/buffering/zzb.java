package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 == 1) {
                str = b.o(parcel, readInt);
            } else if (c5 == 2) {
                str2 = b.o(parcel, readInt);
            } else if (c5 != 3) {
                b.P(parcel, readInt);
            } else {
                str3 = b.o(parcel, readInt);
            }
        }
        b.t(parcel, Q);
        return new zza(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zza[i5];
    }
}
