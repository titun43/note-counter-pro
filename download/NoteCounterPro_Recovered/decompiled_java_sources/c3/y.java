package c3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y extends u2.a {
    public static final Parcelable.Creator<y> CREATOR = new androidx.fragment.app.b(9);

    /* renamed from: g, reason: collision with root package name */
    public final String f824g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final String f825i;

    public y(String str, String str2, String str3) {
        this.f825i = str;
        this.f824g = str2;
        this.h = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, this.f824g);
        z2.b.I(parcel, 2, this.h);
        z2.b.I(parcel, 5, this.f825i);
        z2.b.P(parcel, O);
    }
}
