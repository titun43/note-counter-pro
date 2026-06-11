package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;
import y4.b;

/* loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = b.Q(parcel);
        long j2 = 0;
        long j5 = 0;
        long j6 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        zzfx zzfxVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i5 = b.L(parcel, readInt);
                    break;
                case 2:
                    j2 = b.M(parcel, readInt);
                    break;
                case 3:
                    bundle = b.l(parcel, readInt);
                    break;
                case 4:
                    i6 = b.L(parcel, readInt);
                    break;
                case 5:
                    arrayList = b.q(parcel, readInt);
                    break;
                case 6:
                    z4 = b.G(parcel, readInt);
                    break;
                case 7:
                    i7 = b.L(parcel, readInt);
                    break;
                case '\b':
                    z5 = b.G(parcel, readInt);
                    break;
                case '\t':
                    str = b.o(parcel, readInt);
                    break;
                case '\n':
                    zzfxVar = (zzfx) b.n(parcel, readInt, zzfx.CREATOR);
                    break;
                case 11:
                    location = (Location) b.n(parcel, readInt, Location.CREATOR);
                    break;
                case '\f':
                    str2 = b.o(parcel, readInt);
                    break;
                case '\r':
                    bundle2 = b.l(parcel, readInt);
                    break;
                case 14:
                    bundle3 = b.l(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = b.q(parcel, readInt);
                    break;
                case 16:
                    str3 = b.o(parcel, readInt);
                    break;
                case 17:
                    str4 = b.o(parcel, readInt);
                    break;
                case 18:
                    z6 = b.G(parcel, readInt);
                    break;
                case 19:
                    zzcVar = (zzc) b.n(parcel, readInt, zzc.CREATOR);
                    break;
                case 20:
                    i8 = b.L(parcel, readInt);
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    str5 = b.o(parcel, readInt);
                    break;
                case 22:
                    arrayList3 = b.q(parcel, readInt);
                    break;
                case 23:
                    i9 = b.L(parcel, readInt);
                    break;
                case 24:
                    str6 = b.o(parcel, readInt);
                    break;
                case 25:
                    i10 = b.L(parcel, readInt);
                    break;
                case 26:
                    j5 = b.M(parcel, readInt);
                    break;
                case 27:
                    j6 = b.M(parcel, readInt);
                    break;
                default:
                    b.P(parcel, readInt);
                    break;
            }
        }
        b.t(parcel, Q);
        return new zzm(i5, j2, bundle, i6, arrayList, z4, i7, z5, str, zzfxVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z6, zzcVar, i8, str5, arrayList3, i9, str6, i10, j5, j6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzm[i5];
    }
}
