package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends u2.a {
    public static final Parcelable.Creator<g> CREATOR = new androidx.fragment.app.b(22);

    /* renamed from: g, reason: collision with root package name */
    public final int f1046g;
    public final String h;

    public g(int i5, String str) {
        this.f1046g = i5;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f1046g == this.f1046g && b0.j(gVar.h, this.h);
    }

    public final int hashCode() {
        return this.f1046g;
    }

    public final String toString() {
        return this.f1046g + ":" + this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1046g);
        z2.b.I(parcel, 2, this.h);
        z2.b.P(parcel, O);
    }
}
