package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import i1.b;
import i1.c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new k0(8);

    /* renamed from: g, reason: collision with root package name */
    public final c f602g;

    public ParcelImpl(Parcel parcel) {
        this.f602g = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        new b(parcel).i(this.f602g);
    }
}
