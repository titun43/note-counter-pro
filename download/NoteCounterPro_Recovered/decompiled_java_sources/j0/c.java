package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: g, reason: collision with root package name */
    public final Parcelable f2013g;
    public static final a h = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f2013g = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.f2013g, i5);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2013g = parcelable == h ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2013g = readParcelable == null ? h : readParcelable;
    }
}
