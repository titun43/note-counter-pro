package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q extends u2.a {
    public static final Parcelable.Creator<q> CREATOR = new androidx.fragment.app.b(24);

    /* renamed from: g, reason: collision with root package name */
    public final int f1106g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1107i;

    /* renamed from: j, reason: collision with root package name */
    public final long f1108j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1109k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1110l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1111m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1112n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1113o;

    public q(int i5, int i6, int i7, long j2, long j5, String str, String str2, int i8, int i9) {
        this.f1106g = i5;
        this.h = i6;
        this.f1107i = i7;
        this.f1108j = j2;
        this.f1109k = j5;
        this.f1110l = str;
        this.f1111m = str2;
        this.f1112n = i8;
        this.f1113o = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1106g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(this.f1107i);
        z2.b.N(parcel, 4, 8);
        parcel.writeLong(this.f1108j);
        z2.b.N(parcel, 5, 8);
        parcel.writeLong(this.f1109k);
        z2.b.I(parcel, 6, this.f1110l);
        z2.b.I(parcel, 7, this.f1111m);
        z2.b.N(parcel, 8, 4);
        parcel.writeInt(this.f1112n);
        z2.b.N(parcel, 9, 4);
        parcel.writeInt(this.f1113o);
        z2.b.P(parcel, O);
    }
}
