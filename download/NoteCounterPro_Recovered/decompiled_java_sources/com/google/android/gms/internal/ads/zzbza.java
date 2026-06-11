package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.getcapacitor.Bridge;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzbza implements Parcelable.Creator {
    public static final zzbyz zza(Parcel parcel) {
        int Q = y4.b.Q(parcel);
        float f5 = 0.0f;
        float f6 = 0.0f;
        long j2 = 0;
        long j5 = 0;
        int i5 = 0;
        Bundle bundle = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i6 = 0;
        ArrayList arrayList = null;
        Bundle bundle3 = null;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        String str7 = null;
        zzbkh zzbkhVar = null;
        ArrayList arrayList3 = null;
        String str8 = null;
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        boolean z6 = false;
        String str9 = null;
        String str10 = null;
        boolean z7 = false;
        int i11 = 0;
        Bundle bundle4 = null;
        String str11 = null;
        com.google.android.gms.ads.internal.client.zzeh zzehVar = null;
        boolean z8 = false;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z9 = false;
        ArrayList arrayList4 = null;
        String str15 = null;
        ArrayList arrayList5 = null;
        int i12 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList6 = null;
        String str16 = null;
        zzbqs zzbqsVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i5 = y4.b.L(parcel, readInt);
                    break;
                case 2:
                    bundle = y4.b.l(parcel, readInt);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) y4.b.n(parcel, readInt, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) y4.b.n(parcel, readInt, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 5:
                    str = y4.b.o(parcel, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) y4.b.n(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) y4.b.n(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case '\b':
                    str2 = y4.b.o(parcel, readInt);
                    break;
                case '\t':
                    str3 = y4.b.o(parcel, readInt);
                    break;
                case '\n':
                    str4 = y4.b.o(parcel, readInt);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) y4.b.n(parcel, readInt, VersionInfoParcel.CREATOR);
                    break;
                case '\f':
                    bundle2 = y4.b.l(parcel, readInt);
                    break;
                case '\r':
                    i6 = y4.b.L(parcel, readInt);
                    break;
                case 14:
                    arrayList = y4.b.q(parcel, readInt);
                    break;
                case 15:
                    bundle3 = y4.b.l(parcel, readInt);
                    break;
                case 16:
                    z4 = y4.b.G(parcel, readInt);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    y4.b.P(parcel, readInt);
                    break;
                case 18:
                    i7 = y4.b.L(parcel, readInt);
                    break;
                case 19:
                    i8 = y4.b.L(parcel, readInt);
                    break;
                case 20:
                    f5 = y4.b.I(parcel, readInt);
                    break;
                case zzbgj.zzt.zzm /* 21 */:
                    str5 = y4.b.o(parcel, readInt);
                    break;
                case 25:
                    j2 = y4.b.M(parcel, readInt);
                    break;
                case 26:
                    str6 = y4.b.o(parcel, readInt);
                    break;
                case 27:
                    arrayList2 = y4.b.q(parcel, readInt);
                    break;
                case 28:
                    str7 = y4.b.o(parcel, readInt);
                    break;
                case 29:
                    zzbkhVar = (zzbkh) y4.b.n(parcel, readInt, zzbkh.CREATOR);
                    break;
                case 30:
                    arrayList3 = y4.b.q(parcel, readInt);
                    break;
                case 31:
                    j5 = y4.b.M(parcel, readInt);
                    break;
                case '!':
                    str8 = y4.b.o(parcel, readInt);
                    break;
                case '\"':
                    f6 = y4.b.I(parcel, readInt);
                    break;
                case '#':
                    i9 = y4.b.L(parcel, readInt);
                    break;
                case '$':
                    i10 = y4.b.L(parcel, readInt);
                    break;
                case '%':
                    z6 = y4.b.G(parcel, readInt);
                    break;
                case '\'':
                    str9 = y4.b.o(parcel, readInt);
                    break;
                case '(':
                    z5 = y4.b.G(parcel, readInt);
                    break;
                case ')':
                    str10 = y4.b.o(parcel, readInt);
                    break;
                case '*':
                    z7 = y4.b.G(parcel, readInt);
                    break;
                case '+':
                    i11 = y4.b.L(parcel, readInt);
                    break;
                case ',':
                    bundle4 = y4.b.l(parcel, readInt);
                    break;
                case '-':
                    str11 = y4.b.o(parcel, readInt);
                    break;
                case '.':
                    zzehVar = (com.google.android.gms.ads.internal.client.zzeh) y4.b.n(parcel, readInt, com.google.android.gms.ads.internal.client.zzeh.CREATOR);
                    break;
                case '/':
                    z8 = y4.b.G(parcel, readInt);
                    break;
                case '0':
                    bundle5 = y4.b.l(parcel, readInt);
                    break;
                case '1':
                    str12 = y4.b.o(parcel, readInt);
                    break;
                case '2':
                    str13 = y4.b.o(parcel, readInt);
                    break;
                case '3':
                    str14 = y4.b.o(parcel, readInt);
                    break;
                case '4':
                    z9 = y4.b.G(parcel, readInt);
                    break;
                case '5':
                    int N = y4.b.N(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (N == 0) {
                        arrayList4 = null;
                        break;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (int i13 = 0; i13 < readInt2; i13++) {
                            arrayList7.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + N);
                        arrayList4 = arrayList7;
                        break;
                    }
                case '6':
                    str15 = y4.b.o(parcel, readInt);
                    break;
                case Bridge.MINIMUM_ANDROID_WEBVIEW_VERSION /* 55 */:
                    arrayList5 = y4.b.q(parcel, readInt);
                    break;
                case '8':
                    i12 = y4.b.L(parcel, readInt);
                    break;
                case '9':
                    z10 = y4.b.G(parcel, readInt);
                    break;
                case ':':
                    z11 = y4.b.G(parcel, readInt);
                    break;
                case ';':
                    z12 = y4.b.G(parcel, readInt);
                    break;
                case Bridge.DEFAULT_ANDROID_WEBVIEW_VERSION /* 60 */:
                    arrayList6 = y4.b.q(parcel, readInt);
                    break;
                case '=':
                    str16 = y4.b.o(parcel, readInt);
                    break;
                case '?':
                    zzbqsVar = (zzbqs) y4.b.n(parcel, readInt, zzbqs.CREATOR);
                    break;
                case '@':
                    str17 = y4.b.o(parcel, readInt);
                    break;
                case 'A':
                    bundle6 = y4.b.l(parcel, readInt);
                    break;
            }
        }
        y4.b.t(parcel, Q);
        return new zzbyz(i5, bundle, zzmVar, zzrVar, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i6, arrayList, bundle3, z4, i7, i8, f5, str5, j2, str6, arrayList2, str7, zzbkhVar, arrayList3, j5, str8, f6, z5, i9, i10, z6, str9, str10, z7, i11, bundle4, str11, zzehVar, z8, bundle5, str12, str13, str14, z9, arrayList4, str15, arrayList5, i12, z10, z11, z12, arrayList6, str16, zzbqsVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbyz[i5];
    }
}
