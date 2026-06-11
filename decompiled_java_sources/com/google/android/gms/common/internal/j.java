package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends u2.a {
    public static final Parcelable.Creator<j> CREATOR = new androidx.fragment.app.b(29);

    /* renamed from: g, reason: collision with root package name */
    public final s f1060g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1061i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f1062j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1063k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f1064l;

    public j(s sVar, boolean z4, boolean z5, int[] iArr, int i5, int[] iArr2) {
        this.f1060g = sVar;
        this.h = z4;
        this.f1061i = z5;
        this.f1062j = iArr;
        this.f1063k = i5;
        this.f1064l = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.H(parcel, 1, this.f1060g, i5);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h ? 1 : 0);
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(this.f1061i ? 1 : 0);
        int[] iArr = this.f1062j;
        if (iArr != null) {
            int O2 = z2.b.O(parcel, 4);
            parcel.writeIntArray(iArr);
            z2.b.P(parcel, O2);
        }
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(this.f1063k);
        int[] iArr2 = this.f1064l;
        if (iArr2 != null) {
            int O3 = z2.b.O(parcel, 6);
            parcel.writeIntArray(iArr2);
            z2.b.P(parcel, O3);
        }
        z2.b.P(parcel, O);
    }
}
