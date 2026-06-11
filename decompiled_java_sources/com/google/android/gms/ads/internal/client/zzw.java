package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y4.b;

/* loaded from: classes.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        String str = null;
        zze zzeVar = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j2 = 0;
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
                    zzeVar = (zze) b.n(parcel, readInt, zze.CREATOR);
                    break;
                case 4:
                    bundle = b.l(parcel, readInt);
                    break;
                case 5:
                    str2 = b.o(parcel, readInt);
                    break;
                case 6:
                    str3 = b.o(parcel, readInt);
                    break;
                case 7:
                    str4 = b.o(parcel, readInt);
                    break;
                case '\b':
                    str5 = b.o(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzv(str, j2, zzeVar, bundle, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzv[i5];
    }
}
