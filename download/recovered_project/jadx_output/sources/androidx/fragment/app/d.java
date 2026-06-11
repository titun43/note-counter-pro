package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new b(1);

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f366g;
    public final ArrayList h;

    public d(Parcel parcel) {
        this.f366g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(c.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f366g);
        parcel.writeTypedList(this.h);
    }
}
