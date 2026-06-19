package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class t extends u2.a {
    public static final Parcelable.Creator<t> CREATOR = new androidx.fragment.app.b(23);

    /* renamed from: g, reason: collision with root package name */
    public final int f1121g;
    public List h;

    public t(int i5, List list) {
        this.f1121g = i5;
        this.h = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1121g);
        z2.b.M(parcel, 2, this.h);
        z2.b.P(parcel, O);
    }
}
