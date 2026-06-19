package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends u2.a {
    public static final Parcelable.Creator<l> CREATOR = new androidx.fragment.app.b(15);

    /* renamed from: g, reason: collision with root package name */
    public final List f822g;
    public final int h;

    public l(ArrayList arrayList, int i5) {
        this.f822g = arrayList;
        this.h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return com.google.android.gms.common.internal.b0.j(this.f822g, lVar.f822g) && this.h == lVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f822g, Integer.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        com.google.android.gms.common.internal.b0.g(parcel);
        int O = z2.b.O(parcel, 20293);
        z2.b.M(parcel, 1, this.f822g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.P(parcel, O);
    }
}
