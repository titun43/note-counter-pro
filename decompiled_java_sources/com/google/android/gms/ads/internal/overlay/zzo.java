package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgj;
import y4.b;

/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        long j2 = 0;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        zzc zzcVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String str4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinder6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    zzcVar = (zzc) b.n(parcel, readInt, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = b.K(parcel, readInt);
                    break;
                case 4:
                    iBinder2 = b.K(parcel, readInt);
                    break;
                case 5:
                    iBinder3 = b.K(parcel, readInt);
                    break;
                case 6:
                    iBinder4 = b.K(parcel, readInt);
                    break;
                case 7:
                    str = b.o(parcel, readInt);
                    break;
                case '\b':
                    z4 = b.G(parcel, readInt);
                    break;
                case '\t':
                    str2 = b.o(parcel, readInt);
                    break;
                case '\n':
                    iBinder5 = b.K(parcel, readInt);
                    break;
                case 11:
                    i5 = b.L(parcel, readInt);
                    break;
                case '\f':
                    i6 = b.L(parcel, readInt);
                    break;
                case '\r':
                    str3 = b.o(parcel, readInt);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) b.n(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case zzbgj.zzt.zzm /* 21 */:
                case 22:
                case 23:
                default:
                    b.P(parcel, readInt);
                    break;
                case 16:
                    str4 = b.o(parcel, readInt);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) b.n(parcel, readInt, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinder6 = b.K(parcel, readInt);
                    break;
                case 19:
                    str5 = b.o(parcel, readInt);
                    break;
                case 24:
                    str6 = b.o(parcel, readInt);
                    break;
                case 25:
                    str7 = b.o(parcel, readInt);
                    break;
                case 26:
                    iBinder7 = b.K(parcel, readInt);
                    break;
                case 27:
                    iBinder8 = b.K(parcel, readInt);
                    break;
                case 28:
                    iBinder9 = b.K(parcel, readInt);
                    break;
                case 29:
                    z5 = b.G(parcel, readInt);
                    break;
                case 30:
                    j2 = b.M(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new AdOverlayInfoParcel(zzcVar, iBinder, iBinder2, iBinder3, iBinder4, str, z4, str2, iBinder5, i5, i6, str3, versionInfoParcel, str4, zzlVar, iBinder6, str5, str6, str7, iBinder7, iBinder8, iBinder9, z5, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new AdOverlayInfoParcel[i5];
    }
}
