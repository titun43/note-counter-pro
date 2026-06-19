package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import c3.z;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import u2.a;

/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new b(6);

    /* renamed from: g, reason: collision with root package name */
    public int f1140g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public long f1141i;

    /* renamed from: j, reason: collision with root package name */
    public int f1142j;

    /* renamed from: k, reason: collision with root package name */
    public z[] f1143k;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f1140g == locationAvailability.f1140g && this.h == locationAvailability.h && this.f1141i == locationAvailability.f1141i && this.f1142j == locationAvailability.f1142j && Arrays.equals(this.f1143k, locationAvailability.f1143k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1142j), Integer.valueOf(this.f1140g), Integer.valueOf(this.h), Long.valueOf(this.f1141i), this.f1143k});
    }

    public final String toString() {
        boolean z4 = this.f1142j < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z4);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        int i6 = this.f1140g;
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = this.h;
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(i7);
        long j2 = this.f1141i;
        z2.b.N(parcel, 3, 8);
        parcel.writeLong(j2);
        int i8 = this.f1142j;
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(i8);
        z2.b.L(parcel, 5, this.f1143k, i5);
        z2.b.P(parcel, O);
    }
}
