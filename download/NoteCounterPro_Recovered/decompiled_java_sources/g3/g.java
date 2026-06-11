package g3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.internal.y;

/* loaded from: classes.dex */
public final class g extends u2.a {
    public static final Parcelable.Creator<g> CREATOR = new k0(6);

    /* renamed from: g, reason: collision with root package name */
    public final int f1686g;
    public final t2.b h;

    /* renamed from: i, reason: collision with root package name */
    public final y f1687i;

    public g(int i5, t2.b bVar, y yVar) {
        this.f1686g = i5;
        this.h = bVar;
        this.f1687i = yVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f1686g);
        z2.b.H(parcel, 2, this.h, i5);
        z2.b.H(parcel, 3, this.f1687i, i5);
        z2.b.P(parcel, O);
    }
}
