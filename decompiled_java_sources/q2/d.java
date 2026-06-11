package q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;

/* loaded from: classes.dex */
public final class d extends u2.a {
    public static final Parcelable.Creator<d> CREATOR = new k0(11);

    /* renamed from: g, reason: collision with root package name */
    public final String f3087g;
    public final int h;

    public d(String str, int i5) {
        this.f3087g = str;
        this.h = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, this.f3087g);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h);
        z2.b.P(parcel, O);
    }
}
