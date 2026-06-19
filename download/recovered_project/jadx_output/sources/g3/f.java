package g3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.x;

/* loaded from: classes.dex */
public final class f extends u2.a {
    public static final Parcelable.Creator<f> CREATOR = new k0(5);

    /* renamed from: g, reason: collision with root package name */
    public final int f1685g;
    public final x h;

    public f(int i5, x xVar) {
        this.f1685g = i5;
        this.h = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1685g);
        z2.b.H(parcel, 2, this.h, i5);
        z2.b.P(parcel, O);
    }
}
