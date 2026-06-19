package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.emoji2.text.u;
import s.c;
import u2.a;
import z2.b;

/* loaded from: classes.dex */
public final class VersionInfoParcel extends a {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public VersionInfoParcel(String str, int i5, int i6, boolean z4, boolean z5) {
        this.afmaVersion = str;
        this.buddyApkVersion = i5;
        this.clientJarVersion = i6;
        this.isClientJar = z4;
        this.isLiteSdk = z5;
    }

    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        int O = b.O(parcel, 20293);
        b.I(parcel, 2, this.afmaVersion);
        int i6 = this.buddyApkVersion;
        b.N(parcel, 3, 4);
        parcel.writeInt(i6);
        int i7 = this.clientJarVersion;
        b.N(parcel, 4, 4);
        parcel.writeInt(i7);
        boolean z4 = this.isClientJar;
        b.N(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.isLiteSdk;
        b.N(parcel, 6, 4);
        parcel.writeInt(z5 ? 1 : 0);
        b.P(parcel, O);
    }

    public VersionInfoParcel(int i5, int i6, boolean z4) {
        this(i5, i6, z4, false, false);
    }

    public VersionInfoParcel(int i5, int i6, boolean z4, boolean z5) {
        this(i5, i6, z4, false, z5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VersionInfoParcel(int i5, int i6, boolean z4, boolean z5, boolean z6) {
        this(c.d(r0, ".", r13), i5, i6, z4, z6);
        String str;
        if (z4) {
            str = "0";
        } else {
            str = z5 ? "2" : "1";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + String.valueOf(i5).length() + 13 + 2);
        u.s(sb, "afma-sdk-a-v", i5, ".", i6);
    }
}
