package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import androidx.fragment.app.h1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u2.a;

/* loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: g, reason: collision with root package name */
    public final List f1152g;
    public static final List h = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<LocationResult> CREATOR = new b(8);

    public LocationResult(List list) {
        this.f1152g = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).f1152g;
        int size = list.size();
        List list2 = this.f1152g;
        if (size != list2.size()) {
            return false;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f1152g.iterator();
        int i5 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i5 = (i5 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f1152g);
        return h1.b(new StringBuilder(valueOf.length() + 27), "LocationResult[locations: ", valueOf, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.M(parcel, 1, this.f1152g);
        z2.b.P(parcel, O);
    }
}
