package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y extends u2.a {
    public static final Parcelable.Creator<y> CREATOR = new androidx.fragment.app.b(26);

    /* renamed from: g, reason: collision with root package name */
    public final int f1130g;
    public final IBinder h;

    /* renamed from: i, reason: collision with root package name */
    public final t2.b f1131i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1132j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1133k;

    public y(int i5, IBinder iBinder, t2.b bVar, boolean z4, boolean z5) {
        this.f1130g = i5;
        this.h = iBinder;
        this.f1131i = bVar;
        this.f1132j = z4;
        this.f1133k = z5;
    }

    public final boolean equals(Object obj) {
        Object q0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!this.f1131i.equals(yVar.f1131i)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.h;
        if (iBinder == null) {
            q0Var = null;
        } else {
            int i5 = a.f1037g;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            q0Var = queryLocalInterface instanceof n ? (n) queryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = yVar.h;
        if (iBinder2 != null) {
            int i6 = a.f1037g;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof n ? (n) queryLocalInterface2 : new q0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return b0.j(q0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1130g);
        z2.b.G(parcel, 2, this.h);
        z2.b.H(parcel, 3, this.f1131i, i5);
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(this.f1132j ? 1 : 0);
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(this.f1133k ? 1 : 0);
        z2.b.P(parcel, O);
    }
}
