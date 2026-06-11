package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s extends u2.a {
    public static final Parcelable.Creator<s> CREATOR = new androidx.fragment.app.b(27);

    /* renamed from: g, reason: collision with root package name */
    public final int f1117g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1118i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1119j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1120k;

    public s(int i5, boolean z4, boolean z5, int i6, int i7) {
        this.f1117g = i5;
        this.h = z4;
        this.f1118i = z5;
        this.f1119j = i6;
        this.f1120k = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1117g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h ? 1 : 0);
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(this.f1118i ? 1 : 0);
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(this.f1119j);
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(this.f1120k);
        z2.b.P(parcel, O);
    }
}
