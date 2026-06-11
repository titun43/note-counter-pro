package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new b(2);

    /* renamed from: g, reason: collision with root package name */
    public String f418g;
    public int h;

    public q0(String str, int i5) {
        this.f418g = str;
        this.h = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f418g);
        parcel.writeInt(this.h);
    }
}
