package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends u2.a {
    public static final Parcelable.Creator<e> CREATOR = new androidx.fragment.app.b(5);

    /* renamed from: g, reason: collision with root package name */
    public final List f807g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final String f808i;

    /* renamed from: j, reason: collision with root package name */
    public final String f809j;

    public e(ArrayList arrayList, int i5, String str, String str2) {
        this.f807g = arrayList;
        this.h = i5;
        this.f808i = str;
        this.f809j = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
        sb.append(this.f807g);
        sb.append(", initialTrigger=");
        sb.append(this.h);
        sb.append(", tag=");
        sb.append(this.f808i);
        sb.append(", attributionTag=");
        return s.c.d(sb, this.f809j, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.M(parcel, 1, this.f807g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.I(parcel, 3, this.f808i);
        z2.b.I(parcel, 4, this.f809j);
        z2.b.P(parcel, O);
    }
}
