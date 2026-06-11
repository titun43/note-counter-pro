package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j0 extends u2.a {
    public static final Parcelable.Creator<j0> CREATOR = new androidx.fragment.app.b(28);

    /* renamed from: g, reason: collision with root package name */
    public Bundle f1065g;
    public t2.d[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f1066i;

    /* renamed from: j, reason: collision with root package name */
    public j f1067j;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.E(parcel, 1, this.f1065g);
        z2.b.L(parcel, 2, this.h, i5);
        int i6 = this.f1066i;
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(i6);
        z2.b.H(parcel, 4, this.f1067j, i5);
        z2.b.P(parcel, O);
    }
}
