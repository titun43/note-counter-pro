package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
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
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        Bundle bundle = null;
        boolean z4 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.o(parcel, readInt);
                    break;
                case 3:
                    str2 = b.o(parcel, readInt);
                    break;
                case 4:
                    str3 = b.o(parcel, readInt);
                    break;
                case 5:
                    str4 = b.o(parcel, readInt);
                    break;
                case 6:
                    str5 = b.o(parcel, readInt);
                    break;
                case 7:
                    str6 = b.o(parcel, readInt);
                    break;
                case '\b':
                    str7 = b.o(parcel, readInt);
                    break;
                case '\t':
                    intent = (Intent) b.n(parcel, readInt, Intent.CREATOR);
                    break;
                case '\n':
                    iBinder = b.K(parcel, readInt);
                    break;
                case 11:
                    z4 = b.G(parcel, readInt);
                    break;
                case '\f':
                    bundle = b.l(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z4, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzc[i5];
    }
}
