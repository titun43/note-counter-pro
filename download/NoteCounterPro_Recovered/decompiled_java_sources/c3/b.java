package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends u2.a {
    public static final Parcelable.Creator<b> CREATOR = new androidx.fragment.app.b(17);

    /* renamed from: g, reason: collision with root package name */
    public final int f794g;
    public final int h;

    public b(int i5, int i6) {
        this.f794g = i5;
        this.h = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f794g == bVar.f794g && this.h == bVar.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f794g), Integer.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(this.f794g);
        sb.append(", mTransitionType=");
        sb.append(this.h);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        com.google.android.gms.common.internal.b0.g(parcel);
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f794g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.P(parcel, O);
    }
}
