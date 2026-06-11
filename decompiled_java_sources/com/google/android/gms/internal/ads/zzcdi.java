package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzcdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        String str = null;
        String str2 = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        String str3 = null;
        int i5 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = y4.b.o(parcel, readInt);
                    break;
                case 2:
                    str2 = y4.b.o(parcel, readInt);
                    break;
                case 3:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) y4.b.n(parcel, readInt, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 4:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) y4.b.n(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 5:
                    i5 = y4.b.L(parcel, readInt);
                    break;
                case 6:
                    str3 = y4.b.o(parcel, readInt);
                    break;
                default:
                    y4.b.P(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzcdh(str, str2, zzrVar, zzmVar, i5, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcdh[i5];
    }
}
