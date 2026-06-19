package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        boolean z4 = false;
        boolean z5 = false;
        int i5 = 0;
        Bundle bundle = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzflg zzflgVar = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    bundle = y4.b.l(parcel, readInt);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) y4.b.n(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) y4.b.n(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = y4.b.o(parcel, readInt);
                    break;
                case 5:
                    arrayList = y4.b.q(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) y4.b.n(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = y4.b.o(parcel, readInt);
                    break;
                case '\b':
                default:
                    y4.b.P(parcel, readInt);
                    break;
                case '\t':
                    str3 = y4.b.o(parcel, readInt);
                    break;
                case '\n':
                    zzflgVar = (zzflg) y4.b.n(parcel, readInt, zzflg.CREATOR);
                    break;
                case 11:
                    str4 = y4.b.o(parcel, readInt);
                    break;
                case '\f':
                    z4 = y4.b.G(parcel, readInt);
                    break;
                case '\r':
                    z5 = y4.b.G(parcel, readInt);
                    break;
                case 14:
                    bundle2 = y4.b.l(parcel, readInt);
                    break;
                case 15:
                    bundle3 = y4.b.l(parcel, readInt);
                    break;
                case 16:
                    i5 = y4.b.L(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzbzu(bundle, versionInfoParcel, applicationInfo, str, arrayList, packageInfo, str2, str3, zzflgVar, str4, z4, z5, bundle2, bundle3, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbzu[i5];
    }
}
