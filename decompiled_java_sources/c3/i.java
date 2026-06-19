package c3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends u2.a {
    public static final Parcelable.Creator<i> CREATOR = new androidx.fragment.app.b(10);

    /* renamed from: g, reason: collision with root package name */
    public final List f813g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f814i;

    /* renamed from: j, reason: collision with root package name */
    public final y f815j;

    public i(ArrayList arrayList, boolean z4, boolean z5, y yVar) {
        this.f813g = arrayList;
        this.h = z4;
        this.f814i = z5;
        this.f815j = yVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int O = z2.b.O(parcel, 20293);
        z2.b.M(parcel, 1, Collections.unmodifiableList(this.f813g));
        z2.b.N(parcel, 2, 4);
        parcel.writeInt(this.h ? 1 : 0);
        z2.b.N(parcel, 3, 4);
        parcel.writeInt(this.f814i ? 1 : 0);
        z2.b.H(parcel, 5, this.f815j, i5);
        z2.b.P(parcel, O);
    }
}
