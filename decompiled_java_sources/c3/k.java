package c3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k extends u2.a {
    public static final Parcelable.Creator<k> CREATOR = new androidx.fragment.app.b(12);

    /* renamed from: g, reason: collision with root package name */
    public final boolean f817g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f818i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f819j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f820k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f821l;

    public k(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f817g = z4;
        this.h = z5;
        this.f818i = z6;
        this.f819j = z7;
        this.f820k = z8;
        this.f821l = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.N(parcel, 1, 4);
        parcel.writeInt(this.f817g ? 1 : 0);
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h ? 1 : 0);
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(this.f818i ? 1 : 0);
        z2.b.N(parcel, 4, 4);
        parcel.writeInt(this.f819j ? 1 : 0);
        z2.b.N(parcel, 5, 4);
        parcel.writeInt(this.f820k ? 1 : 0);
        z2.b.N(parcel, 6, 4);
        parcel.writeInt(this.f821l ? 1 : 0);
        z2.b.P(parcel, O);
    }
}
