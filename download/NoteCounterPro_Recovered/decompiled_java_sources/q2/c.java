package q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;

/* loaded from: classes.dex */
public final class c extends u2.a {
    public static final Parcelable.Creator<c> CREATOR = new k0(10);

    /* renamed from: g, reason: collision with root package name */
    public final String f3086g;
    public final String h;

    public c(String str, String str2) {
        this.f3086g = str;
        this.h = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.I(parcel, 1, this.f3086g);
        z2.b.I(parcel, 2, this.h);
        z2.b.P(parcel, O);
    }
}
