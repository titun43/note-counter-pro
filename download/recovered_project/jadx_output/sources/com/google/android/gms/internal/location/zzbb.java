package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import y4.b;

/* loaded from: classes.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final zzba createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        List<g> list = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        long j2 = Long.MAX_VALUE;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            char c5 = (char) readInt;
            if (c5 != 1) {
                switch (c5) {
                    case 5:
                        list = b.s(parcel, readInt, g.CREATOR);
                        break;
                    case 6:
                        str = b.o(parcel, readInt);
                        break;
                    case 7:
                        z4 = b.G(parcel, readInt);
                        break;
                    case '\b':
                        z5 = b.G(parcel, readInt);
                        break;
                    case '\t':
                        z6 = b.G(parcel, readInt);
                        break;
                    case '\n':
                        str2 = b.o(parcel, readInt);
                        break;
                    case 11:
                        z7 = b.G(parcel, readInt);
                        break;
                    case '\f':
                        z8 = b.G(parcel, readInt);
                        break;
                    case '\r':
                        str3 = b.o(parcel, readInt);
                        break;
                    case 14:
                        j2 = b.M(parcel, readInt);
                        break;
                    default:
                        b.P(parcel, readInt);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.n(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        b.t(parcel, Q);
        return new zzba(locationRequest, list, str, z4, z5, z6, str2, z7, z8, str3, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i5) {
        return new zzba[i5];
    }
}
